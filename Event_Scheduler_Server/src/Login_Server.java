
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Login_Server {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    ObjectOutputStream output;
    ObjectInputStream input;
    Socket sock;
    
    public static void main(String[] args) {
        new Login_Server().in();
    } 
    public class ClientHandler implements Runnable{
      public ClientHandler(Socket clientSocket){
            try {
                sock=clientSocket;
                output=new ObjectOutputStream(sock.getOutputStream());
  
            input=new ObjectInputStream(sock.getInputStream());
                    
                
                
            } catch (Exception ex) {            } 
        }
       
      @Override
        public void run(){
             String message;
              String user = null;
               String pass = null;
               String id = null;
               String email = null;
               String student= null;
               String event= null;
               String branch= null;
               String venue= null;
               String date= null;
               String time = null;
               String visibility=null;
               String test1="";
       
          try {
              test1=(String)input.readObject();
          } catch (IOException | ClassNotFoundException ex) {
              
          }
       if(test1.equals("login")){
           ArrayList<String> a=new ArrayList<>();
          try {
              Object o=input.readObject();
              a=(ArrayList<String>) o;
              user=a.get(0);
              pass=a.get(1);
          }catch(NullPointerException npex) {
          }
          catch (IOException | ClassNotFoundException ex) {
             
          }
          String sql="select * from Student_info where username=? and password=?";
              try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,user);
            pst.setString(2,pass);
            rs=pst.executeQuery();
            if(rs.next())
            {
                output.writeObject(1);
                sql="insert into log1 (username) values (?)";
                pst=conn.prepareStatement(sql);
                pst.setString(1,user);
                pst.execute();
                rs.close();
                pst.close();
              
                
                
            }
            else
            {
               output.writeObject(5);
            }
 
        }
        catch(SQLException | IOException e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){
                
            }
        }
        }
       if(test1.equals("sign"))
       {    ArrayList<String> a=new ArrayList<>();
             try {
               Object o=new Object();
               o=input.readObject();
               a=(ArrayList<String>) o;
              id=a.get(0);
              student=a.get(1);
              user=a.get(2);
              pass=a.get(3);
              email=a.get(4);
              branch=a.get(5);
          } catch (IOException | ClassNotFoundException ex) {
              Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
          }
            String sql="select * from Student_info where username=? and password=?";
             try {
            String sql1="Insert into Student_info (id,Student,Username,password,email,branch) values (?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql1);
            pst.setString(1,id);
            pst.setString(2,student);
            pst.setString(3,user);
            pst.setString(4,pass);
            pst.setString(5,email);
            pst.setString(6,branch);
            pst.execute();
            
            output.writeObject(1);
         
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){
                
            }
        }
        }
            int p=0;
       
       if(test1.equals("profile"))
       {
           try {
               //String sql="select * from log1";
               String u = null;
               u=(String) input.readObject();
               /* try {
               pst=conn.prepareStatement(sql);
               rs=pst.executeQuery();
               rs.next();
               u=rs.getString("username");
               
               } catch (SQLException ex) {
               
               }*/
               ArrayList<String> a=new ArrayList<>();
               String sql="select * from student_info where username=?";
               try {
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,u);
                   rs=pst.executeQuery();
                   rs.next();
                   
                   Object o=new Object();
                   a.add(rs.getString("Student"));
                   a.add(rs.getString("id"));
                   a.add(rs.getString("email"));
                   a.add(rs.getString("username"));
                   a.add(rs.getString("branch"));
                   output.writeObject(a);
                   
               } catch (Exception ex) {
                   
               }
               finally{
                   try{
                       rs.close();
                       pst.close();
                   }
                   catch(Exception e){
                   }
               }
               /*sql="select * from slot_book where username=?";
               try {
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,u);
                   rs=pst.executeQuery();
                   rs.next();
                   a.add(rs.getString("branch"));
                   
                   
               } catch (SQLException | IOException e) {
               }
               finally{
                   try{
                       rs.close();
                       pst.close();
                   }
                   catch(Exception e){
                       
                   }
               }*/
               try {
                   if(input.readObject().equals("logout"))
                   {
                       try {
             String un=(String) input.readObject();
             sql="delete from log1 where username=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, un);
            pst.execute();
            System.out.println(un);
            output.writeObject(1);
    
        } catch (Exception ex) {
           
        }
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){
            }
        }  
                   }        } catch (IOException | ClassNotFoundException ex) {
                       
                   }
           } catch (IOException ex) {
                     Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
               
           }     catch (ClassNotFoundException ex) {
                     Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
                 }
       }
       if(test1.equals("logout"))
       {
          try {
             String un=(String) input.readObject();
             String sql="delete from log1 where username=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, un);
            pst.execute();
            output.writeObject(1);
    
        } catch (Exception ex) {
           
        }
        finally{
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){
            }
        }  
       }
       if(test1.equals("venue"))
       {       
           String sql="insert into venues (venue_) values (?)";
        try {
            Object o=(String) input.readObject();
            System.out.println(o);
            if(!o.equals("")){
            pst=conn.prepareStatement(sql);
            pst.setString(1, (String) o);
            pst.execute();
            output.writeObject("Booked");
        }
        } catch (SQLException ex) {
           
        }        catch (IOException | ClassNotFoundException ex) {
                     Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
                 }
       
        }
       if(test1.equals("Venues"))
       {
           String sql="select * from venues";
           ArrayList<String> a=new ArrayList<>();
           try {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            int i=0;
            while(rs.next()){
                a.add(rs.getString("venue_"));
            }
              output.writeObject(a);
              String test2=(String) input.readObject();
              if(test2.equals("slot"))
       {    
           ArrayList<String> a1=new ArrayList<>();
       Object o=new Object();
                 try {
                     o=input.readObject();
                 } catch (IOException | ClassNotFoundException ex) {
                     Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
                 }
        a1=(ArrayList<String>)o;
       event=a1.get(0);
       user=a1.get(1);
       branch=a1.get(2);
       venue=a1.get(3);
       date=a1.get(4);
       time=a1.get(5);
       visibility=a1.get(6);
       try {
           sql="select * from slot_book";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           while(rs.next()){
               if((time.equals(rs.getString("time_")))){
                   if(venue.equals(rs.getString("venue"))){
                       if(date.equals(rs.getString("date_")))
                           p=1;
                       output.writeObject(1);
                       break;
                   }
               }
               else if(user.equals(rs.getString("username")))
               {
                   if(date.equals(rs.getString("date_"))){
                       output.writeObject(2);
                       break;
                   }
                   
               }
           }
       } catch (SQLException | IOException e) {
       }
       if(p==0){
           try {
               sql="insert into slot_book (Event,username,Branch,Venue,date_,time_,Visibility) values(?,?,?,?,?,?,?)";
               
               pst=conn.prepareStatement(sql);
               pst.setString(1,event);
               pst.setString(2,user);
               pst.setString(3,branch);
               pst.setString(4,venue);
               pst.setString(5,date);
               pst.setString(6,time);
               pst.setString(7,visibility);
               pst.execute();
               output.writeObject(5);
               
               
           } catch (SQLException | IOException e) {
               JOptionPane.showMessageDialog(null, e);
           }
           finally{
               try{
                   rs.close();
                   pst.close();
               }
               catch(Exception e){
                   
               }
           }
       }
              
       }
              
           if(test2.equals("venue"))
            {
                 
        try {
            Object o=(String) input.readObject();
            sql="select * from venues";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             int t=0;
             while(rs.next())
             {
                 if(o.equals(rs.getString("venue_")))
                 {
                     output.writeObject("oops");
                     t=5;
                     break;
                 }
             }
             pst.close();
             rs.close();
             sql="insert into venues (venue_) values (?)";
             if(t!=5){
            if(!o.equals("")){
            pst=conn.prepareStatement(sql);
            pst.setString(1, (String) o);
            pst.execute();
            output.writeObject("Booked");
        }
        } }catch (SQLException ex) {
           
        }        catch (IOException | ClassNotFoundException ex) {
                     Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
                 }
       
            }
                 
                   if(test2.equals("logout"))
                   {
                       try {
             String un=(String) input.readObject();
             System.out.println(un);
             sql="delete from log1 where username=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, un);
            pst.execute();
            output.writeObject(1);
    
        } catch (Exception ex) {
           
       
                 }       
                   }
    
         
           }     catch (IOException ex) {
                     Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (ClassNotFoundException ex) {
                     Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (SQLException ex) {
                     Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
                 }
       }
          
       if(test1.equals("Events"))
       {
           String sql="select * from slot_book where Visibility='Public'";
           try {
               PreparedStatement pst=conn.prepareStatement(sql);
               rs=pst.executeQuery();
               ArrayList<ArrayList<String>> a=new ArrayList<ArrayList<String>>();
               ArrayList<String> eve=new ArrayList<>();
               ArrayList<String> vn=new ArrayList<>();
               ArrayList<String> dt=new ArrayList<>();
               ArrayList<String> tm=new ArrayList<>();
               while(rs.next()){
                   eve.add(rs.getString("event"));
                   vn.add(rs.getString("venue"));
                   dt.add(rs.getString("date_"));
                   tm.add(rs.getString("time_"));
               }
               output.writeObject(eve);
               output.writeObject(vn);
               output.writeObject(dt);
               output.writeObject(tm);
               
           } catch (SQLException ex) {
               Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(Login_Server.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               if(input.readObject().equals("logout"))
               {
                   try {
                      String un=(String) input.readObject();
                    sql="delete from log1 where username=?";
                    pst=conn.prepareStatement(sql);
                    pst.setString(1, un);
                    pst.execute();
                       
                   } catch (Exception ex) {
                       
                   }
                   finally{
                       try{
                           rs.close();
                           pst.close();
                       }
                       catch(Exception e){
                       }
                   }
               }        } catch (IOException | ClassNotFoundException ex) {
                   
               }
           
       }
       
        }}
      
  
                 
    private void in() {
        conn=JDBC_Connect.ConnectDB();
        
        try {
            ServerSocket serverSock=new ServerSocket(5000);
            
            while(true)
            {
                Socket clientSocket=serverSock.accept();
                Thread t=new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
                
            }
        } catch (Exception ex) {
        }
    }
    }
    
    




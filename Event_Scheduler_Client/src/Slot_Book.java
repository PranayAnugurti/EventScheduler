import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
public class Slot_Book extends javax.swing.JFrame {
     ObjectOutputStream output;
    ObjectInputStream input;
    Socket sock;
    public Slot_Book() throws IOException, ClassNotFoundException {
        initComponents();
        setUpNetworking();
        Venues();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        comb_branch = new javax.swing.JComboBox<>();
        txt_event = new javax.swing.JTextField();
        txt_date = new com.toedter.calendar.JDateChooser();
        comb_venue = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comb_aft = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rad_mor = new javax.swing.JRadioButton();
        rad_aft = new javax.swing.JRadioButton();
        rad_evg = new javax.swing.JRadioButton();
        comb_mor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        comb_evg = new javax.swing.JComboBox<>();
        btn_book = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)), "Slot-Booking", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 51, 255))); // NOI18N

        comb_branch.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comb_branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Branch", "Computer Science", "Electronics", "Electrical", "Mechanical", "BioTech", "Chemical", "Production", "Civil", " " }));

        txt_event.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        txt_date.setDateFormatString("yyyy-MM-dd");
        txt_date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comb_venue.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comb_venue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Venue" }));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Branch");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Time");

        comb_aft.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comb_aft.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a AfterNoon Slot", "2-4", "4-6" }));
        comb_aft.setAutoscrolls(true);
        comb_aft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_aftActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("username");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Venue");

        buttonGroup1.add(rad_mor);
        rad_mor.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rad_mor.setText("Morning");
        rad_mor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dawn.png"))); // NOI18N
        rad_mor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_morItemStateChanged(evt);
            }
        });
        rad_mor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_morMouseClicked(evt);
            }
        });
        rad_mor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_morActionPerformed(evt);
            }
        });

        buttonGroup1.add(rad_aft);
        rad_aft.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rad_aft.setText("After Noon");
        rad_aft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sunset-.png"))); // NOI18N
        rad_aft.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_aftItemStateChanged(evt);
            }
        });
        rad_aft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_aftMouseClicked(evt);
            }
        });

        buttonGroup1.add(rad_evg);
        rad_evg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        rad_evg.setText("Evening");
        rad_evg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/night.png"))); // NOI18N
        rad_evg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_evgItemStateChanged(evt);
            }
        });
        rad_evg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_evgMouseClicked(evt);
            }
        });

        comb_mor.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comb_mor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Morning Slot", "8-10", "10-12", " " }));
        comb_mor.setAutoscrolls(true);
        comb_mor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_morActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Event Name");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Date");

        txt_user.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        comb_evg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        comb_evg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Evening slot", "6-8", "8-9" }));
        comb_evg.setAutoscrolls(true);
        comb_evg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb_evgActionPerformed(evt);
            }
        });

        btn_book.setBackground(new java.awt.Color(51, 255, 0));
        btn_book.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn_book.setText("Book Now");
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(247, 6, 6));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Visibility");

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setText("Public");
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-close-up.png"))); // NOI18N
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setText("Private");
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turn-visibility-off-button.png"))); // NOI18N
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_mor)
                            .addComponent(comb_mor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_book)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comb_venue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addComponent(txt_event))
                                    .addComponent(jRadioButton1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad_aft)
                            .addComponent(comb_aft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comb_evg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rad_evg)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(54, 54, 54)
                        .addComponent(comb_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_reset)
                    .addComponent(jRadioButton2))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_event, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(comb_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comb_venue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rad_evg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comb_evg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rad_mor)
                            .addComponent(rad_aft))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comb_aft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comb_mor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jRadioButton2))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_book)
                    .addComponent(btn_reset)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(0, 153, 255)));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("EVENT SCHEDULER");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(235, 235, 235))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));
        jMenu2.setForeground(new java.awt.Color(0, 0, 255));
        jMenu2.setText("Home");
        jMenu2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 5));
        jMenu3.setForeground(new java.awt.Color(51, 255, 51));
        jMenu3.setText("Add a Venue");
        jMenu3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 5, true));
        jMenu5.setForeground(new java.awt.Color(255, 51, 51));
        jMenu5.setText("Logout");
        jMenu5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1869, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 472, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 473, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 122, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 122, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comb_aftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_aftActionPerformed
       
        if(rad_aft.isSelected()==false)
        comb_aft.setSelectedIndex(0);
    }//GEN-LAST:event_comb_aftActionPerformed

    private void rad_morMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_morMouseClicked

        if(rad_mor.isSelected()==true)
        {
            comb_aft.setSelectedIndex(0);
            comb_evg.setSelectedIndex(0);
        }

    }//GEN-LAST:event_rad_morMouseClicked

    private void rad_morActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_morActionPerformed
        // TODO add your handling code here:
        if(rad_mor.isSelected()==true)
        {
            comb_aft.setSelectedIndex(0);
            comb_evg.setSelectedIndex(0);
        }
    }//GEN-LAST:event_rad_morActionPerformed

    private void rad_aftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_aftMouseClicked
        // TODO add your handling code here:
        if(rad_aft.isSelected()==true)
        {
            comb_mor.setSelectedIndex(0);
            comb_evg.setSelectedIndex(0);
        }

    }//GEN-LAST:event_rad_aftMouseClicked

    private void rad_evgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_evgMouseClicked
        // TODO add your handling code here:
        if(rad_evg.isSelected()==true)
        {
            comb_mor.setSelectedIndex(0);
            comb_aft.setSelectedIndex(0);
        }

    }//GEN-LAST:event_rad_evgMouseClicked

    private void comb_morActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_morActionPerformed
        // TODO add your handling code here:
        if(rad_mor.isSelected()==false)
        comb_mor.setSelectedIndex(0);
    }//GEN-LAST:event_comb_morActionPerformed

    private void comb_evgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb_evgActionPerformed
        // TODO add your handling code here:
        if(rad_evg.isSelected()==false)
        comb_evg.setSelectedIndex(0);
    }//GEN-LAST:event_comb_evgActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_date.setDate(null);
        txt_event.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        comb_aft.setSelectedIndex(0);
        comb_evg.setSelectedIndex(0);
        comb_mor.setSelectedIndex(0);
        comb_branch.setSelectedIndex(0);
        comb_venue.setSelectedIndex(0);

    }//GEN-LAST:event_btn_resetActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        closeCrap();
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        String timetxt = null;
        try {
            
             if(rad_mor.isSelected())
                timetxt=(String)comb_mor.getSelectedItem();
            else if(rad_aft.isSelected())
                timetxt=(String)comb_aft.getSelectedItem();
            else if(rad_evg.isSelected())
                timetxt=(String)comb_evg.getSelectedItem();
              ArrayList<String> a=new ArrayList<String>();
              a.add(txt_event.getText());
              a.add(txt_user.getText());
              a.add((String)comb_branch.getSelectedItem());
              a.add((String)comb_venue.getSelectedItem());
              a.add(((JTextField)(txt_date.getDateEditor().getUiComponent())).getText());
              a.add(timetxt);
              if(jRadioButton1.isSelected())
                  a.add(jRadioButton1.getText());
              else
                  a.add(jRadioButton2.getText());
              output.writeObject("slot");
              output.writeObject(a);
              output.flush();
             int st=0;
             try {
            st=(int)input.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Login_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(st==1){
            JOptionPane.showMessageDialog(null,"Sorry!Slot was already booked!");
            
        }
        else if(st==2){
            JOptionPane.showMessageDialog(null,"Sorry!You cannot book more than one slot a day at same venue");
        }
        else if(st==5)
        {
            JOptionPane.showMessageDialog(null,"Slot booked successfully!");
            closeCrap();
            dispose();
            new Home().setVisible(true);
        }
         } catch (IOException ex) {
             Logger.getLogger(SignUp_JFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
      
    }//GEN-LAST:event_btn_bookActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
       try {
                output.writeObject("logout");
                 new Login_JFrame().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeCrap();
            dispose();
            JOptionPane.showMessageDialog(null,"logged out successfully");
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        try {
                output.writeObject("logout");
                output.writeObject(Variables.un);
                System.out.println(Variables.un);
               
                if((int)input.readObject()==1)
                {    new Login_JFrame().setVisible(true);
                    closeCrap();
                    dispose();
                    JOptionPane.showMessageDialog(null,"logged out successfully");
                }
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
             Logger.getLogger(Slot_Book.class.getName()).log(Level.SEVERE, null, ex);
         }
          
          
    }//GEN-LAST:event_jMenu5MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

         try {
                output.writeObject("logout");
                output.writeObject(Variables.un);
                new Login_JFrame().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeCrap();
            dispose();
            JOptionPane.showMessageDialog(null,"logged out successfully");
    }//GEN-LAST:event_formWindowClosing

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
         String in;
        in = JOptionPane.showInputDialog(null,"Enter the Venue");
        if(in.equals(""))
            JOptionPane.showMessageDialog(null,"Please Enter a valid Venue Address");
         else
        {try {
             output.writeObject("venue");
             output.writeObject(in);
             String str=(String) input.readObject();
             if(str.equals("Booked")){
                JOptionPane.showMessageDialog(null,"Venue added successfully!");
                new Slot_Book().setVisible(true);
                dispose();
             }
             if(str.equals("oops"))
             {
                 JOptionPane.showMessageDialog(null,"This Venue is already listed!");
             }
         } catch (IOException ex) {
             Logger.getLogger(Slot_Book.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Slot_Book.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        }  
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
            jRadioButton1.setForeground(Color.blue);
        else
            jRadioButton1.setForeground(Color.black);
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        // TODO add your handling code here:
         if(jRadioButton2.isSelected())
            jRadioButton2.setForeground(Color.red);
        else
            jRadioButton2.setForeground(Color.black);
    }//GEN-LAST:event_jRadioButton2ItemStateChanged
/**/
    private void rad_morItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_morItemStateChanged
        // TODO add your handling code here:
         if(rad_mor.isSelected())
           rad_mor.setForeground(Color.ORANGE);
       else
           rad_mor.setForeground(Color.black);
    }//GEN-LAST:event_rad_morItemStateChanged

    private void rad_aftItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_aftItemStateChanged
        // TODO add your handling code here:
         // TODO add your handling code here:
         if(rad_aft.isSelected())
           rad_aft.setForeground(Color.yellow);
       else
           rad_aft.setForeground(Color.black);  
    }//GEN-LAST:event_rad_aftItemStateChanged

    private void rad_evgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_evgItemStateChanged
        // TODO add your handling code here:
        if(rad_evg.isSelected())
           rad_evg.setForeground(Color.PINK);
        else
           rad_evg.setForeground(Color.black);
    }//GEN-LAST:event_rad_evgItemStateChanged
                                               
    
         private void closeCrap(){
            try {
                output.close();
                input.close();
                sock.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    private void setUpNetworking() throws ClassNotFoundException{
        try {
            sock=new Socket("127.0.0.1",5000);
            output=new ObjectOutputStream(sock.getOutputStream());
            input=new ObjectInputStream(sock.getInputStream());
            System.out.println("network established");
            //Venues();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Slot_Book().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Slot_Book.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Slot_Book.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_book;
    private javax.swing.JButton btn_reset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comb_aft;
    private javax.swing.JComboBox<String> comb_branch;
    private javax.swing.JComboBox<String> comb_evg;
    private javax.swing.JComboBox<String> comb_mor;
    private javax.swing.JComboBox<String> comb_venue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton rad_aft;
    private javax.swing.JRadioButton rad_evg;
    private javax.swing.JRadioButton rad_mor;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_event;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    private void Venues(){
         try {
             output.writeObject("Venues");
         } catch (IOException ex) {
             Logger.getLogger(Slot_Book.class.getName()).log(Level.SEVERE, null, ex);
         }
        ArrayList<String> a=new ArrayList<String>();
        Object o=new Object();
        txt_user.setText(Variables.un);
        txt_user.setEditable(false);
         try {
             o=input.readObject();
         } catch (IOException ex) {
             Logger.getLogger(Slot_Book.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Slot_Book.class.getName()).log(Level.SEVERE, null, ex);
         }
        a=(ArrayList<String>) o;
        int i=0;
        while(i<a.size())
        {
            comb_venue.addItem(a.get(i));
            i++;
        }
        
    }
}

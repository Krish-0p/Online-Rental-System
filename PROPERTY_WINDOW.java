
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class PROPERTY_WINDOW extends javax.swing.JFrame {

    
    
    P_TYPE type = new P_TYPE();
    HashMap<String, Integer> map = type.getTypesMap();
    
    public PROPERTY_WINDOW() {
        initComponents();
        
        
        
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(26,138,32));
        jPanel_Title.setBorder(panel_title_border);
        
       
        Border button_border = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(255,255,255));
        jButton_Add_Property.setBorder(button_border);
        jButton_Edit_Property.setBorder(button_border);
        jButton_Remove_Property.setBorder(button_border);
        jButton_Show_Properties.setBorder(button_border);
        
        
        bindCombo();
        
    }

    
   
    public void bindCombo()
    {
        for(String s : map.keySet())
        {
            jComboBox_Type.addItem(s);
        }
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jButton_Add_Property = new javax.swing.JButton();
        jButton_Edit_Property = new javax.swing.JButton();
        jButton_Remove_Property = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_SquareFeet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_OwnerId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jButton_Search_Property = new javax.swing.JButton();
        jComboBox_Type = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSpinner_Bedrooms = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSpinner_Bathrooms = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jSpinner_Age = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jCheckBox_Balcony = new javax.swing.JCheckBox();
        jCheckBox_Pool = new javax.swing.JCheckBox();
        jCheckBox_Backyard = new javax.swing.JCheckBox();
        jCheckBox_Garage = new javax.swing.JCheckBox();
        jButton_Show_Properties = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(75, 192, 18));

        jPanel_Title.setBackground(new java.awt.Color(65, 160, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(403, 403, 403))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Type:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Address:");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jButton_Add_Property.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Property.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Property.setText("Add");
        jButton_Add_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_PropertyActionPerformed(evt);
            }
        });

        jButton_Edit_Property.setBackground(new java.awt.Color(0, 153, 255));
        jButton_Edit_Property.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_Property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Property.setText("Edit");
        jButton_Edit_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_PropertyActionPerformed(evt);
            }
        });

        jButton_Remove_Property.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Property.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Property.setText("Remove");
        jButton_Remove_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_PropertyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Square Feet:");

        jTextField_SquareFeet.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Owner Id:");

        jTextField_OwnerId.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Price (INR):");

        jTextField_Price.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButton_Search_Property.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Search_Property.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Search_Property.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Search_Property.setText("Search");
        jButton_Search_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Search_Property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_PropertyActionPerformed(evt);
            }
        });

        jComboBox_Type.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Bedrooms:");

        jSpinner_Bedrooms.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jSpinner_Bedrooms.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Bathrooms:");

        jSpinner_Bathrooms.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jSpinner_Bathrooms.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Age Of The House:");

        jSpinner_Age.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jSpinner_Age.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("* 0 mean brand new");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Description/Comment:");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane3.setViewportView(jTextArea_Description);

        jCheckBox_Balcony.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jCheckBox_Balcony.setText("Balcony");

        jCheckBox_Pool.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jCheckBox_Pool.setText("Pool");

        jCheckBox_Backyard.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jCheckBox_Backyard.setText("Backyard");

        jCheckBox_Garage.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jCheckBox_Garage.setText("Garage");

        jButton_Show_Properties.setBackground(new java.awt.Color(102, 0, 102));
        jButton_Show_Properties.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Show_Properties.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Show_Properties.setText("Show Properties");
        jButton_Show_Properties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Show_Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Show_PropertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_OwnerId)
                                        .addComponent(jTextField_SquareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jComboBox_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Search_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_Bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_Bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_Balcony)
                            .addComponent(jCheckBox_Pool)
                            .addComponent(jCheckBox_Backyard)
                            .addComponent(jCheckBox_Garage))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton_Add_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Edit_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Remove_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Show_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Id)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_Search_Property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_SquareFeet))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_OwnerId)
                                    .addComponent(jSpinner_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Price)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox_Balcony)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox_Pool)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox_Backyard)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox_Garage)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_Bedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_Bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Show_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Remove_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_PropertyActionPerformed

        try{

            
            int id = Integer.valueOf(jTextField_Id.getText());

            P_PROPERTY property = new P_PROPERTY();

            if(jTextField_Id.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Enter the Property ID", "Empty ID", 2);
            }
            else{

                
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You Want To Delete This Property", "Delete Property", JOptionPane.YES_NO_OPTION);

                if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(property.removeProperty(id))
                    {
                        JOptionPane.showMessageDialog(null, "Property Data Deleted", "Delete Property", 1);
                        
                        
                        jTextField_Id.setText("");
                        jTextArea_Address.setText("");
                        jTextArea_Description.setText("");
                        jTextField_Price.setText("");
                        jTextField_SquareFeet.setText("");
                        jTextField_OwnerId.setText("");

                        jComboBox_Type.setSelectedIndex(0);

                        jSpinner_Bedrooms.setValue(0);
                        jSpinner_Bathrooms.setValue(0);
                        jSpinner_Age.setValue(0);

                        jCheckBox_Balcony.setSelected(false);
                        jCheckBox_Backyard.setSelected(false);
                        jCheckBox_Pool.setSelected(false);
                        jCheckBox_Garage.setSelected(false);
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Delete Property", 2);
                    }
                }

            }

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ " Enter a Valid Property ID ", "Invalid Id", 0);
        }
    }//GEN-LAST:event_jButton_Remove_PropertyActionPerformed

    private void jButton_Edit_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_PropertyActionPerformed

        // edit the selected property
        
        try
        { 
          int id = Integer.valueOf(jTextField_Id.getText()); 
          int type = map.get(jComboBox_Type.getSelectedItem().toString()); 
          int ownerId = Integer.valueOf(jTextField_OwnerId.getText());
          int squareFeet = Integer.valueOf(jTextField_SquareFeet.getText());
          int bedrooms = Integer.valueOf(jSpinner_Bedrooms.getValue().toString());
          int bathrooms = Integer.valueOf(jSpinner_Bathrooms.getValue().toString());
          int age = Integer.valueOf(jSpinner_Age.getValue().toString());
          boolean haveBalcony = false;
          boolean havePool = false;
          boolean haveBackyard = false;
          boolean haveGarage = false;
          
          
          if(jCheckBox_Balcony.isSelected()) haveBalcony = true;
          if(jCheckBox_Pool.isSelected()) havePool = true;
          if(jCheckBox_Backyard.isSelected()) haveBackyard = true;
          if(jCheckBox_Garage.isSelected()) haveGarage = true;
          
          String price = jTextField_Price.getText();
          String address = jTextArea_Address.getText();
          String description = jTextArea_Description.getText();
          
          P_PROPERTY property = new P_PROPERTY(id, type, squareFeet, ownerId, price, address, bedrooms, bathrooms, age, haveBalcony, havePool, haveBackyard, haveGarage, description);
          
          if(new P_PROPERTY().editProperty(property))
          {
              JOptionPane.showMessageDialog(null, "Property Data Updated", "Edit Property", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Property Data NOT Updated", "Edit Property", 2);
            }
          
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ " Enter a Valid Property Id, Owner Id and Square Feet", "Invalid Data", 0);
        }
        
        
    }//GEN-LAST:event_jButton_Edit_PropertyActionPerformed

    private void jButton_Add_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_PropertyActionPerformed

       
        
        try
        {
           
          int type = map.get(jComboBox_Type.getSelectedItem().toString()); 
          int ownerId = Integer.valueOf(jTextField_OwnerId.getText());
          int squareFeet = Integer.valueOf(jTextField_SquareFeet.getText());
          int bedrooms = Integer.valueOf(jSpinner_Bedrooms.getValue().toString());
          int bathrooms = Integer.valueOf(jSpinner_Bathrooms.getValue().toString());
          int age = Integer.valueOf(jSpinner_Age.getValue().toString());
          boolean haveBalcony = false;
          boolean havePool = false;
          boolean haveBackyard = false;
          boolean haveGarage = false;
          
          
          if(jCheckBox_Balcony.isSelected()) haveBalcony = true;
          if(jCheckBox_Pool.isSelected()) havePool = true;
          if(jCheckBox_Backyard.isSelected()) haveBackyard = true;
          if(jCheckBox_Garage.isSelected()) haveGarage = true;
          
          String price = jTextField_Price.getText();
          String address = jTextArea_Address.getText();
          String description = jTextArea_Description.getText();
          
          P_PROPERTY property = new P_PROPERTY(0, type, squareFeet, ownerId, price, address, bedrooms, bathrooms, age, haveBalcony, havePool, haveBackyard, haveGarage, description);
          
          if(new P_PROPERTY().addNewProperty(property))
          {
              JOptionPane.showMessageDialog(null, "New Property Added To The System", "Add Property", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Property NOT Added To The System", "Add Property", 2);
            }
          
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ " Enter a Valid Owner Id and Square Feet Value", "Invalid Data", 0);
        }
        
        
    }//GEN-LAST:event_jButton_Add_PropertyActionPerformed

    private void jButton_Show_PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Show_PropertiesActionPerformed
        
        // show all properties in a new form
        SHOW_PROPERTIES_WINDOW showPropertyForm = new SHOW_PROPERTIES_WINDOW();
        showPropertyForm.setVisible(true);
        showPropertyForm.pack();        
        showPropertyForm.setLocationRelativeTo(null);
        showPropertyForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton_Show_PropertiesActionPerformed

    private void jButton_Search_PropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_PropertyActionPerformed
        
        
        // uncheck the checkboxes
        jCheckBox_Balcony.setSelected(false);
        jCheckBox_Backyard.setSelected(false);
        jCheckBox_Pool.setSelected(false);
        jCheckBox_Garage.setSelected(false);
        
        
        
        
        try{
            
            int propertyId = Integer.valueOf(jTextField_Id.getText());
            
            P_PROPERTY property = new P_PROPERTY().findProperty(propertyId);
            
            if(property != null)
            {
                jTextArea_Address.setText(property.getAddress());
                jTextArea_Description.setText(property.getDescription());
                jTextField_Price.setText(property.getPrice());
                jTextField_SquareFeet.setText(String.valueOf(property.getSize()));
                jTextField_OwnerId.setText(String.valueOf(property.getOwnerId()));
               
                // displaying the property type in the combobox
                for(Object type : map.keySet())
                {
                    if(map.get(type).equals(property.getType()))
                        jComboBox_Type.setSelectedItem(type);
                }
               
                jSpinner_Bedrooms.setValue(property.getBedrooms());
                jSpinner_Bathrooms.setValue(property.getBathrooms());
                jSpinner_Age.setValue(property.getAge());
                
                if(property.isBlacone()) jCheckBox_Balcony.setSelected(true);
                if(property.isBackyard()) jCheckBox_Backyard.setSelected(true);
                if(property.isPool()) jCheckBox_Pool.setSelected(true);
                if(property.isGarage()) jCheckBox_Garage.setSelected(true);
                
            }
            else{
                 JOptionPane.showMessageDialog(null,"Property Not Found", "ERROR", 0);
            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+ " Enter a Valid Property Id", "Invalid Id", 0);
        }
        
    }//GEN-LAST:event_jButton_Search_PropertyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Property;
    private javax.swing.JButton jButton_Edit_Property;
    private javax.swing.JButton jButton_Remove_Property;
    private javax.swing.JButton jButton_Search_Property;
    private javax.swing.JButton jButton_Show_Properties;
    private javax.swing.JCheckBox jCheckBox_Backyard;
    private javax.swing.JCheckBox jCheckBox_Balcony;
    private javax.swing.JCheckBox jCheckBox_Garage;
    private javax.swing.JCheckBox jCheckBox_Pool;
    private javax.swing.JComboBox<String> jComboBox_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner_Age;
    private javax.swing.JSpinner jSpinner_Bathrooms;
    private javax.swing.JSpinner jSpinner_Bedrooms;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_OwnerId;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_SquareFeet;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;




public class PROPERTY_IMAGES_WINDOW extends javax.swing.JFrame {

    
    
    P_TYPE type = new P_TYPE();
    HashMap<String, Integer> map = type.getTypesMap();
    String property_image_path = "";
    int propertyId = 0;
    
    public PROPERTY_IMAGES_WINDOW() {
        initComponents();
        
        
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255,255,255));
        jPanel_Title.setBorder(panel_title_border);
        
        
        Border jlabel_image_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255,255,255));
        jLabel_Image.setBorder(jlabel_image_border);
        
        
        bindCombo();
        
        
        fillJtableWithPropertiesData();
        
        
        jTable_properties.setRowHeight(40);
       
        jTable_properties.setSelectionBackground(new Color(27,150,77));
        
        jTable_properties.getColumnModel().getColumn(0).setPreferredWidth(25);
        
        jTable_properties.getColumnModel().getColumn(1).setPreferredWidth(250);
    }

    
    public void bindCombo()
    {
        for(String s : map.keySet())
        {
            jComboBox_types.addItem(s);
        }
   }
    
    
    
    public void fillJtableWithPropertiesData()
    {
        P_PROPERTY property = new P_PROPERTY();
        ArrayList<P_PROPERTY> propertyList = property.propertiesList();
        
            
        String[] colNames = {"ID","Address"};
        
        
        Object[][] rows = new Object[propertyList.size()][2];
        
        
        for(int i = 0; i < propertyList.size(); i++)
        {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getAddress();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_properties.setModel(model);
        
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Add_Image = new javax.swing.JButton();
        jButton_Show_Images = new javax.swing.JButton();
        jButton_Remove_Image = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_types = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_properties = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton_Browse_Image = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel_Title.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property-Images");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_Add_Image.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Image.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Image.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Image.setText("Add");
        jButton_Add_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ImageActionPerformed(evt);
            }
        });

        jButton_Show_Images.setBackground(new java.awt.Color(0, 153, 255));
        jButton_Show_Images.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Show_Images.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Show_Images.setText("Show This Property Images");
        jButton_Show_Images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Show_Images.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Show_ImagesActionPerformed(evt);
            }
        });

        jButton_Remove_Image.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Image.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Image.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Image.setText("Remove");
        jButton_Remove_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_ImageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a Type:");

        jComboBox_types.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typesActionPerformed(evt);
            }
        });

        jTable_properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_propertiesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_properties);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Image:");

        jButton_Browse_Image.setBackground(new java.awt.Color(255, 255, 0));
        jButton_Browse_Image.setText("browse");
        jButton_Browse_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Browse_ImageActionPerformed(evt);
            }
        });

        jLabel_Image.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_Image.setOpaque(true);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>* this table contains the properties id and address.<BR>"
            + "                      click on the button to show the images slider.</html>");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        // make the jlabel multiline
        jLabel6.setText("<html>* this list contains the images id<BR>of the selected property.<BR>(select the property from the table).</html>");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>* select an item from the list to display<BR>"
            + "                      or browse an image from your computer.</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox_types, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jButton_Show_Images, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_Remove_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_Add_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Browse_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_types, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Browse_Image))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Show_Images, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Remove_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Add_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap())
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

    private void jButton_Add_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ImageActionPerformed

        
        P_PROPERTY property = new P_PROPERTY();
        
        if(propertyId != 0)
        { 
            if(property.addImage(propertyId, property_image_path))
            {
                JOptionPane.showMessageDialog(null, "Image Added To This Property", "Add Image", 1);
            }else{
               JOptionPane.showMessageDialog(null, "Image Not Added To This Property", "Add Image", 2);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select The Property First", "Property Not Selected", 2);    
        }

    }//GEN-LAST:event_jButton_Add_ImageActionPerformed

    private void jButton_Show_ImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Show_ImagesActionPerformed

        try
        {
            
            int rowIndex = jTable_properties.getSelectedRow();// selected jtable row index
            int id = Integer.valueOf(jTable_properties.getValueAt(rowIndex, 0).toString());// get the id from the jtable
            
            
            
            if(jList1.getModel().getSize() > 0)
            {
                
                PROPERTY_IMAGES_SLIDER imagesSliderform = new PROPERTY_IMAGES_SLIDER(id);
                imagesSliderform.setVisible(true);
                imagesSliderform.pack();        
                imagesSliderform.setLocationRelativeTo(null);
                imagesSliderform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
            }
            else
            {
               JOptionPane.showMessageDialog(null, "This Property Doesn't Have Any Image To Show", "No Images Found", 2);
            }
            
        }
        
        catch(Exception ex)
        {
         
            JOptionPane.showMessageDialog(null, "Select The Property First", "Property Not Selected", 2);
            
        }
        
    }//GEN-LAST:event_jButton_Show_ImagesActionPerformed

    private void jButton_Remove_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_ImageActionPerformed

        try
        {
          
        String selectedListItem = String.valueOf(jList1.getSelectedValue());
        Integer imageId = Integer.valueOf(selectedListItem);
        
        
        int yes_or_no = JOptionPane.showConfirmDialog(null, "Do You Realy Want To Delete This Image", "Delete Image", JOptionPane.YES_NO_OPTION);

        if(yes_or_no == JOptionPane.YES_OPTION)
                {
                    if(new P_PROPERTY().removePropertyImage(imageId))
                    {
                        JOptionPane.showMessageDialog(null, "Property Image Deleted", "Delete Image", 1);
                        jLabel_Image.setIcon(null);
                    
                    }else
                        {
                        JOptionPane.showMessageDialog(null, "Operation Failed, Image Not Deleted", "Delete Image", 2);
                       }
                }  
        }
        catch(Exception ex)
        {
          JOptionPane.showMessageDialog(null, "No Image Selected", "Delete Image", 2);
        }
    }//GEN-LAST:event_jButton_Remove_ImageActionPerformed

    
    public ImageIcon resizeImage(String path, byte[] byteImage)
    {
        ImageIcon pic;
        if(byteImage != null) pic = new ImageIcon(byteImage);
        else pic = new ImageIcon(path);
        
        Image img = pic.getImage().getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img);
        return image;
    }
    
    private void jButton_Browse_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Browse_ImageActionPerformed
       
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select The Property Image");
        
       
        fileChooser.setCurrentDirectory(new File("C:\\images"));
        
        
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Images", ".jpg",".png",".jpeg");
        fileChooser.addChoosableFileFilter(fileFilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        
        if(fileState == JFileChooser.APPROVE_OPTION)
        {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            jLabel_Image.setIcon(resizeImage(path,null));
            property_image_path = path;
        }
        
    }//GEN-LAST:event_jButton_Browse_ImageActionPerformed

    private void jComboBox_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typesActionPerformed

        
        int typeId = map.get(jComboBox_types.getSelectedItem().toString()); 
        P_PROPERTY property = new P_PROPERTY();
        ArrayList<P_PROPERTY> propertyList = property.propertiesListByType(typeId);
        
           
        String[] colNames = {"ID","Address"};
        
        
        Object[][] rows = new Object[propertyList.size()][2];
        
        
        for(int i = 0; i < propertyList.size(); i++)
        {
            rows[i][0] = propertyList.get(i).getId();
            rows[i][1] = propertyList.get(i).getAddress();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_properties.setModel(model);
        
    }//GEN-LAST:event_jComboBox_typesActionPerformed

    private void jTable_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_propertiesMouseClicked
        
        
        int rowIndex = jTable_properties.getSelectedRow();
        propertyId = Integer.valueOf(jTable_properties.getValueAt(rowIndex, 0).toString());
        
       
        
        fillTypeList();
        
    }//GEN-LAST:event_jTable_propertiesMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       
        
        try
        {
            
            String selectedListItem = String.valueOf(jList1.getSelectedValue());
            Integer imageId = Integer.valueOf(selectedListItem);
            byte[] image = new P_PROPERTY().getImageById(imageId);
            jLabel_Image.setIcon(resizeImage("",image)); 
        }
        catch(Exception ex)
        {
            
        }
        
        
    }//GEN-LAST:event_jList1MouseClicked

    
    
    
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
       
    }//GEN-LAST:event_jList1ValueChanged

    // create a function to populate the JList With The Selected Property Images ID
    public void fillTypeList()
    {
        HashMap<byte[], Integer> imagesListMap = new P_PROPERTY().propertyImagesList(propertyId);
        
        DefaultListModel listModel = new DefaultListModel();
        
        int i = 0;
        
        for(Integer id: imagesListMap.values())
        {
            listModel.add(i, id);
            i++;
        }
        
        jList1.setModel(listModel);
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_IMAGES_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Image;
    private javax.swing.JButton jButton_Browse_Image;
    private javax.swing.JButton jButton_Remove_Image;
    private javax.swing.JButton jButton_Show_Images;
    private javax.swing.JComboBox<String> jComboBox_types;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_properties;
    // End of variables declaration//GEN-END:variables
}

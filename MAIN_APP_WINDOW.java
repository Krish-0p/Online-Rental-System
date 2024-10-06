
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;


public class MAIN_APP_WINDOW extends javax.swing.JFrame {

    
    public MAIN_APP_WINDOW() {
        initComponents();
        
        
        jLabel_APP_ICO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")));
        
       
        Border logo_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_APP_ICO.setBorder(logo_border);
        
        
        Border appname_border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.white);
        jLabel_APP_Name.setBorder(appname_border);
        
        
        Border menu_items_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.yellow);
        jLabel_Property.setBorder(menu_items_border);
        jLabel_PropertyType.setBorder(menu_items_border);
        jLabel_PropertyImages.setBorder(menu_items_border);
        jLabel_Client.setBorder(menu_items_border);
        jLabel_Owner.setBorder(menu_items_border);
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_APP_ICO = new javax.swing.JLabel();
        jLabel_APP_Name = new javax.swing.JLabel();
        jLabel_Property = new javax.swing.JLabel();
        jLabel_PropertyType = new javax.swing.JLabel();
        jLabel_PropertyImages = new javax.swing.JLabel();
        jLabel_Owner = new javax.swing.JLabel();
        jLabel_Client = new javax.swing.JLabel();
        jLabel_Sale = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        jLabel_APP_ICO.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_APP_ICO.setOpaque(true);

        jLabel_APP_Name.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel_APP_Name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_APP_Name.setText("ORS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_APP_ICO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_APP_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_APP_ICO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_APP_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel_Property.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Property.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_Property.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Property.setText("  Property");
        jLabel_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Property.setOpaque(true);
        jLabel_Property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseExited(evt);
            }
        });

        jLabel_PropertyType.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_PropertyType.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_PropertyType.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PropertyType.setText("  Property-Type");
        jLabel_PropertyType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PropertyType.setOpaque(true);
        jLabel_PropertyType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyTypeMouseExited(evt);
            }
        });

        jLabel_PropertyImages.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_PropertyImages.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_PropertyImages.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PropertyImages.setText("  Property-Images");
        jLabel_PropertyImages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PropertyImages.setOpaque(true);
        jLabel_PropertyImages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImagesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImagesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImagesMouseExited(evt);
            }
        });

        jLabel_Owner.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Owner.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_Owner.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Owner.setText("  Owner");
        jLabel_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Owner.setOpaque(true);
        jLabel_Owner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_OwnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_OwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_OwnerMouseExited(evt);
            }
        });

        jLabel_Client.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Client.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_Client.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Client.setText("  Client");
        jLabel_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Client.setOpaque(true);
        jLabel_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ClientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ClientMouseExited(evt);
            }
        });

        jLabel_Sale.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Sale.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_Sale.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Sale.setText("  Sale");
        jLabel_Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Sale.setOpaque(true);
        jLabel_Sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SaleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_SaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_SaleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_PropertyType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_PropertyImages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Owner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_PropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_PropertyImages, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Sale, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 216, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 806, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jLabel_PropertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseEntered
        
        jLabel_Property.setBackground(Color.white);
        jLabel_Property.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_jLabel_PropertyMouseEntered

    private void jLabel_PropertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseExited
        
        jLabel_Property.setBackground(new Color(102,102,102));
        jLabel_Property.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_PropertyMouseExited

    private void jLabel_PropertyTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseEntered
        
        jLabel_PropertyType.setBackground(Color.white);
        jLabel_PropertyType.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_jLabel_PropertyTypeMouseEntered

    private void jLabel_PropertyTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseExited
        
        jLabel_PropertyType.setBackground(new Color(102,102,102));
        jLabel_PropertyType.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_PropertyTypeMouseExited

    private void jLabel_PropertyImagesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImagesMouseEntered
        
        jLabel_PropertyImages.setBackground(Color.white);
        jLabel_PropertyImages.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_jLabel_PropertyImagesMouseEntered

    private void jLabel_PropertyImagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImagesMouseExited
        
        jLabel_PropertyImages.setBackground(new Color(102,102,102));
        jLabel_PropertyImages.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_PropertyImagesMouseExited

    private void jLabel_OwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnerMouseEntered
        
        jLabel_Owner.setBackground(Color.white);
        jLabel_Owner.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_jLabel_OwnerMouseEntered

    private void jLabel_OwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnerMouseExited
        
        jLabel_Owner.setBackground(new Color(102,102,102));
        jLabel_Owner.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_OwnerMouseExited

    private void jLabel_ClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientMouseEntered
       
        jLabel_Client.setBackground(Color.white);
        jLabel_Client.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_jLabel_ClientMouseEntered

    private void jLabel_ClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientMouseExited
       
        jLabel_Client.setBackground(new Color(102,102,102));
        jLabel_Client.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_ClientMouseExited

    private void jLabel_PropertyTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyTypeMouseClicked
        
        
        PROPERTY_TYPE_WINDOW typeform = new PROPERTY_TYPE_WINDOW();
        typeform.setVisible(true);
        typeform.pack();        
        typeform.setLocationRelativeTo(null);
        typeform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_PropertyTypeMouseClicked

    private void jLabel_OwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnerMouseClicked
        
        
        OWNER_WINDOW ownerform = new OWNER_WINDOW();
        ownerform.setVisible(true);
        ownerform.pack();        
        ownerform.setLocationRelativeTo(null);
        ownerform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_OwnerMouseClicked

    private void jLabel_ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientMouseClicked
        
        
        CLIENT_WINDOW clientform = new CLIENT_WINDOW();
        clientform.setVisible(true);
        clientform.pack();        
        clientform.setLocationRelativeTo(null);
        clientform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_ClientMouseClicked

    private void jLabel_PropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseClicked
        
        
        PROPERTY_WINDOW propertyform = new PROPERTY_WINDOW();
        propertyform.setVisible(true);
        propertyform.pack();        
        propertyform.setLocationRelativeTo(null);
        propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_PropertyMouseClicked

    private void jLabel_PropertyImagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImagesMouseClicked
        
        
        PROPERTY_IMAGES_WINDOW propertyImagesForm = new PROPERTY_IMAGES_WINDOW();
        propertyImagesForm.setVisible(true);
        propertyImagesForm.pack();        
        propertyImagesForm.setLocationRelativeTo(null);
        propertyImagesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_PropertyImagesMouseClicked

    private void jLabel_SaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SaleMouseClicked
        
        
        SALE_WINDOW saleForm = new SALE_WINDOW();
        saleForm.setVisible(false);
        saleForm.pack();        
        saleForm.setLocationRelativeTo(null);
        saleForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jLabel_SaleMouseClicked

    private void jLabel_SaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SaleMouseEntered
      
        jLabel_Sale.setBackground(Color.white);
        jLabel_Sale.setForeground(new Color(102,102,102));
        
    }//GEN-LAST:event_jLabel_SaleMouseEntered

    private void jLabel_SaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SaleMouseExited
        
        jLabel_Sale.setBackground(new Color(102,102,102));
        jLabel_Sale.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_SaleMouseExited

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
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_APP_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_APP_ICO;
    private javax.swing.JLabel jLabel_APP_Name;
    private javax.swing.JLabel jLabel_Client;
    private javax.swing.JLabel jLabel_Owner;
    private javax.swing.JLabel jLabel_Property;
    private javax.swing.JLabel jLabel_PropertyImages;
    private javax.swing.JLabel jLabel_PropertyType;
    private javax.swing.JLabel jLabel_Sale;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

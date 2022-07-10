package Interface;


import Classes.Productos;
import Classes.Productos_Dao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddProduct extends javax.swing.JFrame {

    Productos pr = new Productos();
    Productos_Dao prd = new Productos_Dao();
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();
    
    public AddProduct() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ExitButtom = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_item_product = new javax.swing.JTextField();
        txt_quantity_product = new javax.swing.JTextField();
        txt_price_product = new javax.swing.JTextField();
        txt_memprice_product = new javax.swing.JTextField();
        AddProduct = new javax.swing.JButton();
        txt_tax_product = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_product = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("Quick Mart");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("ADD PRODUCT");

        ExitButtom.setText("Exit");
        ExitButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(99, 99, 99)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(ExitButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExitButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 85));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Item");

        txt_item_product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_item_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_item_productActionPerformed(evt);
            }
        });

        txt_quantity_product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_quantity_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantity_productActionPerformed(evt);
            }
        });

        txt_price_product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_price_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_price_productActionPerformed(evt);
            }
        });

        txt_memprice_product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_memprice_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_memprice_productActionPerformed(evt);
            }
        });

        AddProduct.setText("ADD");
        AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductActionPerformed(evt);
            }
        });

        txt_tax_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxable", "Non-Taxable", " " }));
        txt_tax_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tax_productActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Qty");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Regular Price");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Member Price");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Tax");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_item_product, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_quantity_product)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_price_product)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_memprice_product)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tax_product, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(AddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tax_product, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_item_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_quantity_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_price_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_memprice_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 720, 100));

        table_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Price", "Mem Price", "Tax"
            }
        ));
        table_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_productMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_product);
        if (table_product.getColumnModel().getColumnCount() > 0) {
            table_product.getColumnModel().getColumn(0).setPreferredWidth(150);
            table_product.getColumnModel().getColumn(1).setPreferredWidth(150);
            table_product.getColumnModel().getColumn(2).setPreferredWidth(150);
            table_product.getColumnModel().getColumn(3).setPreferredWidth(150);
            table_product.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txt_item_product.getText()) || !"".equals(txt_quantity_product.getText()) || !"".equals(txt_price_product.getText()) || !"".equals(txt_memprice_product.getText())|| !"".equals(txt_tax_product.getSelectedItem())) {
            pr.setItem(txt_item_product.getText());
            pr.setQty(Integer.parseInt(txt_quantity_product.getText()));
            pr.setPrice(Double.parseDouble(txt_price_product.getText()));
            pr.setMemprice(Double.parseDouble(txt_memprice_product.getText()));
            pr.setTax((String) txt_tax_product.getSelectedItem());
            prd.RegistrarProducto(pr);
            
            JOptionPane.showMessageDialog(null, "Product Succesfully Added");
            clean_Products();
            List_TableProduct();
            
        } else {
            JOptionPane.showMessageDialog(null, "Empty Fields");
        }
        
       
       
    }//GEN-LAST:event_AddProductActionPerformed

    public void List_TableProduct() {
        List<Productos> ListarPr = prd.ListarProductos();
        modelo = (DefaultTableModel) table_product.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPr.size(); i++) {
            ob[0] = ListarPr.get(i).getItem();
            ob[1] = ListarPr.get(i).getQty();
            ob[2] = ListarPr.get(i).getPrice();
            ob[3] = ListarPr.get(i).getMemprice();
            ob[4] = ListarPr.get(i).getTax();
            modelo.addRow(ob);
        }
        table_product.setModel(modelo);

    }  
    
    private void ExitButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtomActionPerformed
        Menu jf2 = new Menu();
        jf2.show();
        
       dispose();
    }//GEN-LAST:event_ExitButtomActionPerformed

    private void txt_memprice_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_memprice_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_memprice_productActionPerformed

    private void txt_quantity_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantity_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantity_productActionPerformed

    private void txt_item_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_item_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_item_productActionPerformed

    private void txt_price_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_price_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_price_productActionPerformed

    private void txt_tax_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tax_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tax_productActionPerformed

    private void table_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_productMouseClicked

        int fila = table_product.rowAtPoint(evt.getPoint());
        txt_item_product.setText(table_product.getValueAt(fila, 0).toString());
        txt_quantity_product.setText(table_product.getValueAt(fila, 1).toString());
        txt_price_product.setText(table_product.getValueAt(fila, 2).toString());
        txt_memprice_product.setText(table_product.getValueAt(fila, 3).toString());
        txt_tax_product.setSelectedItem(table_product.getValueAt(fila, 4).toString());

    }//GEN-LAST:event_table_productMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clean_Products();
        List_TableProduct();
            
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProduct;
    private javax.swing.JButton ExitButtom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_product;
    private javax.swing.JTextField txt_item_product;
    private javax.swing.JTextField txt_memprice_product;
    private javax.swing.JTextField txt_price_product;
    private javax.swing.JTextField txt_quantity_product;
    private javax.swing.JComboBox<String> txt_tax_product;
    // End of variables declaration//GEN-END:variables

private void clean_Products() {
        txt_item_product.setText("");
        txt_quantity_product.setText("");
        txt_price_product.setText("");
        txt_memprice_product.setText("");
        txt_tax_product.setSelectedItem("");
       
    }

}



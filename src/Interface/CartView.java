package Interface;


import Classes.Sales;
import Classes.Sales_Dao;
import Classes.Productos_Dao;
import Classes.Transaction_Totals;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CartView extends javax.swing.JFrame {

    String transactionUid;
    List<Sales> ListarSld;
    Transaction_Totals tt;
    Double transactionTotal = 0.0;
    Double amountToPay = 0.0;
    Double amountPaid = 0.0;
    
    public CartView() {
        initComponents();
        List_TableCart();
        RefreshTransactionTotals(ListarSld,0.065);
    }
   
     Sales sl = new Sales();
     Sales_Dao sld = new Sales_Dao();
     Productos_Dao prd = new Productos_Dao();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Cart = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_items_sold = new javax.swing.JLabel();
        txt_sub_total = new javax.swing.JLabel();
        txt_total_cart = new javax.swing.JLabel();
        txt_tax_cart = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_cash_paid = new javax.swing.JTextField();
        txt_pay_print = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bt_cancel_tr = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ExitButtom = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bt_Clear_Cart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tb_Cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ));
        tb_Cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_CartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Cart);
        if (tb_Cart.getColumnModel().getColumnCount() > 0) {
            tb_Cart.getColumnModel().getColumn(0).setPreferredWidth(150);
            tb_Cart.getColumnModel().getColumn(1).setPreferredWidth(155);
            tb_Cart.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tax(6.5%)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Sub-Total:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Total Number of items sold:");

        txt_items_sold.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txt_items_sold.setText("--");

        txt_sub_total.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txt_sub_total.setText("--");

        txt_total_cart.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txt_total_cart.setText("--");

        txt_tax_cart.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txt_tax_cart.setText("--");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("AMOUNT PAID IN CASH");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_cash_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(7, 7, 7)
                .addComponent(txt_cash_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txt_pay_print.setBackground(new java.awt.Color(153, 255, 153));
        txt_pay_print.setText("PAY + PRINT RECIPT");
        txt_pay_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pay_printActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cart Information");

        bt_cancel_tr.setText("CANCEL  A TRANSACTION");
        bt_cancel_tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancel_trActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(45, 45, 45))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_pay_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tax_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_total_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_sub_total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(txt_items_sold, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_cancel_tr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_items_sold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_sub_total))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txt_tax_cart)
                        .addGap(18, 18, 18)
                        .addComponent(txt_total_cart)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_pay_print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_cancel_tr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("Quick Mart");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("CART");

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
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(101, 101, 101)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(ExitButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton5.setText("Remove Selected");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bt_Clear_Cart.setText("Clear All");
        bt_Clear_Cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_Clear_CartMouseClicked(evt);
            }
        });
        bt_Clear_Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Clear_CartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(bt_Clear_Cart, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Clear_Cart, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void RefreshTransactionTotals(List<Sales> salesTransaction, double tax){
        tt = Transaction_Totals.CalculateTransactionTotals(salesTransaction, tax);
        txt_items_sold.setText(Integer.toString(tt.getTotalItemsSold()));
        txt_sub_total.setText(Double.toString(tt.getSubtotal()));
        txt_tax_cart.setText(Double.toString(tt.getTax()));
        txt_total_cart.setText(Double.toString(tt.getTotal()));
        transactionTotal = tt.getTotal();
    }
    
     DefaultTableModel model = new DefaultTableModel();
     
    public void List_TableCart() {
        model.setRowCount(0);
        transactionUid = sld.getLatestActiveTransactionUID();
        System.out.println(transactionUid);
        ListarSld = sld.GetTransactionCart(transactionUid);
        model = (DefaultTableModel) tb_Cart.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarSld.size(); i++) {
            ob[0] = ListarSld.get(i).getItem();
            ob[1] = ListarSld.get(i).getQty();
            ob[2] = ListarSld.get(i).getPrice();
            model.addRow(ob);
        }
                
        tb_Cart.setModel(model);
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String itemN = (String)tb_Cart.getValueAt(tb_Cart.getSelectedRow(),0);
        System.out.println(itemN);
        if (!"".equals(itemN)) {
            sld.DeleteSingleItemInTransaction(transactionUid, itemN);
            List_TableCart();
            RefreshTransactionTotals(ListarSld,0.065);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ExitButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtomActionPerformed
       
        Menu jf2 = new Menu();
        jf2.show();

        dispose();// TODO add your handling code here:
        
    }//GEN-LAST:event_ExitButtomActionPerformed

    private void bt_Clear_CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Clear_CartActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bt_Clear_CartActionPerformed

    private void tb_CartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_CartMouseClicked

        int fila = tb_Cart.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tb_CartMouseClicked

    String outputFile;
    private void txt_pay_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pay_printActionPerformed
        System.out.println(txt_cash_paid.getText());
        amountPaid = Double.parseDouble(txt_cash_paid.getText());
        // Check amount paid is greater than transaction total
        if(amountPaid < transactionTotal){
            JOptionPane.showMessageDialog(null, "Amount paid is less than transaction total");
            return;
        }
        
        // Show change owned
        amountToPay = amountPaid - transactionTotal;
        amountToPay = Math.floor(amountToPay * 100.00) / 100.00;
        JOptionPane.showMessageDialog(null, "Change: " + amountToPay);
        
        
        
        // Print to file
        outputFile = "transaction_" + transactionUid + ".txt";
       
        try{
            FileWriter fw = new FileWriter(outputFile);
            
            fw.write(LocalDateTime.now().toString() + "\n");
            fw.write("TRANSACTION: " + transactionUid + "\n");
            
            fw.write(String.format("%-22s%-22s%-22s%-22s", "ITEM","QUANTITY","UNIT PRICE","TOTAL") + "\n");
           
            for(Sales sl : ListarSld){
                Double unitTotal = sl.getPrice()*sl.getQty();
                String tableRow = String.format("%-22s%-22d%-22.2f%-22.2f", sl.getItem(), sl.getQty(), sl.getPrice(), unitTotal);
                fw.write(tableRow+ "\n");
                prd.UpdateProductQty(sl.getItem(), sl.getQty());
            }
            
            fw.write("**********************"+ "\n");
            fw.write("TOTAL NUMBER OF ITEMS SOLD: " + tt.getTotalItemsSold()+ "\n");
            fw.write("SUB-TOTAL: $" + tt.getSubtotal()+ "\n");
            fw.write("TAX (6.5%): $" + tt.getTax()+ "\n");
            fw.write("TOTAL: $" + tt.getTotal()+ "\n");
            fw.write("CASH: $" + amountPaid+ "\n");
            fw.write("CHANGE: $" + amountToPay+ "\n");
            fw.write("**********************"+ "\n");
            fw.close();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Cannot write reciept to file");
        }
        
         // Exit to menu
        
        Menu jf2 = new Menu();
        jf2.show();
        
       dispose();
        
    }//GEN-LAST:event_txt_pay_printActionPerformed

    private void bt_Clear_CartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_Clear_CartMouseClicked
      
        sld.DeleteAllTransaction(transactionUid);
        List_TableCart();
        RefreshTransactionTotals(ListarSld,0.065);
    }//GEN-LAST:event_bt_Clear_CartMouseClicked

    private void bt_cancel_trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancel_trActionPerformed
        sld.DeleteAllTransaction(transactionUid);
        sld.UpdateTransactionState(transactionUid, "Canceled");
        Menu jf2 = new Menu();
        jf2.show();
       dispose();
    }//GEN-LAST:event_bt_cancel_trActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButtom;
    private javax.swing.JButton bt_Clear_Cart;
    private javax.swing.JButton bt_cancel_tr;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Cart;
    private javax.swing.JTextField txt_cash_paid;
    private javax.swing.JLabel txt_items_sold;
    private javax.swing.JButton txt_pay_print;
    private javax.swing.JLabel txt_sub_total;
    private javax.swing.JLabel txt_tax_cart;
    private javax.swing.JLabel txt_total_cart;
    // End of variables declaration//GEN-END:variables
}

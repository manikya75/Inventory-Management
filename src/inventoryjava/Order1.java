/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventoryjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author yashmaurya
 */
public class Order1 extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    public Order1() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
    }

    Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 public void SelectProd()
   {
       try
       {
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Inventory?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           String cmd="select * from ProductTbl";
           PreparedStatement add=conn.prepareStatement(cmd);
           rs=add.executeQuery();
           ProductTbl.setModel(DbUtils.resultSetToTableModel(rs));
           
       }
       catch (SQLException e)
               {
                   e.printStackTrace();
               }
   }
 public void SelectCust()
   {
       try
       {
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Inventory?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           String cmd="select * from CustomerTbl";
           PreparedStatement add=conn.prepareStatement(cmd);
           rs=add.executeQuery();
           CustTbl.setModel(DbUtils.resultSetToTableModel(rs));
           
       }
       catch (SQLException e)
               {
                   e.printStackTrace();
               }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddOrderBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PlaceOrderBtn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        BillTbl = new javax.swing.JTable();
        BillId = new javax.swing.JTextField();
        Qtyb = new javax.swing.JTextField();
        DateLbl1 = new javax.swing.JLabel();
        TotalAmtLbl = new javax.swing.JLabel();
        CusNameLbl3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        PrintBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setForeground(new java.awt.Color(0, 128, 128));

        jLabel1.setFont(new java.awt.Font("Gothic A1", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE PRODUCT");

        ExitButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("X");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CustTbl.setFont(new java.awt.Font("Gothic A1", 0, 14)); // NOI18N
        CustTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Name", "Phone"
            }
        ));
        CustTbl.setRowHeight(25);
        CustTbl.setSelectionBackground(new java.awt.Color(0, 0, 204));
        CustTbl.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CustTbl.setShowGrid(true);
        CustTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustTbl);

        jLabel2.setFont(new java.awt.Font("Gothic A1", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 128, 128));
        jLabel2.setText("CUSTOMER LIST");

        ProductTbl.setFont(new java.awt.Font("Gothic A1", 2, 14)); // NOI18N
        ProductTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Name", "Quantity", "Description", "Category"
            }
        ));
        ProductTbl.setSelectionBackground(new java.awt.Color(0, 0, 204));
        ProductTbl.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ProductTbl.setShowGrid(true);
        ProductTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductTbl);

        jLabel3.setFont(new java.awt.Font("Gothic A1", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 128, 128));
        jLabel3.setText("PRODUCT LIST");

        jLabel4.setFont(new java.awt.Font("Gothic A1", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 128, 128));
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Gothic A1", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 128, 128));
        jLabel5.setText("Order Id");

        jLabel6.setFont(new java.awt.Font("Gothic A1", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 128, 128));
        jLabel6.setText("Customer Name");

        jLabel7.setFont(new java.awt.Font("Gothic A1", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 128, 128));
        jLabel7.setText("Quantity");

        AddOrderBtn.setFont(new java.awt.Font("Gothic A1", 3, 18)); // NOI18N
        AddOrderBtn.setForeground(new java.awt.Color(0, 128, 128));
        AddOrderBtn.setText("Add Order");
        AddOrderBtn.setBorder(null);
        AddOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOrderBtnMouseClicked(evt);
            }
        });
        AddOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrderBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Gothic A1", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 128, 128));
        jButton2.setText("View Order");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Gothic A1", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 128, 128));
        jButton3.setText("Home");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        PlaceOrderBtn.setFont(new java.awt.Font("Gothic A1", 3, 18)); // NOI18N
        PlaceOrderBtn.setForeground(new java.awt.Color(0, 128, 128));
        PlaceOrderBtn.setText("Place Order");
        PlaceOrderBtn.setBorder(null);
        PlaceOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaceOrderBtnMouseClicked(evt);
            }
        });
        PlaceOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderBtnActionPerformed(evt);
            }
        });

        BillTbl.setFont(new java.awt.Font("Gothic A1", 2, 14)); // NOI18N
        BillTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "UPrice", "Total"
            }
        ));
        BillTbl.setSelectionBackground(new java.awt.Color(0, 0, 204));
        BillTbl.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BillTbl.setShowGrid(true);
        BillTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTblMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(BillTbl);

        jLabel8.setFont(new java.awt.Font("Gothic A1", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 128, 128));
        jLabel8.setText("Price");

        PrintBtn.setFont(new java.awt.Font("Gothic A1", 3, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(0, 128, 128));
        PrintBtn.setText("Print");
        PrintBtn.setBorder(null);
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(AddOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DateLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CusNameLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Qtyb, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PlaceOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TotalAmtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PlaceOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Qtyb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(CusNameLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalAmtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustTblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) CustTbl.getModel();
        int MyIndx=CustTbl.getSelectedRow();
        CusNameLbl3.setText(model.getValueAt(MyIndx,1).toString());
    }//GEN-LAST:event_CustTblMouseClicked

    
    private void GetToday()
    {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now= LocalDateTime.now();
        DateLbl1.setText(dtf.format(now));
    }
    
    private void update()
    {
        int newqty=olqty-Integer.valueOf(Qtyb.getText());
          try 
            {
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Inventory?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
                String UpdateQuery="update Inventory.ProductTbl set PRODQTY="+newqty+""+" where PRODID="+ProdId;
                Statement add= conn.createStatement();
                add.executeUpdate(UpdateQuery);
               // JOptionPane.showMessageDialog(this, "Information Updated");
                SelectProd();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
    }
    
  int flag=0, ProdId,olqty;
    private void ProductTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) ProductTbl.getModel();
        int MyIndx=ProductTbl.getSelectedRow();
       ProdId=Integer.valueOf(model.getValueAt(MyIndx,0).toString());
        ProdName=(model.getValueAt(MyIndx,1).toString());
        olqty=Integer.valueOf(model.getValueAt(MyIndx,2).toString());
        flag=1;
    }//GEN-LAST:event_ProductTblMouseClicked


    private void AddOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrderBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrderBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PlaceOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceOrderBtnActionPerformed

    private void BillTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTblMouseClicked

    int i=1, Uprice, tot=0,total;
    String ProdName;
    private void PlaceOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaceOrderBtnMouseClicked
        // TODO add your handling code here:
        if (flag==0 || Qtyb.getText().isEmpty() || Price.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Product and enter Quantity");
        }
        else
        {
        Uprice= Integer.valueOf(Price.getText());
        tot= Uprice*Integer.valueOf(Qtyb.getText());
        Vector v= new Vector();
        v.add(i);
        v.add(ProdName);
        v.add(Qtyb.getText());
        v.add(Uprice);
        v.add(tot);
        DefaultTableModel dt= (DefaultTableModel) BillTbl.getModel();
        dt.addRow(v);
        total=total+tot;
        TotalAmtLbl.setText(""+total);
        update();
        i++;
        }
        
    }//GEN-LAST:event_PlaceOrderBtnMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        // TODO add your handling code here:
        try
        {
            BillTbl.print();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void AddOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOrderBtnMouseClicked
        // TODO add your handling code here:
        int currQty=Integer.valueOf(Qtyb.getText());
        if (BillId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the Bill Id");
        }
        else
{
    try
    {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Inventory?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");

        // Check if the quantity is zero or less
        if (currQty < 1)
        {
            JOptionPane.showMessageDialog(this, "Product is finished. Cannot place an order.");
        }
        else
        {
            PreparedStatement add = conn.prepareStatement("insert into OrderTbl values (?,?,?,?)");
            add.setInt(1, Integer.valueOf(BillId.getText()));
            add.setString(2, CusNameLbl3.getText());
            add.setString(3, DateLbl1.getText());
            add.setInt(4, Integer.valueOf(TotalAmtLbl.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Order Successfully Added");
        }

        conn.close();
    } catch (SQLException e)
    {
        e.printStackTrace();
    }
}

        
    }//GEN-LAST:event_AddOrderBtnMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        new Homeform().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrderBtn;
    private javax.swing.JTextField BillId;
    private javax.swing.JTable BillTbl;
    private javax.swing.JLabel CusNameLbl3;
    private javax.swing.JTable CustTbl;
    private javax.swing.JLabel DateLbl1;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JButton PlaceOrderBtn;
    private javax.swing.JTextField Price;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTable ProductTbl;
    private javax.swing.JTextField Qtyb;
    private javax.swing.JLabel TotalAmtLbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}

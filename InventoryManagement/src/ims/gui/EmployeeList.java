/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ims.gui;

import ims.bll.*;

import entities.*;
import java.awt.Dimension;
import java.util.*;
import java.awt.Toolkit;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NAT
 */
public class EmployeeList extends javax.swing.JFrame {
    
    List<Nhanvien> nhanvienList;
    List<Bangcap> bangcaps;
    List<Chucvu> chucvus;
    List<Congviec> congviecs;
    List<Tinhthanh> tinhthanhs;
    List<Loainhanvien> loainhanviens;
    List<Phongban> phongbans;
    List<Hocvan> hocvans;
    List<Ngoaingu> ngoaingus;
    List<Dantoc> dantocs;
    List<Quoctich> quoctichs;
    List<Tinhoc> tinhocs;
    List<Tongiao> tongiaos;
    
    BangcapBLL bangcapBLL = new BangcapBLL();
    ChucvuBLL chucvuBLL = new ChucvuBLL();
    CongviecBLL congviecBLL = new CongviecBLL();
    DantocBLL dantocBLL = new DantocBLL();
    HocvanBLL hocvanBLL = new HocvanBLL();
    LoainhanvienBLL loainhanvienBLL = new LoainhanvienBLL();
    NgoainguBLL ngoainguBLL = new NgoainguBLL();
    PhongbanBLL phongbanBLL = new PhongbanBLL();
    QuoctichBLL quoctichBLL = new QuoctichBLL();
    TinhocBLL tinhocBLL = new TinhocBLL();
    TinhthanhBLL tinhthanhBLL = new TinhthanhBLL();
    TongiaoBLL tongiaoBLL = new TongiaoBLL();
    NhanvienBLL nhanvienBLL = new NhanvienBLL();
    int row = 0;
    
    /** Creates new form EmployeeList */
    public EmployeeList() {
        initComponents();
        setInfoDialog();
    }
    public  void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);        
        setResizable(false);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btNew = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnEdit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDel = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnPrint = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jNhanvienTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btNew.setText("Thêm ");
        btNew.setFocusable(false);
        btNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btNew);
        jToolBar1.add(jSeparator1);

        btnEdit.setText("Sửa");
        btnEdit.setFocusable(false);
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEdit);
        jToolBar1.add(jSeparator2);

        btnDel.setText("Xóa");
        btnDel.setFocusable(false);
        btnDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDel);
        jToolBar1.add(jSeparator3);

        btnPrint.setText("In");
        btnPrint.setFocusable(false);
        btnPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnPrint);
        jToolBar1.add(jSeparator4);

        btnExit.setText("Thoát");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 25));

        jNhanvienTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ", "Họ Tên", "Số di động", "Ngày sinh", "Nơi sinh"
            }
        ));
        jNhanvienTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNhanvienTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jNhanvienTable);
        if (jNhanvienTable.getColumnModel().getColumnCount() > 0) {
            jNhanvienTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            jNhanvienTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 830, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateTableNhanvien(Nhanvien nhanvien, int row){
        DefaultTableModel model =(DefaultTableModel) jNhanvienTable.getModel();
        model.setValueAt(nhanvien.getMaNhanVien(), row, 0);
        model.setValueAt(nhanvien.getHoTen(), row, 1);
        model.setValueAt(nhanvien.getDiDong(), row, 2);
        model.setValueAt(nhanvien.getNgaySinh(), row, 3);
        model.setValueAt(nhanvien.getNoiSinh(), row, 4);
    }
    
    private void getListData(){
        bangcaps = bangcapBLL.getListBC();
        chucvus = chucvuBLL.getListCV();
        congviecs = congviecBLL.getListCV();
        tinhthanhs = tinhthanhBLL.getListTT();
        loainhanviens = loainhanvienBLL.getListLNV();
        phongbans = phongbanBLL.getListPB();
        hocvans = hocvanBLL.getListHV();
        ngoaingus = ngoainguBLL.getListNN();
        dantocs = dantocBLL.getListDT();
        quoctichs = quoctichBLL.getListQT();
        tinhocs = tinhocBLL.getListTH();
        tongiaos = tongiaoBLL.getListTG();
        
    }
    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        Employee emGui= new Employee();
        emGui.setFlag("Add");
        emGui.setEditableId(true);
        emGui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btNewActionPerformed
    
    public void addNhanvien(Nhanvien newNhanvien){
        
        if(newNhanvien != null ){
            try {
                nhanvienBLL.addNewNhanvien(newNhanvien);
            } catch (Exception e) {
                String message = "Không thể thêm mới nhân viên. Lỗi:\n" + e.getMessage();
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.setVisible(true);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnEdit.setEnabled(false);
        btnDel.setEnabled(false);
        getListData();
        nhanvienList = nhanvienBLL.getListNhanvien();
        loadTableData(nhanvienList);
    }//GEN-LAST:event_formWindowOpened
    
    Nhanvien nhanvienToEdit;
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int seletedRow = jNhanvienTable.getSelectedRow();
        Employee emGui = new Employee();
        if(seletedRow >= 0){
            nhanvienToEdit = nhanvienList.get(seletedRow);
            emGui.setNhanvien(nhanvienToEdit);
            emGui.setFlag("Edit");
            emGui.setEditableId(false);
            emGui.setVisible(true);
        }
        this.row = seletedRow;
        this.dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    public void editNhanvien(Nhanvien editedNhanvien){
        int seletedRow = row;
        if(editedNhanvien != null){
            try {
                nhanvienBLL.updateNhanvien(editedNhanvien);
            } catch (Exception e) {
                String message = "Không thể cập nhật nhân viên. Lỗi:\n" + e.getMessage();
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.setVisible(true);
    }
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        Nhanvien nhanvienToDel;
        try {
            int seletedRow = jNhanvienTable.getSelectedRow();
            if(seletedRow >= 0) {
                nhanvienToDel = nhanvienList.get(seletedRow);
                if(nhanvienToDel != null){
                    String message = String.format("Bạn có muốn xóa nhân viên '%s'", nhanvienToDel.getHoTen());
                    int answer = JOptionPane.showConfirmDialog(this, message,"Caution", JOptionPane.YES_NO_OPTION);
                    if(answer == JOptionPane.OK_OPTION){
                        nhanvienBLL.deleteNhanvien(nhanvienToDel);
                        nhanvienList.remove(nhanvienToDel);
                        DefaultTableModel model = (DefaultTableModel) jNhanvienTable.getModel();
                        model.removeRow(seletedRow);
                    }
                }
            }
        } catch (Exception e) {
            String message = "Không thể xóa nhân viên. Lỗi:\n"+ e.getMessage();
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void jNhanvienTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNhanvienTableMouseClicked
        // TODO add your handling code here:
        btnEdit.setEnabled(true);
        btnDel.setEnabled(true);
    }//GEN-LAST:event_jNhanvienTableMouseClicked
    
    public void loadTableData(List<Nhanvien> nhanvienList){
        int row = 0;
        DefaultTableModel model = (DefaultTableModel)jNhanvienTable.getModel();
        for(Iterator iterator = nhanvienList.iterator(); iterator.hasNext();){
            Nhanvien nhanvien = (Nhanvien) iterator.next();
            model.addRow(new Object[0]);
            updateTableNhanvien(nhanvien, row);
            row++;
        }
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
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNew;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JTable jNhanvienTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}

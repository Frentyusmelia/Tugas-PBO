/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A_2101091005.view;
import UAS_A_2101091005.controller.PinjamanController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class FormPinjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPinjaman
     */
    PinjamanController controller;
    public FormPinjaman() {
        initComponents();
        controller = new PinjamanController(this);
        controller.bersihForm();
        controller.setCboKode();
        controller.setCboNasabah();
        controller.tampilData();
    }

    public JComboBox<String> getCboKode() {
        return cboKode;
    }

    public JComboBox<String> getCboNasabah() {
        return cboNasabah;
    }
    
    public JTextField getTxtTglpinjam() {
        return txtTglpinjam;
    }

    public JTextField getTxtJumlahpinjaman() {
        return txtJumlahpinjaman;
    }

    public JTextField getTxtLamapinjaman() {
        return txtLamapinjaman;
    }
    
    public JTextField getTxtBunga() {
        return txtBunga;
    }
    
    public JTable getTblPinjaman() {
        return tblPinjaman;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboKode = new javax.swing.JComboBox<>();
        cboNasabah = new javax.swing.JComboBox<>();
        txtTglpinjam = new javax.swing.JTextField();
        txtJumlahpinjaman = new javax.swing.JTextField();
        txtLamapinjaman = new javax.swing.JTextField();
        txtBunga = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPinjaman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 110, 30);

        jLabel2.setText("Nasabah");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 110, 30);

        jLabel3.setText("Tanggal Pinjam");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 110, 30);

        jLabel4.setText("Jumlah Pinjaman");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 180, 110, 30);

        jLabel5.setText("Lama Pinjaman");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 230, 110, 30);

        jLabel6.setText("Bunga");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 280, 110, 30);

        cboKode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboKode);
        cboKode.setBounds(150, 30, 400, 30);

        cboNasabah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboNasabah);
        cboNasabah.setBounds(150, 80, 400, 30);

        txtTglpinjam.setText("jTextField1");
        getContentPane().add(txtTglpinjam);
        txtTglpinjam.setBounds(150, 130, 400, 30);

        txtJumlahpinjaman.setText("jTextField2");
        getContentPane().add(txtJumlahpinjaman);
        txtJumlahpinjaman.setBounds(150, 180, 400, 30);

        txtLamapinjaman.setText("jTextField3");
        getContentPane().add(txtLamapinjaman);
        txtLamapinjaman.setBounds(150, 230, 400, 30);

        txtBunga.setText("jTextField4");
        getContentPane().add(txtBunga);
        txtBunga.setBounds(150, 280, 400, 30);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(30, 340, 90, 30);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(150, 340, 90, 30);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(270, 340, 100, 30);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(400, 340, 90, 30);

        tblPinjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nasabah", "Tanggal Pinjam", "Jumlah Pinjaman", "Lama Pinjaman", "Bunga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPinjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPinjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPinjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 382, 600, 200);

        setSize(new java.awt.Dimension(649, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblPinjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPinjamanMouseClicked
        // TODO add your handling code here:
        controller.getPinjaman();
    }//GEN-LAST:event_tblPinjamanMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.save();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        controller.bersihForm();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(FormPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPinjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboKode;
    private javax.swing.JComboBox<String> cboNasabah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPinjaman;
    private javax.swing.JTextField txtBunga;
    private javax.swing.JTextField txtJumlahpinjaman;
    private javax.swing.JTextField txtLamapinjaman;
    private javax.swing.JTextField txtTglpinjam;
    // End of variables declaration//GEN-END:variables
}

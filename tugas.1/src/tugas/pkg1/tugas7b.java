/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package m5;

import javax.swing.DefaultListModel;

/**
 *
 * @author PC RPL - R1
 */
public class latihan7b extends javax.swing.JFrame {

    /**
     * Creates new form latihan7
     */
    public latihan7b() {
        initComponents();
        ListModel = new DefaultListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CbMakanan = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaKota = new javax.swing.JTextArea();
        eUbah = new javax.swing.JTextField();
        BtTambah = new javax.swing.JButton();
        BtHapus = new javax.swing.JButton();
        BtUbah = new javax.swing.JButton();
        BtSisip = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListMinuman = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TKota = new javax.swing.JTextField();
        TMakanan = new javax.swing.JTextField();
        TMinuman = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kota ");

        jLabel2.setText("Makanan");

        jLabel3.setText("Minuman");

        CbMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbMakananActionPerformed(evt);
            }
        });

        AreaKota.setColumns(20);
        AreaKota.setRows(5);
        jScrollPane2.setViewportView(AreaKota);

        BtTambah.setText("Tambah");
        BtTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTambahActionPerformed(evt);
            }
        });

        BtHapus.setText("Hapus");
        BtHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHapusActionPerformed(evt);
            }
        });

        BtUbah.setText("Ubah");
        BtUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUbahActionPerformed(evt);
            }
        });

        BtSisip.setText("Sisip");
        BtSisip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSisipActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(ListMinuman);

        jLabel4.setText("Kota");

        jLabel5.setText("Makanan");

        jLabel6.setText("Minuman");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(TKota, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(TMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(TMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel1)
                                    .addGap(79, 79, 79)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtHapus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(BtSisip, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(134, 134, 134))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtUbah)
                    .addComponent(BtTambah)
                    .addComponent(BtHapus)
                    .addComponent(BtSisip))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbMakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbMakananActionPerformed

    private void BtTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTambahActionPerformed
AreaKota.append("Gersik"+"\n");
AreaKota.append("Malang "+"\n");
AreaKota.append("Surabaya"+"\n");
CbMakanan.insertItemAt("Rujak", 0);
CbMakanan.insertItemAt("Rawon", 1);
CbMakanan.insertItemAt("Sate", 2);
ListModel.add(0, "Sprite");
ListModel.add(1, "Fanta");
ListModel.add(2, "Es Batu");
ListModel.add(3, "Kopi");
ListMinuman.setModel(ListModel);        // TODO add your handling code here:
    }//GEN-LAST:event_BtTambahActionPerformed

    private void BtHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHapusActionPerformed
if (AreaKota.getLineCount()>0) {
AreaKota.setSelectionStart(0);
AreaKota.setSelectionEnd(12);
int posisi = AreaKota.getSelectedText().indexOf("\n");
AreaKota.replaceRange("", 0,posisi+1);
if (posisi == -1)
AreaKota.replaceRange("",0,8);
}
if (CbMakanan.getItemCount()>0){
CbMakanan.removeItemAt(0);
}
if (ListModel.getSize()>0){
ListModel.remove(0);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_BtHapusActionPerformed

    private void BtUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUbahActionPerformed
if (AreaKota.getLineCount()>0) {
        AreaKota.setSelectionStart(0);
        AreaKota.setSelectionEnd(12);
        int posisi = AreaKota.getSelectedText().indexOf("\n");
        AreaKota.replaceRange(eUbah.getText()+"\n", 0,posisi+1);
        if (posisi == -1)
        AreaKota.replaceRange(eUbah.getText() + "\n", 0, 8);

        }
        if (CbMakanan.getItemCount()>0){
        CbMakanan.removeItemAt(1);
        CbMakanan.insertItemAt(eUbah.getText(),1);
        }
        if (ListModel.getSize()>0){
        ListModel.remove(1);
        ListModel.insertElementAt(eUbah.getText(),1);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtUbahActionPerformed

    private void BtSisipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSisipActionPerformed
String kotaInput = TKota.getText();
    String makananInput = TMakanan.getText();
    String minumanInput = TMinuman.getText();
    
    // Masukkan input ke dalam JTextArea
    AreaKota.append(kotaInput + "\n"); // Menambahkan teks baru di akhir
    
    // Masukkan input ke dalam JComboBox
    CbMakanan.addItem(makananInput); // Menambahkan item baru
    
    // Masukkan input ke dalam JList
    ListModel.addElement(minumanInput);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtSisipActionPerformed

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
            java.util.logging.Logger.getLogger(latihan7b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan7b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan7b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan7b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan7b().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaKota;
    private javax.swing.JButton BtHapus;
    private javax.swing.JButton BtSisip;
    private javax.swing.JButton BtTambah;
    private javax.swing.JButton BtUbah;
    private javax.swing.JComboBox<String> CbMakanan;
    private javax.swing.JList<String> ListMinuman;
    private javax.swing.JTextField TKota;
    private javax.swing.JTextField TMakanan;
    private javax.swing.JTextField TMinuman;
    private javax.swing.JTextField eUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
DefaultListModel ListModel;
}

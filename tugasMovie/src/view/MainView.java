/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.datamoviecontroller;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    datamoviecontroller data;
    public MainView() {
        initComponents();
        data = new datamoviecontroller(this);
        data.isitabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TJudul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TAlur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TPenokohan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TAkting = new javax.swing.JTextField();
        TTambah = new javax.swing.JButton();
        TUpdate = new javax.swing.JButton();
        TDelete = new javax.swing.JButton();
        TClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Judul", "Alur", "Penokohan", "Akting", "Nilai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);

        jLabel1.setText("Judul");

        TJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TJudulActionPerformed(evt);
            }
        });

        jLabel2.setText("Alur");

        TAlur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAlurActionPerformed(evt);
            }
        });

        jLabel3.setText("Penokohan");

        TPenokohan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPenokohanActionPerformed(evt);
            }
        });

        jLabel4.setText("Akting");

        TTambah.setText("Tambah");
        TTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTambahActionPerformed(evt);
            }
        });

        TUpdate.setText("Update");
        TUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUpdateActionPerformed(evt);
            }
        });

        TDelete.setText("Delete");
        TDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDeleteActionPerformed(evt);
            }
        });

        TClear.setText("Clear");
        TClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TAlur, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TPenokohan)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TAkting)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TJudul))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(TTambah)
                            .addComponent(TUpdate)
                            .addComponent(TDelete)
                            .addComponent(TClear))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAlur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPenokohan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAkting)
                .addGap(18, 18, 18)
                .addComponent(TTambah)
                .addGap(18, 18, 18)
                .addComponent(TUpdate)
                .addGap(18, 18, 18)
                .addComponent(TDelete)
                .addGap(18, 18, 18)
                .addComponent(TClear)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TJudulActionPerformed

    private void TAlurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAlurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TAlurActionPerformed

    private void TPenokohanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPenokohanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPenokohanActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
        // TODO add your handling code here:
        int baris = tabeldata.getSelectedRow();
    
    // Cek apakah pengguna benar-benar mengklik baris
    if (baris != -1) {
        // Ambil data dari baris yang diklik dan tampilkan pada inputan pengguna
        TJudul.setText(tabeldata.getValueAt(baris, 0).toString());
        TAlur.setText(tabeldata.getValueAt(baris, 1).toString());
        TPenokohan.setText(tabeldata.getValueAt(baris, 2).toString());
        TAkting.setText(tabeldata.getValueAt(baris, 3).toString());
    } else {
        // Jika pengguna mengklik di luar baris tabel, kosongkan inputan
        TJudul.setText("");
        TAlur.setText("");
        TPenokohan.setText("");
        TAkting.setText("");
    }
    }//GEN-LAST:event_tabeldataMouseClicked

    private void TDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDeleteActionPerformed
        // TODO add your handling code here:
        data.delete();
        data.isitabel();
    // Kosongkan inputan setelah data berhasil dihapus
        TJudul.setText("");
        TAlur.setText("");
        TPenokohan.setText("");
        TAkting.setText("");
        JOptionPane.showMessageDialog(this, "Data Movie berhasil dihapus", "Penghapusan Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_TDeleteActionPerformed

    private void TTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTambahActionPerformed
        // TODO add your handling code here:
        data.insert();
        data.isitabel();
        TJudul.setText("");
        TAlur.setText("");
        TPenokohan.setText("");
        TAkting.setText("");
        JOptionPane.showMessageDialog(this, "Data Movie berhasil ditambahkan.", "Penambahan Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_TTambahActionPerformed

    private void TUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUpdateActionPerformed
        // TODO add your handling code here:
        String judul = TJudul.getText();
    double alur = Double.parseDouble(TAlur.getText());
    double penokohan = Double.parseDouble(TPenokohan.getText());
    double akting = Double.parseDouble(TAkting.getText());
    data.update();
    data.isitabel();
    JOptionPane.showMessageDialog(this, "Data Movie berhasil diupdate", "Update Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_TUpdateActionPerformed

    private void TClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TClearActionPerformed
        // TODO add your handling code here:
        TJudul.setText("");
        TAlur.setText("");
        TPenokohan.setText("");
        TAkting.setText("");
    }//GEN-LAST:event_TClearActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TAkting;
    private javax.swing.JTextField TAlur;
    private javax.swing.JButton TClear;
    private javax.swing.JButton TDelete;
    private javax.swing.JTextField TJudul;
    private javax.swing.JTextField TPenokohan;
    private javax.swing.JButton TTambah;
    private javax.swing.JButton TUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelDatamovie() {
        return tabeldata;    
    }
    
    public void setTabelDatamovie(JTable tabeldata) {
        this.tabeldata = tabeldata;
    }
    
    public JTextField getTJudul() {
        return TJudul;
    }
    
    public void setTJudul(JTextField TJudul) {
        this.TJudul = TJudul;
    }
    
    public JTextField getTAkting() {
        return TAkting;
    }
    
    public void setTAkting(JTextField TAkting) {
        this.TAkting = TAkting;
    }
    
    public JTextField getTAlur() {
        return TAlur;
    }
    
    public void setTAlur(JTextField TAlur) {
        this.TAlur = TAlur;
    }
    
    public JTextField getTPenokohan() {
        return TPenokohan;
    }
    
    public void setTPenokohan(JTextField TPenokohan) {
        this.TPenokohan = TPenokohan;
    }
}

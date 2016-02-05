/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagwaan.com;

import wagwaan.config.AMSUtility;
import wagwaan.config.TableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import wagwaan.config.ConnectionDB;
/**
 *
 * @author Helmut
 */
public class SingleReportCardPerStudentDlg extends javax.swing.JDialog {
Connection con;
    /**
     * Creates new form SingleReportCardDlg
     */
    public SingleReportCardPerStudentDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        con=ConnectionDB.getInstance().getCon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSearchDialog28 = new javax.swing.JDialog();
        jSearchPanel29 = new javax.swing.JPanel();
        jTextField1139 = new javax.swing.JTextField();
        jSearchScrollPane29 = new javax.swing.JScrollPane();
        jSearchTable29 = new javax.swing.JTable();
        jButton529 = new javax.swing.JButton();
        jSearchDialog29 = new javax.swing.JDialog();
        jSearchPanel30 = new javax.swing.JPanel();
        jTextField1140 = new javax.swing.JTextField();
        jSearchScrollPane30 = new javax.swing.JScrollPane();
        jSearchTable30 = new javax.swing.JTable();
        jButton530 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jSearchDialog28.setModal(true);
        jSearchDialog28.setUndecorated(true);
        jSearchDialog28.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchPanel29.setLayout(new java.awt.GridBagLayout());

        jTextField1139.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1139CaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel29.add(jTextField1139, gridBagConstraints);

        jSearchTable29.setToolTipText("");
        jSearchTable29.setShowHorizontalLines(false);
        /*javax.swing.table.TableColumn column = null;

        for (int i = 0; i < 4; i++) {

            column = jSearchTable2.getColumnModel().getColumn(i);

            if (i == 1) {

                column.setPreferredWidth(400);
                //sport column is bigger
            } else {

                column.setPreferredWidth(200);

            }
        }
        */
        jSearchTable29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable29MouseClicked(evt);
            }
        });
        jSearchScrollPane29.setViewportView(jSearchTable29);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel29.add(jSearchScrollPane29, gridBagConstraints);

        jButton529.setText("Close");
        jButton529.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton529ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jSearchPanel29.add(jButton529, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog28.getContentPane().add(jSearchPanel29, gridBagConstraints);

        jSearchDialog29.setModal(true);
        jSearchDialog29.setUndecorated(true);
        jSearchDialog29.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchPanel30.setLayout(new java.awt.GridBagLayout());

        jTextField1140.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1140CaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel30.add(jTextField1140, gridBagConstraints);

        jSearchTable30.setToolTipText("");
        jSearchTable30.setShowHorizontalLines(false);
        /*javax.swing.table.TableColumn column = null;

        for (int i = 0; i < 4; i++) {

            column = jSearchTable2.getColumnModel().getColumn(i);

            if (i == 1) {

                column.setPreferredWidth(400);
                //sport column is bigger
            } else {

                column.setPreferredWidth(200);

            }
        }
        */
        jSearchTable30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable30MouseClicked(evt);
            }
        });
        jSearchScrollPane30.setViewportView(jSearchTable30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel30.add(jSearchScrollPane30, gridBagConstraints);

        jButton530.setText("Close");
        jButton530.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton530ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jSearchPanel30.add(jButton530, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog29.getContentPane().add(jSearchPanel30, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SINGLE REPORT CARD DIALOG");

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Select class");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "BABY CLASS", "NURSERY", "PRE-UNIT", "STD. 1", "STD. 2", "STD. 3", "STD. 4", "STD. 5", "STD. 6", "STD. 7", "STD. 8" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 0);
        jPanel2.add(jComboBox1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButton2, gridBagConstraints);

        jTextField2.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 0);
        jPanel1.add(jTextField2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jPanel1, gridBagConstraints);

        jLabel1.setText("Select Student ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel1, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jTextField1.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jTextField1, gridBagConstraints);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jPanel3, gridBagConstraints);

        jLabel3.setText("Select Term");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jLabel3, gridBagConstraints);

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jButton3, gridBagConstraints);

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jButton4, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedItem().equals("-") || jComboBox1.getSelectedItem().equals(null)){
            JOptionPane.showMessageDialog(this, "Please select the student's class from the above combo");
            return;
        }
        AMSUtility.showSearchDialog(jTextField2, jSearchDialog28);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1139CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1139CaretUpdate
        if(jTextField1139.getCaretPosition()>2){
            jSearchTable29.setModel(TableModel.createTableVectors(con, "select distinct(term) from fees_setup where term ilike '%"+jTextField1139.getText()+"%'"));
            jSearchScrollPane29.setViewportView(jSearchTable29);
        }
    }//GEN-LAST:event_jTextField1139CaretUpdate

    private void jSearchTable29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable29MouseClicked
        jTextField2.setText(jSearchTable29.getValueAt(jSearchTable29.getSelectedRow(), 0).toString());
        jSearchDialog28.dispose();
    }//GEN-LAST:event_jSearchTable29MouseClicked

    private void jButton529ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton529ActionPerformed
        jSearchDialog28.dispose();
    }//GEN-LAST:event_jButton529ActionPerformed

    private void jTextField1140CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1140CaretUpdate
        if(jTextField1140.getCaretPosition()>2){
            jSearchTable30.setModel(TableModel.createTableVectors(con, "select distinct(res.student_id), first_name||' '||middle_name||' '||last_name as names "
                    + "from student_registration re, student_results res where active=true and students_class='"+jComboBox1.getSelectedItem()+"' "
                    + " and res.student_id=re.student_id and first_name||' '||middle_name||' '||last_name ilike '%"+jTextField1140.getText()+"%'"));
        jSearchScrollPane30.setViewportView(jSearchTable30);
        }
    }//GEN-LAST:event_jTextField1140CaretUpdate

    private void jSearchTable30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable30MouseClicked
//        jTable1.setValueAt(jSearchTable30.getValueAt(jSearchTable30.getSelectedRow(), 0), jTable1.getSelectedRow(), 0);
        jTextField1.setText(jSearchTable30.getValueAt(jSearchTable30.getSelectedRow(), 0).toString());
        jSearchDialog29.dispose();
    }//GEN-LAST:event_jSearchTable30MouseClicked

    private void jButton530ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton530ActionPerformed
        jSearchDialog29.dispose();
    }//GEN-LAST:event_jButton530ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AMSUtility.showSearchDialog(jTextField1, jSearchDialog29);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        wagwaan.reports.IndividualReportCardPdf in=new wagwaan.reports.IndividualReportCardPdf();
        in.IndividualReportCardPdf(con, String.valueOf(jTextField1.getText()), String.valueOf(jTextField2.getText()), String.valueOf(jComboBox1.getSelectedItem()));
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton529;
    private javax.swing.JButton jButton530;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JDialog jSearchDialog28;
    private javax.swing.JDialog jSearchDialog29;
    private javax.swing.JPanel jSearchPanel29;
    private javax.swing.JPanel jSearchPanel30;
    private javax.swing.JScrollPane jSearchScrollPane29;
    private javax.swing.JScrollPane jSearchScrollPane30;
    private javax.swing.JTable jSearchTable29;
    private javax.swing.JTable jSearchTable30;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1139;
    private javax.swing.JTextField jTextField1140;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
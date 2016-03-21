/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wagwaan.accounts;
import wagwaan.reports.FeesStatementPdf;
import wagwaan.config.AMSUtility;
import wagwaan.config.ConnectionDB;
import wagwaan.config.TableModel;
import java.sql.*;
/**
 *
 * @author Helmut
 */
public class FeesPanel extends javax.swing.JDialog {
private final Connection con;
    /**
     * Creates new form FeesPanel
     * @param parent
     * @param modal
     */
    public FeesPanel(java.awt.Frame parent, boolean modal) {
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

        jSearchDialog21 = new javax.swing.JDialog();
        jSearchPanel21 = new javax.swing.JPanel();
        jTextField1131 = new javax.swing.JTextField();
        jSearchScrollPane21 = new javax.swing.JScrollPane();
        jSearchTable21 = new javax.swing.JTable();
        jButton521 = new javax.swing.JButton();
        jSearchDialog22 = new javax.swing.JDialog();
        jSearchPanel22 = new javax.swing.JPanel();
        jTextField1132 = new javax.swing.JTextField();
        jSearchScrollPane22 = new javax.swing.JScrollPane();
        jSearchTable22 = new javax.swing.JTable();
        jButton522 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        txtterm = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        txtid = new javax.swing.JTextField();
        searchButton2 = new javax.swing.JButton();
        comboclass = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnok = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();

        jSearchDialog21.setModal(true);
        jSearchDialog21.setUndecorated(true);
        jSearchDialog21.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchPanel21.setLayout(new java.awt.GridBagLayout());

        jTextField1131.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1131CaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel21.add(jTextField1131, gridBagConstraints);

        jSearchTable21.setToolTipText("");
        jSearchTable21.setShowHorizontalLines(false);
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
        jSearchTable21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable21MouseClicked(evt);
            }
        });
        jSearchScrollPane21.setViewportView(jSearchTable21);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel21.add(jSearchScrollPane21, gridBagConstraints);

        jButton521.setText("Close");
        jButton521.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton521ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jSearchPanel21.add(jButton521, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog21.getContentPane().add(jSearchPanel21, gridBagConstraints);

        jSearchDialog22.setModal(true);
        jSearchDialog22.setUndecorated(true);
        jSearchDialog22.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchPanel22.setLayout(new java.awt.GridBagLayout());

        jTextField1132.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1132CaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jSearchPanel22.add(jTextField1132, gridBagConstraints);

        jSearchTable22.setToolTipText("");
        jSearchTable22.setShowHorizontalLines(false);
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
        jSearchTable22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable22MouseClicked(evt);
            }
        });
        jSearchScrollPane22.setViewportView(jSearchTable22);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel22.add(jSearchScrollPane22, gridBagConstraints);

        jButton522.setText("Close");
        jButton522.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton522ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jSearchPanel22.add(jButton522, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog22.getContentPane().add(jSearchPanel22, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel41.setLayout(new java.awt.GridBagLayout());

        txtterm.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel41.add(txtterm, gridBagConstraints);

        searchButton1.setToolTipText("Search");
        searchButton1.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton1.setMinimumSize(new java.awt.Dimension(20, 20));
        searchButton1.setPreferredSize(new java.awt.Dimension(20, 20));
        searchButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel41.add(searchButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        jPanel1.add(jPanel41, gridBagConstraints);

        jPanel42.setLayout(new java.awt.GridBagLayout());

        txtid.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel42.add(txtid, gridBagConstraints);

        searchButton2.setToolTipText("Search");
        searchButton2.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton2.setMinimumSize(new java.awt.Dimension(20, 20));
        searchButton2.setPreferredSize(new java.awt.Dimension(20, 20));
        searchButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel42.add(searchButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        jPanel1.add(jPanel42, gridBagConstraints);

        comboclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BABY CLASS", "NURSERY", "PRE-UNIT", "STD. 1", "STD. 2", "STD. 3", "STD. 4", "STD. 5", "STD. 6", "STD. 7", "STD. 8" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        jPanel1.add(comboclass, gridBagConstraints);

        jLabel1.setText("Student ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Term");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Class");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel3, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnok, gridBagConstraints);

        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(btnclose, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(362, 266));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        AMSUtility.showSearchDialog(txtterm, jSearchDialog22);
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed
        AMSUtility.showSearchDialog(txtid, jSearchDialog21);
    }//GEN-LAST:event_searchButton2ActionPerformed

    private void jTextField1131CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1131CaretUpdate
        if(jTextField1131.getCaretPosition()>3){
//select current_term_id, current_class from term_fees_setup where current_term_id ilike '%"+jTextField1131.getText()+"%' 
            jSearchTable21.setModel(TableModel.createTableVectors(con, "select student_id, first_name||' '||middle_name||' '||last_name as names from student_registration where first_name||' '||middle_name||' '||last_name ilike '%"+jTextField1131.getText()+"%' "));
            jSearchScrollPane21.setViewportView(jSearchTable21);

        }
    }//GEN-LAST:event_jTextField1131CaretUpdate

    private void jSearchTable21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable21MouseClicked
        txtid.setText(jSearchTable21.getValueAt(jSearchTable21.getSelectedRow(), 0).toString());
        jSearchDialog21.dispose();

    }//GEN-LAST:event_jSearchTable21MouseClicked

    private void jButton521ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton521ActionPerformed
        jSearchDialog21.dispose();      // Add your handling code here:
    }//GEN-LAST:event_jButton521ActionPerformed

    private void jTextField1132CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1132CaretUpdate
        if(jTextField1132.getCaretPosition()>3){

            jSearchTable22.setModel(TableModel.createTableVectors(con, "select distinct(term) from fees_setup where term ilike '%"+jTextField1132.getText()+"%' and class='"+comboclass.getSelectedItem()+"'"));
            jSearchScrollPane22.setViewportView(jSearchTable22);

        }
    }//GEN-LAST:event_jTextField1132CaretUpdate

    private void jSearchTable22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable22MouseClicked
        txtterm.setText(jSearchTable22.getValueAt(jSearchTable22.getSelectedRow(), 0).toString());
        jSearchDialog22.dispose();
    }//GEN-LAST:event_jSearchTable22MouseClicked

    private void jButton522ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton522ActionPerformed
        jSearchDialog22.dispose();      // Add your handling code here:
    }//GEN-LAST:event_jButton522ActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        FeesStatementPdf fees=new FeesStatementPdf();
        fees.FeesStatementPdf(con, String.valueOf(txtterm.getText()), String.valueOf(comboclass.getSelectedItem()), String.valueOf(txtid.getText()));
        this.dispose();
    }//GEN-LAST:event_btnokActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox comboclass;
    private javax.swing.JButton jButton521;
    private javax.swing.JButton jButton522;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JDialog jSearchDialog21;
    private javax.swing.JDialog jSearchDialog22;
    private javax.swing.JPanel jSearchPanel21;
    private javax.swing.JPanel jSearchPanel22;
    private javax.swing.JScrollPane jSearchScrollPane21;
    private javax.swing.JScrollPane jSearchScrollPane22;
    private javax.swing.JTable jSearchTable21;
    private javax.swing.JTable jSearchTable22;
    private javax.swing.JTextField jTextField1131;
    private javax.swing.JTextField jTextField1132;
    private javax.swing.JButton searchButton1;
    private javax.swing.JButton searchButton2;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtterm;
    // End of variables declaration//GEN-END:variables
}

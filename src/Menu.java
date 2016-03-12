
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Menu.java
 *
 * Created on 8 Nov, 2011, 12:31:58 PM
 */
/**
 *
 * @author avp
 */
public class Menu extends javax.swing.JFrame {

    /** Creates new form Menu */
    public Menu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        update = new javax.swing.JComboBox();
        insert = new javax.swing.JComboBox();
        delete = new javax.swing.JComboBox();
        retrieve = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        bill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        update.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Record", "Patient", "Employee", "Room" }));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        insert.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Patient", "Employee", "Room" }));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        delete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Patient", "Employee", "Room" }));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        retrieve.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Record", "Patient", "Employee", "Room" }));
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });

        jLabel1.setText("Update Info :-");

        jLabel2.setText("Insert Info :-");

        jLabel3.setText("Delete Info :-");

        jLabel4.setText("Retrieve Info :-");

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        bill.setText("Create bill for patient");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retrieve, javax.swing.GroupLayout.Alignment.TRAILING, 0, 96, Short.MAX_VALUE)
                    .addComponent(insert, 0, 96, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, 0, 96, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, 0, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insert)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(bill, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retrieve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(close)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String result = (String)update.getSelectedItem();
        try
        {
            if (result.equalsIgnoreCase("Record"))
        {
            System.out.println("Record");
        }
        else if (result.equalsIgnoreCase("Employee"))
        {
            System.out.println("Employee");
            Employee_Update eu = new Employee_Update();
            eu.Init();
        }
        else if (result.equalsIgnoreCase("Patient"))
        {
            System.out.println("Patient");
            Patient_Update pu = new Patient_Update();
            pu.Init();
        }
        else if (result.equalsIgnoreCase("Room"))
        {
            System.out.println("Room");
            Room_Update ru = new Room_Update();
            ru.Init();
        }
        // TODO add your handling code here:
        }
        catch (Exception e)
        {
            System.err.println("Exception " + e.getMessage());
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        String result = (String)insert.getSelectedItem();
        if (result.equalsIgnoreCase("Employee"))
        {
            System.out.println("Insert : Employee");
            Employee_Insert ei = new Employee_Insert();
            ei.NewMain();
        }
        else if (result.equalsIgnoreCase("Patient"))
        {
            Patient_Insert pi = new Patient_Insert();
            pi.NewMain();
            System.out.println("Insert : Patient");
        }
        else if (result.equalsIgnoreCase("Room"))
        {
            Room_Insert ri = new Room_Insert();
            ri.NewMain();
            System.out.println("Insert : Room");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_insertActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String result = (String)delete.getSelectedItem();
         if (result.equalsIgnoreCase("Employee"))
        {
            System.out.println("Delete :Employee");
            JDBC ed = new JDBC();
            int tmp = ed.Delete_Employee();
            if(tmp != 0)
            {
                JOptionPane.showMessageDialog(null, "Employee deleted successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error deleting employee");
            }
        }
        else if (result.equalsIgnoreCase("Patient"))
        {
            try {
                ResultSet rs = null;
                JDBC pd = new JDBC();
                int tmp = pd.Delete_Patient();
                rs = pd.Retrieve_Record_pid(tmp);
                rs.next();
                int del_record = Integer.parseInt(rs.getString(1));
                if(tmp != 0)
                {
                    JOptionPane.showMessageDialog(null, "Patient deleted successfully");
                    pd.Delete_Record(del_record);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error deleting Patient");
                }
                
                System.out.println("Patient");
            }
            catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (result.equalsIgnoreCase("Room"))
        {
            JDBC rd = new JDBC();
            int tmp = rd.Delete_Room();
            if(tmp != 0)
            {
                JOptionPane.showMessageDialog(null, "Room deleted successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error deleting Room");
            }
            System.out.println("Room");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed
        String result = (String)retrieve.getSelectedItem();
        if (result.equalsIgnoreCase("Record"))
        {
            System.out.println("Retrieve : Record");
            Record_Retrieve rr = new Record_Retrieve();
            rr.NewMain();
        }
        else if (result.equalsIgnoreCase("Employee"))
        {
            System.out.println("Employee");
            Employee_Retrieve er = new Employee_Retrieve();
            er.NewMain();
        }
        else if (result.equalsIgnoreCase("Patient"))
        {
            System.out.println("Record");
            Patient_Retrieve pr = new Patient_Retrieve();
            pr.NewMain();
        }
        else if (result.equalsIgnoreCase("Room"))
        {
            System.out.println("Room");
            Room_Retrieve rr = new Room_Retrieve();
            rr.NewMain();
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_retrieveActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter patient ID"));
        Bill b = new Bill();
        b.NewMain();
        b.Init(id);
        // TODO add your handling code here:
    }//GEN-LAST:event_billActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill;
    private javax.swing.JButton close;
    private javax.swing.JComboBox delete;
    private javax.swing.JComboBox insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox retrieve;
    private javax.swing.JComboBox update;
    // End of variables declaration//GEN-END:variables
}

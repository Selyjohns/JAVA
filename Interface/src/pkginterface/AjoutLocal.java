/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

//import java.beans.Statement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Thomas
 */
public class AjoutLocal extends javax.swing.JFrame {

    
    /**
     * Creates new form AjoutLocal
     */
    public AjoutLocal() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelAddLocal = new javax.swing.JLabel();
        jLabelNomLocal = new javax.swing.JLabel();
        AjoutLocal_TextNom = new javax.swing.JTextField();
        jLabelDescriptionLocal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AjoutLocal_TextDescription = new javax.swing.JTextArea();
        jLabelLieuLocal = new javax.swing.JLabel();
        AjoutLocal_TextLieu = new javax.swing.JTextField();
        AjoutLocal_ButtonValider = new javax.swing.JToggleButton();
        AjoutLocal_ButtonQuitter = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAddLocal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelAddLocal.setText("Ajout d'un local");

        jLabelNomLocal.setText("Nom :");

        jLabelDescriptionLocal.setText("Description :");

        AjoutLocal_TextDescription.setColumns(20);
        AjoutLocal_TextDescription.setRows(5);
        jScrollPane1.setViewportView(AjoutLocal_TextDescription);

        jLabelLieuLocal.setText("Lieu :");

        AjoutLocal_ButtonValider.setText("Valider");
        AjoutLocal_ButtonValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjoutLocal_ButtonValiderMouseClicked(evt);
            }
        });
        AjoutLocal_ButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutLocal_ButtonValiderActionPerformed(evt);
            }
        });

        AjoutLocal_ButtonQuitter.setText("Annuler");
        AjoutLocal_ButtonQuitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjoutLocal_ButtonQuitterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomLocal)
                                    .addComponent(jLabelDescriptionLocal)
                                    .addComponent(jLabelLieuLocal))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AjoutLocal_TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AjoutLocal_TextLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AjoutLocal_ButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelAddLocal)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AjoutLocal_ButtonQuitter)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAddLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomLocal)
                    .addComponent(AjoutLocal_TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescriptionLocal)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjoutLocal_TextLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLieuLocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AjoutLocal_ButtonValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AjoutLocal_ButtonQuitter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AjoutLocal_ButtonValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjoutLocal_ButtonValiderMouseClicked
        // TODO add your handling code here:
      setVisible(false);
    }//GEN-LAST:event_AjoutLocal_ButtonValiderMouseClicked

    private void AjoutLocal_ButtonQuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjoutLocal_ButtonQuitterMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_AjoutLocal_ButtonQuitterMouseClicked

    private void AjoutLocal_ButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutLocal_ButtonValiderActionPerformed
        // TODO add your handling code here:
        try{
            Connexion co = new Connexion();
            Statement statement = co.connect();
            
            String Query = ("INSERT INTO locaux (nom, description, lieu) VALUES ('"+AjoutLocal_TextNom.getText()+"','"+AjoutLocal_TextDescription.getText()+"','"+AjoutLocal_TextLieu.getText()+"')");
            
            statement.execute(Query);
            
            JOptionPane.showMessageDialog(null, "Local ajouté");
            
             }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());}
    }//GEN-LAST:event_AjoutLocal_ButtonValiderActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AjoutLocal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutLocal_ButtonQuitter;
    private javax.swing.JToggleButton AjoutLocal_ButtonValider;
    private javax.swing.JTextArea AjoutLocal_TextDescription;
    private javax.swing.JTextField AjoutLocal_TextLieu;
    private javax.swing.JTextField AjoutLocal_TextNom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelAddLocal;
    private javax.swing.JLabel jLabelDescriptionLocal;
    private javax.swing.JLabel jLabelLieuLocal;
    private javax.swing.JLabel jLabelNomLocal;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

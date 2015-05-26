/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author 21105905
 */
public class AjoutOS extends javax.swing.JFrame {

    /**
     * Creates new form AjoutAppareils
     */
    public AjoutOS() {
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

        jLabelAddSalle = new javax.swing.JLabel();
        jLabelNomAppareil = new javax.swing.JLabel();
        AjoutOS_TextNom = new javax.swing.JTextField();
        jToggleButtonValiderAppareil = new javax.swing.JToggleButton();
        jLabelLocalAppareil = new javax.swing.JLabel();
        AjoutOS_TextVersion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAddSalle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelAddSalle.setText("Ajout d'un OS");

        jLabelNomAppareil.setText("Nom :");

        AjoutOS_TextNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutOS_TextNomActionPerformed(evt);
            }
        });

        jToggleButtonValiderAppareil.setText("Valider");
        jToggleButtonValiderAppareil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButtonValiderAppareilMouseClicked(evt);
            }
        });
        jToggleButtonValiderAppareil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonValiderAppareilActionPerformed(evt);
            }
        });

        jLabelLocalAppareil.setText("Version :");

        jButton1.setText("Annuler");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                            .addComponent(jLabelAddSalle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomAppareil)
                                    .addComponent(jLabelLocalAppareil))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AjoutOS_TextVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AjoutOS_TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonValiderAppareil, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAddSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomAppareil)
                    .addComponent(AjoutOS_TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLocalAppareil)
                    .addComponent(AjoutOS_TextVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonValiderAppareil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonValiderAppareilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonValiderAppareilMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        //Quitter fenetre
    }//GEN-LAST:event_jToggleButtonValiderAppareilMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButtonValiderAppareilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonValiderAppareilActionPerformed
        // TODO add your handling code here:
        try{
            Connexion co = new Connexion();
            Statement statement = co.connect();
            
             String Query = ("INSERT INTO os (nom, version) VALUES ('"+AjoutOS_TextNom.getText()+"','"+AjoutOS_TextVersion.getText()+"')");
            
            statement.execute(Query);
            
            JOptionPane.showMessageDialog(null, "OS ajoutée");
            
             }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());}
    }//GEN-LAST:event_jToggleButtonValiderAppareilActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void AjoutOS_TextNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutOS_TextNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjoutOS_TextNomActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutOS().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AjoutOS_TextNom;
    private javax.swing.JTextField AjoutOS_TextVersion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelAddSalle;
    private javax.swing.JLabel jLabelLocalAppareil;
    private javax.swing.JLabel jLabelNomAppareil;
    private javax.swing.JToggleButton jToggleButtonValiderAppareil;
    // End of variables declaration//GEN-END:variables
}

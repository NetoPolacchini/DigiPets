
package View;
import DAO.ExceptionDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class GerenciarUsuario extends javax.swing.JPanel {

    public GerenciarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BotaoGerenciarTutor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotaoGerenciarAnimal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 740));

        SubMenu.setBackground(new java.awt.Color(79, 171, 201));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel9.setText("Gerenciar usuário");

        javax.swing.GroupLayout SubMenuLayout = new javax.swing.GroupLayout(SubMenu);
        SubMenu.setLayout(SubMenuLayout);
        SubMenuLayout.setHorizontalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel9)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        SubMenuLayout.setVerticalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        BotaoGerenciarTutor.setBackground(new java.awt.Color(163, 216, 239));
        BotaoGerenciarTutor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoGerenciarTutorMouseMoved(evt);
            }
        });
        BotaoGerenciarTutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoGerenciarTutorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoGerenciarTutorMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Gerenciar tutor");

        javax.swing.GroupLayout BotaoGerenciarTutorLayout = new javax.swing.GroupLayout(BotaoGerenciarTutor);
        BotaoGerenciarTutor.setLayout(BotaoGerenciarTutorLayout);
        BotaoGerenciarTutorLayout.setHorizontalGroup(
            BotaoGerenciarTutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoGerenciarTutorLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoGerenciarTutorLayout.setVerticalGroup(
            BotaoGerenciarTutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoGerenciarTutorLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        BotaoGerenciarAnimal.setBackground(new java.awt.Color(163, 216, 239));
        BotaoGerenciarAnimal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoGerenciarAnimalMouseMoved(evt);
            }
        });
        BotaoGerenciarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoGerenciarAnimalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoGerenciarAnimalMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Gerenciar animal");

        javax.swing.GroupLayout BotaoGerenciarAnimalLayout = new javax.swing.GroupLayout(BotaoGerenciarAnimal);
        BotaoGerenciarAnimal.setLayout(BotaoGerenciarAnimalLayout);
        BotaoGerenciarAnimalLayout.setHorizontalGroup(
            BotaoGerenciarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoGerenciarAnimalLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        BotaoGerenciarAnimalLayout.setVerticalGroup(
            BotaoGerenciarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoGerenciarAnimalLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoGerenciarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoGerenciarTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(379, 379, 379))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(SubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(BotaoGerenciarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(BotaoGerenciarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoGerenciarTutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarTutorMouseClicked
        GerenciarTutor gerenciarTutor = new GerenciarTutor();
        showPanel(gerenciarTutor);
    }//GEN-LAST:event_BotaoGerenciarTutorMouseClicked

    private void BotaoGerenciarAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarAnimalMouseClicked
        GerenciarAnimalSelecioneTutor gerenciarAnimalSelecioneTutor = new GerenciarAnimalSelecioneTutor();
        showPanel(gerenciarAnimalSelecioneTutor);
    }//GEN-LAST:event_BotaoGerenciarAnimalMouseClicked

    private void BotaoGerenciarTutorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarTutorMouseMoved
        setColor(BotaoGerenciarTutor);
    }//GEN-LAST:event_BotaoGerenciarTutorMouseMoved

    private void BotaoGerenciarTutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarTutorMouseExited
        resetColor(BotaoGerenciarTutor);        
    }//GEN-LAST:event_BotaoGerenciarTutorMouseExited

    private void BotaoGerenciarAnimalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarAnimalMouseExited
        resetColor(BotaoGerenciarAnimal);
    }//GEN-LAST:event_BotaoGerenciarAnimalMouseExited

    private void BotaoGerenciarAnimalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarAnimalMouseMoved
        setColor(BotaoGerenciarAnimal);
    }//GEN-LAST:event_BotaoGerenciarAnimalMouseMoved
    
    public void showPanel(JPanel panel){
        panel.setSize(750,740);
        panel.setLocation(0, 0);
        
        this.removeAll();
        this.add(panel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(79,171,201));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(163,216,239));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoGerenciarAnimal;
    private javax.swing.JPanel BotaoGerenciarTutor;
    private javax.swing.JPanel SubMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author joao_
 */
public class GerenciarTutor extends javax.swing.JPanel {

    /**
     * Creates new form GerenciarTutor
     */
    public GerenciarTutor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BotaoCadastrarTutor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotaoAlterarTutor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotaoRemoverTutor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 740));

        SubMenu.setBackground(new java.awt.Color(79, 171, 201));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel9.setText("Gerenciar tutor");

        javax.swing.GroupLayout SubMenuLayout = new javax.swing.GroupLayout(SubMenu);
        SubMenu.setLayout(SubMenuLayout);
        SubMenuLayout.setHorizontalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel9)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        SubMenuLayout.setVerticalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        BotaoCadastrarTutor.setBackground(new java.awt.Color(163, 216, 239));
        BotaoCadastrarTutor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoCadastrarTutorMouseMoved(evt);
            }
        });
        BotaoCadastrarTutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarTutorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCadastrarTutorMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Cadastrar tutor");

        javax.swing.GroupLayout BotaoCadastrarTutorLayout = new javax.swing.GroupLayout(BotaoCadastrarTutor);
        BotaoCadastrarTutor.setLayout(BotaoCadastrarTutorLayout);
        BotaoCadastrarTutorLayout.setHorizontalGroup(
            BotaoCadastrarTutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarTutorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(104, 104, 104))
        );
        BotaoCadastrarTutorLayout.setVerticalGroup(
            BotaoCadastrarTutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarTutorLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        BotaoAlterarTutor.setBackground(new java.awt.Color(163, 216, 239));
        BotaoAlterarTutor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoAlterarTutorMouseMoved(evt);
            }
        });
        BotaoAlterarTutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlterarTutorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlterarTutorMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Alterar tutor");

        javax.swing.GroupLayout BotaoAlterarTutorLayout = new javax.swing.GroupLayout(BotaoAlterarTutor);
        BotaoAlterarTutor.setLayout(BotaoAlterarTutorLayout);
        BotaoAlterarTutorLayout.setHorizontalGroup(
            BotaoAlterarTutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAlterarTutorLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoAlterarTutorLayout.setVerticalGroup(
            BotaoAlterarTutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAlterarTutorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        BotaoRemoverTutor.setBackground(new java.awt.Color(163, 216, 239));
        BotaoRemoverTutor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoRemoverTutorMouseMoved(evt);
            }
        });
        BotaoRemoverTutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoRemoverTutorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoRemoverTutorMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Remover tutor");

        javax.swing.GroupLayout BotaoRemoverTutorLayout = new javax.swing.GroupLayout(BotaoRemoverTutor);
        BotaoRemoverTutor.setLayout(BotaoRemoverTutorLayout);
        BotaoRemoverTutorLayout.setHorizontalGroup(
            BotaoRemoverTutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRemoverTutorLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel4)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        BotaoRemoverTutorLayout.setVerticalGroup(
            BotaoRemoverTutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRemoverTutorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoCadastrarTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoAlterarTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoRemoverTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(SubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(SubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(BotaoCadastrarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(BotaoAlterarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotaoRemoverTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
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

    private void BotaoCadastrarTutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarTutorMouseClicked
        CadastrarTutor cadastrarTutor = new CadastrarTutor();
        showPanel(cadastrarTutor);
    }//GEN-LAST:event_BotaoCadastrarTutorMouseClicked

    private void BotaoAlterarTutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarTutorMouseClicked
        AlterarTutor alterarTutor = new AlterarTutor();
        showPanel(alterarTutor);
    }//GEN-LAST:event_BotaoAlterarTutorMouseClicked

    private void BotaoRemoverTutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverTutorMouseClicked
        RemoverTutor removerTutor = new RemoverTutor();
        showPanel(removerTutor);
    }//GEN-LAST:event_BotaoRemoverTutorMouseClicked

    private void BotaoCadastrarTutorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarTutorMouseMoved
        setColor(BotaoCadastrarTutor);
    }//GEN-LAST:event_BotaoCadastrarTutorMouseMoved

    private void BotaoCadastrarTutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarTutorMouseExited
        resetColor(BotaoCadastrarTutor);
    }//GEN-LAST:event_BotaoCadastrarTutorMouseExited

    private void BotaoAlterarTutorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarTutorMouseMoved
        setColor(BotaoAlterarTutor);
    }//GEN-LAST:event_BotaoAlterarTutorMouseMoved

    private void BotaoAlterarTutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarTutorMouseExited
        resetColor(BotaoAlterarTutor);
    }//GEN-LAST:event_BotaoAlterarTutorMouseExited

    private void BotaoRemoverTutorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverTutorMouseMoved
        setColor(BotaoRemoverTutor);
    }//GEN-LAST:event_BotaoRemoverTutorMouseMoved

    private void BotaoRemoverTutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverTutorMouseExited
        resetColor(BotaoRemoverTutor);
    }//GEN-LAST:event_BotaoRemoverTutorMouseExited
    
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
    private javax.swing.JPanel BotaoAlterarTutor;
    private javax.swing.JPanel BotaoCadastrarTutor;
    private javax.swing.JPanel BotaoRemoverTutor;
    private javax.swing.JPanel SubMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
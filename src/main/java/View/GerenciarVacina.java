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
public class GerenciarVacina extends javax.swing.JPanel {

    /**
     * Creates new form GerenciarVacina
     */
    private int a;
    public GerenciarVacina(int a) {
        this.a = a;
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
        BotaoCadastrarVacina = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotaoAlterarVacina = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotaoRemoverVacina = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 740));

        SubMenu.setBackground(new java.awt.Color(79, 171, 201));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel9.setText("Gerenciar vacina");

        javax.swing.GroupLayout SubMenuLayout = new javax.swing.GroupLayout(SubMenu);
        SubMenu.setLayout(SubMenuLayout);
        SubMenuLayout.setHorizontalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubMenuLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(206, 206, 206))
        );
        SubMenuLayout.setVerticalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        BotaoCadastrarVacina.setBackground(new java.awt.Color(163, 216, 239));
        BotaoCadastrarVacina.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoCadastrarVacinaMouseMoved(evt);
            }
        });
        BotaoCadastrarVacina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarVacinaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCadastrarVacinaMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Cadastrar vacina");

        javax.swing.GroupLayout BotaoCadastrarVacinaLayout = new javax.swing.GroupLayout(BotaoCadastrarVacina);
        BotaoCadastrarVacina.setLayout(BotaoCadastrarVacinaLayout);
        BotaoCadastrarVacinaLayout.setHorizontalGroup(
            BotaoCadastrarVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarVacinaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(104, 104, 104))
        );
        BotaoCadastrarVacinaLayout.setVerticalGroup(
            BotaoCadastrarVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarVacinaLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        BotaoAlterarVacina.setBackground(new java.awt.Color(163, 216, 239));
        BotaoAlterarVacina.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoAlterarVacinaMouseMoved(evt);
            }
        });
        BotaoAlterarVacina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlterarVacinaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlterarVacinaMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Alterar vacina");

        javax.swing.GroupLayout BotaoAlterarVacinaLayout = new javax.swing.GroupLayout(BotaoAlterarVacina);
        BotaoAlterarVacina.setLayout(BotaoAlterarVacinaLayout);
        BotaoAlterarVacinaLayout.setHorizontalGroup(
            BotaoAlterarVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAlterarVacinaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoAlterarVacinaLayout.setVerticalGroup(
            BotaoAlterarVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAlterarVacinaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        BotaoRemoverVacina.setBackground(new java.awt.Color(163, 216, 239));
        BotaoRemoverVacina.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoRemoverVacinaMouseMoved(evt);
            }
        });
        BotaoRemoverVacina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoRemoverVacinaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoRemoverVacinaMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Remover vacina");

        javax.swing.GroupLayout BotaoRemoverVacinaLayout = new javax.swing.GroupLayout(BotaoRemoverVacina);
        BotaoRemoverVacina.setLayout(BotaoRemoverVacinaLayout);
        BotaoRemoverVacinaLayout.setHorizontalGroup(
            BotaoRemoverVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRemoverVacinaLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel4)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        BotaoRemoverVacinaLayout.setVerticalGroup(
            BotaoRemoverVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRemoverVacinaLayout.createSequentialGroup()
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
                    .addComponent(BotaoCadastrarVacina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoAlterarVacina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoRemoverVacina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(SubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(SubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(BotaoCadastrarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(BotaoAlterarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotaoRemoverVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void BotaoCadastrarVacinaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarVacinaMouseMoved
        setColor(BotaoCadastrarVacina);
    }//GEN-LAST:event_BotaoCadastrarVacinaMouseMoved

    private void BotaoCadastrarVacinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarVacinaMouseClicked
        CadastrarVacina cadastrarVacina = new CadastrarVacina(a);
        showPanel(cadastrarVacina);
    }//GEN-LAST:event_BotaoCadastrarVacinaMouseClicked

    private void BotaoCadastrarVacinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarVacinaMouseExited
        resetColor(BotaoCadastrarVacina);
    }//GEN-LAST:event_BotaoCadastrarVacinaMouseExited

    private void BotaoAlterarVacinaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarVacinaMouseMoved
        setColor(BotaoAlterarVacina);
    }//GEN-LAST:event_BotaoAlterarVacinaMouseMoved

    private void BotaoAlterarVacinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarVacinaMouseClicked
        AlterarVacina alterarVacina = new AlterarVacina(a);
        showPanel(alterarVacina);
    }//GEN-LAST:event_BotaoAlterarVacinaMouseClicked

    private void BotaoAlterarVacinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarVacinaMouseExited
        resetColor(BotaoAlterarVacina);
    }//GEN-LAST:event_BotaoAlterarVacinaMouseExited

    private void BotaoRemoverVacinaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverVacinaMouseMoved
        setColor(BotaoRemoverVacina);
    }//GEN-LAST:event_BotaoRemoverVacinaMouseMoved

    private void BotaoRemoverVacinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverVacinaMouseClicked
        RemoverVacina removerVacina = new RemoverVacina(a);
        showPanel(removerVacina);
    }//GEN-LAST:event_BotaoRemoverVacinaMouseClicked

    private void BotaoRemoverVacinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverVacinaMouseExited
        resetColor(BotaoRemoverVacina);
    }//GEN-LAST:event_BotaoRemoverVacinaMouseExited

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
    private javax.swing.JPanel BotaoAlterarVacina;
    private javax.swing.JPanel BotaoCadastrarVacina;
    private javax.swing.JPanel BotaoRemoverVacina;
    private javax.swing.JPanel SubMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

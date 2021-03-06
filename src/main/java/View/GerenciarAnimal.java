package View;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class GerenciarAnimal extends javax.swing.JPanel {

    
    private int a;

    public void setA(int a) {
        this.a = a;
    }
    
    public GerenciarAnimal() {
        initComponents();
    }
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BotaoCadastrarAnimal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotaoAlterarAnimal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotaoRemoverAnimal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 740));

        SubMenu.setBackground(new java.awt.Color(79, 171, 201));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel9.setText("Gerenciar animal");

        javax.swing.GroupLayout SubMenuLayout = new javax.swing.GroupLayout(SubMenu);
        SubMenu.setLayout(SubMenuLayout);
        SubMenuLayout.setHorizontalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubMenuLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(197, 197, 197))
        );
        SubMenuLayout.setVerticalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        BotaoCadastrarAnimal.setBackground(new java.awt.Color(163, 216, 239));
        BotaoCadastrarAnimal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAnimalMouseMoved(evt);
            }
        });
        BotaoCadastrarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAnimalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCadastrarAnimalMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Cadastrar animal");

        javax.swing.GroupLayout BotaoCadastrarAnimalLayout = new javax.swing.GroupLayout(BotaoCadastrarAnimal);
        BotaoCadastrarAnimal.setLayout(BotaoCadastrarAnimalLayout);
        BotaoCadastrarAnimalLayout.setHorizontalGroup(
            BotaoCadastrarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarAnimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(104, 104, 104))
        );
        BotaoCadastrarAnimalLayout.setVerticalGroup(
            BotaoCadastrarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarAnimalLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        BotaoAlterarAnimal.setBackground(new java.awt.Color(163, 216, 239));
        BotaoAlterarAnimal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoAlterarAnimalMouseMoved(evt);
            }
        });
        BotaoAlterarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAlterarAnimalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAlterarAnimalMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Alterar animal");

        javax.swing.GroupLayout BotaoAlterarAnimalLayout = new javax.swing.GroupLayout(BotaoAlterarAnimal);
        BotaoAlterarAnimal.setLayout(BotaoAlterarAnimalLayout);
        BotaoAlterarAnimalLayout.setHorizontalGroup(
            BotaoAlterarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAlterarAnimalLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoAlterarAnimalLayout.setVerticalGroup(
            BotaoAlterarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAlterarAnimalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        BotaoRemoverAnimal.setBackground(new java.awt.Color(163, 216, 239));
        BotaoRemoverAnimal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotaoRemoverAnimalMouseMoved(evt);
            }
        });
        BotaoRemoverAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoRemoverAnimalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoRemoverAnimalMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Remover animal");

        javax.swing.GroupLayout BotaoRemoverAnimalLayout = new javax.swing.GroupLayout(BotaoRemoverAnimal);
        BotaoRemoverAnimal.setLayout(BotaoRemoverAnimalLayout);
        BotaoRemoverAnimalLayout.setHorizontalGroup(
            BotaoRemoverAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRemoverAnimalLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel4)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        BotaoRemoverAnimalLayout.setVerticalGroup(
            BotaoRemoverAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoRemoverAnimalLayout.createSequentialGroup()
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
                    .addComponent(BotaoCadastrarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoAlterarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoRemoverAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(SubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(SubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(BotaoCadastrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(BotaoAlterarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotaoRemoverAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void BotaoCadastrarAnimalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAnimalMouseMoved
        setColor(BotaoCadastrarAnimal);
    }//GEN-LAST:event_BotaoCadastrarAnimalMouseMoved

    private void BotaoCadastrarAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAnimalMouseClicked
        CadastrarAnimal cadastrarAnimal = new CadastrarAnimal(a);
        showPanel(cadastrarAnimal);
    }//GEN-LAST:event_BotaoCadastrarAnimalMouseClicked

    private void BotaoCadastrarAnimalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarAnimalMouseExited
        resetColor(BotaoCadastrarAnimal);
    }//GEN-LAST:event_BotaoCadastrarAnimalMouseExited

    private void BotaoAlterarAnimalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarAnimalMouseMoved
        setColor(BotaoAlterarAnimal);
    }//GEN-LAST:event_BotaoAlterarAnimalMouseMoved

    private void BotaoAlterarAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarAnimalMouseClicked
        AlterarAnimal alterarAnimal = new AlterarAnimal(a);
        showPanel(alterarAnimal);
    }//GEN-LAST:event_BotaoAlterarAnimalMouseClicked

    private void BotaoAlterarAnimalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAlterarAnimalMouseExited
        resetColor(BotaoAlterarAnimal);
    }//GEN-LAST:event_BotaoAlterarAnimalMouseExited

    private void BotaoRemoverAnimalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverAnimalMouseMoved
        setColor(BotaoRemoverAnimal);
    }//GEN-LAST:event_BotaoRemoverAnimalMouseMoved

    private void BotaoRemoverAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverAnimalMouseClicked
        RemoverAnimal removerAnimal = new RemoverAnimal(a);
        showPanel(removerAnimal);
    }//GEN-LAST:event_BotaoRemoverAnimalMouseClicked

    private void BotaoRemoverAnimalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRemoverAnimalMouseExited
        resetColor(BotaoRemoverAnimal);
    }//GEN-LAST:event_BotaoRemoverAnimalMouseExited

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
    private javax.swing.JPanel BotaoAlterarAnimal;
    private javax.swing.JPanel BotaoCadastrarAnimal;
    private javax.swing.JPanel BotaoRemoverAnimal;
    private javax.swing.JPanel SubMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

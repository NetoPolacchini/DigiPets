
package View;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class HomeVeterinario extends javax.swing.JFrame {

    public HomeVeterinario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        BotaoGerenciarUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotaoConsultarCarteira = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BotaoGerenciarVacina = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        SubMenu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(135, 206, 235));

        BotaoGerenciarUsuario.setBackground(new java.awt.Color(163, 216, 239));
        BotaoGerenciarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoGerenciarUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoGerenciarUsuarioMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Gerenciar usuário");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\ProjetoDigipets\\src\\main\\java\\com\\mycompany\\projetodigipets\\view\\imagens\\icons8_user_50px_3.png")); // NOI18N

        javax.swing.GroupLayout BotaoGerenciarUsuarioLayout = new javax.swing.GroupLayout(BotaoGerenciarUsuario);
        BotaoGerenciarUsuario.setLayout(BotaoGerenciarUsuarioLayout);
        BotaoGerenciarUsuarioLayout.setHorizontalGroup(
            BotaoGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoGerenciarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoGerenciarUsuarioLayout.setVerticalGroup(
            BotaoGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoGerenciarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoGerenciarUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        BotaoConsultarCarteira.setBackground(new java.awt.Color(163, 216, 239));
        BotaoConsultarCarteira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoConsultarCarteiraMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoConsultarCarteiraMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Consultar carteira");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\ProjetoDigipets\\src\\main\\java\\com\\mycompany\\projetodigipets\\view\\imagens\\icons8_document_50px.png")); // NOI18N

        javax.swing.GroupLayout BotaoConsultarCarteiraLayout = new javax.swing.GroupLayout(BotaoConsultarCarteira);
        BotaoConsultarCarteira.setLayout(BotaoConsultarCarteiraLayout);
        BotaoConsultarCarteiraLayout.setHorizontalGroup(
            BotaoConsultarCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoConsultarCarteiraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        BotaoConsultarCarteiraLayout.setVerticalGroup(
            BotaoConsultarCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoConsultarCarteiraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BotaoConsultarCarteiraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoGerenciarVacina.setBackground(new java.awt.Color(163, 216, 239));
        BotaoGerenciarVacina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoGerenciarVacinaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoGerenciarVacinaMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Gerenciar vacina");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\ProjetoDigipets\\src\\main\\java\\com\\mycompany\\projetodigipets\\view\\imagens\\icons8_syringe_40px.png")); // NOI18N

        javax.swing.GroupLayout BotaoGerenciarVacinaLayout = new javax.swing.GroupLayout(BotaoGerenciarVacina);
        BotaoGerenciarVacina.setLayout(BotaoGerenciarVacinaLayout);
        BotaoGerenciarVacinaLayout.setHorizontalGroup(
            BotaoGerenciarVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoGerenciarVacinaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        BotaoGerenciarVacinaLayout.setVerticalGroup(
            BotaoGerenciarVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoGerenciarVacinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BotaoGerenciarVacinaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel1.setText("Digipets");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\joao_\\Documents\\NetBeansProjects\\ProjetoDigipets\\src\\main\\java\\com\\mycompany\\projetodigipets\\view\\imagens\\icons8_doge_100px.png")); // NOI18N

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoGerenciarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel1))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel8))
                            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotaoGerenciarVacina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoConsultarCarteira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(BotaoGerenciarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoGerenciarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoConsultarCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel8)
                .addGap(81, 81, 81))
        );

        background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 760));

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 20, 20));

        jLabel11.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel11.setText("-");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 20, 20));

        content.setBackground(new java.awt.Color(255, 255, 255));

        SubMenu.setBackground(new java.awt.Color(79, 171, 201));

        jLabel9.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel9.setText("Bem vindo!");

        javax.swing.GroupLayout SubMenuLayout = new javax.swing.GroupLayout(SubMenu);
        SubMenu.setLayout(SubMenuLayout);
        SubMenuLayout.setHorizontalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel9)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        SubMenuLayout.setVerticalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(SubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(531, Short.MAX_VALUE))
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 750, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoGerenciarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarUsuarioMouseClicked
        GerenciarUsuario gerenciarUsuario = new GerenciarUsuario();
        showPanel(gerenciarUsuario);
    }//GEN-LAST:event_BotaoGerenciarUsuarioMouseClicked

    private void BotaoConsultarCarteiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoConsultarCarteiraMouseClicked
        ConsultarCarteiraSelecioneTutor consultarCarteiraSelecioneTutor = new ConsultarCarteiraSelecioneTutor();
        showPanel(consultarCarteiraSelecioneTutor);
    }//GEN-LAST:event_BotaoConsultarCarteiraMouseClicked

    private void BotaoGerenciarVacinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarVacinaMouseClicked
         GerenciarVacinaSelecioneTutor gerenciarVacinaSelecioneTutor = new GerenciarVacinaSelecioneTutor();
        showPanel(gerenciarVacinaSelecioneTutor);
    }//GEN-LAST:event_BotaoGerenciarVacinaMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);    
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void BotaoGerenciarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarUsuarioMousePressed
        setColor(BotaoGerenciarUsuario);
        resetColor(BotaoConsultarCarteira);
        resetColor(BotaoGerenciarVacina);
    }//GEN-LAST:event_BotaoGerenciarUsuarioMousePressed

    private void BotaoGerenciarVacinaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGerenciarVacinaMousePressed
        setColor(BotaoGerenciarVacina);
        resetColor(BotaoConsultarCarteira);
        resetColor(BotaoGerenciarUsuario);
    }//GEN-LAST:event_BotaoGerenciarVacinaMousePressed

    private void BotaoConsultarCarteiraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoConsultarCarteiraMousePressed
        setColor(BotaoConsultarCarteira);
        resetColor(BotaoGerenciarVacina);
        resetColor(BotaoGerenciarUsuario);
    }//GEN-LAST:event_BotaoConsultarCarteiraMousePressed
    
    public void showPanel(JPanel panel){
        panel.setSize(750,740);
        panel.setLocation(0, 0);
        
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
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
            java.util.logging.Logger.getLogger(HomeVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeVeterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new HomeVeterinario().setVisible(true);
            }
        });
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(79,171,201));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(163,216,239));
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoConsultarCarteira;
    private javax.swing.JPanel BotaoGerenciarUsuario;
    private javax.swing.JPanel BotaoGerenciarVacina;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel SubMenu;
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

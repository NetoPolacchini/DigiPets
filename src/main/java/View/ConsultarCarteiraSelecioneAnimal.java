/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import DAO.AnimalDAO;
import DAO.ExceptionDAO;
import Model.Animal;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joao_
 */
public class ConsultarCarteiraSelecioneAnimal extends javax.swing.JPanel {

    /**
     * Creates new form ConsultarCarteiraSelecioneAnimal
     * @throws DAO.ExceptionDAO
     */
    private int a;
    public ConsultarCarteiraSelecioneAnimal(int a) {
        this.a = a;
        initComponents();
        try {
            loadTable(a);
        } catch (ExceptionDAO ex) {
            Logger.getLogger(ConsultarCarteiraSelecioneAnimal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarCarteiraSelecioneAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        SubMenu7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableTutores5 = new javax.swing.JTable();

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(750, 740));

        SubMenu7.setBackground(new java.awt.Color(79, 171, 201));

        jLabel19.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel19.setText("Selecione o animal");

        javax.swing.GroupLayout SubMenu7Layout = new javax.swing.GroupLayout(SubMenu7);
        SubMenu7.setLayout(SubMenu7Layout);
        SubMenu7Layout.setHorizontalGroup(
            SubMenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenu7Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel19)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        SubMenu7Layout.setVerticalGroup(
            SubMenu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenu7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jButton8.setBackground(new java.awt.Color(79, 171, 201));
        jButton8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton8.setText("Confirmar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTableTutores5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableTutores5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "C??digo", "Nome", "Esp??cie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTutores5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTutores5MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableTutores5);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SubMenu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(SubMenu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ConsultarCarteiraVeterinario consultarCarteiraVeterinario = new ConsultarCarteiraVeterinario((int) jTableTutores5.getValueAt(jTableTutores5.getSelectedRow(), 0));
        showPanel(consultarCarteiraVeterinario);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTableTutores5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTutores5MouseClicked
        
    }//GEN-LAST:event_jTableTutores5MouseClicked

    public void showPanel(JPanel panel){
        panel.setSize(750,740);
        panel.setLocation(0, 0);
        
        this.removeAll();
        this.add(panel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }
    
    private void loadTable(int a) throws ExceptionDAO, SQLException{
        DefaultTableModel modelo = (DefaultTableModel)jTableTutores5.getModel();
        modelo.setNumRows(0);
        
        AnimalDAO adao = new AnimalDAO();
        
        for(Animal ani: adao.listarAnimalTutor(a)){
            
            modelo.addRow(new Object[]{
                ani.getCod(),
                ani.getNome(),
                ani.getRaca(),
                ani.getEspecie()
            });
        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SubMenu7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableTutores5;
    // End of variables declaration//GEN-END:variables
}

package views;

import controllers.ControleTabela;
import controllers.ControlePartidosRepetidos;
import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import java.util.List;
import javax.swing.ListSelectionModel;
import models.CamaraDadosAbertos;
import models.ModeloDeputados;
import models.ModeloTabela;
import javax.swing.table.TableRowSorter;

public class TelaDados extends javax.swing.JInternalFrame {
    
    private ModeloDeputados deputado = new ModeloDeputados();
    private TableRowSorter<ModeloTabela> sorter;
    private ModeloTabela tabelaDeputados = CamaraDadosAbertos.getTabelaDeputados();
    //private ModeloTabela tabelaPartidos = ControleTabela.eliminarPartidosRepetidos();
    
    
    
    public TelaDados() {
        initComponents();
        preencherDadosTabela(tabelaDeputados);
        //preencherDadosTabela(tabelaPartidos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guias = new javax.swing.JTabbedPane();
        guiaDeputados = new javax.swing.JPanel();
        botaoIr = new javax.swing.JButton();
        buscarDep = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDadosDeputados = new javax.swing.JTable();
        botaoInfo = new javax.swing.JButton();
        guiaPartidos = new javax.swing.JPanel();
        buscarPart = new javax.swing.JTextField();
        botaoIr2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaDadosPartidos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Câmara dos Deputados");

        botaoIr.setText("Ir");
        botaoIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIrActionPerformed(evt);
            }
        });

        buscarDep.setText("Buscar Deputado");
        buscarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDepActionPerformed(evt);
            }
        });

        tabelaDadosDeputados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaDadosDeputados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaDadosDeputados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDadosDeputadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaDadosDeputados);

        botaoInfo.setText("Info");
        botaoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guiaDeputadosLayout = new javax.swing.GroupLayout(guiaDeputados);
        guiaDeputados.setLayout(guiaDeputadosLayout);
        guiaDeputadosLayout.setHorizontalGroup(
            guiaDeputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaDeputadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoIr)
                .addGap(11, 11, 11))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        guiaDeputadosLayout.setVerticalGroup(
            guiaDeputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaDeputadosLayout.createSequentialGroup()
                .addGroup(guiaDeputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIr)
                    .addComponent(buscarDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
        );

        guias.addTab("Deputados", new javax.swing.ImageIcon(getClass().getResource("/img/group.png")), guiaDeputados); // NOI18N

        buscarPart.setText("Buscar Partido");

        botaoIr2.setText("Ir");
        botaoIr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIr2ActionPerformed(evt);
            }
        });

        tabelaDadosPartidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaDadosPartidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabelaDadosPartidos);

        javax.swing.GroupLayout guiaPartidosLayout = new javax.swing.GroupLayout(guiaPartidos);
        guiaPartidos.setLayout(guiaPartidosLayout);
        guiaPartidosLayout.setHorizontalGroup(
            guiaPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiaPartidosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarPart, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoIr2)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        guiaPartidosLayout.setVerticalGroup(
            guiaPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaPartidosLayout.createSequentialGroup()
                .addGroup(guiaPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoIr2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
        );

        guias.addTab("Partidos", new javax.swing.ImageIcon(getClass().getResource("/img/rosette.png")), guiaPartidos); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guias)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guias)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIrActionPerformed
        String text = buscarDep.getText().toUpperCase();
        if(text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(javax.swing.RowFilter.regexFilter(text));
        }
    }//GEN-LAST:event_botaoIrActionPerformed

    private void botaoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInfoActionPerformed
        
        TelaDetalhes telaDetalhes = new TelaDetalhes(deputado);
        telaDetalhes.setVisible(true);
       
    }//GEN-LAST:event_botaoInfoActionPerformed

    private void botaoIr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIr2ActionPerformed
        String text = buscarPart.getText().toUpperCase();
        if(text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(javax.swing.RowFilter.regexFilter(text));
        }              
    }//GEN-LAST:event_botaoIr2ActionPerformed

    private void tabelaDadosDeputadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDadosDeputadosMouseClicked
        deputado.setNome(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 0));
        deputado.setPartido(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 1));
        deputado.setEstado(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 2));
        deputado.setEmail(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 3));
        deputado.setTelefone(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 4));
        deputado.setCondicao(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 5));
        deputado.setSexo(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 6));
        deputado.setId(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 7));
        deputado.setMatricula(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 8));
        deputado.setNomeParlamentar(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 9));
        deputado.setGabinete(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 10));
        deputado.setAnexo(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 11));
        deputado.setLinkFoto(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 12));
        deputado.setUf(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 13));
        deputado.setSituacaoLegislatura(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 14));
        deputado.setNascimento(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 15));
        deputado.setFalecimento(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 16));
        deputado.setNumLegislatura(""+tabelaDadosDeputados.getValueAt(tabelaDadosDeputados.getSelectedRow(), 17));
    }//GEN-LAST:event_tabelaDadosDeputadosMouseClicked

    private void buscarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarDepActionPerformed
        
    public void preencherDadosTabela(ModeloTabela tabelaDeputados) {
        tabelaDadosDeputados.setModel(tabelaDeputados);
        
        tabelaDadosDeputados.getColumnModel().getColumn(0).setPreferredWidth(260);
        tabelaDadosDeputados.getColumnModel().getColumn(0).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(1).setPreferredWidth(60);
        tabelaDadosDeputados.getColumnModel().getColumn(1).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabelaDadosDeputados.getColumnModel().getColumn(2).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(3).setPreferredWidth(250);
        tabelaDadosDeputados.getColumnModel().getColumn(3).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(4).setPreferredWidth(80);
        tabelaDadosDeputados.getColumnModel().getColumn(4).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(5).setPreferredWidth(80);
        tabelaDadosDeputados.getColumnModel().getColumn(5).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(6).setPreferredWidth(80);
        tabelaDadosDeputados.getColumnModel().getColumn(6).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(7).setPreferredWidth(60);
        tabelaDadosDeputados.getColumnModel().getColumn(7).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(8).setPreferredWidth(60);
        tabelaDadosDeputados.getColumnModel().getColumn(8).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(9).setPreferredWidth(200);
        tabelaDadosDeputados.getColumnModel().getColumn(9).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(10).setPreferredWidth(60);
        tabelaDadosDeputados.getColumnModel().getColumn(10).setResizable(false);
        tabelaDadosDeputados.getColumnModel().getColumn(11).setPreferredWidth(60);
        tabelaDadosDeputados.getColumnModel().getColumn(11).setResizable(false);
        
        tabelaDadosDeputados.getTableHeader().setReorderingAllowed(false);
        tabelaDadosDeputados.setAutoResizeMode(tabelaDadosDeputados.AUTO_RESIZE_OFF);
        
        tabelaDadosDeputados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        sorter = new TableRowSorter<ModeloTabela>(tabelaDeputados);
        tabelaDadosDeputados.setRowSorter(sorter);
        
    }
    
    public void preencherTabela(ModeloTabela tabelaPartidos) {
        
        tabelaDadosPartidos.setModel(tabelaPartidos);
        
        tabelaDadosPartidos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaDadosPartidos.getColumnModel().getColumn(0).setResizable(false);
        tabelaDadosPartidos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabelaDadosPartidos.getColumnModel().getColumn(1).setResizable(false);
        tabelaDadosPartidos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabelaDadosPartidos.getColumnModel().getColumn(2).setResizable(false);
        
        tabelaDadosPartidos.getTableHeader().setReorderingAllowed(false);
        tabelaDadosPartidos.setAutoResizeMode(tabelaDadosPartidos.AUTO_RESIZE_OFF);
        
        tabelaDadosPartidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //sorter = new TableRowSorter<ModeloTabela>(this.tabelaPartidos);
        tabelaDadosPartidos.setRowSorter(sorter);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInfo;
    private javax.swing.JButton botaoIr;
    private javax.swing.JButton botaoIr2;
    private javax.swing.JTextField buscarDep;
    private javax.swing.JTextField buscarPart;
    private javax.swing.JPanel guiaDeputados;
    private javax.swing.JPanel guiaPartidos;
    private javax.swing.JTabbedPane guias;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaDadosDeputados;
    private javax.swing.JTable tabelaDadosPartidos;
    // End of variables declaration//GEN-END:variables
}

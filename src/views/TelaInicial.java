package views;

import javax.swing.JOptionPane;
import controllers.ControleTabela;
import edu.unb.fga.dadosabertos.Camara;
import edu.unb.fga.dadosabertos.Deputado;
import static java.lang.Thread.sleep;
import java.util.List;
import models.CamaraDadosAbertos;
import java.io.IOException;
import javax.xml.bind.JAXBException;

public class TelaInicial extends javax.swing.JFrame {
    
    private static List<Deputado> deputados;

    
    public TelaInicial() {
        initComponents();
        barraProgresso.setVisible(false);
        labelBarraProgresso.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        labelBarraProgresso = new javax.swing.JLabel();
        barraProgresso = new javax.swing.JProgressBar();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        menuDadosAbertos = new javax.swing.JMenu();
        menuItemConectar = new javax.swing.JMenuItem();
        menuItemCarregarXML = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuItemHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");

        labelBarraProgresso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelBarraProgresso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        barraProgresso.setStringPainted(true);

        jDesktopPane1.setLayer(labelBarraProgresso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(barraProgresso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(labelBarraProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(labelBarraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelBarraProgresso.getAccessibleContext().setAccessibleParent(this);

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/house.png"))); // NOI18N
        menuArquivo.setText("Arquivo");

        menuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_out.png"))); // NOI18N
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        barraMenu.add(menuArquivo);

        menuDadosAbertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/database_table.png"))); // NOI18N
        menuDadosAbertos.setText("Dados Abertos");

        menuItemConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/server_connect.png"))); // NOI18N
        menuItemConectar.setText("Conectar WebService");
        menuItemConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConectarActionPerformed(evt);
            }
        });
        menuDadosAbertos.add(menuItemConectar);

        menuItemCarregarXML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xhtml_go.png"))); // NOI18N
        menuItemCarregarXML.setText("Carregar XML");
        menuItemCarregarXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCarregarXMLActionPerformed(evt);
            }
        });
        menuDadosAbertos.add(menuItemCarregarXML);

        barraMenu.add(menuDadosAbertos);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information.png"))); // NOI18N
        menuSobre.setText("Sobre");

        menuItemHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help (2).png"))); // NOI18N
        menuItemHelp.setText("Help");
        menuItemHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHelpActionPerformed(evt);
            }
        });
        menuSobre.add(menuItemHelp);

        barraMenu.add(menuSobre);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConectarActionPerformed
        
        barraProgresso.setVisible(true);
        labelBarraProgresso.setVisible(true);
        
        new Thread(){
            @Override
            public void run() {
                for(int i=0; i<101; i++) {
                    try {
                        sleep(2001);
                        barraProgresso.setValue(i);
                        if(barraProgresso.getValue() <= 10) {
                            labelBarraProgresso.setText("Conectando ao WebService da Câmara dos Deputados...");
                        } else if(barraProgresso.getValue() <= 40) {
                            labelBarraProgresso.setText("Carregando Banco de Dados...");
                        } else if(barraProgresso.getValue() <= 90) {
                            labelBarraProgresso.setText("Obtendo Dados Abertos da Câmara dos Deputados...");
                        } else {
                            labelBarraProgresso.setText("Abrindo Tela de Dados...");
                        }
                    } catch(InterruptedException erro) {
                        JOptionPane.showMessageDialog(null, "Erro na Conexão e Obtenção dos Dados!\nErro: " + erro.getMessage());
                      }
                }
                
                barraProgresso.setVisible(false);
                labelBarraProgresso.setVisible(false);
                
                TelaDados telaDados = new TelaDados();
                jDesktopPane1.add(telaDados);
                telaDados.setVisible(true);
            }
        }.start();
        
        new Thread(){
            @Override
            public void run() {
                Camara dadosCamara = new Camara();
                try {
                    dadosCamara.obterDados();
                } catch (JAXBException | IOException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao Obter Dados do WebService!\nErro: " + erro.getMessage());
                  }
                
                deputados = dadosCamara.getDeputados();
                
                CamaraDadosAbertos.setDeputados(deputados);
                
                ControleTabela controleTabela = new ControleTabela();
                controleTabela.gerarTabela(deputados);
                //controleTabela.gerarTabela(partidos);
            }
        }.start();
    }//GEN-LAST:event_menuItemConectarActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemCarregarXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCarregarXMLActionPerformed
        
    }//GEN-LAST:event_menuItemCarregarXMLActionPerformed

    private void menuItemHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHelpActionPerformed
        TelaHelp telaHelp = new TelaHelp();
        telaHelp.setVisible(true);
    }//GEN-LAST:event_menuItemHelpActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JProgressBar barraProgresso;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel labelBarraProgresso;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuDadosAbertos;
    private javax.swing.JMenuItem menuItemCarregarXML;
    private javax.swing.JMenuItem menuItemConectar;
    private javax.swing.JMenuItem menuItemHelp;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}

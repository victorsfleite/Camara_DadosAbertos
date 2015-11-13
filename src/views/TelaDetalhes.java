package views;

import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import models.ModeloDeputados;
import java.awt.MediaTracker;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaDetalhes extends javax.swing.JFrame {
    
    public TelaDetalhes(ModeloDeputados deputado) {
        initComponents();
        campoTextoUf.setText(deputado.getUf());
        campoTextoSituacao.setText(deputado.getSituacaoLegislatura());
        campoTextoNascimento.setText(deputado.getNascimento());
        campoTextoFalecimento.setText(deputado.getFalecimento());
        campoTextoNumLegislatura.setText(deputado.getNumLegislatura());
        
        try {
            URL foto = new URL(deputado.getLinkFoto());
            ImageIcon imagem = new ImageIcon(foto);
            
            while(imagem.getImageLoadStatus() == MediaTracker.LOADING);
                labelFoto.setIcon(imagem);            
        } catch (MalformedURLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar foto do deputado!\nErro: " + erro.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDetalhes = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        labelUf = new javax.swing.JLabel();
        labelSituacao = new javax.swing.JLabel();
        labelFalecimento = new javax.swing.JLabel();
        labelNascimento = new javax.swing.JLabel();
        labelNumLegislatura = new javax.swing.JLabel();
        campoTextoUf = new javax.swing.JTextField();
        campoTextoSituacao = new javax.swing.JTextField();
        campoTextoNascimento = new javax.swing.JTextField();
        campoTextoFalecimento = new javax.swing.JTextField();
        campoTextoNumLegislatura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalhes do Deputado");

        labelUf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUf.setText("UF");

        labelSituacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSituacao.setText("Situação Atual");

        labelFalecimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFalecimento.setText("Falecimento");

        labelNascimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNascimento.setText("Nascimento");

        labelNumLegislatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumLegislatura.setText("Nº Legislatura");

        javax.swing.GroupLayout painelDetalhesLayout = new javax.swing.GroupLayout(painelDetalhes);
        painelDetalhes.setLayout(painelDetalhesLayout);
        painelDetalhesLayout.setHorizontalGroup(
            painelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDetalhesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDetalhesLayout.createSequentialGroup()
                        .addComponent(campoTextoUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(campoTextoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTextoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTextoFalecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(campoTextoNumLegislatura, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addGroup(painelDetalhesLayout.createSequentialGroup()
                        .addComponent(labelUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(labelSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDetalhesLayout.createSequentialGroup()
                                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelDetalhesLayout.createSequentialGroup()
                                .addComponent(labelNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelFalecimento, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNumLegislatura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        painelDetalhesLayout.setVerticalGroup(
            painelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDetalhesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFalecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumLegislatura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoFalecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoNumLegislatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoTextoFalecimento;
    private javax.swing.JTextField campoTextoNascimento;
    private javax.swing.JTextField campoTextoNumLegislatura;
    private javax.swing.JTextField campoTextoSituacao;
    private javax.swing.JTextField campoTextoUf;
    private javax.swing.JLabel labelFalecimento;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNumLegislatura;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JLabel labelUf;
    private javax.swing.JPanel painelDetalhes;
    // End of variables declaration//GEN-END:variables
}

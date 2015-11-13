package views;

public class TelaHelp extends javax.swing.JFrame {

    public TelaHelp() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelHelp = new javax.swing.JPanel();
        botaoHelpConectar = new javax.swing.JButton();
        botaoHelpCarregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help");
        setResizable(false);

        botaoHelpConectar.setText("Menu Conectar WebService");
        botaoHelpConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHelpConectarActionPerformed(evt);
            }
        });

        botaoHelpCarregar.setText("Menu Carregar XML");
        botaoHelpCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHelpCarregarActionPerformed(evt);
            }
        });

        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout painelHelpLayout = new javax.swing.GroupLayout(painelHelp);
        painelHelp.setLayout(painelHelpLayout);
        painelHelpLayout.setHorizontalGroup(
            painelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelHelpLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(painelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoHelpCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoHelpConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        painelHelpLayout.setVerticalGroup(
            painelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHelpLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(botaoHelpConectar)
                .addGap(33, 33, 33)
                .addComponent(botaoHelpCarregar)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoHelpConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHelpConectarActionPerformed
        jTextPane1.setText("1. Contecta ao WebService da Câmara dos Deputados;\n2. Obtém dados do banco de dados aberto;\n"
                + "3. Mostra dados em tabela, dividida por abas;\n4. O botão 'Info' mostra mais informações do deputado "
                + "selecionado na tabela.");
    }//GEN-LAST:event_botaoHelpConectarActionPerformed

    private void botaoHelpCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHelpCarregarActionPerformed
        jTextPane1.setText("1.Carrega arquivo XML de diretório local;\n2.Mostra dados do arquivo em tabela.");
    }//GEN-LAST:event_botaoHelpCarregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoHelpCarregar;
    private javax.swing.JButton botaoHelpConectar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel painelHelp;
    // End of variables declaration//GEN-END:variables
}

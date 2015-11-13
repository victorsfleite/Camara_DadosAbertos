package controllers;

import edu.unb.fga.dadosabertos.Deputado;
import edu.unb.fga.dadosabertos.Detalhes;
import edu.unb.fga.dadosabertos.Partido;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;
import models.CamaraDadosAbertos;
import models.ModeloTabela;

public class ControleTabela {

    public static void gerarTabela(List<Deputado> deputados) {
        
        ArrayList linhasDadosDeputados = new ArrayList();
        ArrayList linhasDadosPartidos = new ArrayList();
        String[] colunasDadosDeputados = new String[]{"Nome", "Partido", "Estado", "E-mail", "Telefone", "Condição", "Sexo", "ID",
                                                      "Matrícula","Nome Parlamentar", "Gabinete", "Anexo", "Link da Foto",
                                                      "UF Atual", "Situação Atual", "Nascimento", "Falecimento","Número de Legislatura" };
        String[] colunasDadosPartidos = new String[]{"ID", "Sigla", "Nome do Partido"};
        
        for(Deputado deputado: deputados) {
            
            try {
                    deputado.obterDetalhes();
                    System.out.print("-");
                } catch (IOException | JAXBException erro) {
                    JOptionPane.showMessageDialog(null, "Erro na obtenção dos detalhes!\nErro:"+ erro.getMessage());
                }
            
            Detalhes detalhes = deputado.getDetalhes();
        
            linhasDadosDeputados.add(new Object[]{deputado.getNome(), deputado.getPartido(), deputado.getUf(), deputado.getEmail(),
                                                  deputado.getFone(), deputado.getCondicao(), deputado.getSexo(),
                                                  deputado.getIdeCadastro(), deputado.getMatricula(), deputado.getNomeParlamentar(),
                                                  deputado.getGabinete(), deputado.getAnexo(), deputado.getUrlFoto(), detalhes.getUfRepresentacaoAtual(),
                                                  detalhes.getSituacaoNaLegislaturaAtual(), detalhes.getDataNascimento(), 
                                                  detalhes.getDataFalecimento(), detalhes.getNumLegislatura()});
            
            Partido partidos = detalhes.getPartido();
            
            linhasDadosPartidos.add(new Object[]{partidos.getIdPartido(), partidos.getSigla(), partidos.getNome()});
        }
        
        ModeloTabela tabelaDeputados = new ModeloTabela(linhasDadosDeputados, colunasDadosDeputados);
        CamaraDadosAbertos.setTabelaDeputados(tabelaDeputados);
        ModeloTabela tabelaPartidos = new ModeloTabela(linhasDadosPartidos, colunasDadosPartidos);
        CamaraDadosAbertos.setTabelaPartidos(tabelaPartidos);
        
        
    }
    
    public static ModeloTabela eliminarPartidosRepetidos(){
        ModeloTabela tabela = CamaraDadosAbertos.getTabelaPartidos();
        ControlePartidosRepetidos<Object[]> dados = new ControlePartidosRepetidos<Object[]>();
        String[] colunas = new String[]{"ID", "Sigla", "Nome do Partido"};

            for(int i = 0; i<tabela.getRowCount(); i++){
                    Object dado1 = tabela.getValueAt(i, 0);
                    Object dado2 = tabela.getValueAt(i, 1);
                    Object dado3 = tabela.getValueAt(i, 2);
                    if(!dados.contains(new Object[]{dado1, dado2, dado3})){
                    
                            Object ID = tabela.getValueAt(i, 0);
                            Object sigla = tabela.getValueAt(i, 1);
                            Object nome = tabela.getValueAt(i, 2);
                            
                            
                            dados.add(new Object[]{ID, sigla, nome});
                    }  
            }
                ModeloTabela Modeltabela = new ModeloTabela(dados, colunas);
                return Modeltabela;
    }
}


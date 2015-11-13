package models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel {
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList linhas, String[] colunas) {
        setLinhas(linhas);
        setColunas(colunas);
        
    }
    
    public ArrayList getLinhas() {
        return linhas;
        
    }
    
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }
    
    public String[] getColunas() {
        return colunas;
        
    }
    
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int numeroDaLinhas, int numeroDaColunas){
        Object[] linha = (Object[]) getLinhas().get(numeroDaLinhas);
        return linha[numeroDaColunas];
    }
    
    @Override
    public String getColumnName(int numeroDaColuna) {
        return colunas[numeroDaColuna];
    }
    
    
}

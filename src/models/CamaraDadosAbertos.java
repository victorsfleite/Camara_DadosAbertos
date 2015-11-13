package models;

import edu.unb.fga.dadosabertos.Deputado;
import java.util.List;

public class CamaraDadosAbertos {
    
    private static List<Deputado> deputados;
    private static ModeloTabela tabelaDeputados;
    private static ModeloTabela tabelaPartidos;

    public static ModeloTabela getTabelaDeputados() {
        return tabelaDeputados;
    }

    public static void setTabelaDeputados(ModeloTabela tabelaDeputados) {
        CamaraDadosAbertos.tabelaDeputados = tabelaDeputados;
    }

    public static ModeloTabela getTabelaPartidos() {
        return tabelaPartidos;
    }

    public static void setTabelaPartidos(ModeloTabela tabelaPartidos) {
        CamaraDadosAbertos.tabelaPartidos = tabelaPartidos;
    }

    public static List<Deputado> getDeputados() {
        return deputados;
    }

    public static void setDeputados(List<Deputado> deputados) {
        CamaraDadosAbertos.deputados = deputados;
    }
    
}

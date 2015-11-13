package controllers;

import java.util.Arrays;
import java.util.ArrayList;

public class ControlePartidosRepetidos<X> extends ArrayList<X> {
    
    public ControlePartidosRepetidos() {
        super();
    }
    
    public boolean contains(Object[] obj) {
        for(int cont = 0; cont < this.size(); cont++) {
            Object[] toCompare = (Object[]) this.get(cont);
            
            if(Arrays.equals(obj, toCompare)) {
                return (true);
            }
        }
        return (false);
    }
}

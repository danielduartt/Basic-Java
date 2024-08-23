package ordenacao_em_set;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Objeto> {
    @Override
    public int compare(Objeto o1, Objeto o2){
        return Double.compare(o1.getPreco(), o2.getPreco()); 
    }
}

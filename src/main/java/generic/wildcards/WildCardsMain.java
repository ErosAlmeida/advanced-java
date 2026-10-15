package generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCardsMain {

    public static void main(String[] args) {

        List<Bebida> bebidas = new ArrayList<>();

        prepararBebidas(bebidas);

        for (Bebida b : bebidas) {
            b.preparar();
        }
    }

    public static void prepararBebidas(List<Bebida> bebidas) {
        bebidas.add(new Cafe());
        bebidas.add(new Cha());
    }
}

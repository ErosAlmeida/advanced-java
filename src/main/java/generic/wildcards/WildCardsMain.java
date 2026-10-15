package generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCardsMain {

    public static void main(String[] args) {

        List<Bebida> bebidas = new ArrayList<>();

        prepararBebidas(bebidas);


        List<Cafe> cafes = new ArrayList<Cafe>();
        cafes.add(new Cafe());
        prepararBebidas(cafes);

    }

    public static void prepararBebidas(List<? extends Bebida> bebidas) {
        for (Bebida b : bebidas) {
            b.preparar();
        }

    }


}

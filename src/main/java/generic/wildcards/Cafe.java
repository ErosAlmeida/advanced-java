package generic.wildcards;

public class Cafe implements Bebida{

    @Override
    public void preparar() {
        System.out.println("Preparando café");
    }
}

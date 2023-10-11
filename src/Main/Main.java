package Main;
import java.util.List;
import Methods.SanduicheBuilder;



public class Main {
    public static void main(String[] args) {
        var sanduiche = new SanduicheBuilder("Italiano")
                .setRecheio("Frango")
                .setMolhos(List.of("Maionese", "Mostarda"))
                .setExtra("Bacon")
                .build();

        // Imprimir o sanduíche
        sanduiche.imprimir();

    }
}

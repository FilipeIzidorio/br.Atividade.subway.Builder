package Methods;
import java.util.*;

public class Sanduiche {
    private String tipoDePao;
    private String recheio;
    private List<String> molhos;
    private String extra;

    public Sanduiche(String tipoDePao, String recheio, List<String> molhos, String extra) {
        this.tipoDePao = tipoDePao;
        this.recheio = recheio;
        this.molhos = molhos;
        this.extra = extra;
    }
    public void imprimir() {
        System.out.println("Sanduíche: ");
        System.out.println("Tipo de Pão: " + tipoDePao);
        System.out.println("Recheio: " + recheio);
        System.out.println("Molhos: " + molhos);
        System.out.println("Extra: " + extra);
    }
}

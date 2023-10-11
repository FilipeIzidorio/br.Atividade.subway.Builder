package Methods;
import java.util.List;

public class SanduicheBuilder {
    private final String tipoDePao;
    private String recheio;
    private List<String> molhos;
    private String extra;

    public SanduicheBuilder(String tipoDePao) {
        this.tipoDePao = tipoDePao;
    }


    public SanduicheBuilder setRecheio(String recheio) {
        this.recheio = recheio;
        return this;
    }

    public SanduicheBuilder setMolhos(List<String> molhos) {
        this.molhos = molhos;
        return this;
    }

    public SanduicheBuilder setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public Sanduiche build() {
        return new Sanduiche(tipoDePao, recheio, molhos, extra);
    }
}

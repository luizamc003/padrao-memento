package padroescomportamentais.memento;

public class CelularModoAviao implements CelularModo {

    private CelularModoAviao() {};
    private static CelularModoAviao instance = new CelularModoAviao();
    public static CelularModoAviao getInstance() {
        return instance;
    }

    public String getNomeModo() {
        return "Avião";
    }

}
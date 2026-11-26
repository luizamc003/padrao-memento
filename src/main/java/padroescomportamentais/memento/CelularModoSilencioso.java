package padroescomportamentais.memento;

public class CelularModoSilencioso implements CelularModo {

    private CelularModoSilencioso() {};
    private static CelularModoSilencioso instance = new CelularModoSilencioso();
    public static CelularModoSilencioso getInstance() {
        return instance;
    }

    public String getNomeModo() {
        return "Silencioso";
    }

}
package padroescomportamentais.memento;

public class CelularModoNormal implements CelularModo {

    private CelularModoNormal() {};
    private static CelularModoNormal instance = new CelularModoNormal();
    public static CelularModoNormal getInstance() {
        return instance;
    }

    public String getNomeModo() {
        return "Normal";
    }

}
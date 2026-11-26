package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Celular {

    private CelularModo modo;
    private List<CelularModo> memento = new ArrayList<CelularModo>();

    public CelularModo getModo() {
        return this.modo;
    }

    public void setModo(CelularModo modo) {
        this.modo = modo;
        this.memento.add(this.modo);
    }

    public void restauraModo(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.modo = this.memento.get(indice);
    }

    public List<CelularModo> getModos() {
        return this.memento;
    }
}
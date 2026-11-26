package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelularTest {

    @Test
    void deveArmazenarModos() {
        Celular celular = new Celular();
        celular.setModo(CelularModoNormal.getInstance());
        celular.setModo(CelularModoSilencioso.getInstance());
        assertEquals(2, celular.getModos().size());
    }

    @Test
    void deveRetornarModoInicial() {
        Celular celular = new Celular();
        celular.setModo(CelularModoNormal.getInstance());
        celular.setModo(CelularModoSilencioso.getInstance());
        celular.restauraModo(0);
        assertEquals(CelularModoNormal.getInstance(), celular.getModo());
    }

    @Test
    void deveRetornarModoAnterior() {
        Celular celular = new Celular();
        celular.setModo(CelularModoNormal.getInstance());
        celular.setModo(CelularModoSilencioso.getInstance());
        celular.setModo(CelularModoNormal.getInstance());
        celular.setModo(CelularModoAviao.getInstance());
        celular.restauraModo(2);
        assertEquals(CelularModoNormal.getInstance(), celular.getModo());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Celular celular = new Celular();
            celular.restauraModo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
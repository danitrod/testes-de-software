package lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex2Test {
    // 2) O programa solicita uma nota bimestral (entre 0 e 10) de um aluno.

    Ex2 ex2;

    public Ex2Test() {
        ex2 = new Ex2();
    }

    @Test
    public void muitoBaixo() {
        assertEquals(ex2.valido(-1), false);
    }

    @Test
    public void limiteInferior() {
        assertEquals(ex2.valido(0), true);
    }

    @Test
    public void limiteSuperior() {
        assertEquals(ex2.valido(10), true);
    }

    @Test
    public void muitoAlto() {
        assertEquals(ex2.valido(11), false);
    }
}

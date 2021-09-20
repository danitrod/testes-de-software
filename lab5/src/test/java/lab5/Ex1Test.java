package lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex1Test {
    // 1) Em um programa, é obrigatório digitar o ano que pode variar entre 1900 e
    // 2020. Qualquer outra data é inválida

    Ex1 ex1;

    public Ex1Test() {
        ex1 = new Ex1();
    }

    @Test
    public void muitoBaixo() {
        assertEquals(false, ex1.valido(1899));
    }

    @Test
    public void limiteInferior() {
        assertEquals(true, ex1.valido(1900));
    }

    @Test
    public void limiteSuperior() {
        assertEquals(true, ex1.valido(2020));
    }

    @Test
    public void muitoAlto() {
        assertEquals(false, ex1.valido(2021));
    }
}

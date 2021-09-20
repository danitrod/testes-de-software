package lab5;

import static org.junit.Assert.assertEquals;

// import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex3Test {
    // 3) Dada a idade do motorista, o programa informa a periodicidade de renovação
    // da carteira:
    // - Idade inferior a 50 anos, renovação a cada 10 anos
    // - Idade entre 50 e 70 anos, renovação a cada 5 anos
    // - Idade igual ou superior a 70 anos renovação a cada 3 anos

    Ex3 ex3;

    public Ex3Test() {
        ex3 = new Ex3();
    }

    @Test
    public void renovacaoDemorada() {
        assertEquals(10, ex3.frequenciaDeRenovacao(49));
    }

    @Test
    public void renovacaoMedia() {
        assertEquals(5, ex3.frequenciaDeRenovacao(50));
    }

    @Test
    public void renovacaoFrequente() {
        assertEquals(3, ex3.frequenciaDeRenovacao(70));
    }
}

package lab5;

public class Ex3 {
    // 3) Dada a idade do motorista, o programa informa a periodicidade de renovação
    // da carteira:
    // - Idade inferior a 50 anos, renovação a cada 10 anos
    // - Idade entre 50 e 70 anos, renovação a cada 5 anos
    // - Idade igual ou superior a 70 anos renovação a cada 3 anos
    public int frequenciaDeRenovacao(int idade) {
        if (idade < 50) {
            return 10;
        } else if (idade < 70) {
            return 5;
        } else {
            return 3;
        }
    }
}

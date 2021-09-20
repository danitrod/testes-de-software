package lab5;

public class Ex1 {
    // 1) Em um programa, é obrigatório digitar o ano que pode variar entre 1900 e
    // 2020. Qualquer outra data é inválida
    public boolean valido(int ano) {
        return ano >= 1900 && ano <= 2020;
    }
}

import java.util.Scanner;

public class QualidadeDoAr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o índice do IQA (Índice de Qualidade do Ar): ");
        float iqa = sc.nextFloat();

        System.out.println("Classificação do Ar: " + classificacaoDoAr(iqa));
        System.out.println("Efeito sobre a População: " + efeitoSobrePopulacao(iqa));
    }

    public static String classificacaoDoAr (float indiceIqa) {

        String classificacao;

        if (indiceIqa <= 50) {
            classificacao = "Boa";
        } else if (indiceIqa >= 51 && indiceIqa <= 100 ) {
            classificacao = "Regular";
        } else if (indiceIqa >= 101 && indiceIqa <= 199) {
            classificacao = "Inadequada";
        } else if (indiceIqa >= 200 && indiceIqa <= 299) {
            classificacao = "Má";
        } else if (indiceIqa >= 300 && indiceIqa <= 399) {
            classificacao = "Péssima";
        } else {
            classificacao = "Crítica";
        }

        return classificacao;
    }

    public static String efeitoSobrePopulacao (float indiceIqa) {

        String efeito;

        if (indiceIqa <= 100) {
            efeito = "Ausência de sintomas";
        } else if (indiceIqa >= 101 && indiceIqa <= 199) {
            efeito = "Leve agravamento dos sintomas de pessoas susceptíveis, ...";
        } else if (indiceIqa >= 200 && indiceIqa <= 299) {
            efeito = "Decréscimo da resistência  física e significativo agravamento, ...";
        } else if (indiceIqa >= 300 && indiceIqa <= 399) {
            efeito = "Aparecimento prematuro de certas doenças, ...";
        } else {
            efeito = "Morte prematura de pessoas doentes e pessoas idosas, ...";
        }

        return efeito;
    }
}

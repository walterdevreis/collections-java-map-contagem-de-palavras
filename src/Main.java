import entities.ContagemPalavras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        System.out.println();
        System.out.println("Exibe a contagem total de linguagens");
        contagemLinguagens.exibirContagemPalavras();

        System.out.println();
        System.out.println("Adicionando uma nova linguagem.");
        contagemLinguagens.adicionarPalavra("Kotlin", 7);

        System.out.println();
        System.out.println("Exibe a contagem total de linguagens");
        contagemLinguagens.exibirContagemPalavras();

        System.out.println();
        System.out.println("Removendo uma linguagem");
        contagemLinguagens.removerPalavra("JavaScript");

        System.out.println();
        System.out.println("Exibe a contagem total de linguagens");
        contagemLinguagens.exibirContagemPalavras();

        System.out.println();
        System.out.println("Encontra e exibe a linguagem mais frequente");
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
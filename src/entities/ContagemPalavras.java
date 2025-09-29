package entities;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> listaPalavras;

    public ContagemPalavras() {
        this.listaPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.listaPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (this.listaPalavras.containsKey(palavra)) {
            this.listaPalavras.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada!");
        }
    }

    public void exibirContagemPalavras() {
        this.listaPalavras.entrySet().stream()
                .forEach(imprimir -> System.out.println("Palavra: " + imprimir.getKey() + ", Contagem: " + imprimir.getValue()));
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorFrequencia = 0;
        for (Map.Entry<String, Integer> entry : listaPalavras.entrySet()){
            if (entry.getValue() > maiorFrequencia){
                maiorFrequencia = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

}

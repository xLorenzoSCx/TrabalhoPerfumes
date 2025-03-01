/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoperfumes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lorenzo
 */
public class PerfumeList {

    private ArrayList<String> nome;

    public PerfumeList() {
        nome = new ArrayList();

    }

    public void adicionarPerfume(String palavra) {
        this.nome.add(palavra);
        System.out.println("Item adicionado na lista!");
    }

    public void alterarPerfume(String palavra, String palavraNova) {
        int ind = buscarPerfume(palavra);
        if (ind != -1) {
            System.out.println("Item " + palavra + " de indice " + ind + " alterado com sucesso!!!");
            this.nome.set(ind, palavraNova);
        } else {
            System.out.println("Item não encontrado");
        }

    }

    public void removerPorNome(String nomeRemovido) {
        int ind = buscarPerfume(nomeRemovido);
        if (ind != -1) {
            System.out.println("Item " + nomeRemovido + " de indice " + ind + " removido com sucesso!!!");
        } else {
            System.out.println("Item não encontrado");
        }
    }

    public String listarPerfume() {
        if (nome.isEmpty()) {
            System.out.println("Não existem perfumes adicionados");
        }
        String perfumes = "Lista de perfumes:\n";
        for (int i = 0; i < nome.size(); i++) {
            perfumes += (i + 1) + "°" + nome.get(i) + "\n";

        }
        return perfumes;
    }

    private int buscarPerfume(String nomeDoPerfume) {
        for (int i = 0; i < nome.size(); i++) {
            if (nome.get(i).equalsIgnoreCase(nomeDoPerfume)) {
                return i;

            }

        }
        return -1;
    }

    public void MostrarPerfume(String nomeDoPerfume) {
        int ind = buscarPerfume(nomeDoPerfume);
        if (ind >= 0) {
            System.out.println("O perfume de nome " + nomeDoPerfume + " é de indice " + ind);
        } else {
            System.out.println("Perfume inexistente");
        }

    }

    public int exibirQuantidadePerfumes() {
        return nome.size();
    }

    public void ordenarPerfumes() {
        if (nome.isEmpty()) {
            System.out.println("Não há como ordenar uma lista que não possui itens");
            return;
        }

        Collections.sort(nome);
        System.out.println("Ordem alfabética dos perfumes:");

        for (int i = 0; i < nome.size(); i++) {
            System.out.println((i + 1) + "° " + nome.get(i));
        }
    }

}


package projetoperfumes;

import java.util.Scanner;

public class ProjetoPerfumes {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        PerfumeList perfume = new PerfumeList();
        int cont = 5;
        while (cont != 0) {
            System.out.println("---Perfumes---"
                    + "\n1.Adicionar"
                    + "\n2.Remover"
                    + "\n3.Modificar"
                    + "\n4.Mostrar perfume"
                    + "\n5.Listar perfumes"
                    + "\n6.Exibir a quantidade de perfumes"
                    + "\n7.Ordenar perfumes por odem alfabética"
                    + "\n8.Sair");

            int resp = teclado.nextInt();
            String produto = "";
            String produtoNovo = "";
            switch (resp) {

                case 1:
                    System.out.println("Insira o perfume que deseja adicionar");
                    produto = teclado.next();
                    perfume.adicionarPerfume(produto);
                    break;

                case 2:
                    System.out.println("Insira o perfume que deseja remover");
                    produto = teclado.next();
                    perfume.removerPorNome(produto);
                    break;

                case 3:
                    System.out.println("Qual perfume deseja modificar? E por qual?");
                    produto = teclado.next();
                    produtoNovo = teclado.next();

                    perfume.alterarPerfume(produto, produtoNovo);
                    break;

                case 4:
                    System.out.println("Qual perfume você deseja ver?");
                    produto = teclado.next();
                    perfume.MostrarPerfume(produto);
                    break;

                case 5:
                    System.out.println(perfume.listarPerfume());

                    break;

                case 6:
                    System.out.println("Quantidade de perfumes adicionados: " + perfume.exibirQuantidadePerfumes());
                    break;

                case 7:
                    perfume.ordenarPerfumes();
                    break;

                case 8:
                    System.out.println("Obrigado por acessar ;)");
                    break;

                default:
                    System.out.println("Opção escolhida inválida");
            }

        }
    }

}


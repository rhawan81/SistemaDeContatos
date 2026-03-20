package br.com.contatos;

import java.util.Scanner;

import br.com.contatos.gerenciador.GerenciadorContatos;
import br.com.contatos.modelo.Contato;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Gerenciador de Contatos!");
        // ferramenta que le oque o usuario digita no console
        Scanner escolhaUser = new Scanner(System.in);
        // nosso cerebro que contem a lista dos metodos para manipular os contatos
        GerenciadorContatos gerenciador = new GerenciadorContatos();
        // começa com -1 para poder entra no while na primeira vez
        int escolha = -1;
        // ele ira repetir ate o usuario digitar 0
        while (escolha != 0) {
            // menu de opçoes
            System.out.println("===== Sistema de Contatos =====");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Excluir Contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            // le o que foi digitado pelo usuario
            escolha = escolhaUser.nextInt();
            // limpa o buffer necessario apos o nextInt para funcionar corretamente
            escolhaUser.nextLine(); // Limpa o buffer do scanner


            switch (escolha) {
                case 1:
                    // ira ler os dados do novo contato ou seja adicionar no sistema
                    System.out.print("Nome: ");
                    String nome = escolhaUser.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = escolhaUser.nextLine();
                    System.out.print("Email: ");
                    String email = escolhaUser.nextLine();
                    // chamamos o gerenciador para passarmos todos os dados criar e salvar o contato
                    gerenciador.adicionarContato(nome, telefone, email);
                    break;
                case 2:
                    // chama o metodo onde percorre toda a lista de usuarios cadastrados
                    gerenciador.listarContato();
                    break;
                case 3:
                    // pergunta qual nome o usuario quer buscar nos contatos
                    System.out.print("Digite o nome do contato para buscar: ");
                    String nomeBusca = escolhaUser.nextLine();
                    Contato encontrado = gerenciador.buscarContato(nomeBusca);
                    if (encontrado != null) {
                        System.out.println("Contato encontrado: " + encontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    // le o numero que o usuario deseja remover da lista de contato
                    System.out.println("Digite o nome para excluir");
                    String nomeExcluir = escolhaUser.nextLine();
                    // chamammos o metodo que remove o nome da lista de contatos
                    gerenciador.excluirContato(nomeExcluir);
                    break;
                case 0:
                    // encerramento do sistema
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }


        }
        // fechamos o scanner e encerramos o programa
        escolhaUser.close();
    }
}

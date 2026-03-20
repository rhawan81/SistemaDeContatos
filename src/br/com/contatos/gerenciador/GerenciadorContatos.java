package br.com.contatos.gerenciador;

import java.util.ArrayList;

import br.com.contatos.modelo.Contato;

public class GerenciadorContatos {
    /* ArrayList Metodo que cria uma lista onde ela expande sozinha conforme voce vai adicionando elementos
     e o contato entre <contato> diz que essa linha so aceita objetos do tipo contato
     */
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(String nome, String telefone, String email) {
        // Cria um Objeto Contato usando todos os dados que chegaram como parametro no metodo
        Contato novo = new Contato(nome, telefone, email);
        contatos.add(novo); // adiciona o objeto criado a o array que recebe os parametros.
        System.out.println("Contato adicionado com sucesso !!");
    }

    public void listarContato() {
        if (contatos.isEmpty()) { // metodo que verifica se o array esta vazio , se estiver retornar true caso nao retornar falso e pula o if
            System.out.println("Nenhum contato cadastrado");
            return;
        }
        System.out.println("----- Lista de Contatos -----");
        for (int i = 0; i < contatos.size(); i++) { ///  size metodo que conta quantos contatos tem na lista se tiver 3 contatos ira imprimir.
            // o loop ira percorrer caso tenha 3 contatos 0,1,2;
            System.out.println("[ " + i + "] " + contatos.get(i));

        }
    }

    public Contato buscarContato(String nome) {
        for (Contato c : contatos) {
            // pega o nome do contato da lista e compara com o nome digitado pelo usuário
            if (c.getNome().equalsIgnoreCase(nome)) {
                // se achar ele retorna esse contato
                return c;
            }
        }
        // se não achou devolve vazia
        return null;
    }

    public void excluirContato(String nome) {
        Contato encontrado = buscarContato(nome);
        if (encontrado != null) { // se o contato procurado for encontrado removemos ele da lista
            contatos.remove(encontrado);
            System.out.println("Contato excluido com sucesso !!");
            return;
        }
        // nao achou -de imediato avisa ao usuario que o contato nao existe
        System.out.println("Contato não encontrado !!");
    }

}




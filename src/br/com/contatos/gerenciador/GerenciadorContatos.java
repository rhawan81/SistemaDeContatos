package br.com.contatos.gerenciador;

import java.util.ArrayList;
import br.com.contatos.modelo.Contato;
public class GerenciadorContatos {
    /* ArrayList Metodo que cria uma lista onde ela expande sozinha conforme voce vai adicionando elementos
     e o contato entre <contato> diz que essa linha so aceita objetos do tipo contato
     */
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(String nome, String telefone, String email){
        // Cria um Objeto  Contato usando todos os dados que chegaram como parametro no metodo
        Contato novo = new Contato(nome, telefone, email);
        contatos.add(novo);
        System.out.println("Contato adicionado com sucesso !!");
    }

}

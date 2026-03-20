package br.com.contatos;

import br.com.contatos.modelo.Contato;

public class Main {
    public static void main(String[]args){
        System.out.println("Bem-vindo ao Gerenciador de Contatos!");
        Contato contato1 = new Contato("Jose", " 81996618185", "rhawanj@gmail.com");
          contato1.setNome("Michel");
        System.out.println(contato1);
    }
}

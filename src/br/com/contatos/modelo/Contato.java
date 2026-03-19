package br.com.contatos.modelo;

public class Contato {
    private String nome;
    private String telefone;
    private String email;


    ///  Construtor
    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;



    }

    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public String email(){
        return email;
    }
}

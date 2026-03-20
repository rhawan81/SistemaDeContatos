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
        return this.nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public String email(){
        return email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;

    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override // Metodo que substitui o original onde se quisermos imprimir o objeto iria mostrar o endereço de memoria por isso usamos ele para mostrar as informações do contato
    public String toString(){ // metodo que retorna nome , telefone, email.
        return "Nome: " + nome + " | Tel: " + telefone + " | Email: " + email;
    }
}

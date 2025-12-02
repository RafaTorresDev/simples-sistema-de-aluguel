package classes;

public class Estudantes {

    private String nome;
    private String mail;

    public Estudantes(String name, String email){ //construtor com valor
        this.nome = name;
        this.mail = email;
    }

    public String getNome(){
        return nome;
    }
    public String getMail(){
        return mail;
    }

    public String toString(){
        return nome + ", " + mail;
    }


}

package Agenda;

public class Pessoa {
    
    private String nome;
    private String email;
    private int telefone;
    private int id;
    
    public Pessoa(){}
    
    public Pessoa(int id, String nome, int phone, String mail){
        this.id = id;
        this.nome = nome;
        this.telefone = phone;
        this.email = mail;        
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void imprimeContato(){
        System.out.println(" {" + getId() + "} ");
        System.out.println(" {" + getNome() + "} ");
        System.out.println(" {" + getTelefone() + "} ");
        System.out.println(" {" + getEmail() + "} ");
    }
}

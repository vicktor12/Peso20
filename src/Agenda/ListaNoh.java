package Agenda;

public class ListaNoh {
    
    private Noh primeiroNoh;
    private String nome;
    
    public ListaNoh(){}
    
    public ListaNoh(Noh primeiroNoh){
        this.primeiroNoh = primeiroNoh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Noh getPrimeiroNoh() {
        return primeiroNoh;
    }

    public void setPrimeiroNoh(Noh primeiroNoh) {
        this.primeiroNoh = primeiroNoh;
    }
    
    public boolean estaVazio(){
        boolean status = false;
        if(this.primeiroNoh == null){
            status = true;
        }
        return status;
    }
    
    public void inserirNoInicio(Noh n){
        Noh aux;
        boolean laco = true;
        if(this.estaVazio()){
            this.primeiroNoh = n;
        }
        else{
            aux = this.primeiroNoh;
            while(laco){
                if(aux.getProximoNoh() == null){
                    n.setProximoNoh(aux);
                    this.setPrimeiroNoh(n);
                    laco = false;
                }
            }
        }
    }
    
    public void inseriOrdenado(Noh n){
        Noh aux;
        boolean laco = true;
        if(this.estaVazio()){
            this.primeiroNoh = n;
        }
        else{
            aux = this.primeiroNoh;
            while(laco){
                laco = false;
            }
        }
    }
    
    public void inseriNoFim(Noh n){
        Noh aux;
        boolean laco = true;
        if(this.estaVazio()){
            this.primeiroNoh = n;
        }
        else{
            aux = this.primeiroNoh;
            while(laco){
                if(aux.getProximoNoh() == null){
                    aux.setProximoNoh(n);
                    laco = false;
                }
                else{
                    aux = aux.getProximoNoh();
                }
            }
        }
    }
    
    public void removeNoInicio(){
        Noh aux;
        boolean laco = true;
        if(this.estaVazio()){
            System.out.println("Ainda não existe elementos na lista");
        }
        else{
            aux = this.primeiroNoh;
            while(laco){
                if(aux.getProximoNoh() == null){
                    this.primeiroNoh = null;
                    laco = false;
                }
                else{
                    this.primeiroNoh = aux.getProximoNoh();
                    laco = false;
                }
            }
        }
    }
    
    public void removeNoFim(){
        Noh aux;
        boolean laco = true;
        if(this.estaVazio()){
            System.out.println("Ainda não existe elementos na lista");
        }
        else{
            aux = this.primeiroNoh;
            while(laco){
                if(aux.getProximoNoh() == null){
                    //Tem de remover do final
                    laco = false;
                }
                else{
                    aux = aux.getProximoNoh();                    
                }
            }
        }
    }
        
    
    public void imprimeLista(){
        Noh aux;
        boolean laco = true;
        if(this.estaVazio()){
            System.out.println("A lista está vazia");
        }
        else{
            aux = this.primeiroNoh;
            while(laco){
                if(aux.getProximoNoh() == null){
                    this.getPrimeiroNoh().getValor().imprimeContato();
                    laco = false;
                }
                else{
                    aux.getProximoNoh().getValor().imprimeContato();
                    aux = aux.getProximoNoh();
                }
            }
        }
    }
}

package Agenda;

public class Noh {
    
    private Pessoa valor;
    private Noh proximoNoh;
    
    public Noh(){}
    
    public Noh(Pessoa valor, Noh proximoNoh){
        this.valor = valor;
        this.proximoNoh = proximoNoh;
    }

    public Pessoa getValor() {
        return valor;
    }

    public Noh getProximoNoh() {
        return proximoNoh;
    }

    public void setValor(Pessoa valor) {
        this.valor = valor;
    }

    public void setProximoNoh(Noh proximoNoh) {
        this.proximoNoh = proximoNoh;
    }
    
    public void imprimeNoh(){
        System.out.println(" {" + getValor() + "} ");
        System.out.println(" {" + getProximoNoh() + "} ");
    }
}

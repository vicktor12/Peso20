package Agenda;

import java.util.Scanner;

public class TesteClasse {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        /*-----------------------TESTA A CLASSE PESSOA----------------------*/
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa(1, "victor", 5544, "victor@mail.com");
        
        p1.setId(0);
        p1.setNome("Victor");
        p1.setTelefone(11223344);
        p1.setEmail("victor@mail.com");
        
        /*p1.imprimeContato();
        read.nextLine();
        p2.imprimeContato();
        read.nextLine();
               
        /*------------------------FIM DO TESTE--------------------------------*/
        
        /*------------------------TESTE CLASSE NOH----------------------------*/
        Noh n1 = new Noh();
        Noh n3 = new Noh(p2, null);
        Noh n2 = new Noh(new Pessoa(1, "victor", 5544, "victor@mail.com"),n3);
        
        n1.setValor(p1);
        n1.setProximoNoh(n2);
        
        /*n1.imprimeNoh();
        read.nextLine();
        n2.imprimeNoh();
        read.nextLine();
        n3.imprimeNoh();
        read.nextLine();
        /*--------------------------FIM DO TESTE------------------------------*/
        
        ListaNoh lista = new ListaNoh(new Noh(new Pessoa(1, "victor", 11223344, "victor@mail.com"), null));
        //ListaNoh lista2 = new ListaNoh(n1);
        
        lista.imprimeLista();
        //lista2.imprimeLista();
        
    }
  }
    


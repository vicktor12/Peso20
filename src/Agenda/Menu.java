package Agenda;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Pessoa cadastro = new Pessoa();
        ListaNoh lista = new ListaNoh();
        boolean continua = true;               
        int opcao;       
        int cont = 1;
        String resposta;        
        
        
        while(continua){
            System.out.println("********BEM VINDO********");
            System.out.println("Deseja cadastrar um novo contato? "); 
            resposta = leia.nextLine();
            if((resposta.equalsIgnoreCase("Sim")) || (resposta.equalsIgnoreCase("SIM")) 
               || (resposta.equalsIgnoreCase("sim"))){                
                while(continua){                    
                    cadastro.setId(cont);
                    System.out.println("Informe o nome do contato");
                    cadastro.setNome(leia.nextLine());
                    System.out.println("Informe o telefone do contato");
                    cadastro.setTelefone(leia.nextInt());
                    System.out.println("Informe o email do contato");
                    cadastro.setEmail(leia.nextLine());
                    System.out.println("Deseja cadastrar outro contato? ");
                    resposta = leia.nextLine();                    
                    if((resposta.equalsIgnoreCase("Sim")) || (resposta.equalsIgnoreCase("SIM")) 
                        || (resposta.equalsIgnoreCase("sim"))){
                        continua = true;
                        cont++;
                    }
                    else{
                        continua = false;                        
                    }
                }    
            }
            else{
                System.out.println("***Por favor escolha uma opção no menu abaixo***");
                System.out.print("1 - Cadastrar um novo contato ");            
                System.out.print("2 - Criar uma nova lista ");
                System.out.print("3 - Inserir um novo contato no inicio da lista ");
                System.out.print("4 - Inserir um novo contato no fim da lista ");
                System.out.print("5 - Inserir um novo contato em qualquer lugar da lista ");
                System.out.print("6 - Remover o contato do inicio da lista");
                System.out.print("7 - Remover um contato da lista");
                System.out.print("8 - Imprimir Lista ");
                opcao = leia.nextInt();
                switch(opcao){
                    case 1:
                        while(continua){ 
                            cont++;
                            cadastro.setId(cont);
                            System.out.println("Informe o nome do contato");
                            cadastro.setNome(leia.nextLine());
                            System.out.println("Informe o telefone do contato");
                            cadastro.setTelefone(leia.nextInt());
                            System.out.println("Informe o email do contato");
                            cadastro.setEmail(leia.nextLine());
                            System.out.println("Deseja cadastrar outro contato? ");
                            resposta = leia.nextLine();
                            System.out.println("O contato criado foi: ");                            
                            if((resposta.equalsIgnoreCase("Sim")) || (resposta.equalsIgnoreCase("SIM")) 
                                || (resposta.equalsIgnoreCase("sim"))){
                                continua = true;                                
                            }
                            else{
                                continua = false;                        
                            }
                        }
                        break;
                        
                    case 2:
                        boolean i = true;
                        while(i){
                            lista.setNome("Lista " + i);
                            System.out.println("Para criar uma nova lista será necessario criar pelo "
                                    + "menos 1 contato \n");
                            cont++;
                            cadastro.setId(cont);
                            System.out.println("Informe o nome do contato");
                            cadastro.setNome(leia.nextLine());
                            System.out.println("Informe o telefone do contato");
                            cadastro.setTelefone(leia.nextInt());
                            System.out.println("Informe o email do contato");
                            cadastro.setEmail(leia.nextLine());                            
                        }
                        break;
                        
                    case 3:
                        cont++;
                        cadastro.setId(cont);
                        System.out.println("Informe o nome do contato");
                        cadastro.setNome(leia.nextLine());
                        System.out.println("Informe o telefone do contato");
                        cadastro.setTelefone(leia.nextInt());
                        System.out.println("Informe o email do contato");
                        cadastro.setEmail(leia.nextLine());
                        break;
                    
                    case 4:
                        //comando
                        break;
                    
                    case 5:
                        //comando
                        break;
                        
                    case 6:
                        //comando
                        break;
                        
                    case 7:
                        //comando
                        break;
                        
                    case 8:
                        lista.imprimeLista();
                        break;
                        
                    default:
                        System.out.println("Opção invalida");
                        System.out.println("Aplicação Encerrada");
                }
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Folha {
    public static void main(String args[]){

        
        
        menu();
        List<Funcionario>funcionarios = new ArrayList<>();
        

        Scanner scn = new Scanner(System.in);
        int id = 1;

        while(true){
            System.out.printf("Escolha uma opção do menu:");
            int option = Integer.parseInt (scn.nextLine());;

            switch(option){
                case 1:
                    System.out.println("Nome:");
                    String name = scn.nextLine();
                    System.out.println("Endereço:");
                    String address = scn.nextLine();
                    System.out.println("Tipo de salário:");
                    String type = scn.nextLine();
                    System.out.println(name+" Foi adicionado com sucesso, deseja fazer algo mais?");
                    Funcionario funcionario = new Funcionario();
                    funcionario.name = name;
                    funcionario.address = address;
                    funcionario.type = type;
                    funcionario.id = id;
                    id++;
                    funcionarios.add(funcionario);
                    break;
                    
                case 2:
                    System.out.printf("Digite 1 para buscar e remover o funcionário pelo ID, e 2 para remover pelo nome completo");
                    int option1 = Integer.parseInt (scn.nextLine());;
                    boolean flag = false;

                    if(option1 == 1){
                        System.out.println("Digite o ID do funcionario");
                        int id_s = Integer.parseInt (scn.nextLine());
                        

                        for(int i = 0; i< funcionarios.size(); i++){
                            if(funcionarios.get(i).id == id_s){
                                funcionarios.remove(funcionarios.get(i));
                                flag = true;
                                break;
                            }
                            
                        }
                        if(!flag){
                                System.out.println("Funcionario nao encontrado");
                                
                            }
                        }
                        
                        
                    
                    else if(option1 == 2){
                        String name_s = scn.nextLine();
                        for(int i = 0; i< funcionarios.size(); i++){
                            if(funcionarios.get(i).name.equals(name_s)){
                                funcionarios.remove(funcionarios.get(i));
                                flag = true;
                                break;
                            }
                    
                            
                        }
                        if(!flag){
                            System.out.println("Funcionario nao encontrado");
                            
                        }
                        
                    }
                    else{
                        System.out.println("Opcao invalida, voltando ao menu principal...");
                    }
                    break;
                case 0: System.out.println("Encerrando o sistema...");break;
                case 6:
                    System.out.println("Digite o id do funcionario que deseja alterar as informacoes");
                    int id_s1 = Integer.parseInt (scn.nextLine());;
                    boolean flag1 = false;
                    for(int i = 0; i< funcionarios.size(); i++){
                        if(funcionarios.get(i).id == id_s1){
                            flag1 = true;
                            break;
                        }
                    }
                        if(!flag1){
                            System.out.println("Funcionario nao encontrado");
                            
                        }
                    if(flag1){
                        System.out.println("(1)Alterar o nome");
                        System.out.println("(2)Alterar o endereco");
                        int option2 = Integer.parseInt (scn.nextLine());
                        switch(option2){
                            case 1:
                                String name_change = scn.nextLine();
                                funcionarios. = name_change;
                                break;
                            case 0: break;

                            default: break;
                        }


                    }
                    
                case 8: show(funcionarios); break;
                default: System.out.println("Opção inválida"); break;
            }
            if(option == 0) break;
        }
    }

    static void menu(){

        System.out.println("------------------------------------------");
        System.out.println("(1)Adicionar funcionário");
        System.out.println("(2)Remover funcionário");
        System.out.println("(3)Lançar cartão de ponto");
        System.out.println("(4)Lançar um resultado de venda");
        System.out.println("(8)Mostrar lista de funcionários");
        System.out.println("(0)Encerrar");
    }
    static void show(List<Funcionario> funcionarios){
        System.out.println("Lista de funcionários:");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%5s %40s %30s %20s", "ID", "NAME", "ADDRESS", "SALARY TYPE");
        System.out.println();
        for(int i=0; i<funcionarios.size(); i++){

    
            System.out.printf("%5s %40s %30s %20s",funcionarios.get(i).id,funcionarios.get(i).name, funcionarios.get(i).address,funcionarios.get(i).type);
            System.out.println();
        }

        
    }

    
    
    
    

    
}

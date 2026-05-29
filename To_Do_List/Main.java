package To_Do_List;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<String>();
        boolean funcionando = true;
        while(funcionando){
            System.out.println("=================");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Sair");
            System.out.println("=================");
            int opcao = scan.nextInt();
            scan.nextLine(); // Limpar o buffer do scanner
            switch(opcao){
                case 1:
                    System.out.println("Digite a tarefa: ");
                    String tarefa = scan.nextLine();
                    tarefas.add(tarefa);
                    break;
                case 2:
                    System.out.println("Tarefas:");
                    for(String t : tarefas){
                        System.out.println("- " + t);
                    }
                    break;
                case 3:
                    funcionando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

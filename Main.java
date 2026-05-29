import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> candidatos = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o numero de candidatos:");
        int numCandidatos = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < numCandidatos; i++) {
            System.out.println("Insira o nome do candidato " + (i + 1) + ":");
            String nome = sc.nextLine();
            candidatos.add(nome);
        }
        
        int[] votos = new int[candidatos.size() + 1];
        int indiceBranco = candidatos.size();

        while (true) {
            System.out.println("\n======= Votação =======");
            for (int i = 0; i < candidatos.size(); i++) {
                System.out.println((i + 1) + ". " + candidatos.get(i));
            }
            System.out.println("Insira qual a opçao desejada:");
            System.out.println("-1 para sair da votação.");
            System.out.println("0 para votar em branco.");
            System.out.println("1 para escolher em qual candidato votar.");
            System.out.println("2 para mostrar o resultado da votação.");
            System.out.println("========================");
            
            int voto = sc.nextInt();
            
            switch (voto) { 
                case -1:
                    System.out.println("Votação encerrada.");
                    sc.close();
                    return;
                    
                case 0:
                    System.out.println("Voto em branco registrado.");
                    votos[indiceBranco] = votos[indiceBranco] + 1;
                    break;
                    
                case 1:
                    System.out.println("Insira o número do candidato que deseja votar:");
                    int candidatoEscolhido = sc.nextInt();
                    
                    // Validação para garantir que o usuário não digite um número que não existe
                    if (candidatoEscolhido > 0 && candidatoEscolhido <= candidatos.size()) {
                        votos[candidatoEscolhido - 1] = votos[candidatoEscolhido - 1] + 1;
                    } else {
                        System.out.println("Candidato inválido!");
                    }
                    break;
                    
                case 2:
                    System.out.println("======= Resultado da Votação =======");
                    // Mostra os votos de cada candidato
                    for (int i = 0; i < candidatos.size(); i++) {
                        System.out.println(candidatos.get(i) + ": " + votos[i] + " votos");
                    }
                    System.out.println("Votos em Branco: " + votos[indiceBranco] + " votos");
                    System.out.println("====================================");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
package controleCandidatos;

import java.util.Scanner;

public class Candidato {
    String nome, telefone; 
    double salario_pretendido; 

    public Candidato(String nome, double salario_pretendido, String telefone){
        this.nome = nome; 
        this.salario_pretendido = salario_pretendido;
        this.telefone = telefone;
    }
    public static Candidato[] cadastrarCandidatos(int qntCandidatos) {
        Candidato[] candidatos = new Candidato[qntCandidatos]; 
        Scanner entrada = new Scanner(System.in); 

        for (int x = 0; x < qntCandidatos; x++) {
            try {
                System.out.printf("Digite o nome do candidato %d: ", x + 1); 
                String nome = entrada.nextLine(); 

                System.out.printf("Digite o salário pretendido do candidato %d: ", x + 1); 
                double salario = entrada.nextDouble(); 
                entrada.nextLine();  

                System.out.printf("Digite o telefone do candidato %d: ", x + 1); 
                String telefone = entrada.nextLine(); 

                Candidato cand = new Candidato(nome, salario, telefone); 
                candidatos[x] = cand;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, tente novamente.");
                entrada.nextLine(); 
                x--; 
            }
        }
        entrada.close();
        return candidatos; 
    }
}

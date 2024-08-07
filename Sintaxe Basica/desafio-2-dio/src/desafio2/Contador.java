package desafio2;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int num1 = 0, num2 = 0; 
        try{
        System.out.print("Digite o número 1: ");
        num1  = scanner.nextInt(); 
        System.out.print("Digite o número 2: "); 
        num2  = scanner.nextInt();
        } catch(Exception e){
            System.out.println("Valores inseridos errados! "); 
            scanner.close();  
            return; 
        }   

        try{
                contar(num1, num2); 
        }catch(ParametrosInvalidosException e){
                System.out.println(e.getMessage()); 
        }
        
        scanner.close(); 
    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 >= num2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro"); 
        }
        int contagem = num2 - num1; 
        for (int i =1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}

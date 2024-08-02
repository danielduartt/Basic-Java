public class ExemploBreakContinue {
    public static void main(String[] args) {
        //Break 
        for(int num = 1; num <=5; num++){
            if(num == 3) break; 
            System.out.println(num);
        }
        System.out.println("----------------------------------------------");
        //Continue 
        for(int num = 1; num <=5; num++){
            if(num == 3) continue; 
            System.out.println(num);
        }
    }
}

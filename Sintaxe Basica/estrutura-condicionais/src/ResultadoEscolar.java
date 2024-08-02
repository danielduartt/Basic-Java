public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6; 
        if(nota >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

        //Outra Forma
        String resultado = nota>= 7 ? "Aprovado!" : "Reprovado!"; 
        System.out.println(resultado); 
    }
}

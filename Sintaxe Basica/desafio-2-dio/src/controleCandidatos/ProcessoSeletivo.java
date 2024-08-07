package controleCandidatos;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        Candidato[] candidatos = Candidato.cadastrarCandidatos(10);
        int candidatoAtual = 0, candidatosSelecionados = 0;
        double salarioBase = 2000.00; 

        while(candidatosSelecionados <= 5 && candidatoAtual <= candidatos.length){
            Candidato candidato = candidatos[candidatoAtual]; 
            System.out.println("O candidato" + candidato.nome + " Solicitou este valor de salário" + candidato.salario_pretendido); 
            if( salarioBase >= candidato.salario_pretendido ){
                System.out.println("O candidato" + candidato + "foi seleionado para a vaga"); 
                candidatosSelecionados++; 
            }
            candidatoAtual ++; 
        }
    }
public static void analisarCandidato(Candidato candidato){
    double salarioBase = 2000.00; 
    if(salarioBase > candidato.salario_pretendido ){
        System.out.printf("Ligando para o número %s do candidato %s %n", candidato.telefone, candidato.nome);
    }else if(salarioBase == candidato.salario_pretendido){
        System.out.printf("Ligando para contraproposta para o número %s do candidato %s %n", candidato.telefone, candidato.nome);
    }else{
        System.out.println("Aguardando o resultado dos demais candidatos"); 
    }
 }
}

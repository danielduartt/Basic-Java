import java.time.LocalDate;

public class Cursos extends Conteudo {
    private int cargoHoraria;

    public Cursos(String titulo, String descricao){
        super.setDescricao(descricao);
        super.setTitulo(descricao);
    }
    @Override
    public double calcularXP(){return 0;};
}

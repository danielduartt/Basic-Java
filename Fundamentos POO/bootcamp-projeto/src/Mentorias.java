import java.time.LocalDate;

public class Mentorias extends Conteudo {
    private LocalDate data;

    public Mentorias(String titulo, String descricao,LocalDate data){
        super.setDescricao(descricao);
        super.setTitulo(titulo);
        this.data = data;
    }

// --------------------------------------------------------------------------------------
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public double calcularXP(){
        return XP_PADRAO + 20d;
    };
}

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos("Java", "Aprenda Java em 10 minutos");
        Cursos curso2 = new Cursos("Python", "Aprenda Ia em 10 segundos");
        Cursos curso3 = new Cursos("PHP", "Aprenda a linguagem do diabo agora");
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);

    }



}

public class Sistema {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Vladimir");
        p.setEmail("vladimir@gmail.com");
        p.setTelefone("(11) 555-5555");

        Estudante e = new Estudante();
        e.setNome("Juan");
        e.setEmail("juan@gmail.com");
        e.setTelefone("(11) 5557-5555");
        e.setNumeroMatricula(486481);
        e.setCurso("Física");

        System.out.println(p.exibir());
        System.out.println(e.exibir());

    }
}

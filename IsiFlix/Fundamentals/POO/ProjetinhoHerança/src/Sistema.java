public class Sistema {
    public static void main(String[] args) {
        /*
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

         */

        Pessoa cadastro[] = new Pessoa[5];

        cadastro[0] = new Pessoa("(21)999468445", "Vladimir@vladimir.com", "Vladimir");
        cadastro[1] = new Pessoa("(51)999515545", "Jose@jose.com", "Jose");
        cadastro[2] = new Pessoa("(11)999833642", "Carlos@carlos.com", "Carlos");
        cadastro[3] = new Pessoa("(21)999645354", "Rosa@rosa.com", "Rosa");
        cadastro[4] = new Pessoa("(21)964435715", "Frederico@frederico.com", "Frederico");

        for (Pessoa p : cadastro) {
            System.out.println(p.exibir());
        }

    }
}

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso de Java para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Angular");
        curso2.setDescricao("Curso de Angular para iniciantes");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Carreira");
        mentoria1.setDescricao("Mentoria voltada para a carreira de TI");
        mentoria1.setData(LocalDate.now());

//      Conteudo conteudo = new Curso();
//      conteudo.setTitulo("Curso de Python");
//      conteudo.setDescricao("Curso de Python para iniciantes");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp voltado para desenvolvedores Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Igor: " + devIgor.getConteudosInscritos());
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("-------------------");
        System.out.println("Conteúdos inscritos do Igor: " + devIgor.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por Igor: " + devIgor.getConteudosConcluidos());
        System.out.println("-------------------");
        System.out.println("XP total do Igor: " + devIgor.calcularTotalXp());

        System.out.println("-------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-------------------");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos por João: " + devJoao.getConteudosConcluidos());
        System.out.println("-------------------");
        System.out.println("XP total do João: " + devJoao.calcularTotalXp());
    }
}

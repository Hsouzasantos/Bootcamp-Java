import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("JavaScript");
        curso1.setDescricao("Curso de JavaScript");
        curso1.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria do curso Java");
        LocalDateTime agora = LocalDateTime.now();
        mentoria.setData(agora);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devHugo = new Dev();
        devHugo.setNome("Hugo");
        devHugo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito de " + devHugo.getNome() +":" + devHugo.getConteudoInscritos());
        devHugo.progredir();
        System.out.println("Conteudo Concluidos de " + devHugo.getNome() +":" + devHugo.getConteudosConcluidos());


        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito de " + devMaria.getNome() +":" + devMaria.getConteudoInscritos());

        devMaria.progredir();
        System.out.println("Conteudo Concluidos de " + devMaria.getNome() +":" + devMaria.getConteudosConcluidos());
        System.out.println("Conteudo Inscrito de " + devMaria.getNome() +":" + devMaria.getConteudoInscritos());
        System.out.println("XP conquistado: " + devMaria.calcularTotalXp());
    }
}
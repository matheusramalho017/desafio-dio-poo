import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso de Java");
        curso1.setDescricao("Curso feito na DIO");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de JS");
        curso2.setDescricao("Curso feito na DIO");
        curso2.setCargaHoraria(15);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Ensino de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java Delover");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila" + devCamila.getconteudosConcluidos());
        System.out.println("XP:" + devCamila.CalcularTotalXP());

        System.out.println("----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao" + devJoao.getconteudosConcluidos());
        System.out.println("XP:" + devJoao.CalcularTotalXP());
    }
}

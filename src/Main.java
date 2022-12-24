import com.kennedfer.dio.desafio.dominio.Bootcamp;
import com.kennedfer.dio.desafio.dominio.Curso;
import com.kennedfer.dio.desafio.dominio.Dev;
import com.kennedfer.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoDeJava = new Curso();
        cursoDeJava.setTitulo("Curso de Java");
        cursoDeJava.setDescricao("O melhor curso de Java");
        cursoDeJava.setCargaHoraria(200);

        Mentoria mentoriaDeJava = new Mentoria();
        mentoriaDeJava.setTitulo("Mentoria de Java");
        mentoriaDeJava.setDescricao("Melhor mentoria de Java");
        mentoriaDeJava.setData(LocalDate.now());

        Bootcamp bootcampDeJava = new Bootcamp();
        bootcampDeJava.setNome("Bootcamp Java Dev");
        bootcampDeJava.setDescricao("Melhor Bootcamp de Java");
        bootcampDeJava.getConteudos().add(cursoDeJava);
        bootcampDeJava.getConteudos().add(mentoriaDeJava);

        Dev devKenned = new Dev();
        devKenned.setNome("Kenned");
        devKenned.inscreverBootcamp(bootcampDeJava);
        devKenned.progredir();

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampDeJava);
        devCamila.progredir();

        System.out.println(devKenned.getConteudosInscritos());
        System.out.println(devKenned.getConteudosConcluidos());
        System.out.println(devKenned.calcularTotalXp());
    }
}

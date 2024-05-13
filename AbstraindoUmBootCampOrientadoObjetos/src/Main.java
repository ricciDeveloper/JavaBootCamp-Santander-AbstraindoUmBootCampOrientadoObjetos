import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java spring");
        curso1.setDescricao("Java -Framework SpringBoot");
        curso1.setCargaHoraria(16);

        Curso curso2 = new Curso();
        curso2.setTitulo("Phyton");
        curso2.setDescricao("Python /pandas/pyautogui");
        curso2.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("Java e alguns frameworks de seu ecossistema");
        mentoria1.setData(LocalDate.now());

        /*
        *System.out.println(curso1);
        *System.out.println(curso2);
        *System.out.println(mentoria1);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Java 2024");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        System.out.println("==");
        Dev dev1 = new Dev();
        dev1.setNome("João Victor");
        dev1.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos João:" + dev1.getConteudosInscritos());
        System.out.println("_");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos João:" + dev1.getConteudosInscritos());
        System.out.println("_");
        System.out.println("Conteúdos concluídos João:" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());
        System.out.println("==");
        Dev dev2 = new Dev();
        dev2.setNome("Stella");
        dev2.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos Stella:" + dev2.getConteudosInscritos());
        System.out.println("==");
        dev2.progredir();
        System.out.println("Conteúdos inscritos Stella:" + dev2.getConteudosInscritos());
        System.out.println("_");
        System.out.println("Conteúdos concluídos João:" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());
        System.out.println("==");

    }
}
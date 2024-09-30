package br.com.desafio;


import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descirção curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descirção curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Camila");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("---------------");
        System.out.println("Conteúdos inscritos" + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + dev.getConteudosConcluidos());
        System.out.println("XP" + dev.calcularTotalXp());


        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("---------------");
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + dev2.getConteudosConcluidos());
        System.out.println("XP" + dev2.calcularTotalXp());





    }
}
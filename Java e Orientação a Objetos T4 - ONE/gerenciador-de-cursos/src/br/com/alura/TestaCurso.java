package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira" );

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        //pode ser feito assim
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);


    }
}

package br.com.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private final LocalDate  dataFinal = dataInicial.plusDays(45);
    private Set<Dev>devInscritos = new HashSet<>();
    private Set<Conteudo>conteudos = new LinkedHashSet<>();




}

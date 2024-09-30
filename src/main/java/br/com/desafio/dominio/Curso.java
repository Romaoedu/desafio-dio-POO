package br.com.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Curso extends  Conteudo {

    private int cargaHoraria;


    @Override
    public String toString() {
        return "Curso{" +
                "Mentoria{" +
                "Titulo = " + getTitulo() +
                " Descrição = " + getDescricao()+
                " CargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}

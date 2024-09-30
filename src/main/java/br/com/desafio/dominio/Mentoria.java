package br.com.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Mentoria extends Conteudo {


    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo = " + getTitulo() +
                " Descrição = " + getDescricao()+
                " Data = " + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}

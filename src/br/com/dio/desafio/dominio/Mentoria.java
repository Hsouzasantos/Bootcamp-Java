package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    private String data;

    @Override
    public double calcularXp() {
        return XP_PROGRESSO + 20d;
    }

    public String getData() {
        return data;
    }

    public Mentoria(){}

    public void setData(LocalDateTime data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.data = data.format(formatter);
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data inicio =" + getData() +
                '}';
    }
}

package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PROGRESSO = 10d;
    private String titulo;
    private String descrição;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descrição;
    }

    public void setDescricao(String descrição) {
        this.descrição = descrição;
    }

}

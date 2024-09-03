package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, double preco, Professor professor) {
        setTitulo(titulo);
        setDescricao(descricao);
        setPreco(preco);
        setProfessor(professor);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data + '\'' +
                ", preço=" + String.format("%,.2f",getPreco()) +
                '}';
    }
}

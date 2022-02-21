package br.edu.iftm.demo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private Double valorInicial;
    private int encerramento;

    @ManyToOne
    private Categoria categoria;

    public Item() {
    }

    public Item(Integer id, String nome, Double valorInicial, int i, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.valorInicial = valorInicial;
        this.encerramento = i;
        this.categoria = categoria;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorInicial() {
        return this.valorInicial;
    }

    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getEncerramento() {
        return this.encerramento;
    }

    public void setEncerramento(int encerramento) {
        this.encerramento = encerramento;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", valorInicial='" + getValorInicial() + "'" +
            ", encerramento='" + getEncerramento() + "'" +
            ", categoria='" + getCategoria() + "'" +
            "}";
    }

}

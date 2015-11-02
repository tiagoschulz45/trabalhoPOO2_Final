/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/// TODO Implementar novos atributos, data Final, numero de temporadas e sinopse
/// TODO incluir classe Servlet para grava, excluir dados na tabela
/// TODO testar SQL pra ver se está funcionando
/// TODO incluir validações JS na tela
/// TODO incluir CSS pra enfeitar um pouco
/// TODO fazer relatório no jasperreports
/// TODO ver pra fazer um gráfico com algum framework


package model;

import java.io.Serializable;

public class Serie implements Serializable {
    private int id;
    private String nome;
    private Genero genero;
    private int classificacao;
    private String sinopse;
    private int temporadas;
    
    public Serie(String nome, Genero genero, int classificacao,String sinopse,int temporadas) {
        this.nome = nome;
        this.genero = genero;
        this.classificacao = classificacao;
        this.sinopse = sinopse;
        this.temporadas = temporadas;
    }
    
    public Serie() {
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero.toString();
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}


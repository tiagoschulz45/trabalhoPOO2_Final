
package model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;


@Entity
public class Serie implements Serializable {
    
    @Id
    @GeneratedValue
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


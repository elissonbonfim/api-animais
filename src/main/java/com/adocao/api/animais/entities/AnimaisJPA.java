/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adocao.api.animais.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author elisson
 */
@Entity(name = "Animais")
@Table(name = "tb_animais")
public class AnimaisJPA implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long animais_id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nomeImg")
    private List<ImgJPA> img;

    @Column(nullable = false)
    private String porte;

    @Column(nullable = false)
    private String idade;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false)
    private String pelos;

    @Column(nullable = false)
    private String castracao;

    @Column(nullable = false)
    private String descricao;

    public AnimaisJPA() {
    }

    public AnimaisJPA(Long animais_id, String nome, String tipo, List<ImgJPA> img, String porte, String idade, String sexo, String pelos, String castracao, String descricao) {
        this.animais_id = animais_id;
        this.nome = nome;
        this.tipo = tipo;
        this.img = img;
        this.porte = porte;
        this.idade = idade;
        this.sexo = sexo;
        this.pelos = pelos;
        this.castracao = castracao;
        this.descricao = descricao;
    }

    public Long getAnimais_id() {
        return animais_id;
    }

    public void setAnimais_id(Long animais_id) {
        this.animais_id = animais_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<ImgJPA> getImg() {
        return img;
    }

    public void setImg(List<ImgJPA> img) {
        this.img = img;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPelos() {
        return pelos;
    }

    public void setPelos(String pelos) {
        this.pelos = pelos;
    }

    public String getCastracao() {
        return castracao;
    }

    public void setCastracao(String castracao) {
        this.castracao = castracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.animais_id);
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.tipo);
        hash = 79 * hash + Objects.hashCode(this.img);
        hash = 79 * hash + Objects.hashCode(this.porte);
        hash = 79 * hash + Objects.hashCode(this.idade);
        hash = 79 * hash + Objects.hashCode(this.sexo);
        hash = 79 * hash + Objects.hashCode(this.pelos);
        hash = 79 * hash + Objects.hashCode(this.castracao);
        hash = 79 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnimaisJPA other = (AnimaisJPA) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.porte, other.porte)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.pelos, other.pelos)) {
            return false;
        }
        if (!Objects.equals(this.castracao, other.castracao)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.animais_id, other.animais_id)) {
            return false;
        }
        if (!Objects.equals(this.img, other.img)) {
            return false;
        }
        return true;
    }

}

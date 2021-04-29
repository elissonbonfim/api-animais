/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adocao.api.animais.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author elisson
 */
@Entity
@Table(name = "tb_img")
public class ImgJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long img_id;

    @ManyToOne
    @JoinColumn(name = "animais_id")
    private AnimaisJPA nomeImg;

    public ImgJPA() {
    }

    public ImgJPA(Long img_id, AnimaisJPA nomeImg) {
        this.img_id = img_id;
        this.nomeImg = nomeImg;
    }

    public Long getImg_id() {
        return img_id;
    }

    public void setImg_id(Long img_id) {
        this.img_id = img_id;
    }

    public AnimaisJPA getNomeImg() {
        return nomeImg;
    }

    public void setNomeImg(AnimaisJPA nomeImg) {
        this.nomeImg = nomeImg;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.img_id);
        hash = 31 * hash + Objects.hashCode(this.nomeImg);
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
        final ImgJPA other = (ImgJPA) obj;
        if (!Objects.equals(this.img_id, other.img_id)) {
            return false;
        }
        if (!Objects.equals(this.nomeImg, other.nomeImg)) {
            return false;
        }
        return true;
    }

}

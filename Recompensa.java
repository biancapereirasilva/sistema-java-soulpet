package br.com.fiap.bean;

import javax.swing.*;

public class Recompensa implements Resgatavel{
    private int id;
    private String nome;
    private int custoEmPontos;

    public Recompensa(){}

    public Recompensa(int id, String nome, int custoEmPontos){
        this.id = id;
        this.nome = nome;
        this.custoEmPontos = custoEmPontos;
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

    public int getCustoEmPontos() {
        return custoEmPontos;
    }

    public void setCustoEmPontos(int custoEmPontos) {
        this.custoEmPontos = custoEmPontos;
    }

    public void resgatar() {
        JOptionPane.showMessageDialog(null, "Recompensa " + nome + " resgatada por " + custoEmPontos + " pontos!");
    }
}

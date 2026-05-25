package br.com.fiap.bean;

import javax.swing.*;

public class Produto extends Recompensa{
    private String categoria;
    private int estoque;

    public Produto(){}

    public Produto(int id, String nome, int custoEmPontos, String categoria, int estoque){
        super(id, nome, custoEmPontos);
        this.categoria = categoria;
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void resgatar() {
        super.resgatar();
    }

    public void verificarEstoque(){
        JOptionPane.showMessageDialog(null, "Estoque disponível: " + estoque + " unidades.");
    }
}

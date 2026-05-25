package br.com.fiap.bean;

import javax.swing.*;

public class Missao implements Realizavel{
    private String titulo;
    private String descricao;
    private int pontosRecompensa;
    private boolean concluida;

    public Missao(){}

    public Missao(String titulo, String descricao, int pontosRecompensa, boolean concluida){
        this.titulo = titulo;
        this.descricao = descricao;
        this.pontosRecompensa = pontosRecompensa;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPontosRecompensa() {
        return pontosRecompensa;
    }

    public void setPontosRecompensa(int pontosRecompensa) {
        this.pontosRecompensa = pontosRecompensa;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    public void exibirMissao(){
        JOptionPane.showMessageDialog(null,
                "Missão: " + titulo + "\n" + "Descrição: " + descricao + "\n" + "Pontos: " + pontosRecompensa + "\n" + "Missão concluída: " + concluida);
    }
}

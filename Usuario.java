package br.com.fiap.bean;

import javax.swing.*;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private int pontos;
    private String nivel;

    public Usuario(){}

    public Usuario(int id, String nome, String email, String senha, int pontos, String nivel){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.pontos = pontos;
        this.nivel = nivel;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void acumularPontos(){
        JOptionPane.showMessageDialog(null, "Total de pontos acumulados: " + pontos);
    }

    public String exibirNivel(){
        return nivel;
    }
}

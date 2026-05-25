package br.com.fiap.bean;

import javax.swing.*;

public class Participante extends Usuario{
    private String cpf;
    private String endereco;
    private String telefone;

    public Participante(){}

    public Participante(int id, String nome, String email, String senha, int pontos, String nivel, String cpf, String endereco, String telefone){
        super(id, nome, email, senha, pontos, nivel);
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void resgatarRecompensa(){
        JOptionPane.showMessageDialog(null, "Recompensa resgatada por: " + getNome());
    }

    public void listarResgates(){
        JOptionPane.showMessageDialog(null, "Listando resgates do participante: " + getNome());
    }
}

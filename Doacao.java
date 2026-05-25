package br.com.fiap.bean;

import javax.swing.*;

public class Doacao extends Recompensa{
    private double valorEquivalente;
    private String comprovante;

    public Doacao(){}

    public Doacao(int id, String nome, int custoEmPontos, double valorEquivalente, String comprovante){
        super(id, nome, custoEmPontos);
        this.valorEquivalente = valorEquivalente;
        this.comprovante = comprovante;
    }

    public double getValorEquivalente() {
        return valorEquivalente;
    }

    public void setValorEquivalente(double valorEquivalente) {
        this.valorEquivalente = valorEquivalente;
    }

    public String getComprovante() {
        return comprovante;
    }

    public void setComprovante(String comprovante) {
        this.comprovante = comprovante;
    }

    public void resgatar() {
        super.resgatar();
    }

    public void emitirComprovante(){
        JOptionPane.showMessageDialog(null, "Comprovante: " + comprovante + "\nValor equivalente: R$ " + valorEquivalente);
    }
}


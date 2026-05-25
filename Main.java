package br.com.fiap.main;

import br.com.fiap.bean.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim", exibe;
        String titulo, descricao, nomeRecompensa, nomeProduto, categoria, nomeDoacao, comprovante;
        String nomeUsuario, email, senha, nivel, cpf, endereco, telefone;
        int opcao, pontosRecompensa, custoRecompensa, custoProduto, custoDoacao, estoque, pontos;
        double valorEquivalente;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Selecione a classe a ser testada:\n(1) Missão\n(2) Recompensa\n(3) Produto\n(4) Doação\n(5) Usuário\n(6) Participante");
                opcao = Integer.parseInt(auxiliar);

                switch (opcao) {
                    case 1:
                        titulo = JOptionPane.showInputDialog("Digite o título da missão: ");
                        descricao = JOptionPane.showInputDialog("Digite a descrição: ");
                        auxiliar = JOptionPane.showInputDialog("Digite os pontos de recompensa: ");
                        pontosRecompensa = Integer.parseInt(auxiliar);
                        Missao missao = new Missao(titulo, descricao, pontosRecompensa, false);
                        missao.exibirMissao();
                        missao.concluir();
                        missao.exibirMissao();
                        break;

                    case 2:
                        nomeRecompensa = JOptionPane.showInputDialog("Digite a recompensa a ser resgatada: ");
                        auxiliar = JOptionPane.showInputDialog("Digite o custo em pontos: ");
                        custoRecompensa = Integer.parseInt(auxiliar);
                        Recompensa recompensa = new Recompensa(1, nomeRecompensa, custoRecompensa);
                        recompensa.resgatar();
                        exibe = String.format("Recompensa: %s\nCusto: %d pontos", recompensa.getNome(), recompensa.getCustoEmPontos());
                        JOptionPane.showMessageDialog(null, exibe);
                        break;

                    case 3:
                        nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
                        auxiliar = JOptionPane.showInputDialog("Digite o custo em pontos: ");
                        custoProduto = Integer.parseInt(auxiliar);
                        categoria = JOptionPane.showInputDialog("Digite a categoria: ");
                        estoque = 10;
                        Produto produto = new Produto(1, nomeProduto, custoProduto, categoria, estoque);
                        produto.verificarEstoque();
                        produto.resgatar();
                        break;

                    case 4:
                        nomeDoacao = JOptionPane.showInputDialog("Digite o nome da ONG que vai receber a doação: ");
                        auxiliar = JOptionPane.showInputDialog("Digite a quantidade de pontos que vai ser doada: ");
                        custoDoacao = Integer.parseInt(auxiliar);
                        comprovante = "COMP-" + System.currentTimeMillis();
                        Doacao doacao = new Doacao(1, nomeDoacao, custoDoacao, 0, comprovante);
                        doacao.resgatar();
                        doacao.emitirComprovante();
                        break;

                    case 5:
                        nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuário:");
                        email = JOptionPane.showInputDialog("Digite o email:");
                        senha = JOptionPane.showInputDialog("Digite a senha:");
                        auxiliar = JOptionPane.showInputDialog("Digite os pontos:");
                        pontos = Integer.parseInt(auxiliar);
                        nivel = JOptionPane.showInputDialog("Digite o nível:");
                        Usuario usuario = new Usuario(1, nomeUsuario, email, senha, pontos, nivel);
                        usuario.acumularPontos();
                        exibe = String.format("Usuário: %s\nNível: %s\nPontos: %d", usuario.getNome(), usuario.exibirNivel(), usuario.getPontos());
                        JOptionPane.showMessageDialog(null, exibe);
                        break;

                    case 6:
                        nomeUsuario = JOptionPane.showInputDialog("Digite o nome do participante: ");
                        email = JOptionPane.showInputDialog("Digite o email: ");
                        senha = JOptionPane.showInputDialog("Digite a senha: ");
                        auxiliar = JOptionPane.showInputDialog("Digite os pontos: ");
                        pontos = Integer.parseInt(auxiliar);
                        nivel = JOptionPane.showInputDialog("Digite o nível: ");
                        cpf = JOptionPane.showInputDialog("Digite o CPF: ");
                        endereco = JOptionPane.showInputDialog("Digite o endereço: ");
                        telefone = JOptionPane.showInputDialog("Digite o telefone: ");
                        Participante participante = new Participante(1, nomeUsuario, email, senha, pontos, nivel, cpf, endereco, telefone);
                        participante.acumularPontos();
                        participante.resgatarRecompensa();
                        participante.listarResgates();
                        exibe = String.format("Participante: %s\nCPF: %s\nEndereço: %s\nTelefone: %s", participante.getNome(), participante.getCpf(), participante.getEndereco(), participante.getTelefone());
                        JOptionPane.showMessageDialog(null, exibe);
                        break;

                    default:
                        throw new Exception("Opção inválida!");
                }

                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre!");
    }
}
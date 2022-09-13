package projetoCRUDbasico.app;

import projetoCRUDbasico.model.Produto;

import javax.swing.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Produto pro;
        pro = new Produto();


        System.out.print("Informe o nome: ");
        var nome = JOptionPane.showInputDialog(null, "Informe o nome: ", "Input Nome", JOptionPane.QUESTION_MESSAGE);
        pro.setNome(nome);

        System.out.print("Informe a marca: ");
        var marca = JOptionPane.showInputDialog(null, "Informe a marca: ", "Input Email", JOptionPane.QUESTION_MESSAGE);
        pro.setMarca(marca);

        System.out.print("Informe o preço: ");
        var preco = JOptionPane.showInputDialog(null, "Informe o preço: ", "Input Matricula", JOptionPane.QUESTION_MESSAGE);
        pro.setPreco(Double.parseDouble((preco)));

        System.out.print("Informe o tipo: ");
        var tipo = JOptionPane.showInputDialog(null, "Informe o tipo: ", "Input Sexo", JOptionPane.QUESTION_MESSAGE);
        pro.setTipo(tipo);


        var msg = "Produto.nome: " + pro.getNome() + "\n" + "Produto.marca: " + pro.getMarca() + "\n" + "Produto.preco: " + pro.getPreco() + "\n" + "Produto.tipo: " + pro.getTipo();
        JOptionPane.showMessageDialog(null, msg, "Resposta", JOptionPane.PLAIN_MESSAGE);
    }
}
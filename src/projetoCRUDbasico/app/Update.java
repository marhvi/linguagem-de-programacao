package projetoCRUDbasico.app;

import projetoCRUDbasico.model.Produto;
import projetoCRUDbasico.service.ProdutoService;

import javax.swing.*;

public class Update {
    public static void main(String[] args) {
        var service = new ProdutoService();
        var produtos = service.findById(1L);
        Produto pro = new Produto();

        var nome = JOptionPane.showInputDialog(null, "Informe o nome: ", "Input Nome", JOptionPane.QUESTION_MESSAGE);
        pro.setNome(nome);

        var marca = JOptionPane.showInputDialog(null, "Informe a marca: ", "Input Nome", JOptionPane.QUESTION_MESSAGE);
        pro.setMarca((marca));

        var preco = JOptionPane.showInputDialog(null, "Informe o preço: ", "Input Nome", JOptionPane.QUESTION_MESSAGE);
        pro.setPreco(Double.valueOf(preco));

        var tipo = JOptionPane.showInputDialog(null, "Informe o tipo: ", "Input Nome", JOptionPane.QUESTION_MESSAGE);
        pro.setTipo(tipo);

        var situacao = "Ocorreu uma falha na gravação. Verifique o log";
        var iconeStatus = JOptionPane.ERROR_MESSAGE;

        var response = service.save(pro);
        if(response) {
            situacao = "Gravado com sucesso";
            iconeStatus = JOptionPane.INFORMATION_MESSAGE;
        }

        var msg = "Situação da gravação no banco: " + situacao + "\n\n" + "Produto.nome: " + pro.getNome() + "\n" + "Produto.marca: " + pro.getMarca() + "\n" + "Produto.preço: " + pro.getPreco() + "Produto.tipo: " + "\n" + pro.getTipo();
        JOptionPane.showMessageDialog(null, msg, "Resposta", iconeStatus);
    }
}

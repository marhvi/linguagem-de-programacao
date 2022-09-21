package projetoCRUDbasico.app;

import projetoCRUDbasico.service.ProdutoService;

import javax.swing.*;

public class FindByName {
    public static void main(String[] args) {
        var service = new ProdutoService();

        var respostaList = service.findByName("Livro").stream().map(produto -> "Produto.nome: " + produto.getNome() + "\n" + "Produto.marca: " + produto.getMarca() + "\n" + "Produto.preco: " + produto.getPreco() + "\n"  + "Produto.tipo " + produto.getTipo() + "\n\n").toList();
        JOptionPane.showMessageDialog(null, respostaList, "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }
}

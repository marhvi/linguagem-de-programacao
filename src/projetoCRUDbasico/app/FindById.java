package projetoCRUDbasico.app;

import projetoCRUDbasico.service.ProdutoService;

import javax.swing.*;

public class FindById {
    public static void main(String[] args) {
        var service = new ProdutoService();

        var pro = service.findById(1L);

        var msg = "Produto.nome: " + pro.getNome() + "\n" + "Produto.marca: " + pro.getMarca() + "\n" + "Produto.preço: " + pro.getPreco() + "Produto.tipo: " + "\n" + pro.getTipo();
        JOptionPane.showMessageDialog(null, msg, "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }
}

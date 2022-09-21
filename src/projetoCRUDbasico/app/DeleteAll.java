package projetoCRUDbasico.app;

import projetoCRUDbasico.service.ProdutoService;

import javax.swing.*;

public class DeleteAll {
    public static void main(String[] args) {
        var service = new ProdutoService();
        var produtos = service.findByName("Livro");

        var status = service.deleteAll(produtos);

        var msg = "Status da exclusão: " + (status ? "Sucesso" : "Error");
        JOptionPane.showMessageDialog(null, msg, "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }
}

package projetoCRUDbasico.app;

import projetoCRUDbasico.model.Produto;
import projetoCRUDbasico.service.ProdutoService;

import javax.swing.*;

public class Save {
    public static void main(String[] args) {
        var service = new ProdutoService();
        Produto pro = new Produto();


        pro.setNome(JOptionPane.showInputDialog(null, "Informe o nome: ", "Input Nome", JOptionPane.QUESTION_MESSAGE));

        pro.setMarca(JOptionPane.showInputDialog(null, "Informe a marca: ", "Input Marca", JOptionPane.QUESTION_MESSAGE));
        
        pro.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço: ", "Input Preço", JOptionPane.QUESTION_MESSAGE)));

        pro.setTipo(JOptionPane.showInputDialog(null, "Informe o tipo: ", "Input Tipo", JOptionPane.QUESTION_MESSAGE));

        var response = service.save(pro);

        var situacao = "Ocorreu uma falha na gravação. Verifique o log";
        var iconeStatus = JOptionPane.ERROR;

        if(response){
            situacao = "Gravado com sucesso";
            iconeStatus = JOptionPane.INFORMATION_MESSAGE;
        }

        var msg = "Situação da gravação no banco: " + situacao + "\n\n" + "Produto.nome = " + pro.getNome() + "\n" + "Produto.marca = " + pro.getMarca() + "\n" + "Produto.tipo = " + pro.getTipo() + "\n" + "Produto.preco = " + pro.getPreco();
        JOptionPane.showMessageDialog(null, msg, "Resposta", iconeStatus );

    }
}

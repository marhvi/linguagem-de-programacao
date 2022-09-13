package projetoCRUDbasico.model;

public class Produto {

    private int id;
    private String nome;
    private String marca;
    private Double preco;
    private String tipo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Produto retornaProduto() {
        return this;
    }
}
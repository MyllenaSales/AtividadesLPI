package model;

public class Produto {
private int codigo, estoque;
private String descricao, categoria; 
private float preco;
public Produto() {
}
public Produto(int codigo, int estoque, String descricao, String categoria, float preco) {
    setCodigo(codigo);
    setEstoque(estoque);
    setDescricao(descricao);
    setCategoria(categoria);
    setPreco(preco);
}
public int getCodigo() {
    return codigo;
}
public void setCodigo(int codigo) {
    this.codigo = codigo;
}
public int getEstoque() {
    return estoque;
}
public void setEstoque(int estoque) {
    this.estoque = estoque;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public String getCategoria() {
    return categoria;
}
public void setCategoria(String categoria) {
    this.categoria = categoria;
}
public float getPreco() {
    return preco;
}
public void setPreco(float preco) {
    this.preco = preco;
}
}


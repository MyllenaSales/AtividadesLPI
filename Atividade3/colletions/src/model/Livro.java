package model;

public class Livro {
private int ano, paginas;
private String isbn, titulo, autor;
private boolean disponivel;
public Livro() {
}
public Livro(int ano, int paginas, String isbn, String titulo, String autor, boolean disponivel) {
    setAno(ano);
    setPaginas(paginas);
    setIsbn(isbn);
    setTitulo(titulo);
    setAutor(autor);
    setDisponivel(disponivel);
}
public int getAno() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}
public int getPaginas() {
    return paginas;
}
public void setPaginas(int paginas) {
    this.paginas = paginas;
}
public String getIsbn() {
    return isbn;
}
public void setIsbn(String isbn) {
    this.isbn = isbn;
}
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}
public boolean isDisponivel() {
    return disponivel;
}
public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
}
}
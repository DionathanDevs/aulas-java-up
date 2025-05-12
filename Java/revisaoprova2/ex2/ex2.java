class Main{

    public static void main(String[] args) {
        Livro l1 = new Livro("O Hobbit", 1937, "J.R.R. Tolkien", 310);
        Dvd d1 = new Dvd("Interestelar", 2014, "Ficção Científica", 169);

        l1.mostrarDetalhes();
        d1.mostrarDetalhes();
    }

}

class ItemBiblioteca{
    private String titulo;
    private int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public void mostrarDetalhes(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }


}


class Livro extends ItemBiblioteca{
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas){
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Autor do Livro: " + getAutor());
        System.out.println("Número de Páginas: " + getNumeroPaginas());
    }
}

class Dvd extends ItemBiblioteca{
    private String categoria;
    private int minutos;

    public Dvd(String titulo, int anoPublicacao, String categoria, int minutos){
        super(titulo, anoPublicacao);
        this.categoria = categoria;
        this.minutos = minutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getMinutos() {
        return minutos;
    }


    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Categoria do DVD: " + getCategoria());
        System.out.println("Minutos do DVD: " + getMinutos());
    }
}
/*public class Main {

    public static void main(String[] args) {

        
        itemBiblioteca i1 = new itemBiblioteca("Teste", 2005);
        i1.mostrarDetalhes();

        System.out.println("");

        Livro l1 = new Livro("Homem aranha", 2018, "Dionathan", 256);
        l1.mostrarDetalhes();

        System.out.println("");

        Dvd d1 = new Dvd("Homem de ferro", 2025, "Ação", 200);
        d1.mostrarDetalhes();

        System.out.println("");

    }



}

class itemBiblioteca{

    private String titulo;
    private int ano;

    public itemBiblioteca(String titulo, int ano){

        this.titulo = titulo;
        this.ano = ano;

    }

    public void setAno(int ano) {

        this.ano = ano;

    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }

    public int getAno() {

        return ano;

    }

    public String getTitulo() {

        return titulo;

    }


    public void mostrarDetalhes(){

        System.out.println("Titulo: " + this.getTitulo());

        System.out.println("Ano de publicação: " + this.getAno());

    }



}

class Livro extends itemBiblioteca{

    private String autor;
    private int numeroPagina;

    public Livro(String titulo,int ano, String autor, int numeroPagina){

        super(titulo, ano);
        this.autor = autor;
        this.numeroPagina = numeroPagina;
        

    }

    @Override
    public void mostrarDetalhes(){

        super.mostrarDetalhes();

        System.out.println("Autor: " + this.autor);
        System.out.println("Número Página: " + this.numeroPagina);

    }
}

class Dvd extends itemBiblioteca{

    private String categoria;
    private int minutos;

    public Dvd(String titulo, int ano, String categoria, int minutos){

        super(titulo, ano);
        this.categoria = categoria;
        this.minutos = minutos;

    }

    @Override
    public void mostrarDetalhes(){

        super.mostrarDetalhes();
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Minutos: " + this.minutos);


    }

} */
package ex1;
public class Main {
    public static void main(String[] args){

        Livro l1 = new Livro("TesteLivro","TesteAutor");
        Cliente p1 = new Cliente("TesteCliente", 19);
        Emprestimo e1 = new Emprestimo(p1, l1, "07/05/2025");
        e1.exibirDetalhes();
        Livro l2 = new Livro("LIVRO ACABANA ","JACKOB");
        Cliente p2 = new Cliente("DIONATHAN", 19);
        Emprestimo e2 = new Emprestimo(p2, l2, "07/05/2025");
        e2.exibirDetalhes();

    }
}

class Livro{
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

}

class Cliente{
    private String nome;
    private int idade;

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Emprestimo{
    private Cliente cliente;
    private Livro livro;
    private String data;
    
    public Emprestimo(Cliente cliente, Livro livro, String data){
        this.cliente = cliente;
        this.livro = livro;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getData() {
        return data;
    }

    public Livro getLivro() {
        return livro;
    }

    public void exibirDetalhes(){
        System.out.println("Dados do emprestismo: ");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Data: " + data);
    }
}

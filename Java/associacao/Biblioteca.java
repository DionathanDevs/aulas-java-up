public class Biblioteca{
    
    public static void main(String[] args) {
    
    Livro l1 = new Livro("A casa assombrada", "Dionathan");
    
    Cliente c1 = new Cliente("Dionathan", 19);
    
    Emprestimo e1 = new Emprestimo(c1, l1, "08/04/2025");
    
    e1.exibirDetalhes();
    
    }
    
    }
    
    public class Livro{
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
    
    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
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
    
    
    
    
    public void exibirDetalhes(){
        System.out.println("Dados do empréstimo: \n");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Idade:" + cliente.getIdade());
        System.out.println("Livro:" + livro.getTitulo());
        System.out.println("Data: " + data);
    
    }
    
    
    }
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


class Main {
    public static void main(String[] args) {
        

       
    Livro l1 = new Livro("O homem aranha", "Jacob");

    Cliente c1 = new Cliente("Dionathan",19);

    Emprestimo e1 = new Emprestimo(c1, l1, "22/04/2025", "21/04/2025");

    
    Livro l2 = new Livro("Harry Potter", "Percy");

    Cliente c2 = new Cliente("Kerem",18);

    Emprestimo e2 = new Emprestimo(c2, l2, "12/04/2025", "27/04/2025");

        
    e1.exibirDetalhes();
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

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}   

class Cliente{

    private String nome;
    private int idade;

    public Cliente(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

class Emprestimo{

    private Cliente cliente;
    private Livro livro;
    private String dataInicio;
    private String dataFinal;


    

    public Emprestimo(Cliente cliente, Livro livro, String dataInicio, String dataFinal){
        this.cliente = cliente;
        this.livro = livro;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

   


    public void exibirDetalhes(){

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     
        LocalDate dataInicioFormatada = LocalDate.parse(dataInicio, formato);
        
        LocalDate dataFinalFormatada = LocalDate.parse(dataFinal, formato);
    
        Period diferenca = Period.between(dataInicioFormatada, dataFinalFormatada);
            
        int dias = diferenca.getDays();
        
        
        if(dias > 7){
            
            int diasMulta = dias - 7;
            
            float multa = diasMulta * 2.00f;

            System.out.println("Dados do empréstimo: ");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Data de empréstimo: " + dataInicioFormatada.format(formato));
            System.out.println("Data de devolução: " + dataFinalFormatada.format(formato));
            System.out.println("Total de dias com o livro: " + dias + " dia(s)"  );
            System.out.printf("Situação: Devolvido com %d dia(s) de atraso.\n", diasMulta);
            System.out.printf("Multa: R$ %.2f ", multa);
            System.out.println("");
            
        }else{
            System.out.println("Dados do empréstimo: ");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Data de empréstimo: " + dataInicioFormatada.format(formato));
            System.out.println("Data de devolução: " + dataFinalFormatada.format(formato));
            System.out.println("Total de dias com o livro: " + dias + " dia(s)" );
            System.out.println("Situação: Devolvido no prazo.");
            System.out.println("");
            
        }
           
    }

}
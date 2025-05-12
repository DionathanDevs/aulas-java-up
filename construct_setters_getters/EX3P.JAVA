// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    Produto p1 = new Produto("Carro", 20.500, 10);
    
    System.out.println("" + p1.getQuantidade());
    p1.atualizarEstoque(10);
     System.out.println("" + p1.getQuantidade());
    p1.atualizarEstoque(-20);
      System.out.println("" + p1.getQuantidade());
      p1.atualizarEstoque(-21);
      System.out.println("" + p1.getQuantidade());
    }
}

class Produto{
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeEstoque;
    
    public Produto(String nomeProduto, double precoProduto, int quantidadeEstoque){
      this.nomeProduto = nomeProduto;
      this.precoProduto = precoProduto;
      this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public void atualizarEstoque(int quantidade){
            
            if(this.quantidadeEstoque + quantidade > 0){
                this.quantidadeEstoque += quantidade;
            }else{
                System.out.println("Não foi possivel diminuir");
            }
            
        
        
    }
    
    public void setNome(String nome){
        this.nomeProduto = nome;
    }
    
    public void setPreco(double preco){
        this.precoProduto = preco;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidadeEstoque = quantidade;
    }
    
    public String getNome(){
        return this.nomeProduto;
    }
    
    public double getPreco(){
        return this.precoProduto;
    }
    
    public int getQuantidade(){
        return this.quantidadeEstoque;
    }
}
class Main{


    public static void main(String[] args){

        Produto p1 = new Produto("Tenis",50.50,5);

        p1.mostrarInformacoes();

        p1.atualizarQuantidade(-10);

        p1.mostrarInformacoes();
        
        p1.setNomeProduto("Garrafa");

        p1.mostrarInformacoes();

        System.out.println(p1.getNomeProduto());
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

    //setters

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //getters

    public String getNomeProduto(){
        return nomeProduto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void atualizarQuantidade(int quantidade){
        if(this.quantidadeEstoque >= 0){
       
            this.quantidadeEstoque += quantidade;
         

        }else{
            System.out.println("Não é possivel realizar a atualização de estoque, pois a quantidade esta negativa");
        }
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nomeProduto);
        System.out.println("Preco: " + this.precoProduto);
        System.out.println("Quantidade: " + this.quantidadeEstoque);
    }
    

}



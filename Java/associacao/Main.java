/* 

public class Main{


public static void main(String[] args) {


    Cliente c1 = new Cliente("Dionathan", "dio@hotmail.com", "rua sao joao");





}

}


class Cliente{
private String nome;
private String email;
private String endereco;

public Clieeeente(String nome, String email, String endereco){
    this.nome = nome;
    this.email = email;
    this.endereco = endereco;
}

public void setEmail(String email){
    this.email = email;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEmail() {
    return email;
}

public String getEndereco(){
    return endereco;
}

public String getNome() {
    return nome;
}


}

class Pedido{
    private int numero;
    private double valorTotal;
    private Cliente cliente;

    public Pedido(int numero, double valorTotal, Cliente cliente){
        this.numero = numero;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void criarPedido(){

    }


    

}

class ItemPedido{
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public ItemPedido(String nome, int quantidade, double valorUnitario){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }


    

}*/
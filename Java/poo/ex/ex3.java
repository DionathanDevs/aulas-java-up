class ContaExercicio{
    public static void main(String[] args){
        Bomba b1 = new Bomba();
        b1.numero = 1;
        b1.tipo = "Gasolina";
        b1.valorLitro = 6.99;
        b1.quantidade = 10000;
        b1.mostrarInfo();
        b1.abastecer(50);
        b1.abastecer_litro(10);
        b1.mostrarInfo();
        b1.alterarValor(5);
        b1.mostrarInfo();
    }
}

class Bomba{
   
    int numero;
    String tipo;
    double valorLitro;
    double quantidade;

    public void mostrarInfo(){
        System.out.println("Numero bomba: " + this.numero + ". ");
        System.out.println("Tipo Combustivel: " + this.tipo + ". ");
        System.out.println("Valor litro: " + this.valorLitro + ". ");
        System.out.printf("Quantidade de Litros: %.2f . ", this.quantidade);
        System.out.println("");
    }

    public void abastecer(double valor){
        double litro_abastecidos = valor / this.valorLitro;
        System.out.printf("Serão abastecidos %.2f", litro_abastecidos);
        this.quantidade -= litro_abastecidos;
    }

    public void abastecer_litro(double litros){
        System.out.printf("\nValor do abastecimento: %.2f\n", litros * this.valorLitro );
        
        this.quantidade -= litros;
    }

    public void alterarValor(double valor){
        this.valorLitro = valor;
    }
    public void alterarQuantidade(double quantidade){
        this.quantidade += quantidade;
    }
}
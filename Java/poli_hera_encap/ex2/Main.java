
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){


    Carro c1 = new Carro("Vw", "Gol", 2020, 50, 10);

    Moto m1 = new Moto("Honda", "Cg", 2021, 8,32);

    List<Veiculo> frota = new ArrayList<>();

    frota.add(c1);
    frota.add(m1);

    c1.calcularAutonomia();
    
    c1.precisaAbastecimento();

    c1.mostrarDetalhes();

    c1.acelerar();

    c1.frear();
    
    m1.mostrarDetalhes();

    frota.remove(c1);

    c1.mostrarDetalhes();


    }
}

class Veiculo{
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;

    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){

        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;

    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double calcularAutonomia(){
        return this.combustivel * this.consumoMedio;
    }

    public String precisaAbastecimento(){
        if(this.combustivel * this.consumoMedio < 30){
            return "Sim";
        }else{
            return "Não";
        }
    }

    public void realizarViagem(double distancia){
        if(this.calcularAutonomia() >= distancia){

          double sobra = distancia / this.consumoMedio;

          double cbRestante = this.combustivel - sobra;

          System.out.println("Viagem realizada com sucesso! Restaram" + cbRestante + "litros de combustível no veículo!");

        }else{
            System.out.println("Não foi possível realizar a viagem!");
        }
    }

    public void mostrarDetalhes(){
        System.out.println("Veiculo: " + getMarca() + " " + getModelo());   
        System.out.println("Ano de fabricação: " + getAnoFabricacao());
        System.out.println("Autonomia: " + getConsumoMedio());
        System.out.println("Precisa de abastecimento: " + precisaAbastecimento());
        System.out.println("");
        System.out.println("--------------");
    }


}

class Carro extends Veiculo{
    
    public Carro(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        super(marca,modelo, anoFabricacao,combustivel,consumoMedio);
    }

    public void acelerar(){
        System.out.println("Carro acelerando") ;
    }

    public void frear(){
        System.out.println("Carro freando") ;
    }

}


class Moto extends Veiculo{
    
    public Moto(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        super(marca,modelo, anoFabricacao,combustivel,consumoMedio);
    }

    public void acelerar(){
        System.out.println("Moto acelerando") ;
    }

    public void frear(){
        System.out.println("\nMoto freando") ;
    }
    
}
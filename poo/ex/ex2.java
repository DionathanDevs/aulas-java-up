class ContaExercicio{
    public static void main(String[] args){
    Pessoa p1 = new Pessoa();
    p1.nome = "Dionathan";
    p1.idade = 19;
    p1.peso = 65.5;
    p1.altura = 1.83f;
    
    p1.envelhecer();
    p1.engordar(30);
    p1.emagrecer(15);
    p1.mostrarPessoa();
    }
}

class Pessoa{
    
    String nome;
    int idade;
    double peso;
    float altura;

    public void envelhecer(){
        this.idade += 1;
        if(this.idade < 21){
            this.altura += 0.01f;
        }
    }
    public void engordar(double peso){
        this.peso += peso;
    }
    public void emagrecer(double peso){
        if(this.peso >= peso){
            this.peso -= peso;
        }else{
            System.out.println("O peso informado para emagrecer é inferior ao peso da pessoa");
        }
    }
    public void mostrarPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.printf("Altura: %.2f ", this.altura);
    }

}

class ContaExercicio{
    public static void main(String[] args){
       Conta p1 = new Conta();
       p1.numero_conta = 123;
       p1.nome = "dionathan";
      
      
      p1.deposito(30);
      p1.saque(20);
    }
}

class Conta{
    int numero_conta;
    String nome;
    double saldo = 0;
    public void deposito(double valor){
       this.saldo += valor;
       System.out.println("O valor atual da conta no nome de " + this.nome + " é de " + this.saldo);
    }
    public void saque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso no nome de " + this.nome + " e o saldo restante é " + this.saldo);
        }else{
            System.out.println("O valor solicitado para saque é inferior ao saldo");
        }
    }

}
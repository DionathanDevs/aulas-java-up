import java.util.Scanner;

class Main {
    public static void calc(String nome, float valorProduto, float valorEntregue){
        float valorFinal = valorEntregue - valorProduto;
        System.out.printf("Voce comprou o produto %s, no valor de %.2f e pagou %.2f, o valor do troco sera %.2f", nome, valorProduto, valorEntregue, valorFinal );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o produto");
        String nomeProduto = input.nextLine();
        System.out.println("Informe o valor do produto: ");
        float valorProduto = input.nextFloat();
        System.out.println("Informe o valor passado ao vendedor");
        float valorEntregue = input.nextFloat();
        
        calc(nomeProduto,valorProduto,valorEntregue);
        
        input.close();
    }
}
import java.util.Scanner;

class Main {
    public static void calc(String nome, float valorProduto){
        float valorFinal = valorProduto * 0.9f;
        System.out.printf("Voce comprou o produto %s, no valor de %.2f e porem ganhou 10%% de desconto e pagara apenas %.2f", nome, valorProduto, valorFinal );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o produto");
        String nomeProduto = input.nextLine();
        System.out.println("Informe o valor do produto: ");
        float valorProduto = input.nextFloat();
        
        calc(nomeProduto,valorProduto);
        
        input.close();
    }
}
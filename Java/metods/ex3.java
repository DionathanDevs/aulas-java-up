import java.util.Scanner;

class Main {
    
        public static float calc(float kW, String opcao_escolhida) {
            
        float valor = 0;
        
        switch(opcao_escolhida){
            case "Pessoa Fisica":
                valor = kW * 0.60f;
            break;
            case "Empresa":
                valor = kW * 1.29f;
            break;
            case "Comercio":
                valor = kW * 0.48f;
            break;
        }
        
        return valor;
      
        
}
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
       
    System.out.println("Escolha uma das opções:\n [1] Pessoa fisica\n [2] Empresa\n [3] Comercio");
    int opcao = input.nextInt();
    System.out.println("Informe a quantidade kW consumidos: ");
    float kW = input.nextFloat();
    String opcao_escolhida = "Padrao";
    switch(opcao){
        case 1:
            opcao_escolhida = "Pessoa Fisica";
        break;
        case 2:
            opcao_escolhida = "Empresa";
        break;
        case 3:
            opcao_escolhida = "Comercio";
        break;
        default:
        System.out.println("Numero inserido invalido, por favor tente umas das opções oferecidas");
        break;
    }
    
    input.close();
    System.out.printf("O valor: %.2f", calc(kW,opcao_escolhida));
    }
    
}
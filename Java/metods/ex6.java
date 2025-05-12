import java.util.Scanner;

class Main {
    public static int inteiro(int num1, int num2, int num3){
      int valorFinal = 0;
     if(num1 > num2 && num1 > num3){
         valorFinal = num1;
     }else if(num2 > num1 && num2 > num3){
         valorFinal = num2;
     }else if(num3 > num1 && num3 > num2){
         valorFinal = num3;
     }else{
         valorFinal = num1;
     }
         
     
      return valorFinal;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o numero 1");
        int num1 = input.nextInt();
        System.out.println("Informe o numero 2");
        int num2 = input.nextInt();
        System.out.println("Informe o numero 3");
        int num3 = input.nextInt();
        
       System.out.printf("O maior numero e %d", inteiro(num1,num2,num3));
       
       input.close();
    }
}
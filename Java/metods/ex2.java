import java.util.Scanner;

class Main {
    public static int calc(int nivel, int horas) {
        
         int salario = 0;
        
         switch(nivel){
         case 1:
         salario = horas * 20;
         break;
         case 2:
         salario = horas * 25;
         break;
         case 3:
         salario = horas * 30;
         break;
        
         }
         
        return salario;
        
}
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do Professor: ");
        String nome = input.nextLine();
        System.out.println("Digite o nivel: ");
        int nivel = input.nextInt();
        System.out.println("Digite as horas: ");
        int horas = input.nextInt();
        
      
        
        System.out.printf("O salario e %d", calc(nivel,horas));
        
        input.close();
        
    }
}
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do Aluno: ");
        String nome = input.nextLine();
        System.out.println("Digite a nota 1: ");
        float nota1 = input.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = input.nextFloat();
        System.out.println("Digite a nota 3: ");
        float nota3 = input.nextFloat();
        
        media(nome,nota1,nota2,nota3);
        
        input.close();
    }
    public static void media(String nome, float nota1, float nota2, float nota3) {
        
        float media_aritmetica = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("O nome do aluno e %s e sua media e: %.2f", nome, media_aritmetica);
        
        
}
}
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        
        System.out.println("Digite a hora de entrada: (hh:mm) ");
        String horaEntradaString = input.nextLine();
        System.out.println("Digite a hora de saida: (hh:mm) ");
        String horaSaidaString = input.nextLine();
        
        LocalTime horaEntrada = LocalTime.parse(horaEntradaString,formato);
        LocalTime horaSaida = LocalTime.parse(horaSaidaString,formato);
        
        Duration diferenca = Duration.between(horaEntrada, horaSaida);
       
        long minutos = diferenca.toMinutes();
        
        System.out.println(" " + minutos);

        double valor = 5.00;

        if(minutos > 60){
            
            minutos -= 60;

            valor += Math.ceil(minutos / 15.0) * 2;      x      x   



        }

        System.out.println("" + valor);

        
    }
    
 
}
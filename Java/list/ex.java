import com.sun.security.auth.NTNumericCredential;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


class main{
    public static void main(String[] args){

        ArrayList<Integer> numero = new ArrayList<>();

        numero.add(1);
        numero.add(10);
        numero.add(20);
        numero.add(21);
        numero.add(30);
        numero.add(40);
        numero.add(50);

        if(numero.contains(30)){
            System.out.println("30 existe na lista");
        }else{
            System.out.println("30 não existe na lista");
        }

        if(numero.contains(15)){
            System.out.println("30 existe na lista");
        }else{
            System.out.println("30 não existe na lista");
        }

        numero.add(60);
        numero.remove(0);
        System.out.println(numero);

        Collections.sort(numero);
        System.out.println(numero);

        Collections.sort(numero, Collections.reverseOrder());
        System.out.println(numero);

        ArrayList<Integer> numeroPar = new ArrayList<>();

        for(Integer elemento : numero){
            if(elemento % 2 == 0){
                numeroPar.add(elemento);
            }
        }

        System.out.println(numeroPar);

        numeroPar.clear();
        numero.clear();

        System.out.println(numeroPar);
        System.out.println(numero);
    }

}

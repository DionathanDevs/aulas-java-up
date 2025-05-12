class Main{
    public static void main(String[] args){
        Luz l1 = new Luz();
        l1.marca = "Philips";
        l1.potencia = 40;
        l1.estado = "Desligado";
        
        Luz l2 = new Luz();
        l2.marca = "Elgin";
        l2.potencia = 60;
        l2.estado = "Desligado";

        l1.ligar();
        l1.desligar();
        l1.ligar();
        l1.desligar();
        l1.ligar();
        l1.ligar();
     
    }
}

class Luz{
    String marca;
    int potencia;
    String estado;
    int acendimentos = 1;

    public void ligar(){
        if(this.estado != "Quebrado"){

            if(this.estado == "Desligado"){
                this.estado = "Ligado";
                System.out.printf("\nA lampada foi ligada");
                System.out.printf("\nA marca: %s", this.marca);
                System.out.printf("\nPotencia da Lampada: %d", this.potencia);
                System.out.printf("\nTotal de acendimentos: %d\n", this.acendimentos);
                acendimentos++;
                }else{
                    System.out.println("A lampada ja está ligada");
                }
        }else{
            System.out.println("A lampada esta quebrada e nao e possivel acende-la");
        }
       
    }
    public void desligar(){
        if(this.estado != "Quebrado"){

            if(this.estado == "Ligado"){
                this.estado = "Desligado";
            }else{
                System.out.println("A lampada já esta desligada");
            }
        }else{
            System.out.println("A lampada esta quebrada e nao é possivel desliga-la.");
        }
        
        
    }
    public void quebrar(){
        this.estado = "Quebrado";
        System.out.println("Lampada quebrada!");
    }
}
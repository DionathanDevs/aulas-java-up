class Exemplo_OOP{
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.nome = "Dionathan";
        p1.idade = 19;
        p1.status();

        Pessoa p2 = new Pessoa();
        p2.nome = "Kerem"; 
        p2.idade = 18;
        p2.falando = false;
        p2.status();
        p2.falar();
        p2.comer("Arroz");
        p2.falar();
        p2.pararDeFalar();
        p2.comer("ameixa");
        p2.comer("xuxu");
    
        p2.falar();
    }
}

class Pessoa{
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;
  
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Falando: " + this.falando);
        System.out.println("Comendo: " + this.comendo);
    }
    public void falar(){
        if(this.comendo == true){
            System.out.println(this.nome +  " esta comendo e nao pode falar no momento");
        }
        else if(this.falando == false){
            this.falando = true;
            System.out.println(this.nome + " esta falando.");
        }else{
            System.out.println(this.nome + " já esta falando");
        }
        
    }
    public void pararDeFalar(){
        if(this.falando == true){
            this.falando = false;
            System.out.println(this.nome + " parou de falar");
        }else{
            System.out.println(this.nome + " ja esta falando");
        }
    }
    public void comer(String alimento){
        if(this.falando == true){
            System.out.println(this.nome + " nao pode comer falando");
        } else if(this.comendo == true){
            System.out.println(this.nome + " ja esta comendo ");
        }else{
            this.comendo = true;
            System.out.println(this.nome + " esta comendo " + alimento + ".");
        }
       
    }
    public void pararDeComer(){
        if(this.comendo == false){
            System.out.println(this.nome + " nao esta comendo ");
        }else{
            this.comendo = false;
            System.out.println(this.nome + " parou de comer ");
        }
    }
}
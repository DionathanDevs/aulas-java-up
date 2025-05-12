import java.util.Scanner;
import java.util.ArrayList;
 
class Agenda {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        while(true){
            System.out.println("# Agenda de Contatos #");
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Editar contato");
            System.out.println("[3] Excluir contato");
            System.out.println("[4] Listar contatos");
            System.out.println("[5] Sair");
            int opcao = input.nextInt();
                        

            /* Limpa o buffer do teclado */
            input.nextLine();
            
            switch(opcao){
                
                /* Adicionar contato */
                case 1:
         
                    
                    System.out.println("Digite o nome do novo contato: ");
                    String nomeInput = input.nextLine();
                    System.out.println("Digite o telefone: ");
                    String telefoneInput = input.nextLine();
                    contatos.add(new Contato(nomeInput,telefoneInput));
                    System.out.println("Numero adicionado com sucesso!");
         
                    break;
                
                /* Editar contato */    
                case 2:
                  
                  if(contatos.isEmpty()){
                    System.out.println("A lista esta vazia");
                    }else{
                      

                        System.out.println("Informe o nome do contato que deseja editar: ");
                        String nomeEditarInput = input.nextLine();
                        
                        System.out.println("Informe o novo numero para o contato");
                        String novoNumeroInput = input.nextLine();
                        for(Contato contato : contatos){
                     if(contato.getNome().equalsIgnoreCase(nomeEditarInput)){
                
                        contato.setTelefone(novoNumeroInput);
            }
        }
                    
                    }
                        
                        
                    
                    break;
                
                /* Excluir contato */
                case 3:
                    
                    if(contatos.isEmpty()){
                    System.out.println("A lista esta vazia");
                    }else{
                        
                        System.out.println("Informe o nome do contato que deseja remover: ");
                        String nomeRemover = input.nextLine();
                      
                        boolean encontrado = false;

for (int i = 0; i < contatos.size(); i++) {
    Contato contato = contatos.get(i);

    if (contato.getNome().equalsIgnoreCase(nomeRemover)) {
        contatos.remove(i);
        System.out.println("Contato removido com sucesso!");
        encontrado = true;
        break; 
    }
}

if (!encontrado) {
    System.out.println("Contato não encontrado!");
}

        
            }
        
                    
               
                    
                    break;
                
                /* Listar contatos */
                case 4:
                    if(contatos.isEmpty()){
                    System.out.println("A lista esta vazia");
                    }else{
                        for(Contato contato : contatos){

                        contato.mostrarInformacoes();

                    }
                    }
                   
                    
                    break;
                
                /* Sair */   
                case 5:
                    
                    input.close();
                    
                    return; /* Finaliza o programa */
                
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}
 
class Contato{
    private String nome;
    private String telefone;
    
    
    
    /* Construtor */
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    /* Setters e getters */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
  
    
    /* Método para mostrar informacoes */
    public void mostrarInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println();
    }
}
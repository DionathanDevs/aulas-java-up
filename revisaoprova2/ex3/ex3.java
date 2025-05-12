import java.util.ArrayList;

class Main{
    public static void main(String[] args) {

        Aluno a1 = new Aluno("DIONATHAN", 19, "teste", "teste");

        Professor pp1 = new Professor("MARCELO FASSINA", 54, "83034393232", "JAVA");

        Escola e1 = new Escola("UP");
        a1.mostrarDetalhes();
        pp1.mostrarDetalhes();
        System.out.println("-----------------------");
        e1.adicionarPessoa(a1);
        e1.adicionarPessoa(pp1);
        e1.mostrarTodos();



    }
}

class Pessoa{

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}

class Aluno extends Pessoa{

    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String matricula, String curso){
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }
}

class Professor extends Pessoa{
    private String cpf;
    private String disciplina;

    public Professor(String nome, int idade, String cpf, String disciplina){
        super(nome, idade);
        this.cpf = cpf;
        this.disciplina = disciplina;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("CPF: " + getCpf());
        System.out.println("Disciplina: " + getDisciplina());
    }

}

class Escola{
    private String nome;

    private ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    public Escola(String nome){
        this.nome = nome;
    }

    public void adicionarPessoa(Pessoa pessoa){
        this.listaDePessoas.add(pessoa);
    }

    public void mostrarTodos(){
        System.out.println("Lista de pessoas na Escola: ");
        for(Pessoa pessoa : listaDePessoas){
            pessoa.mostrarDetalhes();
        }
    }
}
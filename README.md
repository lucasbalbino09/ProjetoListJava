# Projeto lista em Java 

```java
public abstract class Pessoas {

    private String nome;
    private int idade;
    private String cpf;
    private String dataNascimento;

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private String profissao;

    public Pessoas() {

    }

    public Pessoas(String nome, int idade, String cpf, String dataNascimento, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Pessoas: " + "nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", profissao=" + profissao;
    }

}


import java.util.ArrayList;
import java.util.List;

public class Agenda extends Pessoas {

    private List<Funcionario> ListadeContatos;

    public Agenda() {
        this.ListadeContatos = new ArrayList<>();
    }

    public List<Funcionario> getListadeContatos() {
        return this.ListadeContatos;
    }

    public void setListadeContatos(List<Funcionario> listadeContatos) {
        ListadeContatos = listadeContatos;
    }

    public void adicionarPessoa(Funcionario funcionario) {
        ListadeContatos.add(funcionario);
    }

    public Pessoas buscarPessoaPorNome(String nome) {

        for (Pessoas pessoa : this.ListadeContatos) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }

    public List<Pessoas> buscarPessoaPorProfissao(String Profissao) {
        List<Pessoas> pessoaComProfissao = new ArrayList<Pessoas>();

        ListadeContatos.forEach(profissional -> {
            if (profissional.getProfissao().equals(Profissao)) {
                pessoaComProfissao.add(profissional);
            }
        });

        return pessoaComProfissao;
    }

    public List<Pessoas> buscarPessoaPorDepartamento(String Departamento) {
        List<Pessoas> pessoaComDepartamento = new ArrayList<Pessoas>();

        ListadeContatos.forEach(profissional -> {
            if (profissional.getDepartamento().equals(Departamento)) {
                pessoaComDepartamento.add(profissional);
            }
        });

        return pessoaComDepartamento;
    }

    public double SelarioMedio() {

        if (ListadeContatos.isEmpty()) {
            return 0.0; // Retorna 0 se a lista estiver vazia para evitar divisão por zero.
        }

        double totalSalario = 0.0;

        for (Funcionario funcionario : ListadeContatos) {
            totalSalario += funcionario.getSalario();
        }

        return totalSalario / ListadeContatos.size();
    }

    @Override
    public String toString() {
        return "Agenda [getListadeContatos()=" + getListadeContatos() + ", SelarioMedio()=" + SelarioMedio() + "]";
    }
}



import java.util.List;


public class Principal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        
        Funcionario funcionario = new Funcionario();
        Estudante estudante = new Estudante();

        Funcionario pessoa1 = new Funcionario("Maria", 23, "4551515561", "09/02/2000", "infermeira",3300.00,"Medico","Medicina");
        Funcionario pessoa2 = new Funcionario("Joao", 25, "4551515561", "09/02/2000", "pedreiro",1500.00,"ajudante geral","admin");
        Funcionario pessoa3 = new Funcionario("Antonia", 32, "4551515561", "09/02/2000", "Empresario",12000.00,"","autonomo");
        

        
        agenda.adicionarPessoa(pessoa1);
        agenda.adicionarPessoa(pessoa2);
        agenda.adicionarPessoa(pessoa3);
         
      
        
        List<Pessoas> pessoasComProfissao = agenda.buscarPessoaPorProfissao("Medico");
        
        if(pessoasComProfissao != null) {
            System.out.println(pessoasComProfissao.toString());
        } else { 
            System.out.println("nenhuma pessoa contem essa profissão!");
        }
        
        Pessoas pessoaEncontrada =  agenda.buscarPessoaPorNome("Joao");
        
        if(pessoaEncontrada != null) {
            System.out.println(pessoaEncontrada.toString());
       } else { 
           System.out.println("nenhum nome encontrado!");
        }
        
        for (Pessoas contato : agenda.getListadeContatos()) {
            System.out.println(contato); // Chama o método toString
        }

    }
}


public class Funcionario extends Pessoas {

    private Double Salario;
    private String Cargo;
    private String Departamento;

    public Funcionario() {

    }

    public Funcionario(String nome, int idade, String cpf, String dataNascimento, String profissao, Double salario, String cargo, String departamento) {
        super(nome, idade, cpf, dataNascimento, profissao);
        this.Salario = salario;
        this.Cargo = cargo;
        this.Departamento = departamento;
    }

    public Double getSalario() {
        return Salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario [getSalario()=" + getSalario() + ", getCargo()=" + getCargo() + ", getDepartamento()="
                + getDepartamento() + "]";
    }

}


public class Estudante extends Pessoas {

    private String Curso = "";
    private int Matricula = 0;
    private int ano = 0;

    public Estudante() {

    }

    public Estudante(String curso, int matricula, int ano) {
        super();
        Curso = curso;
        Matricula = matricula;
        this.ano = ano;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Estudante [getCurso()=" + getCurso() + ", getMatricula()=" + getMatricula() + ", getAno()=" + getAno()
                + "]";
    }

}


```

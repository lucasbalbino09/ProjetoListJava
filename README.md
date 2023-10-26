# Projeto lista em Java 

```java

package br.com.senac.projetoEmpresa;

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

    public Pessoas () {

    }
    
    public Pessoas(String nome , int idade, String cpf, String dataNascimento, String profissao) {
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
    public void setIdade( int idade) {
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

        private List<Pessoas> ListadeContatos;

        public Agenda() {
            this.ListadeContatos = new ArrayList<>();
        }

        public void adicionarPessoa(Pessoas pessoa) {
            ListadeContatos.add(pessoa);
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
            List<Pessoas> pessoaComProfissao = new ArrayList();

            ListadeContatos.forEach(profissional -> {
                if (profissional.getProfissao().equals(Profissao)) {
                    pessoaComProfissao.add(profissional);
                }
            });

            return pessoaComProfissao;
        }
  
}


public class Principal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Pessoas pessoa = new Pessoas();

        Pessoas pessoa1 = new Pessoas("Maria", 23, "4551515561", "09/02/2000", "Veterinaria");
        Pessoas pessoa2 = new Pessoas("Joao", 25, "4581515561", "09/07/1987", "Médico");
        Pessoas pessoa3 = new Pessoas("Vitor", 24, "4551518561", "28/05/1999", "Analista");
        
        
        agenda.adicionarPessoa(pessoa1);
        agenda.adicionarPessoa(pessoa2);
        agenda.adicionarPessoa(pessoa3);
        
      
        
        List<Pessoas> pessoasComProfissao = agenda.buscarPessoaPorProfissao("Analista");
        
        if(pessoasComProfissao != null) {
            System.out.println(pessoasComProfissao.toString());
        } else { 
            System.out.println("nenhuma pessoa contem essa profissão!");
        }
        
    }

}

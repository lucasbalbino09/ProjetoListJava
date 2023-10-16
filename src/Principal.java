
import java.util.List;
import java.util.Scanner;

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
        
        Pessoas pessoaEncontrada =  agenda.buscarPessoaPorNome("Maria");
        
        if(pessoaEncontrada != null) {
            System.out.println(pessoaEncontrada.toString());
       } else { 
           System.out.println("nenhum nome encontrado!");
        }
    }
}

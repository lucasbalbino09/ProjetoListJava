package br.com.senac.projetoEmpresa;

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
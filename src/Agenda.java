package br.com.senac.projetoEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Agenda extends Pessoas {   

        
		private List<Funcionario> ListadeContatos;

        public Agenda() {
            this.ListadeContatos = new ArrayList<>();
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
        
        public double SelarioMedio(Funcionario funcionario1, Funcionario funcionario2 ,Funcionario funcionario3) {
            return (funcionario1.getSalario() + funcionario2.getSalario() + funcionario3.getSalario()) / 3;
        }        
  
}
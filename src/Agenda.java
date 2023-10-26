package br.com.senac.projetoEmpresa;

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
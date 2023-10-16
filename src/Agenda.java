
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

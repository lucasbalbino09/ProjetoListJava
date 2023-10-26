package br.com.senac.projetoEmpresa;

public class Funcionario extends Pessoas{
	private Double Salario;
	private String Cargo;
	private String Departamento;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome , int idade, String cpf, String dataNascimento, String profissao,Double salario, String cargo, String departamento) {
		super(nome,idade,cpf,dataNascimento, profissao);
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

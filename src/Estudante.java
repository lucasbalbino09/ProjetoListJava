package br.com.senac.projetoEmpresa;

public class Estudante extends Pessoas{
	
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

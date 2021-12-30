package cursojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import CursoJavaConstantes.constantes.StatusAluno;

public class Aluno {
	/*Esses são os atribuitos do aluno,*/
	private String nome;
	private int    idade;
	private String email;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Aluno() {
	}
		
	public Aluno(String nomePai) {
		nomePai = "Seu Carlos";

	}
	
	public Aluno(String nome, String email) {
		nomePai = "Jose Paulo";
		email = "email@email.com";
	}
	
	//Getters e Setters.
	/*Set é para adicionar ou receber dados dos atribulos*/
	/*Get é para obter o valor do atribulo*/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome ;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getMediaNota() {
		
		double soma = 0;
		
		for (Disciplina disciplina : disciplinas) {
			soma  += disciplina.getNota();
		}
		return soma / disciplinas.size();
	}
	

	/*MÉTODO QUE RETORNA TRUE OU FALSE*/
	public boolean getAprovado() {
		double media = this.getMediaNota();
		if (media >= 50) {
			return true;
		}else {
			return false;
		}
	}
	
	/*MÉDOTO QUUE RETONARA A STRING*/
	public String getAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;		
			}else  {
				return StatusAluno.RECUPERACAO;
			}
			
			}else {
				return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", email=" + email + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}


	






	
	
	
	
	

}

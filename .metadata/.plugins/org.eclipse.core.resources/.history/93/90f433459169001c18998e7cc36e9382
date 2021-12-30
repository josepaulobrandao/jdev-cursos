package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import CursoJavaConstantes.constantes.StatusAluno;
import cursojava.Aluno;
import cursojava.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		/*PAREI NA AUTLA 9.31 - AULA - Classes e atributos estáticos*/
		/*9.25 - Remover disciplinas em repetição - 11:41*/
		/*AGORA TEMOS UM OBJETO - ALUNO 1*/
		/*new Aluno() é uma instancia (Criação de Objeto)*/
		/*aluno1 é um referencia para o objeto aluno*/
		
		
		List<Aluno> alunos 				= new ArrayList<>();
		List<Aluno> alunosApovados 		= new ArrayList<>();
		List<Aluno> alunosRecuperacao 	= new ArrayList<>();
		List<Aluno> alunosReprovados 	= new ArrayList<>();
		
		for (int qtd = 1; qtd <= 1;  qtd++) {
		String nome  		  = JOptionPane.showInputDialog("QUAL O NOME DO ALUNO? " + qtd + " ?");
		/*
		 * String idade 	  = JOptionPane.showInputDialog("QUAL A IDADE DO ALUNO?");
		String dataNascimento = JOptionPane.showInputDialog("DATA_NASCIMENTO");
		String email 		  = JOptionPane.showInputDialog("ENTRE COM O E-MAIL");
		String rg 			  = JOptionPane.showInputDialog("ENTRE COM O RG");
		String cpf 			  = JOptionPane.showInputDialog("ENTRE COM O CPF");
		String nomeMae 		  = JOptionPane.showInputDialog(	"ENTRE COM O NOME DA MÃE");
		String nomePai 		  = JOptionPane.showInputDialog("ENTRE COM O NOME DO PAI");
		String nomeEscola 	  = JOptionPane.showInputDialog("ENTRE COM O NOME DA ESCOLA");
		String dataMatricula  = JOptionPane.showInputDialog("ENTRE COM A DATA DA MATRICULA");
		String matricula  	  = JOptionPane.showInputDialog("ENTRE COM A MATRÍCULA");*/
			
		
		
		Aluno aluno1 = new Aluno();	//Construtor padrão
		aluno1.setNome(nome);
		/*
		 * aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setEmail(email);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setSerieMatriculado(matricula);
		aluno1.setNomeEscola(nomeEscola);*/
		
		for(int i = 1; i <= 1; i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("NOME DA DISCIPLINA" + i + " ");
			String notaDisciplina = JOptionPane.showInputDialog("NOTA DA DISCIPLINA" + i + " ");
			
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota((Double.valueOf(notaDisciplina)));
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "DESEJA REMOVER A DISCIPLINA ?");
		
		if  (escolha == 0) {	/*SIM == zero [0] NÃO == [1]*/
			
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0) {
			String desciplinaRemover = JOptionPane.showInputDialog("QUAL A DISCIPLINA ? 1, 2, 3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(desciplinaRemover).intValue() - posicao);
			posicao++;/*SOMA + 1*/
			continuarRemover = JOptionPane.showConfirmDialog(null, "CONTINUAR A REMOVER ? ");
			
			} 
		}
		alunos.add(aluno1);
	}
		
	for(Aluno aluno : alunosReprovados) {/*Separei em listas*/
		if 		(aluno.getAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosApovados.add(aluno);
		}else if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				  alunosRecuperacao.add(aluno);
		} else {
				alunosReprovados.add(aluno);/*REPROADO*/
		}

		System.out.println("----------------------Lista dos Aprovados----------------------");
		for (Aluno aluno2 : alunosApovados) {
			System.out.println("RESULTADO: " + aluno.getAprovado2() + " Com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("----------------------Lista dos Recuperacao----------------------");
		for (Aluno aluno2 : alunosRecuperacao) {
			System.out.println("RESULTADO: " + aluno.getAprovado2() + " Com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("----------------------Lista dos Reprovados----------------------");
		for (Aluno aluno2 : alunosReprovados) {
			System.out.println("RESULTADO: " + aluno.getAprovado2() + " Com média de = " + aluno.getMediaNota());
		}
		
      }

	}		
		
		
		
		
		
//	for (int pos = 0; pos < alunos.size(); pos++) {
//		
//		Aluno aluno = alunos.get(pos);
//		
//		if (aluno.getNome().equalsIgnoreCase("jose")) {
//			
//			Aluno trocar = new Aluno();
//			trocar.setNome("Aluno foi trocado");
//			
//			Disciplina disciplina = new Disciplina();
//			disciplina.setDisciplina("Matematica");
//			disciplina.setNota(96);
//			
//			trocar.getDisciplinas().add(disciplina);
//			
//			alunos.set(pos, trocar);
//			aluno = alunos.get(pos);
//		}
//		
//		System.out.println("Aluno = " + aluno.getNome());
//		System.out.println("Média do aluno é = " + aluno.getMediaNota());
//		System.out.println("Resultado = " + aluno.getAprovado2());
//		System.out.println("-----------------------------------------------------");
//		
////		for (Disciplina disc: aluno.getDisciplinas()) {//PERCORRENDO A LISTA DE DISCIPLINA - PELO FOREACH
////			System.out.println("Matéria = " + disc.getDisciplina() + " nota: " + disc.getNota());
////		}
//		
////		for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
////			Disciplina disc = aluno.getDisciplinas().get(posd);//PERCORRENDO A LISTA DE DISCIPLINA - PELO FOR
////			
////			System.out.println("Matéria " + disc.getDisciplina() + " nota: " + disc.getNota());
////		}
//	}
	
		
		
		
//		for(Aluno aluno: alunos) {
//			
//			if (aluno.getNome().equalsIgnoreCase("jose")) {
//			alunos.remove(aluno);
//			break;
//		}
//			else {
//			System.out.println(aluno);
//			System.out.println("MÉDIA DO ALUNO " + aluno.getMediaNota());
//			System.out.println("APROVADO ? " + aluno.getAprovado2());
//			System.out.println("------------------------------------");
//		}
//	}
//		
//		
//	for(Aluno aluno : alunos) {	
//		System.out.println("Alunos que sobraram na lista");
//		System.out.println(aluno.getNome());
//		System.out.println("Sua materias são: ");
//		for (Disciplina desciplina: aluno.getDisciplinas()) {
//			System.out.println(desciplina.getDisciplina());
//		}
//	}
		
		/* --Equals e Hashcode (Diferenciar Objetos)-- */
		
//		System.out.println("NOME: " + aluno1.getNome());
//		System.out.println("IDADE: " + aluno1.getIdade());
//		System.out.println("EMAIL: " + aluno1.getEmail());
//		System.out.println("REGISTRO_GERAL: " + aluno1.getRegistroGeral());
//		System.out.println("NUM_CPF: " + aluno1.getNumeroCpf());
//		System.out.println("NOME_MAE: " + aluno1.getNomeMae());
//		System.out.println("ESCOLA: " + aluno1.getNomeEscola());
//		System.out.println("MATRICULA: " + aluno1.getSerieMatriculado());
		
//		System.out.println(aluno1.getAprovado() ? "APR0VADO" : "REPROVADO");
//		System.out.println(aluno1.getAprovado2());
//		System.out.println(aluno1.getMediaNota());
		
					
//		Aluno aluno2 = new Aluno("Paulo"); //Construtor com 1 parametro	
//		Aluno aluno3 = new Aluno("Maria", "maria@email.com"); //Construtor com 2 parametros.
//		//referencia/variavel que faz referencia ao objeto Aluno
//		 		
		
//		Aluno alunoHashEEquals = new Aluno();
//		alunoHashEEquals.setNome("Jose");
//		alunoHashEEquals.setNumeroCpf("123");
//		
//		Aluno alunoHashEEquals2 = new Aluno();
//		alunoHashEEquals2.setNome("Jose");
//		alunoHashEEquals2.setNumeroCpf("1234");
//
//
//		if (alunoHashEEquals.equals(alunoHashEEquals2)) {
//			System.out.println("Objetos são iguals");
//		} else {
//			System.out.println("Objetos não são iguais");
//		}
		
		
	}





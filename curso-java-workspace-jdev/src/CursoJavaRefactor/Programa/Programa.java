package CursoJavaRefactor.Programa;

import CursoJavaRefactor.cursoJava.Aluno;
import CursoJavaRefactor.cursoJava.Disciplina;

import javax.swing.*;

public class Programa {

    public static void main(String[] args) {

        Aluno aluno1      =  new Aluno();

        String nome       = JOptionPane.showInputDialog("Entre com o nome do aluno");
        aluno1.setNome(nome);

        String sobrenome       = JOptionPane.showInputDialog("Entre com o sobrenome do aluno");
        aluno1.setNome(sobrenome);

        String cpf        = JOptionPane.showInputDialog("Entre o cpf");
        aluno1.setCpf(cpf);

        String rg         = JOptionPane.showInputDialog("Entre com o RG");
        aluno1.setRg(rg);

        String matricula  = JOptionPane.showInputDialog("Entre com a matricula");
        aluno1.setMatrica(matricula);

        System.out.println("---------OUTPU----------");


        for (int i = 0; i < 1; i++) {
            String inputDesciplina = JOptionPane.showInputDialog("Entre com a disciplina: " + ( i + 1 ));
            String inputNota = JOptionPane.showInputDialog("Entre com a nota: ");

            Disciplina disciplina = new Disciplina();

            disciplina.setDesciplina(inputDesciplina);
            disciplina.setNota((Double.valueOf(inputNota)));
            aluno1.getDisciplinas().add(disciplina);
        }


        aluno1.toString();
        aluno1.calculaMedia();

    }

}

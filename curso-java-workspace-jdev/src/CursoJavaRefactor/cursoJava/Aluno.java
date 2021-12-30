package CursoJavaRefactor.cursoJava;

import CursoJavaRefactor.Constantes.constantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    private String nome;
    private String sobreNome;
    private String cpf;
    private String rg;
    private String matricula;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


    public Aluno() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatrica() {
        return matricula;
    }

    public void setMatrica(String matrica) {
        this.matricula = matrica;
    }

    public String calculaMedia() {
       double media = 0;
       if (media >= 50) {
           if (media >= 45 && media < 50) {
               return constantes.APROVADO ;
           }
           return constantes.RECUPERACAO;
       }
       return constantes.REPROVADO;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(sobreNome, aluno.sobreNome) && Objects.equals(cpf, aluno.cpf) && Objects.equals(rg, aluno.rg) && Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobreNome, cpf, rg, matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", matricula='" + matricula + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}

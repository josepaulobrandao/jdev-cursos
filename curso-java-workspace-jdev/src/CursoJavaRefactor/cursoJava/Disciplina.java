package CursoJavaRefactor.cursoJava;

import java.util.Objects;

public class Disciplina {
    private String desciplina;
    private Double nota;

    public String getDesciplina() {
        return desciplina;
    }

    public void setDesciplina(String desciplina) {
        this.desciplina = desciplina;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(desciplina, that.desciplina) && Objects.equals(nota, that.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desciplina, nota);
    }


    @Override
    public String toString() {
        return "Disciplina{" +
                "desciplina='" + desciplina + '\'' +
                ", nota=" + nota +
                '}';
    }
}

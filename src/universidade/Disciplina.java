package universidade;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String professor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Disciplina(String nome, int cargaHoraria, String professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }
    
    
}

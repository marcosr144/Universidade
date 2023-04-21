package universidade;

public class Curso {
    private String nome;
    private String coordenador;
    private Disciplina disciplina;

    public Curso(String nome, String coordenador, Disciplina disciplina) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.disciplina = disciplina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    
    
}

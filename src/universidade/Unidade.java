package universidade;

public class Unidade {
    private String Nome;
    private String gestor;

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public String getNome() {
        return Nome;
    }

    public String getGestor() {
        return gestor;
    }

    public Unidade(String Nome, String gestor) {
        this.Nome = Nome;
        this.gestor = gestor;
    }
    
    
}

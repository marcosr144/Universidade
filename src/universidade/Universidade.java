package universidade;


public class Universidade {
    private String nome;
    private String endereco;
    private String cidade;
    private Unidade unidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public Unidade getUnidade() {
        return unidade;
    }
    

    public Universidade(String nome, String endereco, String cidade, Unidade unidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.unidade = unidade;
    }
    

   
    public static void main(String[] args) {
      
    }
    
}

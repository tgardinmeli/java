package supermercado;

public class Cliente {
    private Integer id;
    private String nome;
    private String sobrenome;

    public Cliente(Integer id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Cliente:" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'';
    }
}

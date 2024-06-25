import java.util.Objects;

public class Cliente {

    private String nome;
    private String email;
    private long telefone;
    private char sexo;
    private String cpf;

    public Cliente(String nome, String email, long telefone, char sexo, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return getCpf() == cliente.getCpf();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCpf());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                ", sexo=" + sexo +
                ", cpf=" + cpf +
                '}';
    }
}
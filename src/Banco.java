import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private String cnpj;
    private List<Conta> contas;

    public Banco(String cnpj, String nome) {
        this.contas = new ArrayList<>();
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        if(!contas.isEmpty()) {
            contas.remove(conta);
        }
    }

    public void exibirTodasContas() {
        if(!contas.isEmpty()) {
            System.out.println(contas);
        }
    }
}
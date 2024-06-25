public class Main {
    public static void main(String[] args) {

        Banco bradesco = new Banco("60.746.948/0001-12", "Bradesco");

        Cliente felipe = new Cliente("Felipe", "felipe@gmail.com", 1123456789, 'M', "123.456.789-10");
        Cliente joao = new Cliente("João", "joao@gmail.com", 1123456789, 'M', "123.456.789-10");
        Cliente maria = new Cliente("Maria", "maria@gmail.com", 1123456789, 'F', "123.456.789-10");
        Cliente carlos = new Cliente("Carlos", "carlos@gmail.com", 1123456789, 'M', "123.456.789-10");
        Cliente beatriz = new Cliente("Beatriz", "beatriz@gmail.com", 1123456789, 'F', "123.456.789-10");
        Cliente davi = new Cliente("Davi", "davi@gmail.com", 1123456789, 'M', "123.456.789-10");

        Conta contaCorrenteFelipe = new ContaCorrente(felipe);
        Conta contaCorrenteJoao = new ContaCorrente(joao);
        Conta contaCorrenteMaria = new ContaCorrente(maria);
        Conta contaCorrenteCarlos = new ContaCorrente(carlos);
        Conta contaCorrenteBeatriz = new ContaCorrente(beatriz);
        Conta contaCorrenteDavi = new ContaCorrente(davi);

        bradesco.adicionarConta(contaCorrenteFelipe);
        bradesco.adicionarConta(contaCorrenteJoao);
        bradesco.adicionarConta(contaCorrenteMaria);
        bradesco.adicionarConta(contaCorrenteCarlos);
        bradesco.adicionarConta(contaCorrenteBeatriz);
        bradesco.adicionarConta(contaCorrenteDavi);

        bradesco.removerConta(contaCorrenteJoao);

        contaCorrenteFelipe.depositar(100);

        contaCorrenteFelipe.imprimirExtrato();

        System.out.println("-----------");

        bradesco.exibirTodasContas();
    }
}
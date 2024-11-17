public class Main {
    public static void main(String[] args) {
        // Criando contas
        Conta conta1 = new Conta("Henrique Beltrão");
        Conta conta2 = new Conta("Maria Oliveira");

        // Operações com a conta1
        conta1.depositar(500);
        conta1.sacar(200);
        conta1.exibirSaldo();

        // Operações com a conta2
        conta2.depositar(1000);
        conta2.sacar(1200); // Tentativa de saque com saldo insuficiente
        conta2.exibirSaldo();
    }
}


public class Main {
	public static void main(String[]args) {
		Conta cc = new ContaCorrente();
		cc.depositar(1000);
		
		Conta poupanca = new ContaPoupança();
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}

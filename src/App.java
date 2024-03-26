public class App {
    public static void main(String[] args) throws Exception {
        Cliente tiago = new Cliente();
        tiago.setNome("Tiago");


      Conta cc = new ContaCorrente(tiago);
      cc.depositar(100);
      Conta poupanca = new ContaPoupanca(tiago);

      cc.transferir(60, poupanca);

      cc.imprimirExtrato();
      poupanca.imprimirExtrato();
    }
}

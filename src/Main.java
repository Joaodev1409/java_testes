import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner= new
                Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int Numero = scanner.nextInt();
        if(Numero == conta.Numero){
            System.out.println("Olá " + conta.NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.Agencia + ", conta " + conta.Numero + " e seu saldo " + conta.Saldo + " já está disponível para saque");
        }
    }
}
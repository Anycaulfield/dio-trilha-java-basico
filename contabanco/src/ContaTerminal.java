import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var  scanner = new Scanner(System.in);
        String barra = "-=-=-=-=-=-=-=-=-=-=-=-=--=";
        String barrabaixa = "_________________________________";
        System.out.println(barra);
        System.out.println("Olá!! \n \n    Seja Bem-Vindo ao YurBank \n               Seu Banco Favorito \n \n  ");  // boas vindas
        System.out.println(barra);

        System.out.println("Insira o seu Nome: ");  // Nome
        
        var Nome = scanner.next();
        System.out.printf("Olá, %s \n Insira a Agencia por favor : ",Nome); // Nome da Agencia
        String agencia = scanner.next();
        System.out.println(barrabaixa);

        System.out.printf(" \n Agencia %s , ótimo!! \n  Insira o Número da conta:  ",agencia); // Numero da agencia
        int numero = scanner.nextInt();
        System.out.println(barrabaixa);

        System.out.println(" \n Insira seu saldo: "); //Insira o saldo
        Double saldo = scanner.nextDouble();
        System.out.println(barrabaixa);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s $ já está disponível para saque.",Nome , agencia, numero, saldo);

    }
}

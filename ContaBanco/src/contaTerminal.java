import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0;
        String acao;
        String resposta;
        double valorDeposito = 0;
        double saque;
        double deposito;
        boolean sair = false;

        System.out.println("Bem vindo ao banco");
        System.out.println("Informe o nome do cliente :");
        nomeCliente = input.nextLine();
        System.out.println("Informe o número da conta :");
        numeroConta = input.nextInt();
        System.out.println("Informe a agência :");
        agencia = input.next();
        System.out.println("Antes de terminarmos você gostaria de realizar um deposito ?");
        resposta = input.next();

        if (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Qual o valor você deseja depositar ?");
            valorDeposito = input.nextDouble();

            saldo += valorDeposito;
        }

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é " + agencia);
        System.out.println("O número da sua conta  e " + numeroConta + " e seu saldo, no valor de " + saldo + " reais já está disponível para saque");
    
        do{

            System.out.println("Você deseja realizar alguma ação :");
            System.out.println("1 - saque");
            System.out.println("2 - deposito");
            System.out.println("3 - sair");
            acao = input.next();
        
            if(acao.equalsIgnoreCase("1") || acao.equalsIgnoreCase("saque")){
                System.out.println("Qual valor você deseja saquar ?");
                saque = input.nextDouble();

                saldo -= saque;

            }else if(acao.equalsIgnoreCase("2") || acao.equalsIgnoreCase("depositar")){
                System.out.println("Qual valor você deseja depositar ?");
                deposito = input.nextDouble();

                saldo += deposito;
            }else if(acao.equalsIgnoreCase("sair") || acao.equalsIgnoreCase("3")){
                sair = true;
            }else{

                System.out.println("Entrada invalida, tente novamente");
            }

        }while(!sair);

        System.out.println("Saldo atual = " + saldo);

        input.close();
        
    }
}
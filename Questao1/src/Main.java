import java.util.Scanner;

public class Main{
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Conta c = new Conta();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();
    int r;

    do{
        System.out.println("Nome do Titular ");
        c.setTitular(sc.nextLine());
        System.out.println("Número da conta");
        c.setId_conta(sc.nextInt());
        c.detalhes();
        System.out.println("Acessar conta corrente [1]. Acessar poupança [2]");
        int x = sc2.nextInt();
        switch(x){
            case 1:
                System.out.println("Conta corrente");
                System.out.println();


        }
    }


    }
}
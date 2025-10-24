import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Conta: ");
        Integer conta = sc.nextInt();
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Depisito inicial? : ");
        char op = sc.next().charAt(0);
        Account c1 = new Account(conta,nome);

        if (op == 's'){
            System.out.println("Quantidade do saque?");
            Double quantmais = sc.nextDouble();
            c1.deposito(quantmais);
            System.out.println(c1);
        }
        else{
            System.out.println(c1);
        }

        System.out.println("Deposito: ");
        Double quantmais = sc.nextDouble();
        c1.deposito(quantmais);
        System.out.println(c1);

        System.out.println("Saque: ");
        Double quantmenos = sc.nextDouble();
        c1.saque(quantmenos);
        System.out.println(c1);




    }
}
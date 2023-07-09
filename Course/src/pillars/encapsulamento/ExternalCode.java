package pillars.encapsulamento;

import pillars.encapsulamento.bad.BankAccountBad;
import pillars.encapsulamento.good.BankAccountGood;

public class ExternalCode {
    public static void main(String[] args) {
        // Exemplo SEM ENCAPSULAMENTO:
        BankAccountBad account = new BankAccountBad();
        account.balance = 1000000; // Acesso direto ao atributo balance

        // ... Outras operações com o saldo ...
        System.out.println(account.balance);

        // Exemplo SEM ENCAPSULAMENTO:
        BankAccountGood accountGood = new BankAccountGood();
        account.deposit(1000);
        System.out.println(accountGood.getBalance());
        // ... Outras operações com o saldo ...
    }
}

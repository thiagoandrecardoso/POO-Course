package pillars.encapsulamento.bad;

public class BankAccountBad {
    public double balance; // Atributo público para o saldo

    public void withdraw(double amount) {
        // Lógica de saque
        balance -= amount;
    }

    public void deposit(double amount) {
        // Lógica de depósito
        balance += amount;
    }

    /*
    Neste exemplo, o atributo `balance` é público, o que significa que outros códigos
    podem acessá-lo diretamente e modificá-lo. Isso pode levar a riscos, pois qualquer
    código externo pode manipular diretamente o saldo da conta, sem passar por validações
    ou lógicas específicas
     */
}


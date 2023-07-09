package pillars.encapsulamento.good;

public class BankAccountGood {
    private double balance; // Atributo privado para o saldo

    public void withdraw(double amount) {
        // Lógica de saque
        balance -= amount;
    }

    public void deposit(double amount) {
        // Lógica de depósito
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

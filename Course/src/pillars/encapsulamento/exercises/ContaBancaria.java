package pillars.encapsulamento.exercises;
/*
Vamos fazer um exercício relacionado ao encapsulamento:

Suponha que você está criando uma classe chamada
"ContaBancaria" para representar uma conta bancária.
Essa classe deve ter um atributo privado para armazenar o saldo da conta e dois métodos públicos para depositar e
sacar dinheiro da conta.

Aqui está o esqueleto básico da classe:
 */
public class ContaBancaria {
    private double saldo;

    // Construtor da classe
    public ContaBancaria() {
        saldo = 0.0;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        // TODO: Implemente o código para depositar o valor na conta
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        // TODO: Implemente o código para sacar o valor da conta
    }

    // Método para obter o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }
}

/*
Agora, seu exercício é implementar os métodos depositar e sacar, levando em conta o conceito de encapsulamento.
Garanta que o saldo da conta nunca fique negativo e que outros objetos possam interagir com a conta apenas por meio
desses métodos públicos.
 */


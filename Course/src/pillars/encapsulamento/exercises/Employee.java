package pillars.encapsulamento.exercises;

/*
Imagine que você está criando um sistema para gerenciar informações de funcionários de uma empresa.
Cada funcionário tem um nome, um salário e um código único de identificação.
Porém, o salário não pode ser negativo, e o código de identificação deve ser apenas de leitura,
ou seja, não deve ser possível alterá-lo depois de definido.
 */
public class Employee {
    private String name;
    private double salary;
//        private final int identificationCode; Comentado para retirar erros. Retirar comentário!

    // Construtor da classe
    public Employee(String name, double salary, int identificationCode) {
        // TODO: Implemente a inicialização dos atributos
    }

    // Método para obter o nome do funcionário
    public String getName() {
        // TODO: Implemente o método para retornar o nome
        return null;
    }

    // Método para obter o salário do funcionário
    public double getSalary() {
        // TODO: Implemente o método para retornar o salário
        return 0.0;
    }

    // Método para aumentar o salário do funcionário em uma porcentagem
    public void increaseSalary(double percentage) {
        // TODO: Implemente o método para aumentar o salário do funcionário
    }
}

/*
Seu exercício é completar o código da classe Funcionário usando encapsulamento, garantindo que:
1- Os atributos name e salary sejam privados para que só possam ser acessados por meio dos métodos getName() e
getSalary(), respectivamente.

2- O atributo identificationCode seja definido como final para que seu valor não possa ser alterado após ser
definido no construtor.

3- No construtor, implemente a inicialização adequada dos atributos name, salary e identificationCode.

4- No método getName(), retorne o valor do atributo name.

5- No método getSalary(), retorne o valor do atributo salary.

6- No método increaseSalary(double percentage), implemente a lógica para aumentar o salário do funcionário de
acordo com o percentual fornecido como argumento. O salário não pode se tornar negativo após o aumento.

 */

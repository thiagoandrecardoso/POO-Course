package pillars.polimorfismo;

public class MainAnimal {
    public static void main(String[] args) {
        Animal gato = new Gato(); // Criando um objeto Gato e atribuindo a uma variável Animal
        Animal cachorro = new Cachorro(); // Criando um objeto Cachorro e atribuindo a uma variável Animal

        gato.fazerBarulho();
        cachorro.fazerBarulho();
    }
}

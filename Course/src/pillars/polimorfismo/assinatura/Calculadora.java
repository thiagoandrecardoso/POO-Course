package pillars.polimorfismo.assinatura;
/*
* Por exemplo, considere os seguintes métodos em uma classe chamada `Calculadora`:
*/
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public String somar(String a, String b) {
        return a + b;
    }

    /*
    * Com base na assinatura,
    * o compilador Java é capaz de identificar qual método deve ser chamado com base nos argumentos passados.
    * Por exemplo:
    * */
    public void example(){
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.somar(2, 3);
        // Chama o primeiro método somar(int, int)
        double resultado2 = calculadora.somar(4.5, 2.7);
        // Chama o segundo método somar(double, double)
        String resultado3 = calculadora.somar("Olá, ", "mundo!");
        // Chama o terceiro método somar(String, String)
    }
}



package pillars.heranca.good;

public class Pato {
    private String cor;
    private int tamanho;

    public Pato(String cor, int tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void fazerBarulho() {
        System.out.println("Quack!");
    }

    public void exibirCor() {
        System.out.println("Cor do pato: " + cor);
    }

    public void exibirTamanho() {
        System.out.println("Tamanho do pato: " + tamanho);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}

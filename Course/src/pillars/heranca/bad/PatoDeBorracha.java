package pillars.heranca.bad;

public class PatoDeBorracha {
    private String cor; // linha de código existente em Pato
    private int tamanho;// linha de código existente em Pato
    private boolean boia;

    // Construtor
    public PatoDeBorracha(String cor, int tamanho, boolean boia) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.boia = boia;
    }

    public void exibirCor() {
        System.out.println("Cor do pato de borracha: " + cor);
    }

    public void exibirTamanho() {
        System.out.println("Tamanho do pato de borracha: " + tamanho);
    }

    public void flutuar() {
        if (boia) {
            System.out.println("O pato de borracha está flutuando.");
        } else {
            System.out.println("O pato de borracha não flutua.");
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setBoia(boolean boia) {
        this.boia = boia;
    }
}

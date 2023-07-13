package pillars.heranca.good;

public class PatoDeBorracha extends Pato{
    private boolean boia;
    public PatoDeBorracha(String cor, int tamanho, boolean boia) {
        super(cor, tamanho);
        this.boia = boia;
    }

    // Sobrescrita
    public void fazerBarulho(){
        System.out.println("Squeak");
    }

    public void flutuar() {
        if (boia) {
            System.out.println("O pato de borracha está flutuando.");
        } else {
            System.out.println("O pato de borracha não flutua.");
        }
    }

    public void setBoia(boolean boia) {
        this.boia = boia;
    }
}

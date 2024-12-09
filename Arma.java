public class Arma extends Oggetto {
    private int danno;

    public Arma(String nome, String categoria, String descrizione, int danno) {
        super(nome, categoria, descrizione);
        this.danno = danno;
    }

    @Override
    public String toString() {
        return super.toString()+"Arma{" +
                "danno=" + danno +
                '}';
    }
}

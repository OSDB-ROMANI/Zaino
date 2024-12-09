public class Armatura  extends Oggetto{
    private int def;

    public Armatura(String nome, String categoria, String descrizione, int def) {
        super(nome, categoria, descrizione);
        this.def = def;
    }

    @Override
    public String toString() {
        return super.toString()+"Armatura{" +
                "def=" + def +
                '}';
    }
}

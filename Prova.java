//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Prova {
    public static void main(String[] args) {
        Oggetto[] lista = new Oggetto[4];

        lista[0] = new Arma("spada","arma","desc",89);
        lista[1] = new Armatura("piastre","Armatura","Armatura",125);

        for(Oggetto g : lista){

            if(g!=null) {
                System.out.println(g.getClass().getCanonicalName());
            }
        }

    }
}




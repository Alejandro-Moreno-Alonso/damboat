package damboat;

public class MainBarcos {
    // Clases: MiClase
    // Objetos: miObjeto
    // Métodos: miMetodo
    // static final: MI_CONSTANTE

    public static void main(String[] args) {

        Barco apache = new Gwynn("Apache", 100, 100);
        Barco titan = new NoMuertos("titan", 100, 100);

        apache.atacar(titan);
        titan.atacar(apache);

        System.out.println(titan);
        System.out.println(apache);
        System.out.println(((Gwynn) apache).getRayos());

        apache.atacar(titan);
        titan.atacar(apache);

    }

}

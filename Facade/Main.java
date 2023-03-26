public class Main {

    public static void main(String [] args){

        Marmol pedido1 = new Marmol();
        Granito pedido2 = new Granito();
        Arenisca pedido3 = new Arenisca();
        System.out.println("Marmol");
        pedido1.elaboracion();
        System.out.println("-------------------------------");
        System.out.println("Granito");
        pedido2.elaboracion();
        System.out.println("Arenisca");
        pedido3.elaboracion();

    }

}

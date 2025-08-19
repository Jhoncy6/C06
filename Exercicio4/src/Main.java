public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Carlos";

        zumbi2.nome = "Pedro";

        zumbi1.vida = 10;
        zumbi2.vida = 10;

        System.out.println("A vida do " + zumbi1.vida + "é igual a" + zumbi1.mostrarVida());
        zumbi1.transferirVida(zumbi2, 20);

    }
}

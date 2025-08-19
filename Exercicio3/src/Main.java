//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Carlos";

        zumbi2.nome = "Pedro";

        zumbi1 = zumbi2;
        zumbi1.vida = 10;




//        zumbi1.transferirVida(zumbi2, 10);
       System.out.println( "O Zumbi " + zumbi1.nome + " tem um total de " + zumbi1.mostrarVida() );
         System.out.println( "O Zumbi " + zumbi2.nome + " tem um total de " + zumbi2.mostrarVida() );





    }
}
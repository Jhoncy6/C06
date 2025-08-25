//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cantina cantina1 = new Cantina();
        cantina1.nome="Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome="Enroladinho";
        salgado2.nome="Coxinha";
        salgado3.nome="Pão de Queijo";


        cantina1.addSalgado(salgado1);
        cantina1.addSalgado(salgado2);
        cantina1.addSalgado(salgado3);

        cantina1.mostrarInfo();
    }
}
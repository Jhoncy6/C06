public class Main {
    public static void main(String[] args) {
        Arma arma = new Arma();
        Personagem personagem = new Personagem();

        personagem.pontos = 10;
        arma.nome = "AK-47";
        arma.poder = 10;
        arma.resistencia = 5;
        arma.descrisao = "Essa arma é doidona";

        personagem.arma = arma;
        personagem.usarArma();
        personagem.tomarDano();

        System.out.println("Seu personagem tem " + personagem.pontos + " de vida"  );
        arma.mostrarInfoArma();
    }
}

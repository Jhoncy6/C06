public class Kart {
    public String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        motor = new Motor();
    }

    public void pular (){
        System.out.println("Kart está a pular...");
    }

    public void soltarTurbo (){
        System.out.println("Kart está a correr mto rapido...");
    }

    public void fazerDrift (){
        System.out.println("Kart está a deslizar...");
    }

}

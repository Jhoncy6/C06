//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kart kartDoRogerio = new Kart();
        Piloto piloto1 = new Piloto();
        piloto1.nome = "Rogerio Sene";
        piloto1.vilao = false;
        kartDoRogerio.piloto = piloto1;
        kartDoRogerio.motor.cilindradas = "150";
        kartDoRogerio.motor.velocidadeMaxima = 155;

        kartDoRogerio.motor.mostrarInfo();
        piloto1.soltarSuperPoder();
        kartDoRogerio.pular();
        kartDoRogerio.fazerDrift();
        kartDoRogerio.soltarTurbo();
    }
}
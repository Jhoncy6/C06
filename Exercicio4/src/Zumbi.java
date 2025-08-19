public class Zumbi {

    double vida;
    String nome;

   public double mostrarVida(){
       System.out.println("a vida atual do " + nome + "é igual a :" + vida);
    }
    public boolean podeTransferir(Zumbi zumbiAlvo,  double quantia){if (vida >= quantia){
            return true;
        } else {
            return false;
        }
    }

    public void transferirVida (Zumbi zumbiAlvo,  double quantia){
       if (podeTransferir(zumbiAlvo, quantia) == true){
           vida -= quantia;
           zumbiAlvo.vida += quantia;
           System.out.println("A vida atual do" + nome + " é igual a: " + zumbiAlvo.vida);
       }else {
           System.out.println(nome + " Não pode transferir vida");
       }
    }
}

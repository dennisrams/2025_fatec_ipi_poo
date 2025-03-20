import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var messi = new Personagem();
        while (true) {
        var oQueFazer = 1 + gerador.nextInt(0, 3);

        //1 - Caçar
        switch (oQueFazer) {
            case 1:
                messi.cacar();
                break;
            case 2:
                messi.comer();
                break;
            case 3:
                messi.dormir();
                break;
            default:
                break;
            }
            System.out.println(messi.toString());
            System.out.println("*****************");
            Thread.sleep(3000);
        }
    }
}

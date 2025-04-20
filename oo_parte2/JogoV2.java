import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var p1 = new Personagem(null, 10, 0, 0);
        var p2 = new Personagem("LeBron", 10, 10, 0);
        var p3 = new Personagem("MBappe", 4, 4, 10);
        Personagem [] personagens = {p1, p2, p3};

        var quemVaiJogar = gerador.nextInt(personagens.length);

        while (true) {
        var oQueFazer = 1 + gerador.nextInt(0, 3);

        //1 - Caçar
        switch (oQueFazer) {
            case 1:
                personagens[quemVaiJogar].cacar();
                break;
            case 2:
                personagens[quemVaiJogar].comer();
                break;
            case 3:
                personagens[quemVaiJogar].dormir();
                break;
            default:
                break;
            }
            System.out.println(personagens[quemVaiJogar].toString());
            System.out.println("*****************");
            Thread.sleep(3000);
        }
    }
}

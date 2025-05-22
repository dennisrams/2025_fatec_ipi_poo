package colecoes;
import java.util.Random;
public class TesteDeVetorDinamicoV1 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var v = new VetorDinamico();
        while (true) {
            var oQueFazer = gerador.nextDouble();
            if(oQueFazer <= 0.5){
                var numero = gerador.nextInt(1, 7);
                v.adicionar(numero);
            }
            var numero = gerador.nextInt(1, 7);
            v.adicionar(numero);
            System.out.println(v);
            System.out.println("***********************");
            Thread.sleep(5000);
        }

    }
}

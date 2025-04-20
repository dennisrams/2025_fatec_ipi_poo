package colecoes;

public class TesteGenerics {
    public static void main(String[] args) {
     //   VetorDinamico<Integer> 
        //ints = new VetorDinamico<>();
    var meusInteiros = new VetorDinamico<Integer>();
    meusInteiros.adicionar(1);
    var minhasMusicas = new VetorDinamico<Musica>();
    minhasMusicas.adicionar(new Musica());
    }
}

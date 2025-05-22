package colecoes;

public class BasicoDeVetores {
    public static void main(String[] args) {
        //declaração de vetores
        //int [] v1 = new int [10];
        //var v1 = new int [10];
        int [] v1 = {5, 7, 2, 2};
        System.out.println(v1.length);
        //cslcular a média do vetor
        var media = 0.0;
        for(int i = 0; i < v1.length; i++){
            //System.out.println(v1[i]);
            media += v1[i]; 
        }
        media /= v1.length;
        System.out.println(media);
    }
}

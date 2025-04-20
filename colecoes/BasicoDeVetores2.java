package colecoes;

public class BasicoDeVetores2 {
    public static void main(String[] args) {
        int [] v = {1, 2};
        System.out.println(v[0]);
        System.out.println(v[1]);
        //passagem de parametro por valor e por referencia
        //int b = 3;
        //manipulavalor(b);
        //System.out.println(b);
    }

    static void manipulaVetor(int [] x){
        x[0] = 10;
        x[1] = 20;
    }

    static void manipulavalor(int a){
        a = 2;
    }
}

package sobrecarga;

public class TesteCalculadora {
    public static void main(String[] args) {
        long l1 = 2, l2 = 3;
        String s1 = "2", s2 = "3";
        var calc = new Calculadora();
        System.out.println(calc.somar(l1, l2));
        System.out.println(calc.somarStrings(s1, s2));
        System.out.println();
    }
}

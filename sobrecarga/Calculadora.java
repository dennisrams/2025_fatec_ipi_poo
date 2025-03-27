package sobrecarga;

public class Calculadora {
    public long somar(long a, long b){
        return a + b;
    }

    public long somarStrings(String s1, String s2){
        return Long.parseLong(s1) + Long.parseLong(s2);
    }

    public long somar(long a, long b, long c){
        return a + b + c;
    }

    public long somar (String s1, long a){
        return Long.parseLong(s1) + a;
    }

    public long somar (long s1, String s){
        return somar(s, 1);
    }
}

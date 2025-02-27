import java.util.Scanner;

public class Exercicio10Scan{
    static public void main(String[] abc){
        
        int ValorCarro = 15000;

        int PorcentagemDistruibuidor = ValorCarro * 28 / 100;
        int PorcentagemImpostos = ValorCarro * 45 / 100;

        ValorCarro = ValorCarro + PorcentagemDistruibuidor + PorcentagemImpostos;

        System.out.println(ValorCarro);
    }
}
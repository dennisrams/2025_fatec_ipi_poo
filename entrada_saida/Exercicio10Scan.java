import java.util.Scanner;

public class Exercicio10Scan{
    static public void main(String[] abc){
        
        double ValorCarro;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do carro: ");
        ValorCarro = scanner.nextDouble();
        
        double PorcentagemDistruibuidor = ValorCarro * 28 / 100;
        double PorcentagemImpostos = ValorCarro * 45 / 100;

        ValorCarro = ValorCarro + PorcentagemDistruibuidor + PorcentagemImpostos;

        System.out.println(ValorCarro);
    }
}
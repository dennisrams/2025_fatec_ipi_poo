import javax.swing.JOptionPane;
public class Exercicio10{
    static public void main(String[] abc){
        
        int ValorCarro = 15000;

        int PorcentagemDistruibuidor = ValorCarro * 28 / 100;
        int PorcentagemImpostos = ValorCarro * 45 / 100;

        ValorCarro = ValorCarro + PorcentagemDistruibuidor + PorcentagemImpostos;

        JOptionPane.showMessageDialog(null, ValorCarro);
    }
}
import javax.swing.JOptionPane;
public class Exercicio10{
    static public void main(String[] abc){
        
        double ValorCarro;
        ValorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro: "));        

        double PorcentagemDistruibuidor = ValorCarro * 28 / 100;
        double PorcentagemImpostos = ValorCarro * 45 / 100;

        ValorCarro = ValorCarro + PorcentagemDistruibuidor + PorcentagemImpostos;

        JOptionPane.showMessageDialog(null, ValorCarro);
    }
}
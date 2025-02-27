import javax.swing.JOptionPane;
public class SomaDoisNumeros{
    static public void main(String[] abc){
        //declarar variáveis
        double a, b, resultado;
        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        //processamento
        resultado = a + b;
        //saída de dados
        JOptionPane.showMessageDialog(null, resultado);
    }
}
package colecoes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Trak{
    private String titulo;
    private int avaliacao;
    public Trak(String titulo, int avaliacao){
        this.titulo = titulo;
        this.avaliacao = avaliacao;
    }
    public Trak(String titulo){
        this.titulo = titulo;
    }
    public String toString(){
        return String.format("Titulo: %s, Avaliação: %d", titulo, avaliacao);
    }
}

public class MyTrakz {
    public static void main(String[] args) {
        var minhasTrakz = new ArrayList<Trak>();

        var menu = "1 - Cadastrar\n2 - Remover\n3 - Atualizar\n4 - Listar ordenado por nome\n5 - Listar ordenado por avaliação\n6 - Avaliar Musica\n0 - Sair";

        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    var titulo = JOptionPane.showInputDialog("Titulo");
                    var trak = new Trak(titulo);
                    minhasTrakz.add(trak);
                    JOptionPane.showMessageDialog(null, "Trak adicionada!");
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 0:
                    
                    break; 
                default:
                    break;
            }

        }while(op != 0);
    }
}

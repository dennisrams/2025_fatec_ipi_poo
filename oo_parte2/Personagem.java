import java.lang.reflect.Method;
import java.util.Random;

public class Personagem{

    private String nome;
    private String [] possiveisNomes = {"Steve", "Alex", "Mark"};
    private int energia;
    private int fome;
    private int sono;

    public Personagem(String string, int i, int j, int k){
        nome = obterNomeAleatorio();
        energia = 10;
        fome = 0;
        sono = 0;
    }
    
    private String obterNomeAleatorio(){
    var gerador = new Random();
    return possiveisNomes[gerador.nextInt(possiveisNomes.length)];
    }

    public void Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome.length() >= 4 ? 
        nome : obterNomeAleatorio();
        
        this.energia = energia >= 0 && energia <= 10 ?
        energia : 10;

        if(fome >= 0 && fome <= 10){
            this.fome = fome;
        }
        else 
            this.fome = 0;
        
        switch (sono) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                this.sono = sono;       
            default:
                this.sono = 0;
        }
    }

    public void cacar(){
        if(energia >= 2){
            System.out.println(nome + " está caçando!\n");
            energia -= 2;
        }
        else{
            System.out.printf("%s está sem energia para caçar!\n", nome);
        }
        fome = fome < 10 ? fome + 1 : fome;
        sono = Math.min(sono + 1, 10);
    }

    public void comer(){
        if (fome >= 1){
            System.out.printf("%s está comendo!\n", nome);
            if(energia < 10)
            energia ++;
            fome --;
        }
        else{
            System.out.printf("%s está sem fome!\n", nome);
        }
        fome = fome >= 1 ? fome - 1 : fome;
    }

    public void dormir(){
        if(sono >= 1){
            System.out.printf("%s está dormindo!\n", nome);
            sono --;
            energia ++;
            }
        else{
            System.out.printf("%s está sem sono!\n", nome);
        }
    }
    @Override
    public String toString(){
        return String.format(
            "%s: e %d, f: %d, s: %d",
            nome, energia, fome, sono
        );
    }
}
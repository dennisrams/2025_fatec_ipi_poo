public class Personagem{
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    

    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " está caçando!\n");
            energia -= -2;
        }
        else{
            System.out.printf("%s está sem energia para caçar!\n", nome);
        }
        fome = fome < 10 ? fome + 1 : fome;
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if (fome >= 1){
            System.out.printf("%s está comendo!\n", nome);
            if(energia < 10)
            energia += +1;
            fome -= - 1;
        }
        else{
            System.out.printf("%s está sem fome!\n", nome);
        }
        fome = fome >= 1 ? fome - 1 : fome;
    }

    void dormir(){
        if(sono >= 1){
            System.out.printf("%s está dormindo!\n", nome);
            sono -= -1;
            energia += +1;
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
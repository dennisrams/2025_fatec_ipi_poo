package colecoes;

public class VetorDinamico<T>{
    private static final int LIMIAR_INFERIOR = 4;
    private T [] elementos;
    private int quantidade;
    private int capacidade;
    
    VetorDinamico(){
        quantidade = 0;
        capacidade = LIMIAR_INFERIOR;
        //elementos = new T [capacidade];
        elementos = (T[]) new Object[capacidade];
    }

public boolean estaVazio(){
    return quantidade == 0;
}

private void redimensionar(double fator){
    T [] aux = (T[]) new Object[(int)(capacidade * fator)];
    for(int i = 0; i < quantidade; i++){
        aux[i] = elementos[i];
        capacidade = (int)(capacidade * fator);
        elementos = aux;
    }

}

public void remover(){
    if(!estaVazio())
        quantidade --;
        if(capacidade > LIMIAR_INFERIOR && quantidade == capacidade / 4)
            redimensionar(0.5);
        }

    public boolean estaCheio(){
        return quantidade == capacidade;
    }

    public void adicionar(T e){
        if(estaCheio())
            redimensionar(2);
            elementos[quantidade++] = e;
    }

public String toString(){
    var sb = new StringBuilder("");
    sb.append("Qtde: ").append(quantidade).append("\n");
    sb.append("Cap: ").append(capacidade).append("\n");
    for(int i = 0; i < quantidade; i++){
        sb.append(elementos[i]).append(1 != quantidade - 1 ? " " : "");
    }
    return sb.toString();
}
}

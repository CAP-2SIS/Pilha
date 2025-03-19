public class PilhaInt {
    private int[] pilha;
    private int topo;
    private int tamanho;

    public PilhaInt(int tamanho) {
        this.tamanho = tamanho;
    }

    public void init(){
        pilha = new int[tamanho];
        topo = 0;
    }

    public boolean isEmpty(){
        if(topo == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(topo == tamanho){
            return true;
        }
        return false;
    }

    public void push(int elemento){
        if(!isFull()){
            pilha[topo] = elemento;
            topo++;
        }
    }

    public int pop(){
        if(!isEmpty()){
            topo--;
            return pilha[topo];
        }
        return 0;
    }

    public String toString(){
        String retorno = "";
        for(int i = 0; i < topo; i++){
            retorno += pilha[i] + ", ";
        }
        retorno = retorno.substring(0, retorno.length() - 1);
        return retorno;
    }
}

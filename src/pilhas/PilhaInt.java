package pilhas;

public class PilhaInt {
    private int[] pilha;
    private int topo;
    private int tamanho;

    public PilhaInt(int tamanho) {
        this.tamanho = tamanho;
    }

    public void init() {
        pilha = new int[tamanho];
        topo = 0;
    }

    public boolean isEmpty() {
        if (topo == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (topo == tamanho) {
            return true;
        }
        return false;
    }

    public void push(int elemento) {
        if (!isFull()) {
            pilha[topo] = elemento;
            topo++;
        }
    }

    public int pop() {
        topo--;
        return pilha[topo];
    }

    public int top() {
        return pilha[topo - 1];
    }

    public void empty() {
        while (topo > 0) {
            System.out.println(pop());
        }
    }

    public String toString() {
        String retorno = "";
        for (int i = 0; i < topo; i++) {
            retorno += pilha[i] + "\t";
        }
        return retorno;
    }
}

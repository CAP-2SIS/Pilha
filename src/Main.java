import pilhas.PilhaInt;

public class Main {
    public static void main(String[] args) {
        PilhaInt p =  new PilhaInt(20);
        p.init();

        for (int i = 0; i < 20; i++) {
            p.push(i);
        }

        p.empty();
    }
}

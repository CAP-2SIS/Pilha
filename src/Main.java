public class Main {
    public static void main(String[] args) {
        PilhaInt p =  new PilhaInt(5);
        p.init();
        p.push(1);
        p.push(13);
        p.pop();
        p.push(9);

        System.out.println(p);
    }
}

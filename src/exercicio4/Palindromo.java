package exercicio4;

import pilhas.PilhaInt;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt(10);
        int digito, n = 0;
        int[] leitura = new int[10];
        pilha.init();
        do {
            System.out.println("Digite um numero de 0 a 9");
            digito = sc.nextInt();
            leitura[n] = digito;
            pilha.push(digito);
            n++;
        } while (digito >= 0);

        boolean palindromo = true;
        for (int i = 0; i < n && palindromo; i++) {
            if (leitura[i] != pilha.pop()) {
                palindromo = false;
            }
        }

        System.out.println(palindromo? "É palindromo" : "Não é palindromo");
    }
}

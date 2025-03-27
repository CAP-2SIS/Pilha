package exercicio3;

import java.util.Scanner;
import pilhas.PilhaInt;

public class MainExercicioBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor,resto;

        PilhaInt pilha = new PilhaInt(100);
        pilha.init();

        System.out.println("Digite um valor inteiro positivo em decimal: ");
        valor = sc.nextInt();

        while (valor != 0){
           resto = valor % 2;
           pilha.push(resto);
           valor = valor / 2;
        }

        pilha.empty();
        sc.close();
    }
}

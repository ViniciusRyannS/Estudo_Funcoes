package aula7;

import java.util.Scanner;

/**
 *
 * @author vinicius.rssousa
 */
public class Aula7 {

    public static int entradaDados() {
        System.out.println("*-* Entrada de Dados *-*");
        Scanner input = new Scanner(System.in);
        System.out.println("Número: ");
        int n = input.nextInt();
        return n;
    }

    public static int minimo(int n1, int n2) {
        System.out.println("*-* Mínimo *-*");
        int min = 0;
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void imprimir(int menor) {
        System.out.println("*-* Imprimir *-*");
        System.out.println("Menor: " + menor);
    }

    //testando o programa
    public static void main(String[] args) {
        System.out.println("*-* Programa Principal *-*");
        int x = entradaDados();
        int y = entradaDados();
        int min = minimo(x, y);
        imprimir(min);

    }
}

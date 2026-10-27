import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;
        int soma = 0;
        int maior = 0;

        System.out.println("Digite números inteiros (0 para encerrar).");

        do {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if (numero != 0) {
                numeros.add(numero);
                soma = soma + numero;

                if (numeros.size() == 1 || numero > maior) {
                    maior = numero;
                }
            }

        } while (numero != 0);

        System.out.println("\nNúmeros digitados: " + numeros);
        System.out.println("Quantidade: " + numeros.size());
        System.out.println("Soma: " + soma);

        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            System.out.println("Maior número: " + maior);
        }

        scan.close();
    }
}
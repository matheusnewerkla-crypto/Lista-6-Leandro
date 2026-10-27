import java.util.Scanner;

public class Exercicio5 {

 
    public static int contarSete(int numero) {
        if (numero == 0) {
            return 0;
        }

        int ultimoDigito = numero % 10;

        if (ultimoDigito == 7) {
            return 1 + contarSete(numero / 10);
        }

        return contarSete(numero / 10);
    }


    public static int maiorVetor(int[] vetor, int posicao) {
        if (posicao == vetor.length - 1) {
            return vetor[posicao];
        }

        int maiorRestante = maiorVetor(vetor, posicao + 1);

        if (vetor[posicao] > maiorRestante) {
            return vetor[posicao];
        }

        return maiorRestante;
    }


    public static boolean palindromo(
            String palavra, int inicio, int fim) {

        if (inicio >= fim) {
            return true;
        }

        if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        }

        return palindromo(palavra, inicio + 1, fim - 1);
    }

  
    public static int somaRecursiva(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + somaRecursiva(n - 1);
    }


    public static int somaLaco(int n) {
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== EXERCICIO 5 ===");
            System.out.println("1 - Contar digitos 7");
            System.out.println("2 - Encontrar maior elemento");
            System.out.println("3 - Verificar palindromo");
            System.out.println("4 - Comparar somas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um numero: ");
                    int numero = scan.nextInt();

                    if (numero < 0) {
                        System.out.println(
                            "Digite um numero nao negativo.");
                    } else {
                        System.out.println("Quantidade de digitos 7: "
                                + contarSete(numero));
                    }
                    break;

                case 2:
                    int[] vetor = {10, 25, 8, 40, 15};

                    System.out.println("Maior elemento: "
                            + maiorVetor(vetor, 0));
                    break;

                case 3:
                    System.out.print("Digite uma palavra: ");
                    String palavra = scan.nextLine();

                    palavra = palavra.toLowerCase();

                    if (palindromo(palavra, 0,
                            palavra.length() - 1)) {
                        System.out.println("E palindromo!");
                    } else {
                        System.out.println("Nao e palindromo.");
                    }
                    break;

                case 4:
                    System.out.print("Digite um numero: ");
                    int n = scan.nextInt();

                    if (n < 0) {
                        System.out.println(
                            "Digite um numero nao negativo.");
                    } else {
                        System.out.println("Soma recursiva: "
                                + somaRecursiva(n));
                        System.out.println("Soma com laco: "
                                + somaLaco(n));
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }

        scan.close();
    }
}
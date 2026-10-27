public class Exercicio4 {

  
    public static void exibirNumeros(int n) {
        if (n <= 0) {
            return;
        }

        exibirNumeros(n - 1);
        System.out.println(n);
    }

   
    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

 
    public static int somarPares(int n) {
        if (n < 2) {
            return 0;
        }

        if (n % 2 != 0) {
            return somarPares(n - 1);
        }

        return n + somarPares(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Números de 1 até " + n + ":");
        exibirNumeros(n);

        System.out.println("Fatorial de " + n + ": "
                + fatorial(n));

        System.out.println("Soma dos pares até " + n + ": "
                + somarPares(n));
    }
}
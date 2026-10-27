public class Exercicio3 {

    static class No {
        int numero;
        No proximo;

        No(int numero) {
            this.numero = numero;
            this.proximo = null;
        }
    }

    static No inicio = null;

    public static void inserirInicio(int numero) {
        No novo = new No(numero);

        novo.proximo = inicio;
        inicio = novo;
    }

    public static void exibirLista() {
        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.numero + " -> ");
            atual = atual.proximo;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        No n1 = new No(10);
        No n2 = new No(20);
        No n3 = new No(30);

        inicio = n1;
        n1.proximo = n2;
        n2.proximo = n3;

        System.out.println("Lista original:");
        exibirLista();

        System.out.println("\nInserindo 5 no início:");
        inserirInicio(5);
        exibirLista();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== CADASTRO DE ALUNOS ===");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Exibir quantidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scan.nextLine();

                    alunos.add(nome);

                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        System.out.println("\n=== ALUNOS CADASTRADOS ===");

                        for (String aluno : alunos) {
                            System.out.println(aluno);
                        }
                    }
                    break;

                case 3:
                    System.out.println(
                        "Quantidade de alunos: " + alunos.size()
                    );
                    break;

                case 0:
                    System.out.println("Encerrando programa...1");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scan.close();
    }
}
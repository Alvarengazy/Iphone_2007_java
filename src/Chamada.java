import java.util.Scanner;

public class Chamada {
    public void menuChamada() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Chamada ---");
            System.out.println("1. Fazer ligação");
            System.out.println("2. Atender chamada");
            System.out.println("3. Acessar correio de voz");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    ligar(numero);
                    break;
                case 2:
                    atender();
                    break;
                case 3:
                    iniciarCorreioVoz();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Acessando correio de voz...");
    }
}

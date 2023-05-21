package Menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Locadora locadora = new Locadora();
        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Realizar locação");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner, locadora);
                    break;
                case 2:
                    realizarLocacao(scanner, locadora);
                case 3:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
    
    private static void realizarLocacao(Scanner scanner, Locadora locadora) {
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.next();
        System.out.println("Escolha o Veículo:\n\n1- (Fiat, Mobi 1.0, 70R$)\n\n2- (Ford Ka 1.4, 86R$)\n\n3- (Jetta GLI 2.0, 150R$)");
        String placa = scanner.next();
        System.out.println("Digite a data de início da locação (dd/mm/aaaa):");
        String dataInicio = scanner.next();
        System.out.println("Digite a data de fim da locação (dd/mm/aaaa):");
        String dataFim = scanner.next();
        System.out.println("Escolha o Local de Retirada do Veículo:\n\n1- (Praça da Matriz)\n\n2- (Rodoviária)");
        String localRetirada = scanner.next();
        ((Locadora) locadora).realizarLocacao(cpf, placa, dataInicio, dataFim, localRetirada);
    }

    private static void cadastrarCliente(Scanner scanner, Locadora locadora) {
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.next();
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.next();
        System.out.println("Digite o telefone do cliente:");
        String telefone = scanner.next();
        System.out.println("Digite o e-mail do cliente:");
        String email = scanner.next();
        System.out.println("Digite a data de nascimento do cliente (dd/mm/aaaa):");
        String dataNascimento = scanner.next();
        locadora.cadastrarCliente(nome, cpf, telefone, email, dataNascimento);
    }
}
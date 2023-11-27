import java.util.ArrayList;
import java.util.Scanner;

public class SeparacaoPorGenero {
    public static void main(String[] args) {
        // Criação de listas para armazenar nomes por gênero
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Loop para coletar nomes e gêneros
        while (true) {
            // Solicita e lê o nome
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            // Verifica se o usuário deseja encerrar
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            // Solicita e lê o sexo
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpa o buffer do scanner

            // Separa o nome no grupo correspondente
            if (sexo == 'M' || sexo == 'm') {
                masculino.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Use M para masculino ou F para feminino.");
            }
        }

        // Exibe os grupos
        System.out.println("\nGrupo Masculino: " + masculino);
        System.out.println("Grupo Feminino: " + feminino);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}

import java.io.InputStream;
import java.util.Scanner;

public class Aula071222 {

    public static void main(String[] args) {

        String primeiroArgumento = args[0];
        String segundoArgumento = args[1];

        String dados = "Nome: %s, Idade: %s".formatted(primeiroArgumento,segundoArgumento);

        String dados2 = String.format("Nome: %s, Idade: %s",primeiroArgumento,segundoArgumento);

        InputStream Seila = System.in;
        Scanner scanner = new Scanner(Seila);

        System.out.println("Digite o nome");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade");
        int idade = scanner.nextInt();


        System.out.println(dados);
    }
}

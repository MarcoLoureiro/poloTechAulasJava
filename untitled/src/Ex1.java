import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a hora");
        int hora = 00;//scanner.nextInt();
        //System.out.println("Digite os minutos");
        int minuto = 22;//scanner.nextInt();

        int horaLondres = (hora + 3) % 24;
        int horaMexico = ((hora - 3) + 24) % 24;

        System.out.printf("Brasil: %d:%dmm \n", hora, minuto);
        System.out.printf("Mexico: %d:%dmm\n", horaMexico, minuto);
        System.out.printf("Londres: %d:%dmm\n", horaLondres, minuto);

        int hora2 = 20;
        int minuto2 = 22;

        System.out.println("Digite a hora a ser somada");
        int horaSomada = scanner.nextInt();
        System.out.printf("Brasil: %d:%dmin \n", (hora2 + horaSomada) % 24, minuto2);
        System.out.printf("Mexico: %d:%dmin\n", (((hora2 - 3) + 24 + horaSomada) % 24), minuto2);
        System.out.printf("Londres: %d:%dmin\n", (((hora2 + 3)+horaSomada) % 24), minuto2);


    }
}

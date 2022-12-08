import java.util.Scanner;

public class Pratica071222 {
    public static void main(String[] args) {

        //Fazer um programa que escaneie e printe 3 fusos diferentes
        // de acordo com a hora e minuto informada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora");

        int hora = scanner.nextInt();

        System.out.println("Digite o minuto");

        int minuto = scanner.nextInt();

        int horaBr = hora % 24;
        int horaMexico = ((hora - 3) + 24) % 24;
        int horaArgentina = (hora + 3) % 24;

        System.out.printf("Hora Br: %dHH:%dmm\n",horaBr,minuto);
        System.out.printf("Hora Mex: %dHH:%dmm\n",horaMexico,minuto);
        System.out.printf("Hora Arg: %dHH:%dmm\n",horaArgentina,minuto);
    }
}

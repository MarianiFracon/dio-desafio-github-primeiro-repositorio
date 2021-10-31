import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        do {
            nota1 = scan.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
            }
        }while(nota1 < 0 || nota1 > 10);

        do {
            nota2 = scan.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
            }
        }while(nota2 < 0 || nota2 > 10);


        media = (nota1 + nota2)/2;
        System.out.println(String.format("media = " + "%.2f", media));

    }

}

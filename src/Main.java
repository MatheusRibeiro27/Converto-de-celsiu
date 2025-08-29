

        import java.util.Scanner;



        public class Main {


            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);




                char res;

                do {

                    System.out.print("Digite a temperatura em ceslcius: ");
                    double c = sc.nextDouble();
                    double f = 9.0 * c / 5.0 + 32;

                    System.out.printf("Equivalante a farenheit: %.1f%n", f  );
                    System.out.print("Deseja repetir (s/n)?");
                    res = sc.next().charAt(0);

                } while ( res != 'n' ); {
                    System.out.println("Terminou");
                }



















                sc.close();
            }
        }







import java.util.Scanner;

    public class task8 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            double f;
            double c;

            do{
                System.out.println("Enter the degrees in fahrenheit");
                if (in.hasNextDouble()){
                    f = in.nextDouble();
                    break;

                } else{
                    System.out.println("Enter a numerical value.");
                    in.nextLine();
                }
            } while (true);
            c = (f-32) * 5/9;
            System.out.println("The degrees in celsius is " + c + "°");
        }
    }

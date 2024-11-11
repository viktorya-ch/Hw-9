import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("//Task#1");

        int [] payment = {5000,12000,50000,19000,130000};
        int sum = 0;
        for (int index = 0; index < payment.length; index++)
            sum = sum + payment[index];{

            System.out.println(" Сумма трат за месяц составила " + sum + " рублей");}


        System.out.println( );

        System.out.println( "//Task#2");

       int [] waste = {3544,12554,3444,49087,66543};
       int maxWaste = 0;
       int minWast = 80000;
       for (int i = 0; i < waste.length; i++){
           if (waste[i] > maxWaste){
               maxWaste = waste[i];
           }
           else if ( waste[i] < minWast){
               minWast = waste[i];
           }
       }

        System.out.println("Минимальная сумма трат за неделю составила " + minWast + " Максимальная сумма трат за неделю составила " + maxWaste + " рублей");

        System.out.println( );

        System.out.println("//Task#3");

        int [] waste2 = {3000,3554,5644,13349,25400};
        int sum1 = 0;
        for (int index = 0; index < waste2.length; index++) {
            sum1 = sum1 + waste2[index];
        double average = (double) sum1 / 5;
            System.out.println(" Средняя сумма трат за месяц составила " + average + " рублей");
    }
        System.out.println( );

        System.out.println("//Task#4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length - 1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }}
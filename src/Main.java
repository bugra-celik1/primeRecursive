import java.util.Scanner;
public class Main {
    static boolean isPrime(int number1,int divisor) {
        if(number1 <= 0){
            return false;
        }
        if(divisor == 1){
            return true;
        }
        if(number1 % divisor == 0){
            return false;
        }

        return isPrime(number1,divisor-1);


    }

    static boolean isPrime(int number){
        return isPrime(number,number / 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        int number = scan.nextInt();
        if(isPrime(number)){
            System.out.println( number + " Sayısı asal sayıdır.");
        }else{
            System.out.println(number + " Sayısı asal sayı değildir.");
        }


    }
}



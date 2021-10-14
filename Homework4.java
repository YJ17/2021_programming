import  java.util.Scanner;

public class Homework4 {

    int gcd(int m, int n){

        if(m == 0){
            return m;
        }
        else if(m % n  == 0){
            return n;
        }
        else {
            return gcd(n, m % n);
        }

    }

    public static void main(String[] args) {

        int input_a;
        int input_b;

        Scanner scan = new Scanner(System.in);

        Homework4 gcd = new Homework4();

        System.out.printf("두 수를 입력하세요 : ");

        input_a = scan.nextInt();
        input_b = scan.nextInt();

        System.out.println("두 수의 최대공약수는 " + gcd.gcd(input_a, input_b) + "입니다.");

    }

}

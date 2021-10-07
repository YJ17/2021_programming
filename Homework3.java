import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        int len;
        int max;
        int min;

        Scanner scan = new Scanner(System.in);

        System.out.printf("몇 개의 수를 입력할 예정인가요? ");

        len = scan.nextInt();

        int[] arr = new int[len];

        System.out.printf("수를 입력하세요 : ");

        for(int i = 0; i < len; i++){

            arr[i] = scan.nextInt();

        }

        max = arr[0];
        min = arr[0];

        for(int i = 0; i < len; i++){

            if(arr[i] > max){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }

        }

        System.out.println("최대값 : " + max);

        System.out.println("최소값 : " + min);


    }

}

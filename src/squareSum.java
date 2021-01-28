import java.util.Scanner;

public class squareSum {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        int arr[] =new int[10];
        for(int i=0; i<10 ; i++){
            arr[i]= sc.nextInt();
            arr[i]= arr[i]*arr[i];
            sum = arr[i]+sum;

        }
        System.out.println("Sum: "+sum);
    }
}

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10; i++) {

            if(arr[i]>40 && arr[i]<50){
                System.out.println("MARKS:"+ arr[i]+" REMARKS: PASS");
            }
            if(arr[i]>51 && arr[i]<70){
                System.out.println("MARKS:"+ arr[i]+" REMARKS: MERIT");
            }
            if(arr[i]>71 && arr[i]<100){
                System.out.println("MARKS:"+ arr[i]+" REMARKS: DISTINCTION");
            }
        }
    }
}

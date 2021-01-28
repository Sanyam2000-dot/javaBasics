import java.util.Scanner;

public class monthEquivalent {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        a = sc.nextInt();
        switch (a){
            case 1: if(a==1){
                System.out.println("January");
                break;
            }
            case 2: if(a==2){
                System.out.println("February");
                break;
            }
            case 3: if(a==3){
                System.out.println("March");
                break;
            }
            case 4: if(a==4){
                System.out.println("April");
                break;
            }
            case 5: if(a==5){
                System.out.println("May");
                break;
            }
            case 6: if(a==6){
                System.out.println("June");
                break;
            }
            case 7: if(a==7){
                System.out.println("July");
                break;
            }
            case 8: if(a==8){
                System.out.println("August");
                break;
            }
            case 9: if(a==9){
                System.out.println("September");
                break;
            }
            case 10: if(a==10){
                System.out.println("October");
                break;
            }
            case 11: if(a==11){
                System.out.println("November");
                break;
            }
            case 12: if(a==12){
                System.out.println("December");
                break;
            }
            default:
                System.out.println("Incorrect Input");
        }

    }
}

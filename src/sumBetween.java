public class sumBetween {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=40;i<250;i++){
            if(i/10 ==5 || i/10 ==0){
                sum =sum +i;
            }
        }
        System.out.println("Sum :"+ sum);
    }
}

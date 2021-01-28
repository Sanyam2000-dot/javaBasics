import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    if (x != y && y != z && z != x) {
                        System.out.println(arr[x] + "" + arr[y] + "" + arr[z]);
                    }
                }
            }
        }
    }
}

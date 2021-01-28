public class Snooker {
        int a = 10;
}
class Balls extends Snooker{
    public static void main(String[] args) {
        Snooker obj = new Snooker();
        obj.a =8;
        System.out.println(obj.a);
    }
}

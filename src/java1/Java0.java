package java1;

public class Java0 {

    public static void main(String[] args) {

        checkage(10);
        checkage(20);
    }
    public static void checkage(int age) {
        if (age < 18) {
            if (age > 10) {
                System.out.println("불가능");
            } else {
                System.out.println("엄마랑 가능");
            };
        } else {
            if (age > 30) {
                System.out.println("불가능");
            } else {
                System.out.println("가능");
            }
        }
    }
}

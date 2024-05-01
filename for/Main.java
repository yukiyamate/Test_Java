public class Main {
    public static void main(String[] args) {
        System.out.println("値を入力してください");
        int n = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1から" + n + "の和は、" + sum + "です");
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println("1～10の整数を入力してください");
        int number = new java.util.Scanner(System.in).nextInt();
        if (1 <= number && number <5){
            System.out.println("5未満の整数" + number + "が入力されました。");
        }else if(number == 5) {
            System.out.println("5が入力されました。");
        }else if(6 <= number && number <= 10){
            System.out.println("6以上の整数" + number + "が入力されました。");
        }

    }
}

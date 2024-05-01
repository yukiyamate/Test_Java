public class Main2 {
    public static void main(String[] args) {
            System.out.println("1~10の整数を入力してください。");
            int number = new java.util.Scanner(System.in).nextInt();


        switch (number) {
            case 1:
                System.out.println("もっとがんばりましょう");
                break;
            case 2:
                System.out.println("もう少し頑張りましょう");
                break;
            case 3:
                System.out.println("さらに上を目指しましょう");
                break;
            case 4:
                System.out.println("大変よくできました");
                break;
            case 5:
                System.out.println("大変優秀です");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("あきらめたらそこで試合終了ですよ");
                break;
        }
    }
}
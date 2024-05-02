public class MyClass{
    public void sameName(){
        System.out.println("引数を持たないsameNameメソッドです");
    }

    public void sameName(int num1){
        System.out.println("引数1つのsameNameメソッド" + num1);
    }

    public void sameName(int num1, int num2){
        System.out.println("引数2つのsameNameメソッド"+ num1 + ", " + num2);
    }

    public void sameName(String str) {
        System.out.println("String引数1つのsameNameメソッド: " + str);
    }

    public void sameName(String str1, String str2) {
        System.out.println("String引数2つのsameNameメソッド: " + str1 + ", " + str2);
    }
}

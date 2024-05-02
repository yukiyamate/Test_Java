import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("チーム24のメンバーを紹介します。");

        ArrayList<String> names = new ArrayList<String>();

        names.add("橘高壱号");
        names.add("橘高弐号");
        names.add("橘高参号");

        Iterator<String> it = names.iterator();

        for(String s: names){
            System.out.println(s);
        }
    }
}

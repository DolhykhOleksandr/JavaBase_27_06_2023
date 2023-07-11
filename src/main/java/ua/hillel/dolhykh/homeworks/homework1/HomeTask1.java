package ua.hillel.dolhykh.homeworks.homework1;

public class HomeTask1 {

    public static void main(String[] args) {


        String s = "asdf";
        char[] chars = s.toCharArray();
        chars[2] = 'Q';
        String result = new String(chars);

        System.out.println(result); 


    }
}



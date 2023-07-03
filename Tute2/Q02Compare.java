package Tute2;

public class Q02Compare {

    public static void main(String[] args) {

        int a = 2, b = 3, c = 4, d = 5;
        float k = 4.3f;

        int res1 = --b * a + c * d--;
        System.out.println("--b * a +c * d-- : " + res1);
        System.out.println("a++: " + a++);
        System.out.println("–2 * ( g – k ) +c: "+(-2 * ( d - k ) +c));
        System.out.println("c=c++ : " + c++);
        System.out.println("c=++c*a++ :" + ++c * a++);
    }
}

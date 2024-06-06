package Polymorphism;

public class Test3 {
    public static void main(String[] args) {

        Shape[] s = new  Shape[3];

        s[0] = new Shape();
        s[1] = new Rectangle(10, 20);
        s[2] = new Triangle(10, 20);


        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());

    }
}

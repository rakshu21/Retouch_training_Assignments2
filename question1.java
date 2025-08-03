package assignments2;

public class question1 {
    public static void main(String[] args) {
        int a=20 , b=10;
        int addition=a+b;
        int substraction=a-b;
        int multiplication=a*b;
        int division=a/b;
        boolean isGreater=a>b;
        boolean Logical_check=(a>b)&&(b>0);

        System.out.println("Addition: " + addition);
        System.out.println("substraction: " + substraction);
        System.out.println("multiplication :" + multiplication);
        System.out.println("division :" + division);

        System.out.println("Is a greater than b? " + isGreater);

        System.out.println("Is a>b and b>0? " + Logical_check);

    }
}

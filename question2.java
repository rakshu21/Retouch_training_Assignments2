package assignments2;

public class question2 {
    public static void main(String[] args) {
        int a=9 ; double b=4.0;
        double k =(double) a+b;

        double division=(a/b);
        boolean result = a > (int)b;
        boolean res1= (a%3==0) && (b>2.5);

        System.out.println("sum(a+b) :" + k );
        System.out.println("Division(a/b) :" + division);
        System.out.println("Is a>(int)b? "+ result);
        System.out.println("Is a divisible by 3 and b>2.5? "+ res1);


    }
}

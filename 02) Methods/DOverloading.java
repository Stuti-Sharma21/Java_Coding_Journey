public class DOverloading{
    // method overloading ->multiple methods can have the same name with different parameters.
    /*for overloading certain rules are their to achive overloading one of these conditions should be true:
    1) Number of paramenter should be different : eg( Sum(int a,int b) and Sum(int a, int b, int c))
    2) Changing datatype of parameters : eg( area(int a) and area(double radius))
    3) Changing order/Sequence of paramenters : eg info(String name,int a) and info(int a,String name)  */

    static int area(int a){
        return a*a;
    }
    static double area(double r){
        return 3.14*r*r;
    }
    static int area(int a,int b){
        return a*b;
    }
    static double area(double b,double h){
        return (1/2)*b*h;
    }
    public static void main(String[] args){
        System.out.println(area(5));
        System.out.println(area(5.0));
        System.out.println(area(4,7));
        System.out.println(area(5.0,7.0));

    }
}
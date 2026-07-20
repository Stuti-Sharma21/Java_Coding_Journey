public class CReturnType{
    // return type integer
    static int totalmarks(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    // return type string
    static String fullname(String name){
        String Surname="Sharma";
        return name+" "+Surname;
    }

    // return type boolean
    static boolean iftrue(int a){
        return a % 2 == 0;
    }
    public static void main(String[] args){
        System.out.println(totalmarks(6,7,8));
        System.out.println(iftrue(6));
        System.out.println(fullname("Stuti"));
    }
}
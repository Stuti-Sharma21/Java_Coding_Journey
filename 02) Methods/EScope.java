public class EScope{

    // Static (class) variable -> accessible from all methods of this class.
    static int a=10;

    public static void main(String[] args){
        System.out.println(a);

        // Changing the value of the static variable.
        a=6;
        System.out.println(a);

        // y is a local variable we can only access it inside main
        int y=a+5;
        System.out.println(y);

        // loop variable -> can only be accessed inside that loop nowhere outside
        for(int i=0;i<3;i++){
            System.out.println("hello");
        }

        //System.out.println(z); Error: z cannot be used before it is declared.
        int z=10;
        System.out.println(z);
    }
}
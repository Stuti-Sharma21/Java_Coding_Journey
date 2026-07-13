public class EOperators{
    public static void main(String[] args){
        // Arithmetic operators -> are used to perform common mathematical operations
        int x=9;
        int y=18;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        // Assignment operator -> are used to assign values to variables.        int x = 10;
        x += 5;
        System.out.println(x+=2);
        System.out.println(x-=2);
        System.out.println(x*=2);
        System.out.println(x/=2);
        System.out.println(x%=2);
        System.out.println(x&=2);
        System.out.println(x^=2);
        System.out.println(x<<=2);
        System.out.println(x>>=2);

        // Comparison operator -> are used to compare two values (or variables)
        z=2;
        System.out.println(z==2);
        System.out.println(z!=2);
        System.out.println(z<2);
        System.out.println(z>2);
        System.out.println(z<=2);
        System.out.println(z>=2);

        //Logical operator -> are used to determine the logic between variables or values, by combining multiple conditions
        int a=5;int b=7;
        System.out.println(a>10 && b<9 );
        System.out.println(a==5 || b==9);
        System.out.println(!(a==5 || b==9));

        //operator preecedence -> When a calculation contains more than one operator, Java follows order of operations rules to decide which part to calculate first.
        /*
        () - Parentheses       ->highest
        *, /, % - Multiplication, Division, Modulus
        +, - - Addition, Subtraction
        >, <, >=, <= - Comparison
        ==, != - Equality
        && - Logical AND
        || - Logical OR
        = - Assignment*/        ->lower


    }
}
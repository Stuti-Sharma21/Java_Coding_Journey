public class AMethodCode{
    // methods -> A method is a reusable block of code that performs a specific task. It executes only when it is called.
        static void toprint(){
            // static -> means the method belongs to the class.It can be called without creating an object.
            // void -> return type(its void because nothing is returned) ( it can be int String bool anything)
            // toprint -> name of method we can use any name for method

            System.out.println("Hello");
        }
    public static void main(String[] args){
        // parameters -> Parameters are variables declared in the method definition.(static void greet(String name))
        // arguments -> they are passed during function call(greet("Stuti");)
        toprint();  // to call fn
        toprint();
        toprint();// we can run it multiple times
    }
}
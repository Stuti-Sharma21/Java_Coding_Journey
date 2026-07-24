public class CconstructerAndKeywords{
    public static void main(String[] args){
        first obj=new first();
        System.out.println(obj.x);

        second ob=new second(6);// we pass arguments while creating object
        System.out.println(ob.a);
    }
}
class first{ 
    // default constructer -> Takes no parameters and sets initial safe default values. 
    // If you do not define any constructor, the compiler automatically provides one.
    int x;
    first(){
        //a special method that is used to initialize objects.
        //a constructed is called when an obejct is created
        //if not manually initialize a constructer is automatically created
        x=15;
    }
}
class second{
    // parameterized constructor -> Accepts arguments, allowing you to pass specific values 
    // to initialize an object with custom data at creation time

    int a;
    second(int a){
        this.a=a;
    }
    // The 'this' keyword refers to the current object of a class.
    // It is mainly used to avoid confusion between instance variables
    // and method or constructor parameters with the same name.
}
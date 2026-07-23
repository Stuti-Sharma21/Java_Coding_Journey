public class ABasicClassAndObject{
    // oops-> OOP stands for Object-Oriented Programming.
    // its about creating objects that contain both data and methods.

    int x=9;

    /* class -> is a blueprint for objects.
       object -> is an instance of a class.
                 Objects contain both data (variables) and behavior (methods).

    When an object is created, it can access the variables and methods of its class.
     */

    public static void main(String[] args){
        ABasicClassAndObject myobj= new ABasicClassAndObject();
        /* Creating an object:
         1. Write the class name.
         2. Give the object a name.
         3. Use the 'new' keyword.
         4. Call the constructor.
        */
        System.out.println(myobj.x);

        // we can create multiple objects of a class
        ABasicClassAndObject myobj2=new ABasicClassAndObject();
        System.out.println(myobj2.x);

        hello ob=new hello();
        ob.printll();

    }
}
    // we can create multiple classes but only one public class
class hello{
    // we can also access obejct of one class in another
    ABasicClassAndObject obj=new ABasicClassAndObject();
    void printll(){
        System.out.println(obj.x);
        }
    }
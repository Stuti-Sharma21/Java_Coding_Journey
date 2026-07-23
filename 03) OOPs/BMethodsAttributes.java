public class BMethodsAttributes{
    public static void main(String[] args){
        value obj=new value();
        // we access attributes by creating an object of the class, and by using the dot syntax (.):
        System.out.println(obj.x);

        // value of attribut can be changed
        obj.x=70;
        System.out.println(obj.x);

        System.out.println(obj.y);
        //obj.y=90; error: cannot assign a value to final variable y


        // to access methods we create obejct and call it using (.) operator.
        obj.valuetype();

    }
}
class value{
    // attributes -> variables inside class are attributes (also called fields or instance variables)
    int x=5;
    final int y=7; // final keyword fixes the value so it could not be changed after initilization
    
    // methods -> functions declared within a class, and that they are used to perform certain actions
    void valuetype(){
        System.out.println("vaue is positive");
    }

}
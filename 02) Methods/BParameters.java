public class BParameters{
    static void printname(String name){
        System.out.println("Hi My Name Is "+name);
    }
    public static void main(String[] args){
        printname("Stuti Sharma");
        NameAge("Saiyam Kumar",20);
    }

    // we can have multiple parameters
    static void NameAge(String name,int age){
        System.out.println("Hi my name is "+ name +"and my age is "+ age);
    }
}
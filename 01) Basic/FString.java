public class FString{
    public static void main(String[] args){
        // strings are non primitive data types and are object in java so it contains methods
        String name="Stuti Sharma";
        String name1="Saiyam Kumar";

        System.out.println(name.length());

        System.out.println(name1.toUpperCase());
        System.out.println(name.toLowerCase());

        // indexOf -> to locate starting index of first occurance substring in string
        System.out.println(name1.indexOf("Kumar"));

        // charAt -> to access char at specific index
        System.out.println(name.charAt(8));

        System.out.println(name.equals(name1));
      
        // trim -> to remove white spaces form front and back
        System.out.println(name.trim());

        // concatinate string
        System.out.println(name + name1);
        System.out.println(name.concat(name1));
        System.out.println(name +" "+ name1);

        // addition
        int x=9;
        String y="a";
        System.out.println(x+y) ;
        

    }
}
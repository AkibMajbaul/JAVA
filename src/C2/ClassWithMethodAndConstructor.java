package C2;

public class ClassWithMethodAndConstructor extends JavaVariables {
    int number = 50;
    //Constructor
    public  ClassWithMethodAndConstructor(){

    }

    //Method
    public void printSomething(){
        System.out.println("Hello World");
    }
   public static void main(String[] args) {
     ClassWithMethodAndConstructor Abcd=  new ClassWithMethodAndConstructor();
       System.out.println(Abcd);
       Abcd.printSomething();
   }

}

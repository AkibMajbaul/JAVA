package C3;

public class Method {
    protected Method() {
    }



 public void printSomething(){
     System.out.println(" Hello World");

 }

 public String getName(){
    String name= " Majbaul Hossain Bhuiyan Akib";

     return name;
 }

 public void printSum(int a, int b){
    int c;
    c=a+b;
    System.out.println(c);
     }

public static void main(String[] args) {
    Method Test = new Method();
    Test.printSomething();
    System.out.println(Test.getName());

}
 }
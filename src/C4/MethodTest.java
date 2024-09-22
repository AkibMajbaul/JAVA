package C4;

public class MethodTest {
    public void printNumber(){
        int number = 200;
        System.out.println("Print Number:" + number);
    }
    void printString(String str){
        System.out.println("Print String" + str);
    }

    protected String getName(){
        return "Md Majbaul Hossain Bhuiyan";
    }

    private int getNumber(int number1, int number2){
        int number;
        number = number1 + number2;

        return number;
    }

    public static void main(String[] args) {
        MethodTest test = new MethodTest();
        test.printNumber();
        test.printString("Akib Majbaul Hossain Bhuiyan");


    }
}


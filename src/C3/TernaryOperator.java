package C3;

public class TernaryOperator {
    public static void main(String[] args) {
        int number1= 50, number2= 30, number;
        number= number1<number2 ? number2 : number1;
        System.out.println(number);

        number= number1>number2 ? number2 : number1;
        System.out.println(number);
    }
}

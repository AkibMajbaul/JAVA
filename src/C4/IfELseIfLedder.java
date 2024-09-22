package C4;

public class IfELseIfLedder {
    public static void main(String[] args) {
        int number = 88;
        if(number>=80 && number<=100) {
            System.out.println("Grade A+");
        } else if (number<70 && number>=79) {
            System.out.println("Grade A");
        }else if (number>=60 && number<=69) {
            System.out.println("Grade A-");
        } else if (number>=50 && number<=59) {
            System.out.println("Grade B");
        }else if (number>=40 && number<=49) {
            System.out.println("Grade C");
        }else if (number>=30 && number<=39) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade Fail");
        }
System.out.println("This System is Generate By MD MAJBAUL HOSSAIN BHUIYAN ");
    }
}

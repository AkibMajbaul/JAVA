package C5;

public class Loop {
    public static void main(String[] args) {
        int i = 0;
        for (;i < 10; i++) {
            System.out.println(i);
        }


//      for (int j = 0;j < 10; j--) {
//        System.out.println(j);
//      }

        for (int z = 10;z >= 10; z-=2) {
            System.out.println(z);
        }


        String[] strs ={ "Akib", "Majbaul"};
        for(String str : strs) {
            System.out.println(str);
        }

        int[] Numaric = {1,2,3,4,5,6,7,8,9};
        for (int Num : Numaric) {
            System.out.println(Num);
        }

        int a=0;
                while(a<20){
                    System.out.println("ABC" + a);
                    a+= 6;
                }

        int b=0;
       do{
            System.out.println("ABC" + b);
            b+= 6;
        } while(b<20);
    }
}

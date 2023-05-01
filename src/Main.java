public class Main {

    /* public static void main(String[] args) {

           int x1 = 20_000;
           int x2 = 20;
           System.out.println(x1 / x2);
       }
   } */
    public static void main(String[] args) {
        int cost = 20_000;
        int bonuses = 20;

        int miles = cost / bonuses;
         
        System.out.println("Total bonus miles:" + miles);
    }
}

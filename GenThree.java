public class GenThree {
    public static void main(String[] args) {
       
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
      //  double range = (b-a) + 1
// 
        System.out.println(int rand1 = (int) (Math.random() * (b - a)) + a);
        System.out.println(int rand2 = (int) (Math.random() * (b - a)) + a);
        System.out.println(int rand3 = (int) (Math.random() * (b - a)) + a);
        
        int min = Math.min(rand1, Math.min(rand2, rand3));

        System.out.println("The minimal generated number was " + min);
    }
}

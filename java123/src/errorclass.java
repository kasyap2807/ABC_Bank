import java.util.Scanner;

public class errorclass{
   public static void main(String[] args) throws IndexOutOfBoundsException{
//       int[] array = new int[3];
//       try{
//           array[0] = 1;
//           array[1] = 1;
//           array[2] = 1;
//           array[3] = 1;
//       }
//       catch (IndexOutOfBoundsException wrong){
//           System.out.println("Element Overloaded into error");
//       }
//       finally {
//           System.out.println("Hello");
//           System.out.println(array[2]);
//       }

       int[] array = new int[3];
       Scanner sc = new Scanner(System.in);

       for(int i = 0 ; i < 4 ; i++){
           if(i<=2){
               System.out.println("Enter Value For "+i);
               array[i] = sc.nextInt();
           }
           else {
               throw new IndexOutOfBoundsException("Your Index is out of Bound");
           }

       }
       System.out.println("Its nope");

   }
}

public class HundredthPrime {
   public static void main(String[] args) {
      int count = 0;
      int number = 2;
      int hundredthPrime = 0;

      while (count < 100) {
         if (isPrime(number)) {
            count++;
            hundredthPrime = number;
         }
         number++;
      }

      System.out.println(hundredthPrime);
   }

   // Method to check if a number is prime
   public static boolean isPrime(int num) {
      if (num <= 1) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }
}

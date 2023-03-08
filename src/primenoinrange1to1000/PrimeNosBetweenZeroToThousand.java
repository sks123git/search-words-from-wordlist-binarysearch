package primenoinrange1to1000;

// Program to print prime numbers from range 1-1000
public class PrimeNosBetweenZeroToThousand {
    public void printPrimeNumbers(){
        for (int j = 2; j <= 1000 ; j++) {
            int i=2;
            boolean flag =false;
            while (i<j) {
                if (j % i == 0) {
                    flag=true;
                    break;
                }
                ++i;
            }
            if (!flag){
                System.out.print(j+", ");
            }
        }
    }
    public static void main(String[] args) {
        PrimeNosBetweenZeroToThousand printPrime = new PrimeNosBetweenZeroToThousand();
        int i=1;
        int j = i++ + ++i + ++i - --i;
        System.out.println(j);
        printPrime.printPrimeNumbers();
    }
}


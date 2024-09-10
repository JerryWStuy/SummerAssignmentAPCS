public class Tester
{
	public static boolean isPrime(int x){
		boolean prime = true;
		for (int i = 2; i < x; i++) {
			if (x%i == 0){
				prime = false;
			}
		}
		return prime;
	}
	public static int nthPrime(int n){
		int number = 2;
		int current = 0;
		while (current<n) {
			if (isPrime(number)){
			current +=1;
			number +=1;}
			else {
			number +=1;}
		}
		return (number - 1);
	} 
    public static void main(String[] args){
		int[] numbers = {1,2,3,4,5};
		int[] expectedPrimes = {2,3,5,7,11};
		for (int i = 0; i < numbers.length; i++) {
			if (nthPrime(numbers[i]) == expectedPrimes[i]){
				System.out.println("Pass!");
			}
			else {
				System.out.println("Fail, expected " + expectedPrimes[i] + ", but value returned was " + nthPrime(numbers[i]) + ".");
			}
		}
    }
}
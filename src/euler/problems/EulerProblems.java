/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.problems;

/**
 *
 * @author Jen
 * 
 * The functions in this project are my answers to the problems on
 * ProjectEuler.net, starting from problem #1
 * 
 */
public class EulerProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EulerProblems ep = new EulerProblems();
        //int result = ep.smallestMultiple();
        long result = ep.oneThousandAndOnethPrime();
        System.out.print(result);
    }
    
    // Problem #1
    public int multiplesOf3And5() {
        int sum = 0;
        
        for (int i = 1; i <= 1000; i ++){
            if (i % 3 == 0 | i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    // Problem #2
    public int evenFibNumbers(){
        int sum = 0;
        int i = 1; // this counter keeps track of the current fib number
        int fib; // this holds the value of the result of the fib function
        
        fib = fibonacci(i);
        while (fib < 4000000){
            if (fib % 2 == 0){
                sum += fib;
            }
            i ++;
            fib = fibonacci(i);
        }
        return sum;
    }
    
    public int fibonacci(int n){
        
        if (n <= 2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    // Problem #3
    public long largestPrimeFactor(){
        long num = 600851475143L;
        long sqrt = (long)Math.sqrt(num);
        long largePrime = 1; // keeps track of largest prime
        boolean isPrime;
        
        for (long i = 3; i < sqrt; i+=2){
            isPrime = checkPrime(i);
            
            if (isPrime){
                if (num % i == 0)
                    largePrime = i;
            }
        }
        return largePrime;
    }
    
    public boolean checkPrime(long n){
        for (long i = 3; i <= n; i+=2){
            if (n%i == 0 && (i != 1 && i != n)){
                return false;
            }
        }
        return true;
    }
    
    // Problem #4
    public int largestPalindromeProduct(){
        int product = 0;
        boolean check;
        for (int i = 1; i <=999; i ++){
            for (int j = 1; j <= 999; j ++){
                check = checkPalindrome(i*j);
                
                if (check){
                    if (i*j > product){
                        product = i*j;
                    }
                }
            }
        }
        return product;
    }
    
    public boolean checkPalindrome(int n){
        int reverse = 0;
        int digit;
        int m = n; // temp m variable to keep track of current digit
        
        while(m != 0){
            digit = m % 10;
            reverse = reverse * 10 + digit;
            m = m/10;
        }
        
        if (reverse == n){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Problem #5
    public int smallestMultiple(){
        int multiple = 20; // just set to highest multiplier
        int numMultiples = 0;
        
        while (true){
            for (int i = 1; i <= 20; i ++){
                if (multiple%i == 0){
                    numMultiples ++;
                }
            }
            if (numMultiples == 20){
                return multiple;
            }
            multiple ++;
            numMultiples = 0;
        }
    }
    
    //Problem #6
    public long sumSquareDifferent(){
        long sumSquare = 0;
        long squareSum = 0;
        
        for (int i = 1; i <= 100; i ++){
            sumSquare += Math.pow(i, 2);
            squareSum += i;
        }
        squareSum = (long)Math.pow(squareSum, 2);
        return squareSum - sumSquare;
    }
    
    // Problem #7
    public long oneThousandAndOnethPrime(){
        int count = 0;
        int num = 1;
        
        while (count <= 10001){
            if (checkPrime(num) == true){
                count ++;
            }
            num ++;
        }
        return num;
    }
    
    // Problem #8
    public long largestProductInASeries(){
        String series = "73167176531330624919225119674426574742355349194934";
        series += "96983520312774506326239578318016984801869478851843";
        series += "85861560789112949495459501737958331952853208805511";
        series += "12540698747158523863050715693290963295227443043557";
        series += "66896648950445244523161731856403098711121722383113";
        series += "62229893423380308135336276614282806444486645238749";
        series += "30358907296290491560440772390713810515859307960866";
        series += "70172427121883998797908792274921901699720888093776";
        series += "65727333001053367881220235421809751254540594752243";
        series += "52584907711670556013604839586446706324415722155397";
        series += "53697817977846174064955149290862569321978468622482";
        series += "83972241375657056057490261407972968652414535100474";
        series += "82166370484403199890008895243450658541227588666881";
        series += "16427171479924442928230863465674813919123162824586";
        series += "17866458359124566529476545682848912883142607690042";
        series += "24219022671055626321111109370544217506941658960408";
        series += "07198403850962455444362981230987879927244284909188";
        series += "84580156166097919133875499200524063689912560717606";
        series += "05886116467109405077541002256983155200055935729725";
        series += "71636269561882670428252483600823257530420752963450";
        
        long product;
        String current = series
        
        return product;
    }
}

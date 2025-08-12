public class Palindrome {

    public static void main (String[]args){
        Palindrome p= new Palindrome();
        long j=p.reverseBits(8976);
        System.out.println(j);
    }

    public long reverseBits(long n) {
            // Write your code here
            long curr = n ;
            long reverse = 0;
            while(n>0){
                long digit = curr % 10;
                reverse= reverse*10 + digit;
                n = n/10;
            }
            return reverse;
        }
    }

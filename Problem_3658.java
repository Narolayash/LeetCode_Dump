public class Problem_3658 {
        public int gcd(int a, int b) {
            if (a % b == 0) return b;
            return gcd(b, a % b);
        }

        public int gcdOfOddEvenSums(int n) {
            int sumOdd = n * n;
            int sumEven = n * (n + 1);
            return gcd(sumOdd, sumEven);
        }


//    Approach 2: Mathematics Intuition
//    Observe that gcd(n^2,n(n+1))=n×gcd(n,n+1)
//    Since two consecutive integers are always coprime, gcd(n,n+1)=1
//    Therefore, gcd(n^2,n(n+1))=n
//    which is exactly the required answer.



//    public int gcdOfOddEvenSums(int n) {
//        return n;
//    }



/*
    We want to understand why
    gcd(n^2, n(n+1))=n×gcd(n,n+1)
    Step 1: Factor out the common n

    Notice both numbers contain a factor of n.

    n^2 = n×n
    n(n+1)=n×(n+1)

    There is a useful property of GCD:

    gcd(ax,ay)=a×gcd(x,y)
    because every common divisor of ax and ay contains the common factor a.

    Here,
    a=n
    x=n
    y=n+1

    So, gcd(n^2, n(n+1))=gcd(n⋅n,n⋅(n+1))=n⋅gcd(n,n+1)
    This is exactly the given identity.

    Step 2: What is gcd(n,n+1)?
    Consecutive integers are always coprime.

    For example:

    gcd(5,6)=1
    gcd(10,11)=1
    gcd(100,101)=1

    So, gcd(n,n+1)=1

    Therefore, gcd(n^2, n(n+1))=n×1=n
*/
}

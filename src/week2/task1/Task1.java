package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        if(a==b)
        	return a;
        else if( a>b)
        	return gcd(a-b,b);
        else
        	return gcd(a,b-a);
    }

    public static int fibonacci(int n) {
    	if(n==0)
    		return 0;
    	else if(n == 1)
    		return 1;
    	else
    		return fibonacci(i-1)+fibonacci(i-2);
    }
}

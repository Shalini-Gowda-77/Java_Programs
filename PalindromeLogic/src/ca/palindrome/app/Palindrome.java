package ca.palindrome.app;

public class Palindrome {
    public static void main(String args[])
    {
        int r,sum=0,temp;
        int n=675;

        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)

            System.out.println("palindrome number");
            else
            System.out.println("Not a palindrome number");

    }

}

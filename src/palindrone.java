public class palindrone {
    public static void checkPalindrome(String s)
    {
        // reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();

        // check whether the string is palindrome or not
        if (s.equals(reverse))
            System.out.println("Yes");

        else
            System.out.println("No");
    }

    static void palindrome(int arr[], int n)
    {
        // Initialise flag to zero.
        int flag = 0;

        // Loop till array size n/2.
        for (int i = 0; i <= n / 2 && n != 0; i++) {

            // Check if first and last element are different
            // Then set flag to 1.
            if (arr[i] != arr[n - i - 1]) {
                flag = 1;
                break;
            }
        }

        // If flag is set then print Not Palindrome
        // else print Palindrome.
        if (flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }






    public static void main (String[] args)
            throws java.lang.Exception
    {
        checkPalindrome("malayalam");
        checkPalindrome("GeeksforGeeks");
        checkPalindrome("Sam");
        checkPalindrome("bob");


//        int arr[] = { 1, 2, 4, 5, 2, 1 };
        int arr[] = { 1, 2, 3, 2, 1 };
        int n = arr.length;
        palindrome(arr, n);


    }

}




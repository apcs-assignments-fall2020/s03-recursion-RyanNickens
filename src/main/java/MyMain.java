public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        // YOUR CODE HERE
        //getting the last digit
        int total = x % 10;
        if(x == 0){
            return 0;
        }

        else{
            //removing last digit for next run through
             return total + addDigits(x / 10);
        }
        //return -1;
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        // YOUR CODE HERE
        int end = str.length()-1; 
        //if first and last chracters are equal, return it without them
        if(str.charAt(0) == str.charAt(end)) {
            //returns substring with first and last letters gone so it can do it again
            return isPalindrome(str.substring(1, end-1));
        }
        //other cases
        if(str.length() == 0) {
            return true;
        }
        if (str.length() == 1) {
            return true;
        }
        else {
            return false;
        }    
        
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        // YOUR CODE HERE
        int end = str.length();
        if (null == str) {
            return str;
        }
        if (end <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
        
    }

    public static void main(String[] args) {
        // You can test your code here
        System.out.println(isPalindrome("racecar"));
        System.out.println(reverse("racecar"));
        System.out.println(addDigits(999));
    }
}

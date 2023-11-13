public class StringBuilderEx {
    public boolean isPalindrome(int x) {
        String a = ""+x ;
        StringBuilder sc = new StringBuilder();
        sc.append(a);
        sc.reverse();
        String rev=sc.toString();
        return a.equals(rev);
    }
}

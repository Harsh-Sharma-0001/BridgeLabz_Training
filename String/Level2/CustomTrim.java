package String.Level2;
import java.util.*;

class CustomTrim {
    // Method to trim spaces using charAt
    static int[] findStartEnd(String text) {
        int start=0, end=text.length()-1;
        while(start<=end && text.charAt(start)==' ') start++;
        while(end>=start && text.charAt(end)==' ') end--;
        return new int[]{start,end};
    }

    // Substring method using charAt
    static String substring(String text, int start, int end) {
        String res="";
        for(int i=start; i<=end; i++) {
            res += text.charAt(i);
        }
        return res;
    }

    // Compare strings
    static boolean compare(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String input=sc.nextLine();
        
        int[] pos=findStartEnd(input);
        String trimmed=substring(input,pos[0],pos[1]);
        String builtin=input.trim();
        
        System.out.println("Custom Trimmed: "+trimmed);
        System.out.println("Built-in Trimmed: "+builtin);
        System.out.println("Match? "+compare(trimmed,builtin));
    }
}

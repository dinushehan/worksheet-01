import java.util.Scanner;
import java.util.StringTokenizer;


public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter your full name (first, middle, last):");
        Scanner input=new Scanner(System.in);
        String full=input.nextLine();
        String names[]= new String[3];
        int i=0;
        StringTokenizer st= new StringTokenizer(full, " ");
        while(st.hasMoreTokens()){
            names[i]=st.nextToken();
            i++;
        }
        String first=names[0];
        String middle=names[1];
        String last=names[2];
        System.out.print(last+", "+first+" "+middle.charAt(0)+".");
    }

}

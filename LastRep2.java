/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.

You may assume that n is between 0 and the length of the string, inclusive.

Example1)

i/p:Hello,3

o/p:llollollo*/

import java.util.Scanner;
public class LastRep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "", s2 ="", s3 ="";
		int n,i;
		for(i=0; i<s.length();i++) {
			if(s.charAt(i)==',') {
				break;
			}
			else {
				s1 = s1 + s.charAt(i);
			}
		}
		i++;
		for(;i<s.length();i++) {
			s2 = s2+ s.charAt(i);
		}
		
		n = Integer.parseInt(s2);
		int m = n;
		while(m>0) { 
		for(int j=s1.length()-n;j<s1.length();j++) {
			
			s3 = s3  + s1.charAt(j);
			
		}
		m--;
		}
		System.out.println(s3);
		
	}

}

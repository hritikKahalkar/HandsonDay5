/*Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.

Any characters left, will go to the end of the result.

Example1)

i/p:Hello,World

o/p:HWeolrllod*/

import java.util.Scanner;
public class Combine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "", s2 ="", s3 ="";
		int i;
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
		
		for(int j=0;j<s1.length();j++) {
	
		s3 = s3 + s1.charAt(j) + s2.charAt(j);

		}
		System.out.println(s3);
	}

}

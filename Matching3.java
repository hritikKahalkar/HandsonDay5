/*Given two strings a and b, return a new string, following the rules given below.

If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.

Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.

Example1)

i/p:abcXY123XYijk,XY

o/p:c13i

Example2)

i/p:XY123XY,XY

o/p:13

Example3)

i/p:XY1XY,XY

o/p:11
*/

import java.util.Scanner;
public class Matching3 {

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
		
	}
}
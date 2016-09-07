import java.util.*;
class vowel
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
String s1=s.next();
char s2[]=s1.toCharArray();
for(int i=0;i<s1.length();i++)
if(s2[i]=='a' || s2[i]=='e'|| s2[i]=='i'|| s2[i]=='o'|| s2[i]=='u')
System.out.println(s2[i]+" "+"it is vowel");
else
System.out.println(s2[i]+" "+"it is consonant");
}
}
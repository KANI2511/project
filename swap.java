import java.util.*;
class swap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
char s2[]=s1.toCharArray();
char temp;
for(int i=0;i<s1.length();i++)
{
if(i%2==0)
{
temp= s2[i];
s2[i]=s2[i+1];3:38 PM 9/8/2016
s2[i+1]=temp;
}
}
for(int i=0;i<s1.length();i++)
{
System.out.print(s2[i]);
}
}
}
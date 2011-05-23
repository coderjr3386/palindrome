import java.io.*;
import java.util.*;
import java.net.*;
public class palindrom {
String input;
public palindrom(String ip){
	this.input=ip;
}
public void findPalindrome()
{
	  int head,tail;
	  int lar_head=-1,lar_tail=-1;
	  String largest = "";
	  int j, k,l;
	  System.out.println("input entered = "+this.input);
	  //for each char loop through the rest of the string from back to find the same matching char
	  for(int i = 0; i < this.input.length(); ++i)
	    {
		 j=this.input.length()-1;
		 while(this.input.charAt(j)!=this.input.charAt(i)&&j>i)
		 {
			 j--;
		 }
		 //if found check if the substring within it is a palindrom
		 if(j>i)
		 {
			 head=i;
			 tail=j;
			 for(k=i+1,l=j-1;k<j;k++,l--)
			 { //System.out.println("coming here");
			// System.out.println(this.input.charAt(k)+" "+this.input.charAt(l));
				 if(this.input.charAt(k)!=this.input.charAt(l))
				 {
					// System.out.println("breaking");
					 break;
				 }
			 }
			 if(k>=j)
			 {
				 //save only the pointers of the largest palindrome
				 if(lar_head==-1)
				 {
					 lar_head=head;
					 lar_tail=tail;
				 }
				 else if((tail-head)>=(lar_tail-lar_head))
				 {
					 lar_head=head;
					 lar_tail=tail;
				 }
				
			 }
		 }
		 
	    }
	  if(lar_head!=-1)
	  System.out.println("Largest palindrom string is ="+this.input.substring(lar_head, lar_tail+1));
	  else
		  System.out.println("The string does not have a palindrome");
}

public static void main(String args[])
{ 
	String ip="";
	System.out.println("enter input string");
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(input);
	try
	{

	 ip = reader.readLine();

	}
	catch(Exception e){}
	palindrom p=new palindrom(ip);
	p.findPalindrome();
}
}

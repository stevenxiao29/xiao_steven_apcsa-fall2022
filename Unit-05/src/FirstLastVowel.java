//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   int strLen = a.length();
	   
	   if (a.charAt(0)== 'A' || a.charAt(0)== 'E' || a.charAt(0)== 'I' || a.charAt(0)== 'O' || a.charAt(0)== 'U' || a.charAt(0)== 'a' || a.charAt(0)== 'e' || a.charAt(0)== 'i' || a.charAt(0)== 'o' || a.charAt(0)== 'u' ) 
	   {
		   return "yes";
	   }
	   else if(a.charAt(strLen-1)== 'A' || a.charAt(strLen-1)== 'E' || a.charAt(strLen-1)== 'I' || a.charAt(strLen-1)== 'O' || a.charAt(strLen-1)== 'U' || a.charAt(strLen-1)== 'a' || a.charAt(strLen-1)== 'e' || a.charAt(strLen-1)== 'i' || a.charAt(strLen-1)== 'o' || a.charAt(strLen-1)== 'u'  ){
		   return "yes";
	   }
	   else
	   {
		   return "no";
	   }
	}
}
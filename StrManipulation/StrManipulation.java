import java.util.*;
    import java.util.Scanner;
    class StrManipulation
    {
    public static void main(String[]args)
    {
    System.out.print("--------CREATE NEW STRING USING NEW---------");
    char chs[]={'w','e','l','c','o','m','e'};
    String newstr=new String(chs);
    System.out.print("\n\nNew String from char[] using new :"+newstr);
    byte asciis[]={65,66,67,68,69,70};
    String newstr2=new String(asciis);
    System.out.print("\n\nNew string of corresponding ascii value from asciis[] using new :"+newstr2);
    String s1="good";
    String s2="MORNING";
    
    System.out.print("\n\nstring 1 :"+s1);
    System.out.print("\nstring 2 :"+s2);
    System.out.print("\nlength of string 'good' :"+s1.length());
    System.out.print("\n"+s1+" to uppercase :"+s1.toUpperCase());
    System.out.print("\n"+s2+" to lowercase :"+s2.toLowerCase());
    
    
    System.out.print("\n\n\n--------CONCATENATION---------");
    System.out.print("\n\nusing concat()		        	: "+s1.concat(" "+s2));
    System.out.print("\nusing '+' operator			: "+s1+" "+s2);
        
    
    System.out.print("\n\n------CHARACTER EXTRACTION-----");
    System.out.print("\n\ncharacter at 3rd position		: "+s1.charAt(3));
    char c[]=new char[50];
    s1.getChars(2,4,c,0);
    System.out.print("\ncharacter between 2 and 4		: "+new String(c));
       
    
    System.out.print("\n\n-----CHARACTER COMPARISON------");
    String x="welcome";
    String y="WELCOME";
    System.out.print("\n\nstring 1 :"+x);
    System.out.print("\nstring 2 :"+y);
    System.out.print("\n"+x+" equals "+y+"			: "+x.equals(y));
    System.out.print("\n"+x+" equals IgnoreCase "+y+"	: "+x.equalsIgnoreCase(y));
    System.out.print("\n"+x+" compare to "+y+"		: "+x.compareTo(y));
    System.out.print("\n"+x+" starts with w			: "+x.startsWith("w"));
       
    
    System.out.print("\n\n-----SEARCH SUBSTRINGS----");
    String z="have a nice day";
    System.out.print("\n\nstring	        		        : "+z);
    System.out.print("\nindex of 'nice' word			: "+z.indexOf("nice"));
    System.out.print("\nsubstring			        : "+z.substring(7));
    
    
    System.out.print("\n\n------STRING MODIFICATION-----");
    System.out.print("\n\nreplace 'nice' to 'good'	        : "+z.replace("nice","good"));
    
    
    System.out.print("\n\n------USING VALUE OF------");
    float n=35.87f;
    System.out.print(+n+" is converted to string "+String.valueOf(n));
    }
    }

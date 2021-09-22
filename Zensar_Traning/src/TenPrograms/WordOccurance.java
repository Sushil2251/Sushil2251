package TenPrograms;

import java.util.Scanner;

class WordOccurance {
  
static int countOccurrences(String str, String word) 
{
    String a[] = str.split(" ");
  
    int count = 0;
    for (int i = 0; i < a.length; i++) 
    {
    if (word.equals(a[i]))
        count++;
    }
  
    return count;
}
  
public static void main(String args[]) 
{
	Scanner s = new Scanner(System.in);
  System.out.print("Enter Sentence\n");
    String str = s.nextLine();
    System.out.println("Search Word ");
    String word = s.nextLine();
    System.out.println("Occurance Words");
//String word = "Zensar";
  //String str = "Zensar Traning";
 // String word = "Zensar";
System.out.println(countOccurrences(str, word));
}
}


//2.	Accept a String from the user and show occurance of a particular word. 
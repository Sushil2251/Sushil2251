package XobinQuestions;
import java.util.Scanner;
public class Main {
	public String countEvents (String inpstr)
	{
		String result="";
		
		return result;
	}
	public static String doubleChar(String str)
	{
		String val = "";
		for (int i=0; i<str.length();i++)
		{
			val += str.substring(i,i+1)+str.substring(i,i+1);
		}
		return val;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inpstr = sc.nextLine();
		String output = doubleChar(inpstr);
		System.out.println(output);
	}
}

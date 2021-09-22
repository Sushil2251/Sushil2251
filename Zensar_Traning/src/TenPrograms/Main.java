package TenPrograms;

import java.io.BufferedReader;

import java.io.InputStreamReader;

class Main 
{
public static void main(String args[]) throws Exception 
{ 
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); 
String input_from_question = br.readLine();

if (input_from_question != null && !input_from_question.isEmpty());
{

if (Character.isUpperCase(input_from_question.charAt(0)))
{ 
	input_from_question = input_from_question.toUpperCase();

} 

input_from_question="";

input_from_question = input_from_question. toLowerCase();

}

System.out.println(input_from_question);
}
}
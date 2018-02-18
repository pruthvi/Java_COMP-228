package application;

import java.util.Scanner;
import java.security.SecureRandom;

public class Exercise1 {

	public static void main(String[] args) {
		
	}
		Scanner input = new Scanner(System.in);
		SecureRandom randomnumbers = new SecureRandom();
		
		//creating instance variables
		int ans1, ans2, ans3, ans4;
		int flag1,flag2,flag3,flag4;
		int flag;
		
		//creating default constructor
		public Exercise1()
		{

		}
		
		//creating first method to display all four questions
		public void simulatequestion(){
			System.out.printf("Answer the following mcq questions%n");
			for(int i=1;i<=4;i++)
			{
				//display question one
				if(i==1)
				{
					System.out.printf("Which is true about method-local inner class\n");
					System.out.println("1.It should be Marked final");
					System.out.println("2.It should be Marked abstract");
					System.out.println("3.It should be Marked public");
					System.out.println("4.It should be Marked Static");

				}
				//display question 2 and similarly display all the question along with options
				if(i==2)
				{
					System.out.printf("Which is valid keyword for java\n");
					System.out.println("1.Interface");
					System.out.println("2.String");
					System.out.println("3.Float");
					System.out.println("4.Unsigned");
				}

				if(i==3)
				{
					System.out.printf("Which of the following is a statement in java\n");
					System.out.println("1.if()");
					System.out.println("2.for()");
					System.out.println("3.Continue");
					System.out.println("4.break");	
				}
				if(i==4)
				{
					System.out.printf("which of the jump statement can skip processing of code in its body for a particular iteration\n");
					System.out.println("1.Break");
					System.out.println("2.Return");
					System.out.println("3.Exit");
					System.out.println("4.Continue");
				}
			}
		}
		
		//creating second method to take user input
		public void inputanswer()
		{
			System.out.printf("your first answer:\n");
			ans1 = input.nextInt();
			System.out.printf("your second answer:\n");
			ans2 = input.nextInt();
			System.out.printf("your third answer:\n");
			ans3 = input.nextInt();
			System.out.printf("your fourth answer:\n");
			ans4 = input.nextInt();
		}
		
		//creating third method to check the answers of the user.
		public void checkanswer()
		{
			//checking answer 1. if answer1 is correct it makes flag=1 and for wrong
			//answer it makes flag=0
			if(ans1 == 2)
			{
				flag1 = 1;
			}
			else
			{
				flag1 =0;
			}
			if(ans2 == 1)
			{
				flag2 =1;
			}
			else
			{
				flag2 =0;
			}
			if(ans3 == 1)
			{
				flag3=1;
			}
			else
			{
				flag3 = 0;
			}
			if(ans4 == 4)
			{
				flag4 =1;
			}
			else
			{
				flag4 = 0;
			}
		}
		
		//creating final method to display comment according to result
		public void generatemessage()
		{
			int result = flag1+flag2+flag3+flag4;
			//if the result has more than 2 correct answers it will return following comments
			if(result>2)
				//using secure random method to display random comment
				switch(randomnumbers.nextInt(4))
				{
				case 1:
				{
					System.out.printf("excellent");
					break;
				}
				case 2:
				{
					System.out.printf("good");
					break;
				}
				case 3:
				{
					System.out.printf("keep up the good work");
					break;
				}
				case 4:
				{
					System.out.printf("nice work");
					break;
				}
				}
			//if the user gets 2 or less than 2 correct answers the following comment will
			//be displayed.
			if(result<=2)
			{
				switch(randomnumbers.nextInt(4))
				{
				case 1:
				{
					System.out.printf("No.please try again");
					break;
				}
				case 2:
				{
					System.out.printf("wrong. try once more");
					break;
				}
				case 3:
				{
					System.out.printf("don't give up");
					break;
				}
				case 4:
				{
					System.out.printf("No .keep trying");
					break;
				}
				}
			}
		

	}

}

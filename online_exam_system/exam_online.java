import java.util.Scanner;
class subject_cho extends login
{   int cho1;
    int cho2;
    int cho3;
    int sum1 =0;
    int sum2 =0;
    int sum3 =0;
    int sum4 =0;
    void sub_main()
    {
      Scanner DI = new Scanner(System.in);
      System.out.println("Enter the subject you want to give ");
      System.out.println("1 . Maths");
      System.out.println("2 . Science");
      System.out.println("3 . History");
      System.out.println("4 . Geography");
      int cho;
      cho = DI.nextInt();
      switch (cho) {
        case 1:
        {
            System.out.println("Lets Start With with Test");
            System.out.println("5+15 is ");
            cho1 = DI.nextInt();
            System.out.println("8*6 is ");
            cho2 = DI.nextInt();
            System.out.println("66-5 is ");
            cho3 = DI.nextInt();
            if(cho1==20)
            {
                sum1 = sum1+100;
            }
            if (cho2 == 48) 
            {
                sum1 = sum1+100;
            }
            if(cho3 == 61 )
            {
                sum1 = sum1+100;
            }
            System.out.println("Your Score Is " + sum1 );
           
            
        }
        break;
        case 2:
        {
            System.out.println("Lets Start With with Test");
            System.out.println("how may bones does human have  is ");
            cho1 = DI.nextInt();
            System.out.println("during monsoon we have how many hrs day is ");
            cho2 = DI.nextInt();
            System.out.println("hwo may eyes does human has is ");
            cho3 = DI.nextInt();
            if(cho1==206)
            {
                sum2 = sum2+100;
            }
            if (cho2 == 12) 
            {
                sum2 = sum2+100;
            }
            if(cho3 == 2 )
            {
                sum2 = sum2+100;
            }
            System.out.println("Your Score Is " + sum2 );
        }
        break; 
        case 3:
        {
            System.out.println("Lets Start With with Test");
            System.out.println("when was taj mahal constructed");
            cho1 = DI.nextInt();
            System.out.println("when was RED FORT constructed ");
            cho2 = DI.nextInt();
            System.out.println(" BIRTH OF KING AKBAR  ");
            cho3 = DI.nextInt();
            if(cho1==1632)
            {
                sum3 = sum3+100;
            }
            if (cho2 == 1638 ) 
            {
                sum3 = sum3+100;
            }
            if(cho3 == 1542 )
            {
                sum3 = sum3+100;
            }
            System.out.println("Your Score Is " + sum3 );
        }
        break; 
        case 4:
        {
            System.out.println("Lets Start With with Test");
            System.out.println(" HOW Many forest are there in india");
            cho1 = DI.nextInt();
            System.out.println(" How  desert are ther in india");
            cho2 = DI.nextInt();
            System.out.println(" City in mumbai ");
            cho3 = DI.nextInt();
            if(cho1==5000)
            {
                sum3 = sum3+100;
            }
            if (cho2 == 1600 ) 
            {
                sum3 = sum3+100;
            }
            if(cho3 == 1851 )
            {
                sum3 = sum3+100;
            }
            System.out.println("Your Score Is " + sum3 );
        }
        break; 
        default:
        {
           System.out.println("enter the righ option ");
        }
            break;
      }

    } 
}
class login
{

   
    void login1()
    { 
        int acc1 = 123;
        String usre1 ="Ale";
        int acc2 = 456;
        String usre2 ="ele";
        int acc3 = 789;
        String usre3 ="sle";
        System.out.println(" welcome to this page ");
        subject_cho io = new subject_cho();
        Scanner sc = new Scanner(System.in);
      System.out.println("enter yoru user id ");
      String check_user;
      check_user = sc.nextLine();
      System.out.println("Enter the pass word ");
      int acc_check;
      acc_check = sc.nextInt();
      if ( acc_check == acc1) 
      {
         System.out.println("welcome " +usre1+ " To the online test ");
         
         io.sub_main();
      }
      else if(  acc_check == acc2)
      {
        System.out.println("welcome " +usre2+ " To the online test ");
        io.sub_main();
      }
      else if( acc_check == acc3)
      {
        System.out.println("welcome " +usre3+ " To the online test ");
        io.sub_main();
      }
      else 
      {
        System.out.println("Ples Entred right User name ");
        login1();
      }

    }

}
public class exam_online 
{
    public static void main(String[] args) 
    {
        login li =new login();
        li.login1();
    }
}

import java.util.*;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        boolean cont = false;
        int m;
        double g;
        do{
            System.out.println("What major are you?\n1)Computer Science\n2)Business");
            m = kb.nextInt();
            kb.nextLine();
            if(m != 1 && m != 2)
            {
                System.out.println("Invalid entry, try again.");
            }
            else cont = true;
        }while(!cont);
        cont = false;
        do{
            System.out.println("What is your GPA(between 0 and 4)");
            g = kb.nextDouble();
            kb.nextLine();
            if(m < 0 || m > 4)
            {
                System.out.println("Invalid entry, try again.");
            }
            else cont = true;
        }while(!cont);

        Student student;
        if(m == 1)
        {
            student = new CompSciStudent(g,"Computer Science");
        }
        else student = new BusinessStudent(g, "Business");
    }
}
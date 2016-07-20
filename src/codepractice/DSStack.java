
package codepractice;


import java.util.Scanner;


class Stack
{
       
        static int point=0;
        int[] stacky = new int[10];


        void insert(int num)
        {
                if(10==index())
                {
                        System.out.println("The Stack is Full");
                }
                else
                {
                        stacky[index()]=num;
                        point++;

                }
        }
        
        int index()
        {
                return point;
        }

        /*void display()
        {

                for(int i=0;i<p.index();i++)
                {
                        System.out.println(stacky[i]);

                }
        } */

        //void remove();

        //void search();

        //void alter();
}

class DSStack
{
        public static void main(String[] args)
        {

                Stack s = new Stack();
                Scanner sc = new Scanner(System.in);
                int choice,value;

                System.out.println("\nEnter 1 to INSERT value ");
                System.out.println("Enter 2 to DELETE value");
                System.out.println("Enter 3 to SEARCH value");
                System.out.print("\n\nEnter your choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch(choice)
                {
                        case 1:
                                        System.out.print("\n\nEnter value to be added: ");
                                        value = Integer.parseInt(sc.nextLine());

                                        s.insert(value);

                                        break;
                        case 2:
                                        System.out.println("Value 2");
                                        break;
                        case 3:
                                        System.out.println("Value 3");
                                        break;
                        default:

                                        System.out.println("Invalid Value");
                                        break;
                }

        }

}
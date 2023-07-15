package algorithm.sorting;

//TASK--> Here we have to deleting the mid term of stack without using another stack or any other data structure.
//Soln--> we solve this task with the help of recursion.

import java.io.*;
import java.util.*;

class delMidOfStack {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}


class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int mid=(sizeOfStack+1)/2;
        if(s.size()==mid){
            s.pop();
            return;
        }
        int x=s.peek();
        s.pop();
        deleteMid(s, sizeOfStack);
        s.push(x);
    }
}

/*EXPLANATION--> 
    //here we see that even the value of x get change but because the recursion uses the stack(we say recursion's stack),
    the value of x = top of stack of our created stack(created in program by us),
    and every time we push the value of x from top of recursion's stack to our created stack(created in program by us) which is created by recursion
*/
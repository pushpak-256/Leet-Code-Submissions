// { Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;

class node
{
    int salary;
    String name;
    public void setSalary(int a)
    {
        this.salary=a;
    }
    public void setName(String s1)
    {
        this.name=s1;
    }
}

class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            node a[]=new node[n];
            for(int i=0;i<2*n;i=i+2) {
                a[i / 2] = new node();
                a[i / 2].setName(q[i]);
                a[i / 2].setSalary(Integer.parseInt(q[i + 1]));
            }

            Solution ob = new Solution();
            ob.sortRecords(a,n);
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i].name+" "+a[i].salary+" ");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java


/*
class node
{
    int salary;
    String name;
    public void setSalary(int a)
    {
        this.salary=a;
    }
    public void setName(String s)
    {
        this.name=s;
    }
}
*/


class Solution
{
    void sortRecords(node arr[],int n)
    {
       Arrays.sort
       (arr,
          new Comparator<node>()
          {
               public int compare(node a , node b)
               {
                   if(a.salary>b.salary)
                    return 1;
                   else if (a.salary==b.salary)
                    return a.name.compareTo(b.name); 
                   else return -1;
               }
        }
       );
    }
}

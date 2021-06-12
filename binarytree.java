/*package whatever //do not write package name here */

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTree {
    void fillD(int parent[], int i, int d[]) 
    { 
        if (d[i] != 0) 
        { 
            return; 
        }
        if (parent[i] == -1) 
        { 
            d[i] = 1; 
            return; 
        }
        if (d[parent[i]] == 0) 
        { 
            fillD(parent, parent[i], d); 
        } 
        d[i] = d[parent[i]] + 1; 
    } 
    int findH(int parent[], int n) 
    { 
        int d[] = new int[n]; 
        for (int i = 0; i < n; i++) 
        { 
            d[i] = 0; 
        }
        for (int i = 0; i < n; i++) 
        { 
            fillD(parent, i, d); 
        } 
        int height = d[0]; 
        for (int i = 1; i < n; i++) 
        { 
            if (height < d[i]) 
            { 
                height = d[i]; 
            } 
        } 
        return height; 
    } 

    // Driver program to test above functions 
    public static void main(String args[]) { 

        BinaryTree tree = new BinaryTree(); 

        int n;  
        Scanner sc=new Scanner(System.in);  

        n=sc.nextInt();  
        int[] parent = new int[n];  
        for(int i=0; i<n; i++)  
        {  

            parent[i]=sc.nextInt();  
        }  int p=tree.findH(parent, n);
        System.out.println(p);
    } 
}


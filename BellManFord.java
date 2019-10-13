import java.util.*;
import java.io.*;

class Main 
{
  public static void minimum(int m[],int n)
  {
    int i,j;
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;i++)
      {  
      if(a[j]<a[i])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
      }
    }
  public static void main (String args[])
  {
    int graph[][]=new int[100][100];
    int dist[][]=new int[100][100];
    int min[];
    Scanner sc=new Scanner(System.in);
    
    int z,i,j,k;
    System.out.println("enter the n");
    int n=sc.nextInt();
    System.out.println("enter the adjecant matrix");
    for(i=0;i<n;i++)
    {
     for(j=0;j<n;j++)
     {
       graph[i][j]=sc.nextInt(); //input
     }
    }
     System.out.println("the matrix is");
     for(i=0;i<n;i++)
    {
     for(j=0;j<n;j++)
     {
       System.out.print(graph[i][j]);
       
     }
      System.out.println();
    }
    for(i=0;i<n;i++)
    {
     for(j=0;j<n;j++)
     {
       if(graph[i][j]==0)
       {
         graph[i][j]=10000;
       }
      }
    }
    for(i=0;i<n;i++)
    {
     dist[0][i]=graph[0][i];
    dist[i][0]=graph[0][0];
      
    }
    for(i=1;i<=n;i++)
    {
  for(j=1;j<=n;j++)
     {
        for(k=1;k<=n;k++)
        {
          min[k]=dist[i-1][k]+ graph[k][i];
        }
      Main.minimum(min,n);
    z=dist[i-1][j];
    if(z<min[1])
    {
      dist[i][j]=z;
    }
    else{
      dist[i][j]=min[1];
    }
    }
     for(i=0;i<n;i++)
     {
       System.out.println("pass"+ i);
       for(j=0;i<n;j++)
     {
      System.out.println (dist[i][j]);
     }
       System.out.println ();
    }
    }
  }


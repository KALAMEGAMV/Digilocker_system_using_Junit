import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
public class raju {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> list=new LinkedList<String>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        list.add(sc.next());}
    
    Iterator<String> it=list.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next()+"/n");
    }
}
}

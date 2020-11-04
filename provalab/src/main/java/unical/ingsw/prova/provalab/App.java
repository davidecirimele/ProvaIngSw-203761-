package unical.ingsw.prova.provalab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyListUtil m=new MyListUtil();
        List<Integer> lista=new ArrayList<Integer>();
        Random r=new Random();
        
        for(int i=0;i<10;i++)
        	lista.add(r.nextInt(100));
        
        m.organizeList(lista,0);
        System.out.println("Ordine Decrescente: "+lista);
        m.organizeList(lista,1);
        System.out.println("Ordine Crescente: "+lista);
    }
}

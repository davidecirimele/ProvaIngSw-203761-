package unical.ingsw.prova.provalab;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.*;
import org.joda.time.DateTime;

public class MyListUtilTest {
private static MyListUtil l;
private static List<Integer> lista;

@BeforeClass
public static void MyListTest() {
	l=new MyListUtil();
	lista=new ArrayList<Integer>();
	Random r=new Random();
	
	for(int i=0;i<10;i++)
	lista.add(i);
}

@Before
public void printStart() {
	System.out.println(DateTime.now());
}

@After
public void printEnd() {
	System.out.println(DateTime.now());
}

@Test(timeout = 20000)
public void testOrdineCrescente() {
	int []Arr1=new int[lista.size()];
	int []Arr2=new int[lista.size()];
	
	for(int i=0;i<lista.size();i++) {
		Arr1[i]=l.ordineCrescente(lista).get(i);
		Arr2[i]=i;
		
	assertArrayEquals(Arr2,Arr1);
}
}
	
@Test(timeout = 20000)
public void testOrdineDecrescente() {
	int []Arr1=new int[lista.size()];
	int []Arr2=new int[lista.size()];
	int j=0;
		
	for(int i=lista.size()-1;i>=0;i--) {
		Arr1[j]=l.ordineDecrescente(lista).get(j);
		Arr2[j++]=i;
			
	assertArrayEquals(Arr2,Arr1);
}	
}
	
}

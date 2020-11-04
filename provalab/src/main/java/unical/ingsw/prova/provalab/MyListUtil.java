package unical.ingsw.prova.provalab;

import java.util.ArrayList;
import java.util.List;

public class MyListUtil {
private List<Integer> list;

public MyListUtil() {
	list=new ArrayList<Integer>();
}

public void organizeList(List l,int s) {
	switch(s) {
	case 0:
		ordineDecrescente(l);
		break;
	case 1:
		ordineCrescente(l);
		break;
	}
}

public List<Integer> ordineCrescente(List l) {
	int temp;
	list = l;
	
		for(int i=0;i<list.size();i++)
			for(int j=0;j<list.size();j++)
				if(list.get(j)>list.get(i) && i!=j)
				{
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
		
		
		return l;
}

public List<Integer> ordineDecrescente(List l) {
	int temp;
	list = l;
	
			
		for(int i=0;i<list.size();i++)
			for(int j=0;j<list.size();j++)
				if(list.get(j)<list.get(i) && i!=j)
				{
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			
	return l;
}
}

package unical.ingsw.prova.provalab;

import java.util.ArrayList;
import java.util.List;

public class MyListUtil {
private List<Integer> list;

public MyListUtil() {
	list=new ArrayList<Integer>();
}

public void organizeList(List l,int s) {
	list = l;
	switch(s) {
	case 0:
		ordineDecrescente();
		break;
	case 1:
		ordineCrescente();
		break;
	}
}

private void ordineCrescente() {
	int temp;
	boolean ordinata=true;
	
	if(list!=null) {
		do {
		ordinata=true;	
		for(int i=0;i<list.size();i++)
			for(int j=0;j<list.size();j++)
				if(list.get(j)>list.get(i) && list.get(i)!=list.get(j))
				{
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
					ordinata=false;
				}
		}while(!ordinata);
	}
}

private void ordineDecrescente() {
	int temp;
	boolean ordinata=true;
	
	if(list!=null) {
		do {
		ordinata=true;	
		for(int i=0;i<list.size();i++)
			for(int j=0;j<list.size();j++)
				if(list.get(j)<list.get(i) && list.get(i)!=list.get(j))
				{
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
					ordinata=false;
				}
		}while(!ordinata);
	}
}
}

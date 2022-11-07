package collection_list;
import java.util.Comparator;

public class Comparebyname implements Comparator
{

	public int compare(Object ob1,Object ob2)
	{
		Person p1=(Person)ob1;
		Person p2=(Person)ob2;
		return p1.name.compareTo(p2.name);
	}
}

import java.util.*; 
class Queue <K extends Comparable<K>, D>
{
	ArrayList<K> liste = new ArrayList<K> ();
	
	Queue ()
	{
		liste = new ArrayList<K> ();
	}
	
	public boolean isEmpty ()
	{
		return liste.isEmpty();
	}
	
	public void enqueue (Node<K,D> node)
	{
		//liste.add(node);
	}
		
	public Node<K,D> dequeue ()
	{
			return null;
	}
}
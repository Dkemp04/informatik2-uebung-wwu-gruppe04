/**
 * 
 * @author Daniel Kemper
 *
 */

public class LevelOrderIterator<K extends Comparable<K>,D>
{
	Queue<K,D> queue = new Queue<K,D>;
	public void levelOrder (Node wurzel, Node links, Node rechts)
	{
		queue.enqueue (wurzel);
		levelOrder (links, links.left, links.right);
		levelOrder (rechts, rechts.left, rechts.right);
	}
	
	public void test ()
	{
		
	}
}
/**
 * 
 * @author Daniel Kemper
 *
 */

public class LevelOrderIterator<K extends Comparable<K>,D>
{
	Queue<K,D> queue = new Queue<K,D>();
	public void levelOrder (Node<K,D> wurzel, Node<K,D> links, Node<K,D> rechts)
	{
		queue.enqueue (wurzel);
		levelOrder (links, links.left, links.right);
		levelOrder (rechts, rechts.left, rechts.right);
	}
}
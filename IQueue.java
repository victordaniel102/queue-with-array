
public interface IQueue {
	public int length();
	public boolean isEmpty();
	
	public Object first() throws EEmptyQueue;
	
	public void toQueue(Object o);
	public Object deQueue() throws EEmptyQueue;
}

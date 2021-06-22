public class Queue {
	private int capacity;
	private int index;
	private int f;
	private Object[] queue;
	
	public Queue() {
		capacity = 2;
		queue = new Object[capacity];
		index = 0;
		f = 0;
	}
	
	public int length() {
		return f-index;
	}
	
	public boolean isEmpty() {
		return (index==f);
	}

	public Object first() throws EEmptyQueue {
		if(isEmpty()){
			throw new EEmptyQueue("A fila está vazia!");
		}else{
			return queue[index];
		}
	}
	
	public void toQueue(Object o) {
		if(length() == capacity) {
			Object[] newQueue = new Object[capacity*2];
			for(int x = 0; x < capacity; x++) {
				newQueue[x] = queue[((index%capacity)+x)%capacity];
			}
			index = 0;
			f = capacity;
			capacity*=2;
			newQueue[f] = o;
			f++;
			queue = newQueue;
		}else {
			queue[f%capacity] = o;
			f++;
		}
	}

	public Object deQueue() throws EEmptyQueue {
		if(isEmpty()){
			throw new EEmptyQueue("A fila está vazia!");
		}else{
			return queue[index++];
		}
	}
	
	public void show() {
		System.out.print("[ ");
		for(Object item : queue){
            System.out.print(item+" ");
        }
		System.out.println("]");
	}
}

public class TestQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
		q.show();
		System.out.println(q.isEmpty()+" isEmpty");
		q.toQueue(1);
		q.toQueue(2);
		System.out.println(q.length()+" Length");
		q.toQueue(3);
		q.toQueue(4);
		q.show();
		try{
			System.out.println(q.deQueue()+" Removed");
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.first()+" First");
            q.show();
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
		}catch(EEmptyQueue err){
			System.out.println(err.getMessage());
		}
		q.toQueue(5);
		q.toQueue(6);
		System.out.println(q.length()+" Length");
		
		System.out.println(q.isEmpty()+" isEmpty");
    }
}

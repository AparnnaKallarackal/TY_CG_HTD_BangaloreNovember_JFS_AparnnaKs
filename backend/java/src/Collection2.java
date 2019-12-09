import java.util.LinkedList;

public class Collection2 {
	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.add(5);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		l1.add(30);
		l1.add(35);
		
		System.out.println("..............add first & add last............");
		l1.addFirst(0);
		l1.addLast(50);
		System.out.println(l1);
		
		System.out.println("..............get first & last.............");
		l1.getFirst();
		System.out.println(l1.getFirst());
		l1.getLast();
		System.out.println(l1.getLast());
		
		
		System.out.println("..............remove.................");
		l1.remove();
		
		System.out.println("................remove first  & remove last...........");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		
		
		LinkedList l2=new LinkedList();
		l2.add(5);
		l2.add(10);
		l2.add(25);
		l2.add(35);
		l2.add(59);
		l2.add(50);
		System.out.println("............peek ..peek first...last...");
		System.out.println(l2.peek());
		System.out.println(l2.peekFirst());
		System.out.println(l2.peekLast());
		
		System.out.println(".......poll ...poll first...last...");
		System.out.println(l2.poll());
		System.out.println(l2.pollFirst());
		System.out.println(l2.pollLast());
		System.out.println(l2);
		
		System.out.println("............offer....offer first...last.....");
		System.out.println(l2.offer(100));
		System.out.println(l2.offerFirst(200));
		System.out.println(l2.offerLast(500));
		System.out.println(l2);
		
		
		
	}

}

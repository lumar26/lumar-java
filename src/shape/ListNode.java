package shape;

public class ListNode {
	private Shape info;
	private ListNode next;
	public ListNode(Shape info) {
		super();
		this.info = info;
		this.next = null;
	}
	public Shape getInfo() {
		return info;
	}
	public void setInfo(Shape info) {
		this.info = info;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
}

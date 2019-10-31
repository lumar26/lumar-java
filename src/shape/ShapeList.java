package shape;

public class ShapeList {
	private ListNode start;
	private ListNode end;
	
	
	public ShapeList() {
		super();
		this.start = null;
		this.end = null;
	}
	public ListNode getStart() {
		return start;
	}
	public void setStart(ListNode start) {
		this.start = start;
	}
	public ListNode getEnd() {
		return end;
	}
	public void setEnd(ListNode end) {
		this.end = end;
	}
	
	public void addNew(Shape newShape) {
		ListNode newNode = new ListNode(newShape);
		if (this.start == null) {
			this.start = newNode;
			this.end = newNode;
		}
		else{
			end.setNext(newNode);
			end = newNode;
			
		}
	}
	
	public void print() {
		int i = 0;
		ListNode temp = start;
		while(temp != null) {
			Shape shape = temp.getInfo();
			//System.out.format("%s.",String.valueOf(++i));
			System.out.println(++i + shape.getType() + shape.countP()+"\t" + shape.countS());
			temp = temp.getNext();
		}
	}
	
}

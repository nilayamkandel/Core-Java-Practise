package pojo;

public class area {
    private int length;
    private int breadth;
    
    public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public String toString() {
		return "area [length=" + length + ", breadth=" + breadth + "]";
	}
	    
}

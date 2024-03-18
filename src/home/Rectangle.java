package home;

public class Rectangle {
	
	int lenght;
	int width;
	
		
	public int getlenght() {
		return lenght;
	}

    public void setlenght(int lenght) {
		this.lenght=lenght;
	}
    
    public int getwidth() {
		return width;
	}
    
    public void setwidth(int width) {
		this.width=width;
	}
    
    public static void main(String[] args) {
		Rectangle Dreptunghi = new Rectangle();
		Dreptunghi.setlenght(3);
		Dreptunghi.setwidth(6);
		
		System.out.println("Lungime dreptunghiului este: " +Dreptunghi.getlenght());
		System.out.println("Latimea dreptunghoului este: " +Dreptunghi.getwidth());
		
}  
}

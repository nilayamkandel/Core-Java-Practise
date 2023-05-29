package Encapsulation;

public class test {
    public static void main(String[] args) {
		
		Customer c = new Customer();
		
//		now this wont work because we have made instance variable private meaning encapsulated
//		c.id = 34;
//		c.name= "ram";
//		c.age = 33;
//		c.city = "ktm";
//		c.phone = "9856235630";
//		
//		System.out.println("ID : " + c.id);
//		System.out.println("Name : " + c.name);
//		System.out.println("Age : " + c.age);
//		System.out.println("City : " + c.city);
//		System.out.println("Phone : " + c.phone);
		
		
		c.setId(98);
		c.setName("neel");
		c.setAge(23);
		c.setCity("ktm");
		c.setPhone("985561223");
		
		
//		the obj can also be called alltogether using toString method
		System.out.println(c);
		
//		or we can call this individually
		
		System.out.println("ID : " + c.getId());
		System.out.println("Name : " + c.getName());
		System.out.println("Age : " + c.getAge());
		System.out.println("City : " + c.getCity());
		System.out.println("Phone : " + c.getPhone());
		
		
		
		}
}

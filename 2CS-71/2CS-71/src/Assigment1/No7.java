package Assigment1;

public class No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBookEntry entry = new AddressBookEntry();
		
		entry.setTitle("Mr");
        entry.setName("John Lim");
        entry.setAddress("Holland Road 123");
        
        entry.printEntry();
	}

}

class AddressBookEntry {
	String title, name, address;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printEntry() {
        System.out.println("Title: " + title);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

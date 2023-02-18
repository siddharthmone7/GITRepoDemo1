package BuilderPattern;

public class Shop {

	public static void main(String[] args) 
	{
			
		PhoneBuilder pb = new PhoneBuilder();
		Phone phone = pb.setOs("IoS").setProcessor(6.9).getPhone();;
		
		System.out.println(phone);
		
	}

}

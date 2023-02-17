package BuilderPattern;

public class PhoneBuilder 
{
	private String os;
	private Integer ram;
	private String battery;
	private Double processor;
	private Integer screenSize;
		
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(Integer ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setProcessor(Double processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
		return this;
	}		
	
	public Phone getPhone()
	{
		return new Phone(os, ram, battery, processor, screenSize);
	}
	
}

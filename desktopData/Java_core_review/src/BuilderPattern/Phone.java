package BuilderPattern;

public class Phone 
{
	private String os;
	private Integer ram;
	private String battery;
	private Double processor;
	private Integer screenSize;
	
	public Phone(String os, Integer ram, String battery, Double processor, Integer screenSize) {
		super();
		this.os = os;
		this.ram = ram;
		this.battery = battery;
		this.processor = processor;
		this.screenSize = screenSize;
	}
	
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public Double getProcessor() {
		return processor;
	}
	public void setProcessor(Double processor) {
		this.processor = processor;
	}
	public Integer getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}
	
	
	@Override
	public String toString() 
	{
		return "Phone [os=" + os + ", ram=" + ram + ", battery=" + battery + ", processor=" + processor
				+ ", screenSize=" + screenSize + "]";
	}
	
}

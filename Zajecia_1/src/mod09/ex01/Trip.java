package mod09.ex01;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
/**
 * 
 * Interface Externalizable pozwala nam ustawiæ jak maj¹ byæ zapisane dane do pliku
 * wymaga to dopisania dwóch metod. 
 *
 */
public abstract class Trip implements Serializable{
	private static final long serialVersionUID = 3973109129757665895L;
	
	private Date start;
	private Date end;
	private String destination;
	private int price;

	public Trip(Date start, Date end, String destination) {
		this.start = start;
		this.end = end;
		this.destination = destination;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getDestination() {
		return destination;
	}

	public Date getEnd() {
		return end;
	}

	public Date getStart() {
		return start;
	}

	public String getInfo() {
		return destination + ", " + getPrice() + "PLN, \n\tfrom "
				+ format(start) + " to " + format(end);
	}

	protected String format(Date date) {
		return DateFormat.getDateInstance().format(date);
	}
}

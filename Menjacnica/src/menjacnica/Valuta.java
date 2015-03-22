package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String name;
	private String shortName;
	private GregorianCalendar date;
	private double sellPrice;
	private double buyPrice;
	private double middlePrice;
	
	public Valuta(String name, String shortName, GregorianCalendar date,
			double sellPrice, double buyPrice, double middlePrice) {
		super();
		this.name = name;
		this.shortName = shortName;
		this.date = date;
		this.sellPrice = sellPrice;
		this.buyPrice = buyPrice;
		this.middlePrice = middlePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getMiddlePrice() {
		return middlePrice;
	}

	public void setMiddlePrice(double middlePrice) {
		this.middlePrice = middlePrice;
	}
	
	
	
	

}

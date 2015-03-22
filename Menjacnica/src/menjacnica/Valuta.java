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

	@Override
	public String toString() {
		return "Valuta [name=" + name + ", shortName=" + shortName + ", date="
				+ date + ", sellPrice=" + sellPrice + ", buyPrice=" + buyPrice
				+ ", middlePrice=" + middlePrice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(middlePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((shortName == null) ? 0 : shortName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(middlePrice) != Double
				.doubleToLongBits(other.middlePrice))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (shortName == null) {
			if (other.shortName != null)
				return false;
		} else if (!shortName.equals(other.shortName))
			return false;
		return true;
	}

	
	
	
	
	

}

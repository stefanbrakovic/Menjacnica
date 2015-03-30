package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfacePackage.Menjacnica;

public class ZaInpleamantInterface implements Menjacnica {
	
	
	public double returnCourse(String name, GregorianCalendar date) {
		LinkedList<Valuta> valute =  menjacnica.Menjacnica.valute;
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getName().equals(name)&&valute.get(i).getDate().equals(date)) {
				return valute.get(i).getMiddlePrice();
				
			}
		}
		return -1;
	}

	public void newCourse(String name, String shortName, GregorianCalendar date) {
		LinkedList<Valuta> valute =  menjacnica.Menjacnica.valute;
		Valuta valuta =  new Valuta(name, shortName, date, 0, 0, 0);
		valute.add(valuta);
		return;
		
	}

	public void deleteCourse(String name, String shortName,
			GregorianCalendar date) {
		LinkedList<Valuta> valute =  menjacnica.Menjacnica.valute;
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getName().equals(name)&&valute.get(i).getDate().equals(date)&&
					valute.get(i).getShortName().equals(shortName)) {
				valute.remove(i);
				return;
				}
		
	}

	}
}

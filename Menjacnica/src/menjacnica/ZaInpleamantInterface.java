package menjacnica;

import java.util.GregorianCalendar;

import interfacePackage.Menjacnica;

public class ZaInpleamantInterface implements Menjacnica {

	public void newCourse(GregorianCalendar date) {
		menjacnica.Menjacnica.valute.add(null);

	}

	public void deleteCourse(GregorianCalendar date) {
		for (int i = 0; i < menjacnica.Menjacnica.valute.size(); i++) {
			if (menjacnica.Menjacnica.valute.get(i).getDate().equals(date)) {
				menjacnica.Menjacnica.valute.remove(i);
				return;
			}
		}
		

	}

	public double returnCourse(String name, GregorianCalendar date) {
		for (int i = 0; i < menjacnica.Menjacnica.valute.size(); i++){
			if (menjacnica.Menjacnica.valute.get(i).getDate().equals(date) && 
					menjacnica.Menjacnica.valute.get(i).getName().equals(name))
				return menjacnica.Menjacnica.valute.get(i).getMiddlePrice();
		}
		return -1;
	}

}

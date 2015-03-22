package interfacePackage;

import java.util.GregorianCalendar;

public interface Menjacnica {
	
	public void newCourse(GregorianCalendar date);
	
	public void deleteCourse(GregorianCalendar date);
	
	public double returnCourse(String name, GregorianCalendar date);

}

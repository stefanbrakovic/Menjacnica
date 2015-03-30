package interfacePackage;

import java.util.GregorianCalendar;

public interface Menjacnica {
	
	public void newCourse(String name, String shortName,GregorianCalendar date);
	
	public void deleteCourse(String name, String shortName,GregorianCalendar date);
	
	public double returnCourse(String name, GregorianCalendar date);

}

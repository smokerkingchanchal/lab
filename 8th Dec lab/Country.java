 //Q.2   //1. Develop a java class with a instance variable Country  HashSet (H1)  add a method storeCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
  //  2. Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.

package Lab_for_8_th_December;
import java.util.HashSet;
import java.util.Iterator;
public class Country {
HashSet<String>sc =new HashSet<>();
public HashSet<String> storeCountryName(String countryName){
	sc.add(countryName);
	return sc;
 }
	public String retrieveCountry (String CountryName){
		Iterator<String>itr=sc.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals(CountryName))
				return CountryName;
			}
		return null;
	}		

public static void main(String[]args) {
	Country st=new Country();
	st.storeCountryName("India");
	st.storeCountryName("Australia");
	st.storeCountryName("Japan");
	System.out.println(st.sc);
	st.retrieveCountry("USA");
	System.out.println(st.retrieveCountry("INdia")+" "+"prsent in ArrayList");
	System.out.println(st.retrieveCountry("Japan"));
}
}
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author PSWARTHI
 * 1.	put - insert a key-value pair
 * 2.	get - retrieve value for an input key
 * 3.	delete - remove an element from the map
 * 4.	size - return the size of the map at any point in time.
 *
 *
 */
public class FordMap {
	

	
	 @Test
       public void validate_isMapEmpty() {
                       Map m= new Map();
                       assertEquals(0, m.getSize());
                       
       }

	   
	// input 1, 20, return true is inserted 
	@Test
	public void put_keyValuePair() {
		
		Map m = new Map();
		m.put(1,20);
		assertEquals(1, m.key[0]);
		assertEquals(20, m.value[0]);
		
	}
	

	@Test
	public void get_valueForKeyGiven () {
		
		Map m = new Map();
		m.put(1,20);
		assertEquals(20, m.getValue(1));
	}
	
	//insert one pair, delete it and check size
	@Test
	public void delete() {
		
		Map m = new Map();
		m.put(1,20);
		m.delete(1);
		assertEquals(0, m.getSize());
		
	}
	
}

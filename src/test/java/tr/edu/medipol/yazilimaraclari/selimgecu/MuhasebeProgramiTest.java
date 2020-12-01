package tr.edu.medipol.yazilimaraclari.selimgecu;

import org.junit.Test;
import junit.framework.Assert;
import static org.junit.Assert.*;

public class MuhasebeProgramiTest {
	
	
	@Test
	public void ucretHesaplaTest() {
		
		int calisilansaat = 146;
		int saatlikucret = 20;
		
		int ucretHesaplaSonuc = MuhasebeProgrami.ucretHesapla(calisilansaat, saatlikucret);	
		
		Assert.assertEquals(2920,  ucretHesaplaSonuc);
	}

}

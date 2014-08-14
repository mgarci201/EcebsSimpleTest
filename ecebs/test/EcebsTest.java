/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author gauchoescoces
 */
public class EcebsTest {
    
    public EcebsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Test
    public void testRealInput(){
    
        List actuals = new ArrayList(); 
        actuals.add("USD");
        actuals.add("GBP");
        actuals.add("EUR");
        actuals.add("BRZ");
        
        
        Map expected = new HashMap(); 
        expected.put("USD/GBP","USD/GBP");
        expected.put("GBP/USD","GBP/USD");
        expected.put("USD/EUR","USD/EUR");
        expected.put("EUR/USD","EUR/USD"); 
        expected.put("USD/BRZ","USD/BRZ");
        expected.put("BRZ/USD","BRZ/USD"); 
        expected.put("GBP/EUR","GBP/EUR");
        expected.put("EUR/GBP","EUR/GBP"); 
        expected.put("GBP/BRZ","GBP/BRZ");
        expected.put("BRZ/GBP","BRZ/GBP");  
        expected.put("EUR/BRZ","EUR/BRZ");
        expected.put("BRZ/EUR","BRZ/EUR");          
        
   
                
        
        Ecebs ecebs = new Ecebs();
        List output = ecebs.findPair(actuals);
        

       assertEquals(expected.size(), output.size());
       
       for (int i=0;i<output.size();i++){
           
           assertTrue(expected.containsKey(output.get(i)));         
       
       }
        
          
    }
    
    
     @Test
     public void testNullInput(){    
          
        Ecebs ecebs = new Ecebs();
        List output = ecebs.findPair(null);        

        assertNull(output);

        
          
    }
    
}

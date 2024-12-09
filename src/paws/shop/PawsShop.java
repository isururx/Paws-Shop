
package paws.shop;

import com.formdev.flatlaf.FlatDarkLaf;
import java.io.IOException;


public class PawsShop {

    
    public static void main(String[] args) throws IOException {
        
        FlatDarkLaf.setup();
        login log = new login();
        log.setVisible(true); 
          
    }
    
    
}

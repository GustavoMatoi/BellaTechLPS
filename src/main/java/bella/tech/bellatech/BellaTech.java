/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bella.tech.bellatech;

//import Model.Endereco;
import Model.Usuario;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import view.JFrameMain;
import com.stripe.Stripe;
import com.stripe.param.*;
import com.stripe.model.*;
import com.stripe.net.*;

/**
 *
 * @author gutei
 */



public class BellaTech {

    
    public static void main(String[] args) throws IOException{
        try {
            Stripe.apiKey = "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";
            CustomerListParams params = CustomerListParams.builder().build();
            CustomerCollection customers = Customer.list(params);
            System.out.println(customers);
            
        } catch (Exception e){
            System.out.println(e);

        }
        
        //System.out.println("Hello World!");
        JFrameMain jf = new JFrameMain();
        jf.setVisible(true);
        

    }
}

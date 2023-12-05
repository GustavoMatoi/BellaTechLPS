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
        JFrameMain jf = new JFrameMain();
        jf.setVisible(true);
        

    }
}

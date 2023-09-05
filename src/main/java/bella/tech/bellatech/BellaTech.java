/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bella.tech.bellatech;

import Model.Endereco;
import view.JFrameMain;

/**
 *
 * @author gutei
 */
public class BellaTech {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        JFrameMain jf = new JFrameMain();
        jf.setVisible(true);
        Endereco e = new Endereco();
        e.setBairro("lombok funcionando");
        System.out.println(e.getBairro());
        e.teste();
    }
}

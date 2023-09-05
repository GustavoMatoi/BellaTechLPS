/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.DAO;

import java.util.List;

/**
 *
 * @author gutei
 */
public interface IDAO {
    public void save(Object objeto);
    public void update(Object objeto);
    public void find(Object objeto);
    public List<Object> findAll(Object objeto);
    public void delete(Object objeto);
    
}

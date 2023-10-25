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
    public Object find(Object objeto);
    public List<Object> findAll();
    public boolean delete(Object objeto);
    public Object findById(int id);
}

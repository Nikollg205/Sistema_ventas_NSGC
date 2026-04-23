/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author NikollSarayGonzalezC
 */
public class CategoriaDAO implements CrufSimpleInterface<Categoria>{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public CategoriaDAO(){
     CON = Conexion.getInstancia();
    }
    
    
    
@Override
public List<Categoria> listar(String texto){
     List<Categoria> registros = new ArrayList<>();
     try {
        ps=CON.conexion().prepareStatement("SELECT * FROM categoria WHERE nombre LIKE ?");
        ps.setString(1,"%" + texto + "%");
        rs=ps.executeQuery();
         while (rs.next()){
           registros.add(new Categoria(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4)));
           
             
         }
    } catch (Exception e) {
    }

}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import database.Conexion;
import datos.interfaces.CrudSimpleInterface;
import entidades.Categoria;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author NikollSarayGonzalezC
 */
public class CategoriaDAO implements CrudSimpleInterface<Categoria>{
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
        ps=CON.conectar().prepareStatement("SELECT * FROM categoria WHERE nombre LIKE ?");
        ps.setString(1,"%" + texto + "%");
        rs=ps.executeQuery();
         while (rs.next()){
           registros.add(new Categoria(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4)));
           
             
         }
    } catch (Exception e) {
    }
     return registros;

}
@Override
public boolean insertar(Categoria obj) {
    try {
        ps = CON.conectar().prepareStatement("INSERT INTO categoria(nombre, descripcion, activo) VALUES(?,?,1)");
        ps.setString(1, obj.getNombre());
        ps.setString(2, obj.getDescripcion());
        ps.execute();
        return true;
    } catch (Exception e) {
        return false;
    }
}

@Override
public boolean actualizar(Categoria obj) {
    try {
        ps = CON.conectar().prepareStatement("UPDATE categoria SET nombre=?, descripcion=? WHERE id=?");
        ps.setString(1, obj.getNombre());
        ps.setString(2, obj.getDescripcion());
        ps.setInt(3, obj.getId());
        ps.execute();
        return true;
    } catch (Exception e) {
        return false;
    }
}

@Override
public boolean desactivar(int id) {
    try {
        ps = CON.conectar().prepareStatement("UPDATE categoria SET activo=0 WHERE id=?");
        ps.setInt(1, id);
        ps.execute();
        return true;
    } catch (Exception e) {
        return false;
    }
}

@Override
public boolean activar(int id) {
    try {
        ps = CON.conectar().prepareStatement("UPDATE categoria SET activo=1 WHERE id=?");
        ps.setInt(1, id);
        ps.execute();
        return true;
    } catch (Exception e) {
        return false;
    }
}

@Override
public int total() {
    int total = 0;
    try {
        ps = CON.conectar().prepareStatement("SELECT COUNT(*) FROM categoria");
        rs = ps.executeQuery();
        if (rs.next()) {
            total = rs.getInt(1);
        }
    } catch (Exception e) {
    }
    return total;
}

@Override
public boolean existe(String texto) {
    try {
        ps = CON.conectar().prepareStatement("SELECT nombre FROM categoria WHERE nombre=?");
        ps.setString(1, texto);
        rs = ps.executeQuery();
        return rs.next();
    } catch (Exception e) {
        return false;
    }
}

}


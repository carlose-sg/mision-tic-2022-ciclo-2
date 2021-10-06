package utp.misiontic2022.c2.g6967.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.g6967.reto4.model.vo.Requerimiento_3;
import utp.misiontic2022.c2.g6967.reto4.util.JDBCUtilities;

public class RequerimientoDao_3 {
    
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        
        // Creamos un objeto de tipo lista para cargar los datos de la consulta al Requerimiento_2
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();

        // Generamos la conexion de la clase JDBCUtilities a la base de datos
        Connection conexion = JDBCUtilities.getConnection();
        
        try {
            String consulta = "SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido,1,3) || " +
                              "SUBSTR(l.Segundo_Apellido,1,3) AS 'Abrev' " +
                              "FROM Lider l";
            
            PreparedStatement statement = conexion.prepareStatement(consulta);

            // Se genera la consulta en la base de datos
            ResultSet rs = statement.executeQuery();
            
            // Recorremos los registros generados por la consulta
            while(rs.next()){
                Requerimiento_3 requerimiento_3 = new Requerimiento_3(
                        rs.getString("Abrev")
                );
                
                // Adicionamos cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento_3);

            }
            
            rs.close();
            statement.close();
            
        } catch(SQLException e){
            System.err.println("Error de consulta SQL Requerimiento_3 -> " + e);
            
        } finally {
            conexion.close();
        }
                
        return respuesta;
    }
    
}
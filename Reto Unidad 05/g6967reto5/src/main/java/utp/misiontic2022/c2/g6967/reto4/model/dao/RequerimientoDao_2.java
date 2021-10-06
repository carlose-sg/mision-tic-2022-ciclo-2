package utp.misiontic2022.c2.g6967.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utp.misiontic2022.c2.g6967.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.g6967.reto4.util.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {

        // Creamos un objeto de tipo lista para cargar los datos de la consulta al Requerimiento_2
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();

        // Generamos la conexion de la clase JDBCUtilities a la base de datos
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, " +
                              "l.Nombre || ' ' || l.Segundo_Apellido AS 'nombreLider', " +
                              "t.Codigo_Tipo, t.Estrato " +
                              "FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider " +
                              "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo " + 
                              "WHERE p.Fecha_Inicio >= '2021-01-01' " +
                              "AND p.Fecha_Inicio <= '2021-05-30' " +
                              "AND p.Ciudad = 'Armenia' ";
                            

            PreparedStatement statement = conexion.prepareStatement(consulta);

            // Se genera la consulta en la base de datos
            ResultSet resultSet = statement.executeQuery();

            // Recorremos los registros generados por la consulta
            while (resultSet.next()) {
                Requerimiento_2 requerimiento_2 = new Requerimiento_2(
                        resultSet.getString("Fecha_Inicio"),
                        resultSet.getString("Ciudad"),
                        resultSet.getString("Constructora"),
                        resultSet.getString("nombreLider"),
                        resultSet.getInt("Codigo_Tipo"),
                        resultSet.getInt("Estrato")
                );

                // Adicionamos cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento_2);

            }
            
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error de consulta SQL Requerimiento_2 -> " + e);
            
        } finally {
            conexion.close();
        }

        return respuesta;
    }
    
    // Generamos una nueva consulta para el requerimiento 2 que pueda recibir parametros
    // Permite realizar la consulta a traves de la interfaz grafica (GUI)
    
    public ArrayList<Requerimiento_2> requerimiento2(String fIni, String fFin, String ciu) throws SQLException{

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();

        // Generamos la conexion de la clase JDBCUtilities a la base de datos
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, " +
                              "l.Nombre || ' ' || l.Segundo_Apellido AS 'nombreLider', " +
                              "t.Codigo_Tipo, t.Estrato " +
                              "FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider " +
                              "INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo " + 
                              "WHERE p.Fecha_Inicio >= '" + fIni + "' " +
                              "AND p.Fecha_Inicio <= '" + fFin + "' " +
                              "AND p.Ciudad = '" + ciu + "' ";
                            

            PreparedStatement statement = conexion.prepareStatement(consulta);

            // Se genera la consulta en la base de datos
            ResultSet resultSet = statement.executeQuery();

            // Recorremos los registros generados por la consulta
            while (resultSet.next()) {
                Requerimiento_2 requerimiento_2 = new Requerimiento_2(
                        resultSet.getString("Fecha_Inicio"),
                        resultSet.getString("Ciudad"),
                        resultSet.getString("Constructora"),
                        resultSet.getString("nombreLider"),
                        resultSet.getInt("Codigo_Tipo"),
                        resultSet.getInt("Estrato")
                );

                // Adicionamos cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(requerimiento_2);

            }
            
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error de consulta SQL Requerimiento_2 -> " + e);
            
        } finally {
            conexion.close();
        }

        return respuesta;
    }
}

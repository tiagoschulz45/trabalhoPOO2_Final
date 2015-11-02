/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices.dao;

import dataservices.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Serie;

/**
 *
 * @author Tiago
 */
public class SerieDAO implements IDAO<Serie>{
    private final Conexao conexao;
    private final Connection connection;

    public SerieDAO() {
        conexao = new Conexao();
        connection = conexao.abrirConexao();
    }
    
    
    @Override
    public void save(Serie serie) {
        String sql = "INSERT INTO serie" +
                    "(nome, genero, classificacao, sinopse, temporadas)" +
                    "VALUES (?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,serie.getNome());
            pstmt.setString(2,serie.getGenero());
            pstmt.setInt(3,serie.getClassificacao());
            pstmt.setString(4, serie.getSinopse());
            pstmt.setInt(5, serie.getTemporadas());
            pstmt.execute();
        }
        catch(SQLException e) {
        }
        finally {
            conexao.fecharConexao();
        }   
    }

    @Override
    public List list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Serie t) {
        
    }

    @Override
    public void update(Serie t) {
        
    }
  
}

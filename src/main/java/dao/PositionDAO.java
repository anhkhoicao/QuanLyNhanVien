/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Position;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author caube
 */
public class PositionDAO extends EntityDAO<Position, String> {

    @Override
    public void insert(Position pos) {
        String sql = """
                     INSERT INTO [dbo].[Position]
                                ([ID]
                                ,[PosName]
                                ,[Allowance])
                          VALUES (?, ?, ?)""";
        XJdbc.update(sql, pos.getPosID(), 
                pos.getPosName(), 
                pos.getAllowance());
    }

    @Override
    public void update(Position pos) {
        String sql = "update Position set PosName = ?, Allowance = ? where ID = ?";
        XJdbc.update(sql, pos.getPosName(), 
                pos.getAllowance(), 
                pos.getPosID());
    }

    @Override
    public void delete(String depID) {
        String sql = "delete from Position where ID = ?";
        XJdbc.update(sql, depID);
    }

    @Override
    public List<Position> selectAll() {
        String sql = "select * from Position";
        return selectBySql(sql);
    }

    @Override
    public Position selectByID(String posID) {
        String sql = "select * from Position where ID = ? ";
        List<Position> list = selectBySql(sql, posID);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Position> selectBySql(String sql, Object... args) {
        List<Position> list = new ArrayList();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Position pos = new Position();
                    pos.setPosID(rs.getString("ID"));
                    pos.setPosName(rs.getString("PosName"));
                    pos.setAllowance(rs.getDouble("Allowance"));
                    list.add(pos);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    
    public List<String> getPosName() {
        String sql = "select distinct PosName from Position";
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql);
            while (rs.next()) {                
                list.add(rs.getString("PosName"));
            }
            rs.getStatement().getConnection().close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public String getIDByName(String name) {
        String sql = "select ID from Position where PosName = ?";
         String id = null;
        try {
            ResultSet rs = XJdbc.query(sql, name);
            if (rs.next()) {
                id = rs.getString("ID");
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return id;
    }
    public static void main(String[] args) {
        PositionDAO dao = new PositionDAO();
        String id = dao.getIDByName("Manager");
        System.out.println(id);
    }

}

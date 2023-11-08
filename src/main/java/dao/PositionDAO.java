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
        String sql = "INSERT INTO [dbo].[Positon]\n"
                + "           ([PosID]\n"
                + "           ,[PosName]\n"
                + "           ,[Allowance])\n"
                + "     VALUES (?, ?, ?)";
        XJdbc.update(sql, pos.getPosID(), 
                pos.getPosName(), 
                pos.getAllowance());
    }

    @Override
    public void update(Position pos) {
        String sql = "update Positon set PosName = ?, Allowance = ? where PosID = ?";
        XJdbc.update(sql, pos.getPosName(), 
                pos.getAllowance(), 
                pos.getPosID());
    }

    @Override
    public void delete(String depID) {
        String sql = "delete from Positon where PosID = ?";
        XJdbc.update(sql, depID);
    }

    @Override
    public List<Position> selectAll() {
        String sql = "select * from Positon";
        return selectBySql(sql);
    }

    @Override
    public Position selectByID(String posID) {
        String sql = "select * from Positon where PosID = ? ";
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
                    pos.setPosID(rs.getString("PosID"));
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

}

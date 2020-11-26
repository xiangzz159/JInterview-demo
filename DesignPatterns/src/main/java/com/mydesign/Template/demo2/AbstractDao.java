package com.mydesign.Template.demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author：Yerik Xiang
 * @Date：2020/11/26 10:52
 * @Desc：
 */
public abstract class AbstractDao {
    /**
     * 查询
     * @param sql
     * @param params
     * @return
     */
    protected Object find(String sql, Object[] params) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object obj = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                obj = rowMapper(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.free(rs, ps, conn);
        }
        return obj;
    }

    protected abstract Object rowMapper(ResultSet rs) throws SQLException;

    //同时可以添加 insert ，update 等方法
}

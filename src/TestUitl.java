import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * lsy create in 2021/05/04/12:52
 */
public class TestUitl {
    public static void main(String[] args){
        Util uitl = new Util();
        String sql = "select * from users";
        PreparedStatement ps = uitl.getPs(sql);
        ResultSet rs = null;
        try {
            rs = uitl.getRs(ps.executeQuery());
            while (rs.next()){
                int id = rs.getInt(1);
                String username=rs.getString("username");
                String password = rs.getString("password");
                System.out.println(id+" "+username+" "+password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            uitl.closeAll();
        }

    }
}

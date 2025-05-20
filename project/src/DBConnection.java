import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String userid = "bituser";
        String passwd = "bituser";
        String sql = "SELECT eno, ename FROM emp WHERE ename LIKE '김%'";

        PreparedStatement psm = null;
		Connection conn = null; 
		ResultSet rs = null; 
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, userid, passwd);
            System.out.println("오라클 DB 연결 성공");

            psm = conn.prepareStatement(sql); ///prepareStatement 를 통해 sql문 할당
			rs = psm.executeQuery(); //실행

            while(rs.next()){  //결과값을 반복물을 통해서 출력
				System.out.print("ID : "+rs.getString(1));
				System.out.println(", AGE : "+rs.getString(2));
			} 

            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

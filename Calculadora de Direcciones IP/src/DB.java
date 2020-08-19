import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private static DB DB = new DB();
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	private String dbName = "DireccionesIP";
	private String urlDB = "jdbc:postgresql://localhost:5432"+this.dbName;
	private String userDB = "postgres";
	private String passDB = "masterkey";
	
	private DB() {
		try {
			Class.forName(driverDB);
			this.conn = DriverManager.getConnection(urlDB,userDB,passDB);
			System.out.println("Conexion establecida!");
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DB getInstances() {
		return DB;
	}
	public ResultSet dbStatement ( String query ) {
		try {
			this.stmt=this.conn.createStatement();
			this.rs=this.pstmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString("username"));
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.pstmt.close();
				this.rs.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
	public void dbPrepareStatement ( String [] string, String query) {
		try {
			this.pstmt = this.conn.prepareStatement(query);
			
			this.pstmt.setString(1, string[0]);
			this.pstmt.setString(2, string[1]);
			this.pstmt.setString(3, string[2]);
			this.pstmt.setString(4, string[3]);
			this.pstmt.setString(5, string[4]);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.pstmt.close();
				
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	public void dbPrepareStatementInt ( int [] integer, String query) {
		try {
			this.pstmt = this.conn.prepareStatement(query);
			 
			this.pstmt.setInt(1, integer[0]);
			this.pstmt.setInt(2, integer[1]);
			this.pstmt.setInt(3, integer[2]);
			this.pstmt.setInt(4, integer[3]);
			this.pstmt.setInt(5, integer[4]);
			this.pstmt.setInt(6, integer[5]);
			this.pstmt.setInt(7, integer[6]);
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.pstmt.close();
				
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	public ResultSet dbStatementImprimir(String query) {
		try {
			this.stmt=this.conn.createStatement();
			this.rs=this.stmt.executeQuery(query);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	
	
}

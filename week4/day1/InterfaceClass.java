package week4.day1;

public class InterfaceClass {
	public static void main(String[] args) {
		DatabaseConnection dbConnection = new JavaConnection();

		dbConnection.connect();
		dbConnection.executeUpdate("UPDATE users SET name = 'John Doe' WHERE id = 1");
		dbConnection.disconnect();
	}
}

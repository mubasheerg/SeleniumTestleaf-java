package week4.day1;

public class AbstractClass {
	public static void main(String[] args) {
		DatabaseConnection dbConnection = new JavaConnection();

		dbConnection.connect();
		dbConnection.executeUpdate("UPDATE users SET name = 'John Doe' WHERE id = 1");

		// Downcasting to call the executeQuery method
		if (dbConnection instanceof JavaConnection1) {
			((JavaConnection1) dbConnection).executeQuery("SELECT * FROM users");
		}

		dbConnection.disconnect();
	}
}

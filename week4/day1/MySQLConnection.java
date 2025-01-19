package week4.day1;

abstract class MySQLConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connecting to MySQL database...");
		// Add connection logic specific to MySQL here
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from MySQL database...");
		// Add disconnection logic specific to MySQL here
	}

	@Override
	public void executeUpdate(String query) {
		System.out.println("Executing update in MySQL: " + query);
		// Add logic to execute a database update query in MySQL
	}

	// Abstract method to be implemented by concrete classes
	public abstract void executeQuery(String query);
}
package week4.day1;

public class JavaConnection1 extends MySQLConnection {

	@Override
	public void executeQuery(String query) {
		System.out.println("Executing query in MySQL: " + query);
		// Add logic to execute a database query and return results
	}
}
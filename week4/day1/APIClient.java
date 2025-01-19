package week4.day1;

public class APIClient {

	// Overloaded method with single argument
	public void sendRequest(String sender) {
		System.out.println("Sending request " + sender);
		// Add logic to handle sending a simple request
	}

	// Overloaded method with three arguments
	public void sendRequest(String sender, String receiver, boolean requestStatus) {
		System.out.println("\nSending request " + sender);
		System.out.println("Receiving request " + receiver);
		if (requestStatus) {
			System.out.println("Request was successful.");
		} else {
			System.out.println("Request failed.");
		}
	}

	// Main method to test the overloaded methods
	public static void main(String[] args) {
		APIClient apiClient = new APIClient();

		// sendRequest with one argument
		apiClient.sendRequest("Hey team, Good morning");

		// sendRequest with three arguments
		apiClient.sendRequest("Hey team, Good morning", "Good morning trainer", true);
	}
}

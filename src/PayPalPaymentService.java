import java.util.UUID;

public class PayPalPaymentService {

    // Method to initialize payment session with PayPal
    public PaymentResponse initializePayPalPayment(double amount) {
        // Simulate PayPal session creation
        String sessionId = UUID.randomUUID().toString();
        System.out.println("PayPal payment session initialized with ID: " + sessionId);
        return new PaymentResponse(true, "Session initialized", sessionId);
    }

    // Method to authorize payment in PayPal
    public PaymentResponse authorizePayPalPayment(String sessionId) throws PaymentException {
        if (sessionId == null || sessionId.isEmpty()) {
            throw new PaymentException("Invalid session ID.");
        }
        System.out.println("PayPal payment authorized for session: " + sessionId);
        return new PaymentResponse(true, "Payment authorized", sessionId);
    }

    // Method to confirm payment completion
    public PaymentResponse confirmPayPalPayment(String sessionId) throws PaymentException {
        if (sessionId == null || sessionId.isEmpty()) {
            throw new PaymentException("Invalid session ID.");
        }
        System.out.println("PayPal payment confirmed for session: " + sessionId);
        return new PaymentResponse(true, "Payment confirmed", sessionId);
    }
}

package string_26_10_26;

// 3
public class Bank {
    static void main() {
        StringBuffer message = new StringBuffer("Transaction ID: 1");

        message.append(" | Amount Debited: Rs. 5000");
        message.append(" | Transaction Successful");

        System.out.println(message);
    }
}

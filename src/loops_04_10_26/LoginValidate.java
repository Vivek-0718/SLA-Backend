package loops_04_10_26;

public class LoginValidate {
    private String crt_username = "admin";
    private String crt_password = "12345";

    public String checkLogin(String username, String password){
        return username.equals(crt_username) && password.equals(crt_password) ? "Login Successful" : "Invalid Login";
    }

    public static void main(String[] args) {
        LoginValidate l1 = new LoginValidate();
        System.out.println(l1.checkLogin("asdas","12345"));
        System.out.println(l1.checkLogin("admin","12345"));
    }
}

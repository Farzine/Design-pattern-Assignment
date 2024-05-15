public class User {
    public static void main(String[] args) {
        Access access = new ProxyAccess();

        access.check("admin");

        access.check("user");
    }
}

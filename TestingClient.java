public class TestingClient {

    public static void main(String[] args) {
        User user1 = new User();

        System.out.println(user1 + "\n");

        User user2 = new User("Ricardo", "Sandoval", 9983456,
                "2301 Vanderbilt Place");

        System.out.println(user2 + "\n");

        User user3 = new User("", "Sandoval", -2,
                "null");

        System.out.println(user3 + "\n");
    }
}

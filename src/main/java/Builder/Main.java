package Builder;

public class Main {
    public static void main(String[] args)
    {
        User user = new User.UserBuilder().setEmailId("anandjha21@gmail.com").setUserName("anand Jha").setUserId("uuid1234").build();
        System.out.println(user);

        User user1 = User.UserBuilder.builder().setUserId("user122").setUserName("Prem Bhai").setEmailId("prem@1234@gmail.com").build();
        System.out.println(user1);
    }
}

package Day8;
                    //Encapsulation
class Login {
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

    public static void main(String[] args) {
        Login l = new Login();
        l.setPassword("12345");
        System.out.println("Password is set successfully");
    }
}


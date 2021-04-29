public class User {


    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;

    public User()
    {

    }

    public User(int id, String firstName, String lastName, String gender, String email) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGender(gender);
        this.setEmail(email);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

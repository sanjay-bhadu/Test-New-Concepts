package Project;

public class test {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public test(int id,String name,String email)
    {
        this.id=id;
        this.name=name;
        this.email=email;
    }
    @Override
    public String toString(){
        return "Student Id: "+getId()+" Student Name: "+getName()+" Email: "+getEmail();
    }
}


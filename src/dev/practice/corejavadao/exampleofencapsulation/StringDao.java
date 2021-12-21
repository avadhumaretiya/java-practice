package dev.practice.corejavadao.exampleofencapsulation;

public class StringDao {

    private String firstName;
    private String lastName;

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

    //Here we override toString() method and return String as per our requirement
    //Default return format of toString() method is as follow
    //getClass().getName()+"@"+Integer.toHexString(hashcode())
    @Override
    public String toString(){
        return "First name : "+this.firstName+"Last Name : "+this.lastName;
    }
}

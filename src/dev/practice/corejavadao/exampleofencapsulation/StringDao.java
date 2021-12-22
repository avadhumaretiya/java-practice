package dev.practice.corejavadao.exampleofencapsulation;

public class StringDao {

    private String firstName;
    private String lastName;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Here we override toString() method and return String as per our requirement
    //Default return format of toString() method is as follow
    //getClass().getName()+"@"+Integer.toHexString(hashcode())
    @Override
    public String toString(){
        return "First name : "+this.firstName+"Last Name : "+this.lastName;
    }

    //Here we override hashCode() method and return integer value as per our requirement
    //By default it handles by HashMap and HashSet
    @Override
    public int hashCode(){ return id; }

    //Here we override equals() method and return boolean value as per our requirement
    //By default internally equals() method used "=="
    @Override
    public boolean equals(Object obj){
        StringDao stringDao=(StringDao) obj;
        if(stringDao.getId()==this.id && stringDao.getFirstName().equals(this.firstName) && stringDao.getLastName().equals(this.lastName)){
            return true;
        }else{
            return false;
        }
    }
}

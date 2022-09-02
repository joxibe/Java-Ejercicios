package sololearnPoo;

public class Customer {

    String firstName;
    String secondName;
    int age;
    int roomNumber;
    
    public Customer(){
        
    }

    public Customer(String firstName, String secondName, int age, int roomNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.roomNumber = roomNumber;
    }

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    
    
}

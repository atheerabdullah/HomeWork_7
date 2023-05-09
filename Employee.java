public class Employee {
    private String id ;
    private String name ;
    private int salary ;

    public Employee(String id , String name , int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    // getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
       return salary;
    }

    public int raisedSalary(int present){
        return salary=salary+present;
    }
}

public class MainEmployee {
    public static void main(String[] args) {

        // set  information
        Employee emp1 = new Employee("1101","ATHEER",3500); // create am object
        emp1.getName();
        emp1.getId();
        emp1.getSalary();
        System.out.println(emp1);


        Employee emp2 = new Employee("1101","sara",3000);
        emp2.getName();
        emp2.getId();
        emp2.getSalary();
        System.out.println(emp2);

        // get the normal salary
        emp1.getAnnualSalary();
        System.out.println(emp1);

        emp2.getAnnualSalary();
        System.out.println(emp2);

        // get rised salary
        emp1.raisedSalary(100);
        emp2.raisedSalary(200);
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
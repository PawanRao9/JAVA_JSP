public class employee {
    String name;
    double empid;
    String company;
    double salary;

    employee(String name, double empid, String company, double salary) {
        this.name = name;
        this.empid = empid;
        this.company = company;
        this.salary = salary;
    }

    employee(String name, double empid, String company) {
        this.name = name;
        this.empid = empid;
        this.company = company;
        this.salary = 0; 
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }
}

class dummy {
    public static void main(String[] args) {
        employee emp1 = new employee("John Doe", 12345, "ABC Corp", 50000);
        employee emp2 = new employee("Jane Smith", 67890, "XYZ Inc");

        emp1.display();
        emp2.display();
    }
}

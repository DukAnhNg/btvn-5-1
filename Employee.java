package src.main;

public class Employee extends Person {
    private double experince;
    private String placeWork;



    public Employee(int id, String name, String address, int age, double experince, String placeWork) {
        super(id, name, address, age);
        this.experince = experince;
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return "Employee{" + "id="+getId()+ ", name="+getName()+", address="+getAddress()+", age="+getAge()+
                ", experince=" + experince +
                ", placeWork='" + placeWork + '\'' +
                '}';
    }

}

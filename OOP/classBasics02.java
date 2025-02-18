

class EmployeeAbout{

    String empName = "Ramesh";
    String empCity = "Ludhiana";
    String Phn = "91-5566447788";
    float empSal = 50_000.20f;
    int empId = 5012;
    
public void getEmpDetails (){
    System.out.println("Employee Details");
    System.out.println("=================================");
    System.out.println("Employee Id : "+ empId);
    System.out.println("Employee Name : "+ empName);
    System.out.println("Employee Phn : "+ Phn);
    System.out.println("Employee City : "+ empCity);
   
}
}

public class classBasics02 {
public static void main(String[] args) {
    EmployeeAbout emp = new  EmployeeAbout();
    emp.getEmpDetails();

}

    
}

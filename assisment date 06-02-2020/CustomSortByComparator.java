import java.util.*;
class Employee{
    int age;
    String Fname;
    String Lname;
 
    Employee(String Fname, String Lname, int age){
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
    }
 
    public Integer getRegId(){
        return this.age;
    }
 
    public String getFName(){
        return this.Fname;
    }
    
    public String getLName(){
        return this.Lname;
    }
    @Override
    public String toString(){
        return this.getFName();
    }
}
class SortByName implements java.util.Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){
        return ((Employee)firstObj).getFName().compareTo(((Employee)secondObj).getFName());
    }
}
 
class SortByLName implements java.util.Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){
        return ((Employee)firstObj).getLName().compareTo(((Employee)secondObj).getLName());
    }
}
class SortByRegId implements java.util.Comparator{
    @Override
    public int compare(Object firstObj, Object secondObj){
        return ((Employee)firstObj).getRegId().compareTo(((Employee)secondObj).getRegId());
    }
}
 
 
class CustomSortByComparator{
    public static void main(String[] args) {
        java.util.List employeeList = new java.util.ArrayList();
 
        employeeList.add(new Employee("vasu","sharma", 615));
        //employeeList.add(new Employee("rashmi","gupta", 3421));
        employeeList.add(new Employee("abhi","bansal", 3));
        int n=1;
        while(n==1)
        {
        System.out.println("Enter the name");
        Scanner s = new Scanner(System.in);

         //String name = "Abdul Latif Hussain"
        String name = s.nextLine();
        String lastName = "";
        String firstName= "";
        if(name.split("\\w+").length>1){

        lastName = name.substring(name.lastIndexOf(" ")+1);
        firstName = name.substring(0, name.lastIndexOf(' '));
       // System.out.println(firstName);
        //System.out.println(lastName);
    }
     else{
       firstName = name;
         }

         
        System.out.println("Enter the age");
        int age = s.nextInt();

        employeeList.add(new Employee(firstName,lastName,age));
        System.out.println("Press 1 to add more names and 0 to exit");
        n = s.nextInt();
         }
        System.out.println("List before sorting : " + employeeList);
 
        System.out.println("Enter 1 to sort by first name");
        System.out.println("Enter 2 to sort by Last name");
        System.out.println("Enter 3 to sort by age");
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();
        switch(n1){

         case 1:
         java.util.Collections.sort(employeeList, new SortByName());
         break;
         case 2:
          java.util.Collections.sort(employeeList, new SortByLName());
          break;
         case 3:
         java.util.Collections.sort(employeeList, new SortByRegId()); 
         break;

        }

        //java.util.Collections.sort(employeeList, new SortByRegId());
 
        System.out.println("List after sorting : " + employeeList);
 
 
    }
}
 
 
 
    // 1. Add New Employee
    //     - Enter name
    //     - ENter Age
    // Do you want to add more(y/n) :n
 
    // Sort by:
    // 1. First name
    // 2. Last name
    // 3. Age
 
 
 
 
// Comparator
//  - public int compare(Object first, Object secon
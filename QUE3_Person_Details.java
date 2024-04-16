/*code for getting  details of the person by taking input from user and displaying the details using setters and getters*/
import java.util.Scanner;//importing  util package for scanner object
class human{// creating a class of person
    String name;//declaring name
    int age;//declaring age
    long mobile_number;//declaring mobile_number
    public void SetName(String name){/*setting name */
        this.name=name;
    }
    public void SetAge(int age){/*setting age*/
        this.age=age;
    }
    public void SetMobile(long mobile){/*setting mobile_number*/
        this.mobile_number=mobile;
    }
    public String GetName()/*getting name*/
    {
        return name;
    } 
    public int GetAge()/*getting age*/
    
    {
        return age;
    } 
    public long GetMobile()/*getting mobile_number*/
    
    {
        return mobile_number;
    } 
    

}
class person{/* creating main class*/
    public static void main(String args[])
    {
        human obj1=new human();
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Name of the person");
        String name=inp.nextLine();/* Asking user to input name*/
        System.out.println("Enter Age of Person");
        int age=inp.nextInt();/* Asking user to input Age*/
        System.out.println("Enter Mobile Number of person");
        long mobile=inp.nextLong();/* Asking user to input mobile number*/
        obj1.SetName(name);
        obj1.SetAge(age);
        obj1.SetMobile(mobile);
        System.out.println("Here the details of the person:");
        System.out.println("Name: "+obj1.GetName()+"\n"+"Age:"+obj1.GetAge()+"\n"+"Mobile_number: "+obj1.GetMobile());
    }
}

import com.tekwill.Model.Address;
import com.tekwill.Model.ContactInfo;
import com.tekwill.Model.Employee;

public class App {

    public static void main(String[] args) {

        Address adress = new Address("Moldova", "2089", "Dimirie Cantemir 7");
        ContactInfo contact = new ContactInfo("Ion", "Popescu", "0758800286", adress);

        Employee employee = new Employee(contact, "Programmer", 4500);
        
        System.out.println(employee);

    }

}

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
    public static void main(String[] args) throws IOException {

        // Create object
        Employee emp = new Employee();
        emp.name = "Nitin";
        emp.id = 101;
        emp.salary = 55000.0f;

        // Serialize to a file
        FileOutputStream fos = new FileOutputStream("employee.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(emp);
        oos.close();

        System.out.println("Serialization completed. File: employee.dat");
    }
}

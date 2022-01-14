import com.employees.info.Data;
import com.employees.info.ResultOfProcess;
import com.employees.service.Service;

import java.util.List;

/**
 * That is the Main class.
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        List<Data> dataList = Service.readFile();
        if (!dataList.isEmpty()) {
            ResultOfProcess result = Service.returnEmployees(dataList);
            if (result == null)
                System.out.println("No result found.");
            else
                System.out.println("Pair of employees that have worked as a team for the longest time are: ("
                        + result.getEmpId1() + ", " + result.getEmpId2() + ") worked together in " + result.getWorkedDays() + " days.");
        }
    }

}
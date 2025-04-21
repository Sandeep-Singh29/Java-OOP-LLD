package immutableClass;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 19/04/25
 */

public class ImmutablePersonTest {
    public static void main(String[] args) {

        Map<String, String> address = new HashMap<>();
        address.put("address", "banglore");
        address.put("course", "MCA");
        ImmutablePerson immutablePerson = new ImmutablePerson(1,"sandeep",address);

        System.out.println(immutablePerson); // orginal without
        address.put("age","28");
        System.out.println(immutablePerson);



    }
}

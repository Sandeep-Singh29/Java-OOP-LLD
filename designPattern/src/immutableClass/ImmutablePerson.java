package immutableClass;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 19/04/25
 */

final class ImmutablePerson {

    private final int id;
    private final String name;
    private final Map<String,String> testMap;

    public ImmutablePerson(int id, String name, Map<String, String> testMap) {
        this.id = id;
        this.name = name;
//        this.testMap = Collections.unmodifiableMap(new HashMap<>(testMap)); way 1
        this.testMap = Map.copyOf(testMap);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getTestMap() {
        return new HashMap<>(testMap); // Defensive copy
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testMap=" + testMap +
                '}';
    }
}

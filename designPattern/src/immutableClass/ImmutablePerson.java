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
        this.testMap = testMap == null
                ? Collections.emptyMap()
                : new HashMap<>(testMap);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getTestMap() {
        return Collections.unmodifiableMap(testMap);
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

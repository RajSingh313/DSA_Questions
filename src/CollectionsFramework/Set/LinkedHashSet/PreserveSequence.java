package CollectionsFramework.Set.LinkedHashSet;

import java.util.*;

public class PreserveSequence {
    public static void main(String[] args) {
        List<String> actions = Arrays.asList(
                "login", "view", "click", "view", "logout", "click", "login"
        );

        // LinkedHashSet preserves insertion order
        Set<String> uniqueActions = new LinkedHashSet<>(actions);

        System.out.println("Original Actions: " + actions);
        System.out.println("Unique Actions (Order Preserved): " + uniqueActions);
    }
}

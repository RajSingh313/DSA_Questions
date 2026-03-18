package Strings;

public class StringClass {
    public static void main(String[] args) {

        String name = "Raj";
        String s1 = new String(name);
        String s2 = new String("Raj");
        String a = "Raj";
        String b = "Raj";

        // ── == vs equals (reference vs value) ──────────────────────────
        System.out.println("=== Reference Checks (==) ===");
        System.out.println(s1 == s2);      // false  (both new String → heap)
        System.out.println(a == b);        // true   (both from string pool)
        System.out.println(name == a);     // true   (same pool object)
        System.out.println(name == b);     // true   (same pool object)
        System.out.println(name == s1);    // false  (s1 is on heap)
        System.out.println(name == s2);    // false  (s2 is on heap)

        // ── 1. equals() & equalsIgnoreCase() ───────────────────────────
        System.out.println("\n=== equals / equalsIgnoreCase ===");
        System.out.println(name.equals(s1));                   // true
        System.out.println(name.equals("raj"));                // false
        System.out.println(name.equalsIgnoreCase("raj"));      // true

        // ── 2. length() ────────────────────────────────────────────────
        System.out.println("\n=== length ===");
        System.out.println(name.length());                     // 3

        // ── 3. charAt() ────────────────────────────────────────────────
        System.out.println("\n=== charAt ===");
        System.out.println(name.charAt(0));                    // R
        System.out.println(name.charAt(2));                    // j

        // ── 4. indexOf() & lastIndexOf() ───────────────────────────────
        System.out.println("\n=== indexOf / lastIndexOf ===");
        String sentence = "Java is great, Java is fun";
        System.out.println(sentence.indexOf("Java"));          // 0
        System.out.println(sentence.lastIndexOf("Java"));      // 15
        System.out.println(sentence.indexOf("Python"));        // -1

        // ── 5. substring() ─────────────────────────────────────────────
        System.out.println("\n=== substring ===");
        System.out.println(sentence.substring(8));             // great, Java is fun
        System.out.println(sentence.substring(8, 13));         // great

        // ── 6. toUpperCase() & toLowerCase() ───────────────────────────
        System.out.println("\n=== toUpperCase / toLowerCase ===");
        System.out.println(name.toUpperCase());                // RAJ
        System.out.println(name.toLowerCase());                // raj

        // ── 7. trim() & strip() ────────────────────────────────────────
        System.out.println("\n=== trim / strip ===");
        String padded = "   Hello World   ";
        System.out.println(padded.trim());                     // "Hello World"
        System.out.println(padded.strip());                    // "Hello World"
        System.out.println(padded.stripLeading());             // "Hello World   "
        System.out.println(padded.stripTrailing());            // "   Hello World"

        // ── 8. replace() & replaceAll() ────────────────────────────────
        System.out.println("\n=== replace / replaceAll ===");
        System.out.println(sentence.replace("Java", "Python"));         // Python is great, Python is fun
        System.out.println(sentence.replaceAll("[aeiou]", "*"));        // J*v* *s gr**t, J*v* *s f*n

        // ── 9. contains() ──────────────────────────────────────────────
        System.out.println("\n=== contains ===");
        System.out.println(sentence.contains("great"));        // true
        System.out.println(sentence.contains("bad"));          // false

        // ── 10. startsWith() & endsWith() ──────────────────────────────
        System.out.println("\n=== startsWith / endsWith ===");
        System.out.println(sentence.startsWith("Java"));       // true
        System.out.println(sentence.endsWith("fun"));          // true
        System.out.println(sentence.endsWith("great"));        // false

        // ── 11. split() ────────────────────────────────────────────────
        System.out.println("\n=== split ===");
        String csv = "Raj,Riya,Rohan,Ram";
        String[] names = csv.split(",");
        for (String n : names)
            System.out.println(n);                             // Raj  Riya  Rohan  Ram

        // ── 12. join() ─────────────────────────────────────────────────
        System.out.println("\n=== join ===");
        String joined = String.join(" | ", "Raj", "Riya", "Rohan");
        System.out.println(joined);                            // Raj | Riya | Rohan

        // ── 13. concat() ───────────────────────────────────────────────
        System.out.println("\n=== concat ===");
        System.out.println(name.concat(" Kumar"));             // Raj Kumar

        // ── 14. isEmpty() & isBlank() ──────────────────────────────────
        System.out.println("\n=== isEmpty / isBlank ===");
        System.out.println("".isEmpty());                      // true
        System.out.println("  ".isEmpty());                    // false
        System.out.println("  ".isBlank());                    // true
        System.out.println(name.isBlank());                    // false

        // ── 15. valueOf() ──────────────────────────────────────────────
        System.out.println("\n=== valueOf ===");
        System.out.println(String.valueOf(42));                // "42"
        System.out.println(String.valueOf(3.14));              // "3.14"
        System.out.println(String.valueOf(true));              // "true"

        // ── 16. toCharArray() ──────────────────────────────────────────
        System.out.println("\n=== toCharArray ===");
        char[] chars = name.toCharArray();
        for (char c : chars)
            System.out.print(c + " ");                         // R a j
        System.out.println();

        // ── 17. compareTo() & compareToIgnoreCase() ────────────────────
        System.out.println("\n=== compareTo ===");
        System.out.println("Apple".compareTo("Banana"));      // negative (A < B)
        System.out.println("Raj".compareTo("Raj"));            // 0 (equal)
        System.out.println("raj".compareToIgnoreCase("RAJ")); // 0

        // ── 18. intern() ───────────────────────────────────────────────
        System.out.println("\n=== intern ===");
        String interned = s1.intern();
        System.out.println(interned == a);                     // true (now points to pool)

        // ── 19. repeat() ───────────────────────────────────────────────
        System.out.println("\n=== repeat ===");
        System.out.println("Raj ".repeat(3));                  // Raj Raj Raj

        // ── 20. formatted() / String.format() ─────────────────────────
        System.out.println("\n=== String.format ===");
        String formatted = String.format("Name: %s, Age: %d, Score: %.2f", name, 25, 98.5);
        System.out.println(formatted);                         // Name: Raj, Age: 25, Score: 98.50
    }
}
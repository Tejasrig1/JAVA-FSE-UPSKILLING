/*// File: module-info.java (Inside com.utils module)
module com.utils {
    exports com.utils;
}

// File: Utility.java (Inside com.utils module)
package com.utils;

public class Utility {
    public static String greet() {
        return "Hello from Utility!";
    }
}

//File: module-info.java (Inside com.greetings module)
module com.greetings {
    requires com.utils;
}

// File: Greetings.java (Inside com.greetings module)
package com.greetings;

import com.utils.Utility;

public class Greetings {
    public static void main(String[] args) {
        System.out.println(Utility.greet());
    }
}*/

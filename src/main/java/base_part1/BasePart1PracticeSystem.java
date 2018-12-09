package base_part1;

public class BasePart1PracticeSystem {
    public static void main(String[] args) {
//        checkJavaInstallation();
//        printSystemEnvAndProperties();
//        printSystemSecurityManager();
        printEnvVariables();
    }

    /**
     * 31. Write a Java program to check whether Java is installed on your computer.
     * Expected Output:
     * Java Version: 1.8.0_71
     * Java Runtime Version: 1.8.0_71-b15
     * Java Home: /opt/jdk/jdk1.8.0_71/jre
     * Java Vendor: Oracle Corporation
     * Java Vendor URL: http://Java.oracle.com/
     * Java Class Path: .
     */
    private static void checkJavaInstallation() {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }

    /**
     *
     * 88. Write a Java program to get the current system environment and system properties.
     */
    private static void printSystemEnvAndProperties() {
        System.out.println("System enviroment is :");
        System.out.println(System.getenv());
        System.out.println("System properties are :");
        System.out.println(System.getProperties());
    }

    /**
     * 89. Write a Java program to check whether a security manager has already been established for the current
     * application or not.
     */
    private static void printSystemSecurityManager() {
        System.out.println("System secutiry manager");
        System.out.println(System.getSecurityManager());
    }

    /**
     * 90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
     */
    private static void printEnvVariables() {
        System.out.println("Environment variable PATH: " + System.getenv("PATH"));
        System.out.println("Environment variable TEMP: " + System.getenv("TEMP"));
        System.out.println("\nEnvironment variable USERNAME: " + System.getenv("USERNAME"));
    }
}

package file_input_output;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilePractice {
    public static void main(String[] args) {
        File file = null;
        String path;

        path = "C:\\Users\\Intel\\IdeaProjects\\java-exercises\\src\\main\\resources";
        file = new File(path);
        String[] fileNames = getListOfFiles(file);

        String extension = ".txt";
        File[] files = getListOfFilesByExtension(file, extension);

        path = "C:\\Users\\Intel\\IdeaProjects\\java-exercises\\src\\main\\resources\\test.txt";
        file = new File(path);
        System.out.println(String.format("File/Directory exists: %s", exists(file)));

        System.out.println(String.format("File has read and write permissions: %s", hasReadAndWritePermission(file)));

        System.out.println(String.format("Path is a directory: %s", isDirectory(file)));

        File second = new File("C:\\Users\\Intel\\IdeaProjects\\java-exercises\\src\\main\\resources\\test-second.txt");
        System.out.println(String.format("Files are equal: %s", compare(file, second)));

        System.out.println(String.format("File last modified time :%d", lastModifiedTime(file)));

        readInputfromConsole();

        printSize(file);

        readFileIntoByte(file);

        readFile(file);

        readPlainTextFile(file);

        String fileContentAsString = storeFileIntoString(file);

        Object[] fileContentAsArray = storeFileIntoArray(file);

        File newFile = new File("C:\\Users\\Intel\\IdeaProjects\\java-exercises\\src\\main\\resources\\test-output.txt");
        writeToFile(file, newFile);

        appendToFile(newFile, "lorem ipsum");

        readLines(file, 3);

        printLongestWord(file);
    }

    /**
     * 1. Write a Java program to get a list of all file/directory names from the given.
     *
     * @param file
     * @return
     */
    private static String[] getListOfFiles(File file) {
        return file.list();
    }

    /**
     * 2. Write a Java program to get specific files by extensions from a specified folder.
     *
     * @param file
     * @param extension
     * @return
     */
    private static File[] getListOfFilesByExtension(File file, String extension) {
        return file.listFiles((dir, name) -> name.toLowerCase().endsWith(extension));

    }

    /**
     * 3. Write a Java program to check if a file or directory specified by pathname exists or not.
     *
     * @param file
     * @return
     */
    private static boolean exists(File file) {
        return file.exists();
    }

    /**
     * 4. Write a Java program to check if a file or directory has read and write permission.
     *
     * @param file
     * @return
     */
    private static boolean hasReadAndWritePermission(File file) {
        return file.canRead() && file.canWrite();
    }

    /**
     * 5. Write a Java program to check if given pathname is a directory or a file.
     *
     * @param file
     * @return
     */
    private static boolean isDirectory(File file) {
        return file.isDirectory();
    }

    /**
     * 6. Write a Java program to compare two files lexicographically.
     * According to Wikipedia:
     * In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order,
     * alphabetical order or lexicographic(al) product) is a generalization of the way the alphabetical order of
     * words is based on the alphabetical order of their component letters. This generalization consists primarily
     * in defining a total order over the sequences (often called words in computer science) of elements of a finite
     * totally ordered set, often called alphabet.
     *
     * @param first
     * @param second
     * @return
     */
    private static boolean compare(File first, File second) {
        return first.compareTo(second) == 1;
    }

    /**
     * 7. Write a Java program to get last modified time of a file.
     *
     * @param file
     * @return
     */
    private static long lastModifiedTime(File file) {
        return file.lastModified();
    }

    /**
     * 8. Write Java program to read input from java console.
     */
    private static void readInputfromConsole() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter message:");
        try {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 9. Write a Java program to get file size in bytes, kb, mb.
     *
     * @param file
     */
    private static void printSize(File file) {
        System.out.println(String.format("File size in bytes: %d, kb: %d, mb: %d",
                fileSizeInBytes(file),
                fileSizeInKBytes(file),
                fileSizeInMBytes(file)));
    }

    private static long fileSizeInBytes(File file) {
        return file.length();
    }

    private static long fileSizeInKBytes(File file) {
        return fileSizeInBytes(file) / 1024;
    }

    private static long fileSizeInMBytes(File file) {
        return fileSizeInKBytes(file) / 1024;
    }

    /**
     * 10. Write a Java program to read contents from a file into byte array.
     *
     * @param file
     */
    private static void readFileIntoByte(File file) {
        byte[] bytes = new byte[1024 * 1024];
        System.out.println("Read contents from a file into byte array");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            fileInputStream.read();
            int countRead = 0;
            while ((countRead = fileInputStream.read(bytes)) > 0) {
                System.out.println(countRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 11. Write a Java program to read a file content line by line.
     *
     * @param file
     */
    private static void readFile(File file) {
        System.out.println("Read a file content line by line:");
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 12. Write a Java program to read a plain text file.
     *
     * @param file
     */
    private static void readPlainTextFile(File file) {
        System.out.println("Read a plain text file:");
        StringBuilder builder = new StringBuilder();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
            }
            System.out.println(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 13. Write a java program to read a file line by line and store it into a variable.
     *
     * @param file
     */
    private static String storeFileIntoString(File file) {
        String fileContent = "";
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                fileContent += line;
            }
            System.out.println(fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    /**
     * 14. Write a Java program to store text file content line by line into an array.
     *
     * @param file
     * @return
     */
    private static Object[] storeFileIntoArray(File file) {
        List<String> fileContent = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent.toArray();
    }

    /**
     * 15. Write a Java program to write and read a plain text file.
     *
     * @param fromFile
     * @param toFile
     */
    private static void writeToFile(File fromFile, File toFile) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fromFile));
             FileWriter writer = new FileWriter(toFile)) {
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 16. Write a Java program to append text to an existing file.
     *
     * @param file
     * @param text
     */
    private static void appendToFile(File file, String text) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.append(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 17. Write a Java program to read first 3 lines from a file.
     *
     * @param file
     * @param nrOfLinesToRead
     */
    private static void readLines(File file, int nrOfLinesToRead) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (nrOfLinesToRead > 0 && (line = reader.readLine()) != null) {
                System.out.println(line);
                nrOfLinesToRead--;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 18. Write a Java program to find the longest word in a text file.
     *
     * @param file
     */
    private static void printLongestWord(File file) {
        String line;
        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                String[] result = line.split("\\s|\\.|,|;|!|\\?");
                for (String s : result) {
                    if (s.length() > longestWord.length()) {
                        longestWord = s;
                    }
                }
            }
            System.out.println(String.format("Word with maximum leghts is: %s", longestWord));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

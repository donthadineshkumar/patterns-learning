package patterns.structural.proxy;

/**
 * Date: 10/31/13
 * Time: 10:19 AM
 */
public class Main {
    public static void main(String[] args) {
        FileProxy file1 = new FileProxy("/usr/bob/1.txt", "bob", "ezh");
        FileProxy file2 = new FileProxy("/usr/bob/1.txt", "bob", "1111");

        file2.create();
        int size = file2.size();
        System.out.println(String.format("Size is %s", size));

        file1.create();
    }
}

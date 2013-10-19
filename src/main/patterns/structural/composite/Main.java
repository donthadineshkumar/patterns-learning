package patterns.structural.composite;

/**
 * Date: 10/19/13
 * Time: 11:02 AM
 */
public class Main {
    public static void main(String[] args) {
        File file1 = new File("1.txt");
        File file2 = new File("2.txt");
        File file3 = new File("3.txt");

        Folder folder1 = new Folder("folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("folder2");
        folder2.add(file3);
        folder2.add(file1);

        Folder folder3 = new Folder("folder3");
        folder3.add(file1);
        folder3.add(file2);
        folder3.add(file3);

        Folder folder4 = new Folder("/root/");

        folder4.add(folder1);
        folder4.add(folder2);
        folder4.add(folder3);

        folder4.print();
    }
}

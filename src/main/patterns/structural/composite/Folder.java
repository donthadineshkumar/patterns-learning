package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 10/19/13
 * Time: 11:09 AM
 */
public class Folder extends AbstractFileStructureElement {
    private List<FileStructureElement> fileStructureElements = new ArrayList<FileStructureElement>();

    public Folder(String name) {
        super(name);
    }

    public void add(FileStructureElement element){
        fileStructureElements.add(element);
    }

    public void remove(FileStructureElement element){
        fileStructureElements.remove(element);
    }

    @Override
    String getType() {
        return "FOLDER";
    }

    @Override
    public void print() {
        System.out.println(getType() + " = " + name);
        for(FileStructureElement element : fileStructureElements){
            element.print();
        }
    }
}

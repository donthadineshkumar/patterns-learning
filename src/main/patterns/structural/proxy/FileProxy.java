package patterns.structural.proxy;

/**
 * Date: 10/31/13
 * Time: 10:27 AM
 */
public class FileProxy implements File {
    private File file;
    private String userName;
    private String password;

    public FileProxy(String fileName, String userName, String password) {
        file = new FileImpl(fileName);
        this.userName = userName;
        this.password = password;
    }

    @Override
    public int size() {
        auth();
        return file.size();
    }

    @Override
    public void delete() {
        auth();
        file.delete();
    }

    @Override
    public void create() {
        auth();
        file.create();
    }

    private boolean auth(){
        if(userName.equals("bob") && password.equals("1111")){
            return true;
        }
        throw new IllegalStateException(String.format("You don't have access to %s", file));
    }
}

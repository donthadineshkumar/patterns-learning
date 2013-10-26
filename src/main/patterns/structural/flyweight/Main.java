package patterns.structural.flyweight;

/**
 * Date: 10/26/13
 * Time: 1:21 PM
 */
public class Main {
    public static void main(String[] args) {
        DBContext test_db = FlyweightContext.getDBContext("test_db");
        DBContext inno_db = FlyweightContext.getDBContext("inno_db");
        DBContext x_db = FlyweightContext.getDBContext("inno_db");

        if(inno_db == x_db){
            System.out.println("The same objects");
        }
    }
}

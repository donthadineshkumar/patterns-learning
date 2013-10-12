package patterns.structural.adapter.model;

/**
 * Date: 10/12/13
 * Time: 4:54 PM
 */
public class Minolta {
    private StringBuilder pipe;

    public void preparePrinter(){
        pipe = new StringBuilder();
    }

    public void clearData(){
        pipe = null;
    }

    public void addText(String row){
        pipe.append(row);
    }

    public String result(){
        return pipe.toString();
    }

    public String info(){
        return "Minolta Printer inc.";
    }
}

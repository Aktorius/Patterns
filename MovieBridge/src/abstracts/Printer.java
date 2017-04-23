package abstracts;

import domain.Detail;
import interfaces.Formatter;

import java.util.List;

/**
 * Created by Aktorius on 23/04/2017.
 */
public abstract class Printer {

    public String print (Formatter formater){
        return formater.format(getHeder(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeder();
}

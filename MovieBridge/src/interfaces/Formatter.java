package interfaces;

import domain.Detail;

import java.util.List;

/**
 * Created by Aktorius on 23/04/2017.
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}

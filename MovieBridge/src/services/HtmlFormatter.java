package services;

import domain.Detail;
import interfaces.Formatter;

import java.util.List;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>\n");
        builder.append("\t<th>");
        builder.append("Classification");
        builder.append("</th>\n");
        builder.append("\t<th>");
        builder.append("Header");
        builder.append("</th>\n");

        for (Detail detail : details){
            builder.append("\t<tr>\n");
            builder.append("\t\t<td>");
            builder.append(detail.getLabel());
            builder.append("</td>\n");
            builder.append("\t<tr>\n");
            builder.append("\t<tr>\n");
            builder.append("\t\t<td>");
            builder.append(detail.getValue());
            builder.append("</td>\n");
            builder.append("\t<tr>\n");
        }

        builder.append("</table>");

        return builder.toString();
    }
}

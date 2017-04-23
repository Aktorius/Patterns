package interfaces;

/**
 * Created by Aktorius on 23/04/2017.
 */
public interface Twitter {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}

package services;

import interfaces.Twitter;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class TwitterServiceStub implements Twitter{
    @Override
    public String getTimeline(String screenName) {
        return "My great Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}

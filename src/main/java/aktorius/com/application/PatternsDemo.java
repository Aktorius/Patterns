package main.java.aktorius.com.application;

import interfaces.Twitter;
import security.SecurityProxy;
import services.TwitterServiceStub;

/**
 * Created by Aktorius on 20/04/2017.
 */
public class PatternsDemo {

    public static void main (String[] args){
        Twitter service = (Twitter) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline(new String()));
    }
}

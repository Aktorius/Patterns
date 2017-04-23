package services;

import interfaces.Twitter;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

/**
 * Created by Aktorius on 23/04/2017.
 */
public class TwitterService implements Twitter{

    private static final String TWITTER_CONSUMMER_KEY = "MQ5DMDbgNUNYUGQwmX0CMb2Rh";
    private static final String TWITTER_SECRET_KEY = "iKCcxklsiKt6hJ1TGYoiDcraYjMKMSpldXj6S5zwng3vsHyKuk";
    private static final String TWITTER_ACCESS_TOKEN = "1381893816-XAeFHKqEUHdqdyLz24HKCdxBTLUizf5uBP7QdUB";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "7Z6SQdUoXAczWMkIr2Nz2HzD59iGTbtxGNmINgeqm3Q7X";

    @Override
    public String getTimeline(String screenName) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory twitterFactory = new TwitterFactory(cb.build());
        twitter4j.Twitter twitter = twitterFactory.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets){
                    stringBuilder.append("@" + tweet.getUser().getScreenName() +" - "+ tweet.getText());
                    stringBuilder.append("\n");
                }
            }while ((query = result.nextQuery()) != null);
        }catch (TwitterException te){
            te.printStackTrace();
            System.out.println("Failes to search tweets: "+ te.getMessage());
        }

        return stringBuilder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}

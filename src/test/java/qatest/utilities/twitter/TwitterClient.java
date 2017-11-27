package qatest.utilities.twitter;


import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;


import java.io.IOException;
import java.net.URI;

public class TwitterClient{
    protected final static String UrlProject = "https://api.twitter.com/1.1/statuses/user_timeline.json?";
    static String consumerKey = "5ZsIeFvWCjOimLmDxOC9P641N";
    static String consumerSecret = "qjugAda0qLGFoivFR59bVEiA05CtLHLdoL1kAqbYJG9667M7lA";
    static String accessTokenSecret = "LS3yDr9wYbTAzYR1OowQY3Ok53FQ6vI0q4dcol1RNTwAq";
    static String accessTok = "115869792-UjKePnzd9u3FTdPIEwsNNrPbN1BwOfFkExzXyzkQ";
    private final CloseableHttpClient httpclient = HttpClientBuilder.create().build();

    public TwitterClient(){

    }

    protected String GetDataRequest(URI url){
        try {
            Twitter twitter = new TwitterFactory().getInstance();

            twitter.setOAuthConsumer(consumerKey, consumerSecret);
            AccessToken accessToken = new AccessToken(accessTok,
                    accessTokenSecret);

            twitter.setOAuthAccessToken(accessToken);

            twitter.updateStatus("Post using Twitter4J Again");

            System.out.println("Successfully updated the status in Twitter.");
        } catch (TwitterException te) {
            te.printStackTrace();
        }
        return null;
    }
}
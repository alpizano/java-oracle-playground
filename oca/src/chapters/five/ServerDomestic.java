package chapters.five;

// PARENT CLASS
public class ServerDomestic {
    protected String serverUid = "1111999";
    protected String networkId = "0000";
    protected String anotherVar = "Domestic";

    private String test = "inParent";

    public String getTest() {
        return test;
    }

    public Server buildHttpRequest() {
        Server server = new Server(serverUid,networkId,getTest());
        return server;
    }

}

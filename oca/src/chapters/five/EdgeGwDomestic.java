package chapters.five;

// PARENT CLASS
public class EdgeGwDomestic {
    protected String edgeGwUid = "2M2836045K";
    protected String networkId = "105830";
    protected String anotherVar = "Domestic";

    private String test = "inParent";

    public String getTest() {
        return test;
    }

    public EdgeGw buildHttpRequest() {
        EdgeGw edgeGw = new EdgeGw(edgeGwUid,networkId,getTest());
        return edgeGw;
    }

}

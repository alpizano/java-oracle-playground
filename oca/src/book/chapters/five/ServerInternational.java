package book.chapters.five;

// CHILD CLASS
public class ServerInternational extends ServerDomestic {
    protected String serverUid = "111100000";
    protected String networkId = "55555";
    protected String anotherVar = "International";
    private String test = "inChild";

    @Override
    public String getTest() {
        return test;
    }

    @Override
    public Server buildHttpRequest() {
        System.out.println(super.serverUid);
        return super.buildHttpRequest();
    }

    public void testMethod() {
        super.anotherVar = anotherVar;
    }

    {
        System.out.println(this.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        ServerInternational myServer = new ServerInternational();

        Server answer = myServer.buildHttpRequest();
        System.out.println(answer.serverUid);
        System.out.println(answer.networkId);
        System.out.println(answer.test);

    }
}

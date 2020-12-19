package chapters.five;

// CHILD CLASS
public class EdgeGwInternational extends EdgeGwDomestic {
    protected String edgeGwUid = "2M290702XY";
    protected String networkId = "107676";
    protected String anotherVar = "International";
    private String test = "inChild";

    @Override
    public String getTest() {
        return test;
    }

    @Override
    public EdgeGw buildHttpRequest() {
        System.out.println(super.edgeGwUid);
        return super.buildHttpRequest();
    }

    public void testMethod() {
        super.anotherVar = anotherVar;
    }

    {
        System.out.println(this.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        EdgeGwInternational edgegw = new EdgeGwInternational();



        EdgeGw answer = edgegw.buildHttpRequest();
        System.out.println(answer.edgeGwUid);
        System.out.println(answer.networkId);
        System.out.println(answer.test);

    }
}

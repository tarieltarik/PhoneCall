public class Iphone extends  Phone{
    private String market = "AppStore";
    String model="Iphone";
    String phoneNumber,takeOrReject;

    public Iphone(){
        super();
        phoneNumber = super.phoneNumber;
        takeOrReject = super.takeOrReject;
    }

    protected String DownloadApp(String AppName){
        return "Download" + AppName + " from: " + market;
    }

}

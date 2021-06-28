public class Android extends Phone{
    private String market = "PlayMarket";
    String model="Android";
    String phoneNumber,takeOrReject;

    public Android(){
        super();
        phoneNumber = super.phoneNumber;
        takeOrReject = super.takeOrReject;
    }

    protected String DownloadApp(String AppName){
        return "Download " + AppName + " from: " + market;
    }

    public String getModel() {
        return model;
    }
}

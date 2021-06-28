public class User {
    private String userName = "Tariel";
    public String number;
    Android android = new Android();
    Iphone iphone = new Iphone();

    public String getUserName() {
        return userName;
    }

    public String UserCall(String number){
        return android.call(number);
    }

    public String callsToUSer(String number,String takeOrReject){
        if(takeOrReject=="take"){
            return userName + " take phone from : " + number;
        }else{
            return userName + " reject a call from: " + number;
        }
    }

    public String downlaodApp(String AppName,String model){
        if(model=="Android"){
            return android.DownloadApp(AppName);
        }else if(model=="Iphone"){
            return iphone.DownloadApp(AppName);
        }else{
            return "I haven't that phone";
        }

    }

    public void setNumber(String number) {
        this.number = number;
    }
}

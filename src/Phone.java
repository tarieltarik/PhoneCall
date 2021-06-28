public abstract class Phone {
    protected String model = "Phone";
    String phoneNumber= " +996 ",takeOrReject = "take";

    protected Phone(){
    }
    protected String takeCall(String phoneNumber){
        return "Phone" + model + " take call  " + phoneNumber;
    }

    protected String call(String phoneNumber){
        return "Calling to: " + phoneNumber;
    }

    protected String rejectCall(int phoneNumber){
        return "Reject calling to: " + phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setTakeOrReject(String takeOrReject) {
        this.takeOrReject = takeOrReject;
    }

    public String getTakeOrReject() {
        return takeOrReject;
    }
}


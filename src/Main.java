public class Main {
    public static void main(String[] args){
        User Tariel = new User();
        Tariel.setNumber("701952995");
        System.out.println(Tariel.getUserName());
        System.out.println(Tariel.UserCall(Tariel.number));
        System.out.println(Tariel.callsToUSer(Tariel.number,"take"));
        System.out.println(Tariel.callsToUSer(Tariel.number,"reject"));
        System.out.println(Tariel.UserCall("701952995"));
        System.out.println(Tariel.downlaodApp("YouTube","Android"));
        System.out.println(Tariel.downlaodApp("Instagram","Iphone"));
        System.out.println(Tariel.downlaodApp("Instagram","Nokia"));
    }
}

package SpringCore.AppWithoutSpring.IS_ARelation;

public class notificationTest {
    public static void main(String[] args) {
        WhatsappNotification notification = new WhatsappNotification();


    }
}
//problem : Too Much Inheritance(100 method all load )
//eMailNotification IS-A Notification
//Inheritance Explosion
//Sol: prefer composition(has-A Relation) over Inheritance
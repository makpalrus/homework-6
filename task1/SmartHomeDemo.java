package task1;
public class SmartHomeDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        AirConditioner ac = new AirConditioner();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command acStart = new ACStartCommand(ac);

        SmartRemote remote = new SmartRemote();

        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();

        remote.setCommand(acStart);
        remote.pressButton();
        remote.pressUndo();
    }
}

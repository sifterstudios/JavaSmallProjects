package trafficlights;

import static trafficlights.TrafficLight.*;

public class TrafficLights {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = RED;
        while (true) {
            Thread.sleep(3000);
            System.out.println("light = " + light);
            light = switch (light) {
                case RED -> REDANDYELLOW;
                case REDANDYELLOW -> GREEN;
                case GREEN -> YELLOW;
                case YELLOW -> RED;
                default -> RED;
            };
        }
    }
}

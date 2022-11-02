package trafficlights;

import static trafficlights.TrafficLight.*;

public class TrafficLights {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = RED;
        while (true) {
            Thread.sleep(3000);
            System.out.println("light = " + light);
            switch (light) {
                case RED:
                    light = REDANDYELLOW;
                    break;
                case REDANDYELLOW:
                    light = GREEN;
                    break;
                case GREEN:
                    light = YELLOW;
                    break;
                case YELLOW:
                    light = RED;
                    break;
                default:
                    light = RED;

            }
        }
    }
}

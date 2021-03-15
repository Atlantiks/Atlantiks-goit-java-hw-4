package homework4;

public class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}

class Altimeter {
    @Override
    public String toString() {
        return "Measure height";
    }
}

class AirGauge {
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}

class ControlPanel {
    private Altimeter altimeter  = new Altimeter();
    private AirGauge airGauge   = new AirGauge();

    public void control() {
        System.out.print(altimeter);
        System.out.print(" ");
        System.out.print(airGauge);
    }

}

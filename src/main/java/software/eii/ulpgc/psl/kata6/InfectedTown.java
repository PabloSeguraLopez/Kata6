package software.eii.ulpgc.psl.kata6;

import java.util.Arrays;

public class InfectedTown {
    private final String citizens;

    public InfectedTown(String citizens) {
        this.citizens = citizens;
    }

    public String purge() {
        return String.join(" ",
                Arrays.stream(citizens.split(" "))
                .filter(c-> !(c.contains("i") || c.contains("I")))
                .toList());
    }
}

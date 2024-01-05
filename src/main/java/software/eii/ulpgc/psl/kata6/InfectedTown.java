package software.eii.ulpgc.psl.kata6;

public class InfectedTown {
    private final String citizens;

    public InfectedTown(String citizens) {
        this.citizens = citizens;
    }

    public String purge() {
        if (citizens.contains("i")) return "";
        return citizens;
    }
}

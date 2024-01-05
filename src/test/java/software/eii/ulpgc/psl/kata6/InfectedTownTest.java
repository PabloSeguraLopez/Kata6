package software.eii.ulpgc.psl.kata6;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class InfectedTownTest {
    @Test
    public void shouldReturnEmptyIfTownIsEmpty() {
        InfectedTown town = new InfectedTown("");
        String townPurged = town.purge();
        Assertions.assertThat(town.purge()).isEqualTo("");
    }
    @Test
    public void shouldReturnEmptyIfOnlyOneBuildingAndInfectedWithAni() {
        InfectedTown town = new InfectedTown("mirada");
        String townPurged = town.purge();
        Assertions.assertThat(town.purge()).isEqualTo("");
    }
}

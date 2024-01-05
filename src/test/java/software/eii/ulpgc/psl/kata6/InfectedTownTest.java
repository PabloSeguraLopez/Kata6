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
}

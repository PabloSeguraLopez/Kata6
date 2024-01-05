package software.eii.ulpgc.psl.kata6;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class InfectedTownTest {
    @Test
    public void shouldReturnEmptyIfTownIsEmpty() {
        InfectedTown town = new InfectedTown("");
        Assertions.assertThat(town.purge()).isEqualTo("");
    }
    @Test
    public void shouldReturnEmptyIfOnlyOneBuildingAndInfectedWithAni() {
        InfectedTown town = new InfectedTown("mirada");
        Assertions.assertThat(town.purge()).isEqualTo("");
    }
    @Test
    public void shouldReturnEmptyIfOnlyOneBuildingAndInfectedWithAnI() {
        InfectedTown town = new InfectedTown("Intel");
        Assertions.assertThat(town.purge()).isEqualTo("");
    }
    @Test
    public void shouldReturnBuildingsThatAreNotInfected() {
        InfectedTown town = new InfectedTown("mi casa");
        Assertions.assertThat(town.purge()).isEqualTo("casa");
    }
}

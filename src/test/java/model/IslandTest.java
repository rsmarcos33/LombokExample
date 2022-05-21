package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandTest {
    String name = "Lombok";
    String country = "Indonesia";
    String sea = "Java Sea/Indian Ocean";

    @Test
    public void givenValidNameCountryAndSea_whenGetNameCountryAndSea_thenExpectedValuesReturned(){
        Island island = new Island("Lombok", "Indonesia", "Java Sea/Indian Ocean");
        assertEquals(this.name, island.getName());
        assertEquals(this.country, island.getCountry());
        assertEquals(this.sea, island.getSea());
    }
}
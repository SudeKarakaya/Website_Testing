package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void search() {
        String itemName = "Mavi gömlek";
        assertTrue(Search.search(itemName));
    }
}
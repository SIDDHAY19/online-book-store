import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookStoreTest {

    @Test
    void testWelcomeMessage() {
        assertEquals(
            "Welcome to Online Book Store",
            BookStore.getMessage()
        );
    }
}
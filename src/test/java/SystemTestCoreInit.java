import hu.lechnerkozpont.elkepesztok.ambruspal.CoreInit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemTestCoreInit {

    CoreInit coreInit = new CoreInit();
    @Test
    void validStringTest() {
        String response = coreInit.whoIsTheStorage();
        assertEquals("Bootcamp", response);
    }
}

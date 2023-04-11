import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Junit {

    @Test
    public void thereIsNoEnteringOfLine2IntoLine1 (){
        String a = "абвг";
        String b = "де";
        assertEquals(0, Main.Entering(a,b), "Test failed");
    }

    @Test
    public void line2EnteringIntoLine1OnlyOnce (){
        String a = "аб";
        String b = "аб";
        assertEquals(1, Main.Entering(a,b), "Test failed");
    }

    @Test
    public void line2EnteringIntoLine1SeveralTimes (){
        String a = "абабаб";
        String b = "аб";
        assertEquals(3, Main.Entering(a,b), "Test failed");
    }

    @Test
    public void line1IsEmpty(){
        String a = "";
        String b = "ав";
        assertEquals(0, Main.Entering(a,b), "Test failed");
    }

    @Test
    public void line2IsEmpty (){
        assertThrows(Exception.class, ()->{
            Main.Entering("аб","");}
        );
    }
}
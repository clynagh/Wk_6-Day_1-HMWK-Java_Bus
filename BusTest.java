import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

  Bus bus;

  @Before
  public void before(){
    bus = new Bus("Henry");
}

@Test
public void hasName(){
  assertEquals("Henry", bus.getName() );
}



}
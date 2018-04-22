
import com.example.dp.ADuck;
import com.example.dp.Duck;
import com.example.dp.fly.FlyWithWings;
import org.junit.Test;

public class StrategyTest {
    @Test
    public void test() {
        Duck duck = new ADuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
    }
}

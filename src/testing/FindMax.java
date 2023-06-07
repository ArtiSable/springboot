package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class FindMax {
    @Test
    public void testFindMax() {
        int result = MaxNumber.findMax(5, 10, 3);
        Assert.assertEquals(10, result);
    }
}
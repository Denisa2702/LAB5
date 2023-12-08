package Teste;

import ex2.PerecheNumere;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPerecheNumere {

    @Test
    public void test1_suma()
    {
        PerecheNumere p=new PerecheNumere(1,1);
        assertTrue(p.suma()==2);
    }

    @Test
    public void test2_suma()
    {
        PerecheNumere p=new PerecheNumere(3,4);
        assertEquals(7, p.suma());
    }

}

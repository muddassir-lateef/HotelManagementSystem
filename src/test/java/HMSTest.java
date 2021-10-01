import static org.junit.jupiter.api.Assertions.*;

class HMSTest {

    @org.junit.jupiter.api.Test
    void Test() {
        HMS h=new HMS();
        Assert.assertequals(h.bookroom("Ali"),false) ;
        Assert.assertequals(h.Addroom() ,true) ;
        Assert.assertequals(h.bookroom("Ali"),true) ;

    }

}
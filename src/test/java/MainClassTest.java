import org.junit.*;


//тесты в junit следуют не по порядку, поэтому не стоит строить зависимости по порядку тестирования методов
public class MainClassTest {

    //выполняется перед тестом
//    @BeforeClass
//    public void beforeClassMethod(){
//
//    }

    @Test
//    @Ignore //какой-то из тестов можно пометить игнором и не будет выполняться
    public  void method1(){
        //выполнили действия,после их выполнения проводим проверку с помощью assert
        Assert.assertTrue("Values are equals!" , 1+1 == 2);
//        Assert.assertFalse(1+1 == 10);

    }
    @Test
//    @Ignore //какой-то из тестов можно пометить игнором и не будет выполняться
    public  void method2(){
        //выполнили действия,после их выполнения проводим проверку с помощью assert
        Assert.assertFalse("Values are not equals!" , 1+1 == 3);


    }


//    @Test
//    public  void method2(){
//        Assert.assertNull();//при получении значения Null тест успешный
//        Assert.assertNotNull();//при получении значения Null тест провален
//
//    }


    @Test
    public  void method3(){
    Assert.assertEquals("Values are not equals!", 20, 5+5);//ожидаемый результат, реальный результат
        //сообщение указывается в ассерте для того, чтобы текст был выведен в случае ошибки
//    Assert.assertNotEquals(10, 2+2);//если ожидание/реальность не совпадают, то тест успешный

    }

//    // будет выполняться после каждого тестового метода
//    @After
//    public void  tearDown(){
//
//
//    }
//
//
//
//    //будет выполняться перед каждым тестовым методом
//    @Before
//    public void setUp(){
//
//    }
//
//
//    //выполняется после теста
//    @AfterClass
//    public void afterClassMethod(){
//
//    }
//

}

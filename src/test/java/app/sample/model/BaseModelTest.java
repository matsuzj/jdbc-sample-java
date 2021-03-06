package app.sample.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.dbunit.JdbcDatabaseTester;

public class BaseModelTest{

    // テストクラスのstaticイニシャライザの後に呼ばれる。
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        //System.out.println("@BeforeClass call");
    }

    // テストクラス実行後に実行したいメソッドに付与
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        //System.out.println("@AfterClass call");
    }

    // テストクラスのコンストラクタの後に呼ばれる。
    @Before
    public void setUp() throws Exception {
        //System.out.println("@Before call");
    }

    // テストメソッド実行後に実行したいメソッドに付与
    @After
    public void tearDown() throws Exception {
        //System.out.println("@After call");
    }

}



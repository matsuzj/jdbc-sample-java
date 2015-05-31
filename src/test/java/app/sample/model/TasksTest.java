package app.sample.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import app.sample.bean.TasksBean;
import app.sample.model.Tasks;


public class TasksTest {

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

    // テストメソッドに付与
    @Test
    public void selectAllTest() throws SQLException {
        Tasks task = new Tasks();
        List taskList = task.selectAll();
        assertEquals(taskList.size(),5);
    }

    // テストメソッドに付与
    @Test
    public void selectByIdTest() throws SQLException {
        Tasks task = new Tasks();
        TasksBean taskOne = task.selectById(5);
        assertEquals(taskOne.getId(),5);

    }



}
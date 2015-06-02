package app.sample.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.SQLException;
import java.sql.Timestamp;
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

    // テストメソッドに付与
    @Test
    public void selectByLikeTitleTest() throws SQLException {
        Tasks task = new Tasks();
        TasksBean taskOne = task.selectLikeTitle("title2");
        assertEquals(taskOne.getId(),2);
    }

    // テストメソッドに付与
/*
    @Test
    public void insertTest() throws SQLException{
        Tasks task_instance = new Tasks();
        TasksBean tasksbean = new TasksBean();
        Timestamp now_time = new Timestamp(System.currentTimeMillis());
        tasksbean.setTitle("insertTest");
        tasksbean.setFinished(1);
        tasksbean.setVersion(1234);
        tasksbean.setCreatedAt(now_time);
        tasksbean.setUpdatedAt(now_time);
        task_instance.insert(tasksbean);
        //assertEquals(task_instance.insert(tasksbean),2);
    }
*/
    // テストメソッドに付与
    //@Test
    //public void deleteByIdTest() throws SQLException {
    //    Tasks task = new Tasks();
    //    int taskOne = task.deleteById(3);
    //    assertEquals(taskOne,1);
    //}




}
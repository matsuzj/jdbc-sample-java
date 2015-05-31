package app.sample.bean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.reflect.Field;
import java.sql.Timestamp;

import static org.junit.Assert.*;

public class TasksBeanTest {

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
    public void getIdTest() throws Exception {
        TasksBean tasks = new TasksBean();
        int id = 10;
        // クラスからフィールド情報を取得する．
        // java.lang.classのgetDeclaredFieldメソッドを使用します．引数には取得したいフィールド名(String)を指定します。
        // 戻り値はjava.lang.reflect.Fieldなので，その型でフィールド情報を保持します．
        Field idField = tasks.getClass().getDeclaredField("id");
        // FieldクラスのsetAccessibleメソッドを使用します．
        // 引数にtrueを指定することで，フィールド情報にアクセスできるようになります．
        idField.setAccessible(true);
        // フィールド情報から値をセットする
        idField.set(tasks, id);
        // フィールド情報から値をゲットして値を比べる
        assertEquals(id, tasks.getId());
    }

    // テストメソッドに付与
    @Test
    public void setIdTest() throws Exception {
        TasksBean tasks = new TasksBean();
        int id = 10;
        Field idField = tasks.getClass().getDeclaredField("id");
        idField.setAccessible(true);
        idField.set(tasks, id);
        assertEquals(id, idField.get(tasks));
    }

    // テストメソッドに付与
    @Test
    public void getTitleTest() throws Exception {
        TasksBean tasks = new TasksBean();
        String title = new String("Title");
        Field titleField = tasks.getClass().getDeclaredField("title");
        titleField.setAccessible(true);
        titleField.set(tasks, title);
        assertEquals(title, tasks.getTitle());
    }

    // テストメソッドに付与
    @Test
    public void setTitleTest() throws Exception {
        TasksBean tasks = new TasksBean();
        String title = new String("Title");
        Field titleField = tasks.getClass().getDeclaredField("title");
        titleField.setAccessible(true);
        titleField.set(tasks, title);
        assertEquals(title, titleField.get(tasks));
    }

    // テストメソッドに付与
    @Test
    public void getFinishedTest() throws Exception {
        TasksBean tasks = new TasksBean();
        int finished = 1;
        Field finishedField = tasks.getClass().getDeclaredField("finished");
        finishedField.setAccessible(true);
        finishedField.set(tasks, finished);
        assertEquals(finished, tasks.getFinished());
    }

    // テストメソッドに付与
    @Test
    public void setFinishedTest() throws Exception {
        TasksBean tasks = new TasksBean();
        int finished = 1;
        Field finishedField = tasks.getClass().getDeclaredField("finished");
        finishedField.setAccessible(true);
        finishedField.set(tasks, finished);
        assertEquals(finished, finishedField.get(tasks));
    }

    // テストメソッドに付与
    @Test
    public void getVersionTest() throws Exception {
        TasksBean tasks = new TasksBean();
        int version = 1111;
        Field versionField = tasks.getClass().getDeclaredField("version");
        versionField.setAccessible(true);
        versionField.set(tasks, version);
        assertEquals(version, tasks.getVersion());
    }

    // テストメソッドに付与
    @Test
    public void setVersionTest() throws Exception {
        TasksBean tasks = new TasksBean();
        int version = 1111;
        Field versionField = tasks.getClass().getDeclaredField("version");
        versionField.setAccessible(true);
        versionField.set(tasks, version);
        assertEquals(version, versionField.get(tasks));
    }

    // テストメソッドに付与
    @Test
    public void getCreatedAtTest() throws Exception {
        TasksBean tasks = new TasksBean();
        Timestamp created_at = new Timestamp(System.currentTimeMillis());
        Field createdAtField = tasks.getClass().getDeclaredField("created_at");
        createdAtField.setAccessible(true);
        createdAtField.set(tasks, created_at);
        assertEquals(created_at, tasks.getCreatedAt());
    }

    // テストメソッドに付与
    @Test
    public void setCreatedAtTest() throws Exception {
        TasksBean tasks = new TasksBean();
        Timestamp created_at = new Timestamp(System.currentTimeMillis());
        Field createdAtField = tasks.getClass().getDeclaredField("created_at");
        createdAtField.setAccessible(true);
        createdAtField.set(tasks, created_at);
        assertEquals(created_at, createdAtField.get(tasks));
    }

    // テストメソッドに付与
    @Test
    public void getUpdatedAtTest() throws Exception {
        TasksBean tasks = new TasksBean();
        Timestamp updated_at = new Timestamp(System.currentTimeMillis());
        Field updatedAtField = tasks.getClass().getDeclaredField("updated_at");
        updatedAtField.setAccessible(true);
        updatedAtField.set(tasks, updated_at);
        assertEquals(updated_at, tasks.getUpdatedAt());
    }

    // テストメソッドに付与
    @Test
    public void setUpdatedAt() throws Exception {
        TasksBean tasks = new TasksBean();
        Timestamp updated_at = new Timestamp(System.currentTimeMillis());
        Field updatedAtField = tasks.getClass().getDeclaredField("updated_at");
        updatedAtField.setAccessible(true);
        updatedAtField.set(tasks, updated_at);
        assertEquals(updated_at, updatedAtField.get(tasks));
    }

}

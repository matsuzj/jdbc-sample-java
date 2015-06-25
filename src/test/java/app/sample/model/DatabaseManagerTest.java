package app.sample.model;

import static org.junit.Assert.*;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import static org.hamcrest.core.IsInstanceOf.instanceOf;


public class DatabaseManagerTest extends BaseModelTest{

    // テストメソッドに付与
    @Test
    public void getConnectionTest() throws SQLException {
        Connection con = DatabaseManager.getConnection();
        assertThat(con, instanceOf(com.mysql.jdbc.JDBC4Connection.class));
        con.close();
    }


}
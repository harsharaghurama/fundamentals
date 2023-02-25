package com.algos.lld.designpatterns.singleton;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class ConnectionPoolTest {

    @Test
    public void testConnectionPool() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        assertNotNull("Calling getInstance should always give back a non null connection pool instance", connectionPool);
        ConnectionPool secondConnectionPool = ConnectionPool.getInstance();
        assertEquals("Calling getInstance multiple times should always return the same instance", connectionPool, secondConnectionPool);
    }
}

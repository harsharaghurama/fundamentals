package com.algos.lld.designpatterns.singleton;

public class ConnectionPool {

    private ConnectionPool () {
    }

    private static final class InstanceHolder {
        static final ConnectionPool instance = new ConnectionPool();
    }

    public static ConnectionPool getInstance() {
        return InstanceHolder.instance;
    }

    @Override
    public ConnectionPool clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This object cannot be cloned");
    }
}


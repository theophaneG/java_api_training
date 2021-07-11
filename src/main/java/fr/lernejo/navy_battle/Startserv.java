package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Startserv {

    final public HttpServer startserv ()
    {
        ExecutorService myservstart = Executors.newFixedThreadPool(1);
        HttpServer battleserv = null;
        try {
            battleserv = HttpServer.create(new InetSocketAddress(9876), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        battleserv.setExecutor(myservstart);
        return battleserv;
    }

}

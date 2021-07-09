package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Launcher {
    public static void main(String[] args) throws IOException {
        ExecutorService myservstart = Executors.newFixedThreadPool(1);
        HttpServer battleserv = HttpServer.create(new InetSocketAddress(9876), 0);
        battleserv.setExecutor(myservstart);
        battleserv.createContext("/ping", httpExchange -> {
            String body = "Hello";
            httpExchange.sendResponseHeaders(200, body.length());
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(body.getBytes());
            }
        });
        battleserv.start();
        //return battleserv;
    }

}


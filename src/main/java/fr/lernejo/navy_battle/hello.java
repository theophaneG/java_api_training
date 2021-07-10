package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;

import java.io.OutputStream;

public class hello {

    final public void run(String id,String path, HttpServer server) {
        server.createContext(path, httpExchange -> {
            String body = "hello";
            httpExchange.sendResponseHeaders(200, body.length());
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(body.getBytes());
            }
        });
    }
}

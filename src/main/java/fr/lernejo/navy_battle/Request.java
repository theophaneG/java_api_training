package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;

public interface Request {
    String id();
    String url();
    String message();
    HttpServer server();
    Boolean run(String id, String url, String message,HttpServer server);
}

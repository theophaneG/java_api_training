package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Launcher {


    public static void main(String[] args) {
        Hello myhello = new Hello();
        Startserv myserv = new Startserv();
        HttpServer battlerserv = myserv.startserv();
        myhello.run("/ping",battlerserv);
        battlerserv.start();
        }
}


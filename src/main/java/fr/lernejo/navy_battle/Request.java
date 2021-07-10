package fr.lernejo.navy_battle;

public interface Request {
    String id();
    String url();
    String message();
    Boolean run(String id, String url, String message);
}

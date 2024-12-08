package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        return new ConsoleLogger(); // Pour l'instant, retourne un ConsoleLogger
    }
}

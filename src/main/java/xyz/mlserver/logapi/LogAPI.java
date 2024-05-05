package xyz.mlserver.logapi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class LogAPI {
    @NotNull
    public static java.util.logging.Logger as(String title) { return java.util.logging.Logger.getLogger(title); }

    /**
     * Log an INFO message
     * @param name Logger name
     * @param msg Message
     */
    public static void info(String name, String msg) { Bukkit.getLogger().info("[" + name + "] " + msg); }

    /**
     * Log a WARNING message
     * @param name Logger name
     * @param msg Message
     */
    public static void warning(String name, String msg) { Bukkit.getLogger().warning("[" + name + "] " + msg); }

    /**
     * Log a SEVERE message
     * @param name Logger name
     * @param msg Message
     */
    public static void severe(String name, String msg) { Bukkit.getLogger().severe("[" + name + "] " + msg); }

    /**
     * Log a CONFIG message
     * @param name Logger name
     * @param msg Message
     */
    public static void config(String name, String msg) { Bukkit.getLogger().config("[" + name + "] " + msg); }

    /**
     * Log a FINE message
     * @param name Logger name
     * @param msg Message
     */
    public static void fine(String name, String msg) { Bukkit.getLogger().fine("[" + name + "] " + msg); }

    /**
     * Log a FINER message
     * @param name Logger name
     * @param msg Message
     */
    public static void finer(String name, String msg) { Bukkit.getLogger().finer("[" + name + "] " + msg); }

    /**
     * Log a FINEST message
     * @param name Logger name
     * @param msg Message
     */
    public static void finest(String name, String msg) { Bukkit.getLogger().finest("[" + name + "] " + msg); }

    /**
     * Log a DEBUG message
     * @param name Logger name
     * @param msg Message
     */
    public static void debug(String name, String msg) { Bukkit.getLogger().info("[" + name + "] [DEBUG] " + msg); }

    /**
     * Log a message to a file
     * @param name Logger name
     * @param msg Message
     * @param plugin Plugin
     */
    public static void toFile(String name, String msg, Plugin plugin) {
        try {
            File logFile = new File(plugin.getDataFolder(), "debug.log");
            if (!logFile.exists()) logFile.createNewFile();

            FileWriter fileWriter = new FileWriter(logFile, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("[" + name + "] " + getDateTime() + " " + msg);
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    /**
     * Log an INFO message
     * @param msg Message
     */
    public static void info(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            info(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a WARNING message
     * @param msg Message
     */
    public static void warning(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            warning(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a WARNING message
     * @param msg Message
     */
    public static void warn(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            warning(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a SEVERE message
     * @param msg Message
     */
    public static void severe(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            severe(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log an ERROR message
     * @param msg Message
     */
    public static void error(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            severe(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a CONFIG message
     * @param msg Message
     */
    public static void config(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            config(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a FINE message
     * @param msg Message
     */
    public static void fine(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            fine(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a FINER message
     * @param msg Message
     */
    public static void finer(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            finer(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a FINEST message
     * @param msg Message
     */
    public static void finest(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            finest(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a DEBUG message
     * @param msg Message
     */
    public static void debug(String msg) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            debug(name, msg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Log a message to a file
     * @param msg Message
     * @param plugin Plugin
     */
    public static void toFile(String msg, Plugin plugin) {
        try {
            String name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
            if (name.equalsIgnoreCase("")) name = "Anonymous";
            toFile(name, msg, plugin);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get the current date and time
     * @return Date and time
     */
    public static String getDateTime() {
        Format formatter = new SimpleDateFormat("[dd/MM/yyyy | HH:mm:ss]");
        return formatter.format(new Date());
    }

    @NotNull
    public static Logger of(String title) { return new Logger(title); }

    @NotNull
    public static Logger with(String title) { return new Logger(title); }

    @NotNull
    public static Logger getLogger(String title) { return new Logger(title); }

    @NotNull
    public static Logger getLogger() {
        String name;
        try {
            name = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()).getSimpleName();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (name.equalsIgnoreCase("")) name = "Anonymous";
        return new Logger(name);
    }

    public static final class Logger {
        private final String name;

        private Logger(String name) {
            this.name = name;
        }

        public void info(String msg) { LogAPI.info(name, msg); }
        public void warning(String msg) { LogAPI.warning(name, msg); }
        public void warn(String msg) { LogAPI.warning(name, msg); }
        public void severe(String msg) { LogAPI.severe(name, msg); }
        public void error(String msg) { LogAPI.severe(name, msg); }
        public void config(String msg) { LogAPI.config(name, msg); }
        public void fine(String msg) { LogAPI.fine(name, msg); }
        public void finer(String msg) { LogAPI.finer(name, msg); }
        public void finest(String msg) { LogAPI.finest(name, msg); }
        public void debug(String msg) { LogAPI.debug(name, msg); }
    }
}

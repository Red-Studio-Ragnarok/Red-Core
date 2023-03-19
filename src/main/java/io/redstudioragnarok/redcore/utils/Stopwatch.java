package io.redstudioragnarok.redcore.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * A utility class for measuring elapsed time in milliseconds between two points in the code.
 */
public class Stopwatch {

    /**
     * A private static variable that keeps track of the next ID to assign to a newly started stopwatch.
     */
    private static int nextId = 0;

    /**
     * A Map that stores the start time of each stopwatch identified by its ID.
     */
    private static final Map<Integer, Long> startTimes = new HashMap<>();

    /**
     * Starts a new stopwatch and returns its unique ID.
     *
     * @return The ID of the newly started stopwatch
     */
    public static int start() {
        int id = nextId++;

        startTimes.put(id, System.nanoTime());
        ModReference.log.info("Started chronometer with " + id);

        return id;
    }

    /**
     * Stops the stopwatch with the given ID and logs the elapsed time in milliseconds.
     *
     * @param id The ID of the stopwatch to stop
     */
    public static void stop(int id) {
        ModReference.log.info("Time elapsed for chronometer with id " + id + ": " + (System.nanoTime() - startTimes.get(id)) / 1_000_000 + "ms");
        startTimes.remove(id);
    }
}

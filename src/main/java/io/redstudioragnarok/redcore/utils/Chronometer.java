package io.redstudioragnarok.redcore.utils;

import java.util.HashMap;
import java.util.Map;

public class Chronometer {

    private static int nextId = 0;

    private static final Map<Integer, Long> startTimes = new HashMap<>();

    public static int start() {
        int id = nextId++;

        startTimes.put(id, System.nanoTime());
        ModReference.log.info("Started chronometer with " + id);

        return id;
    }

    public static void stop(int id) {
        startTimes.remove(id);
        ModReference.log.info("Time elapsed for chronometer with id " + id + ": " + (System.nanoTime() - startTimes.get(id)) / 1_000_000 + "ms");
    }
}

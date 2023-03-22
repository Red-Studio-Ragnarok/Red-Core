package io.redstudioragnarok.redcore.utils;

import java.io.*;
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
        double elapsed = (System.nanoTime() - startTimes.get(id)) / 1_000_000.0;
        String elapsedFormatted = String.format("%.2f", elapsed);

        ModReference.log.info("Time elapsed for chronometer with id " + id + ": " + elapsedFormatted + "ms");
        startTimes.remove(id);
    }

    /**
     * Stops the stopwatch with the given ID and writes the elapsed time of the stopwatch with the given ID to the specified file.
     *
     * @param id The ID of the stopwatch to write to file
     * @param filePath The path of the file to write to
     */
    public static void stopAndWriteToFile(int id, String filePath) {
        double elapsed = (System.nanoTime() - startTimes.get(id)) / 1_000_000.0;
        String elapsedFormatted = String.format("%.2f", elapsed);

        ModReference.log.info("Time elapsed for chronometer with id " + id + ": " + elapsedFormatted + "ms");
        startTimes.remove(id);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(elapsedFormatted);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads a file containing elapsed times and calculates their average.
     *
     * @param filePath The path of the file to read
     */
    public static void calculateAverage(String filePath) {
        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        if (count > 0) {
            String averageFormatted = String.format("%.2f", sum / count);
            ModReference.log.info("Average elapsed time between " + count + " entries: " + averageFormatted + "ms");
        } else
            ModReference.log.warn("No elapsed times found in file.");
    }
}

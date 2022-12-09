package com.company.map;

import com.company.Game;

import java.util.ArrayList;

/**
 * Lokace
 * @author Masáková Jr.
 * @version 0.1a
 * @since Java 16
 */
public class GameLocation {
    /**
     * Jméno lokace
     */
    private String name;
    /**
     * Max počet tahů
     */
    private byte maxMoves;
    /**
     * Současný počet tahů
     */
    private byte movesCount;
    /**
     * Dostupné cesty
     */
    private ArrayList<GameLocation> paths = new ArrayList<>();

    public GameLocation(String name, byte maxMoves, byte movesCount) {
        this.name = name;
        this.maxMoves = maxMoves;
        this.movesCount = movesCount;
    }

    /**
     * Vytvoří cestu
     */
    public void addPath(GameLocation gameLocation) {
        paths.add(gameLocation);
    }
    /**
     * Odstraní cestu
     */
    public void removePath(GameLocation gameLocation) {
        paths.remove(gameLocation);
    }

    /**
     * Ukáže dostupné cesty
     * @throws Exception
     */
    public void printPaths() throws Exception {
        System.out.println("Dostupné lokace:");
        if (paths.isEmpty()) {
            throw new Exception("Lokace " + name + " nemá další cesty");
        }
        for (GameLocation path : paths) {
            System.out.println(path.getName());
        }
    }

    /**
     *
     * @return název lokace
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name nový název lokace
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return max počet tahů
     */
    public byte getMaxMoves() {
        return maxMoves;
    }

    /**
     *
     * @param maxMoves nový max počet tahů
     */
    public void setMaxMoves(byte maxMoves) {
        this.maxMoves = maxMoves;
    }

    /**
     *
     * @return počet současných tahů
     */
    public byte getMovesCount() {
        return movesCount;
    }

    /**
     *
     * @param movesCount nový počet současných tahů
     */
    public void setMovesCount(byte movesCount) {
        this.movesCount = movesCount;
    }
}

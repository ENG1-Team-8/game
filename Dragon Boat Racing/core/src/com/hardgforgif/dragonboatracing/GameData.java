package com.hardgforgif.dragonboatracing;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameData {
    public static boolean mainMenu = true;
    public static boolean gamePlay = false;
    public static Music music = Gdx.audio.newMusic(Gdx.files.internal("Vibing.ogg"));

    public final static float METERS_TO_PIXELS = 100f;
    public static float TILES_TO_METERS;
    public static float PIXELS_TO_TILES;

    public static List<Float> obstaclesScales = Arrays.asList(-0.8f, 0f, 0f, 0f, 0f, -0.8f);
    public static UI currentUI = new MenuUI();

    public static float[][] startingPoints = new float[][]{{2.3f, 4f}, {4f, 4f}, {7f, 4f},{10f, 4f}};

    public static int currentLeg;
    public static float currentTimer = 0f;
}
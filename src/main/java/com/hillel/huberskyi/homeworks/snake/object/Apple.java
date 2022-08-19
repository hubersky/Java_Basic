package com.hillel.huberskyi.homeworks.snake.object;

import com.hillel.huberskyi.homeworks.snake.SnakeMain;

public class Apple {
    public int posY;
    public int posX;

    public Apple(int posY, int posX) {
        this.posY = posY;
        this.posX = posX;
    }

    public void setRandomPosition() {
        posX = Math.abs((int) (Math.random() * SnakeMain.WIDTH - 1));
        posY = Math.abs((int) (Math.random() * SnakeMain.HEIGHT - 1));
    }
}

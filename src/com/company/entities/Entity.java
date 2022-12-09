package com.company.entities;

import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocation;

/**
 * Interface pro vytváření ostatních entit.
 * @author Masáková Jr.
 * @version 0.1a
 * @since Java 16
 */
public interface Entity {

    void fight();
    void defend();
    void dodge();
    void escape();
    void heal(Potion potion);
    void eat(Food food);
    void moveTo(GameLocation gameLocation);
    void talkTo (Entity entity);


}

package com.company.entities;

import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocation;

/**
 * Třída pro vytváření nepřátel
 * @author Masáková Jr.
 * @version 0.1a
 * @since Java 16
 */
public class Enemy implements Entity {
    /**
     *Metoda pro boj
     */

    @Override
    public void fight() {

    }
    /**
     *Metoda pro boj
     */

    @Override
    public void defend() {

    }
    /**
     *Metoda pro úhyb
     */

    @Override
    public void dodge() {

    }
    /**
     *Metoda pro útěk
     */

    @Override
    public void escape() {

    }
    /**
     *Metoda pro uzdravení
     *  @param potion potion, kterou může použít
     */

    @Override
    public void heal(Potion potion) {

    }
    /**
     *Metoda pro jezení
     *  @param food jídlo, které může sníst
     */

    @Override
    public void eat(Food food) {

    }
    /**
     *Metoda pro pohyb
     *  @param gameLocation dostupná lokace
     */

    @Override
    public void moveTo(GameLocation gameLocation) {

    }
    /**
     *Metoda pro mluvení s charakterem
     *  @param entity entita, se kterou může mluvit
     */

    @Override
    public void talkTo(Entity entity) {

    }
}

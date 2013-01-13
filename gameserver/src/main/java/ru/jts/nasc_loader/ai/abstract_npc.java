package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.AIController;
import ru.jts.gameserver.model.NpcGG;
import ru.jts.gameserver.model.objects.Player;

/**
 * @author: Camelion
 * @date: 15.12.12   15:42
 */
public abstract class abstract_npc {
    protected AIController myself;
    protected NpcGG gg;

    protected int MakeFString = 0;

    protected void NO_DESIRE() {
        // Overridden
    }


    /**
     * @param talker - Player
     */
    protected void TALK_SELECTED(Player talker) {
        // Overridden
    }

    /**
     * @param creature - Creature
     * @param reply    - int
     */
    protected void DEBUG_AI(Object creature, int reply) {
        // Overridden
    }

    protected void CREATED() {
        // Overridden
    }

    /**
     * @param speller       - Creature
     * @param skill_id      - int
     * @param skill_level   - skill_level
     * @param skill_name_id - skill_name_id
     * @param params        - String, Integer
     */
    protected void ABNORMAL_STATUS_CHANGED(Object speller, int skill_id, int skill_level, int skill_name_id, Object... params) {
        // Overridden
    }

    protected void TIMER_FIRED_EX(int timer_id) {
        // Overridden
    }

    /**
     * @param talker - Object
     */
    protected void TALKED(Object talker) {

    }
}

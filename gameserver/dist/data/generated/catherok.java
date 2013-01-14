package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class catherok extends cruma_warrior_use_skill {
	protected void ATTACKED(HandlerParam attacker, HandlerParam c0, HandlerParam c1, HandlerParam damage, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i_quest0) {
myself.SetCurrentQuestID(367);
if (attacker.master) {
attacker = attacker.master;

}
if (gg.HaveMemo(attacker, 367) && myself.i_quest0 != 367) {
if (myself.Skill_GetConsumeMP(266862596) < myself.sm.mp && myself.Skill_GetConsumeHP(266862596) < myself.sm.hp && myself.Skill_InReuseDelay(266862596) == 0) {
myself.AddUseSkillDesire(attacker, 266862596, 0, 0, 1000000);

}
myself.i_quest0 = 367;
i1 = gg.Party_GetCount(attacker);
if (i1 != 0) {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(attacker, i0);
i2 = gg.Rand(1000);
if (i2 > i3) {
i3 = i2;
c1 = c0;

}

}

} else {
c1 = attacker;

}
if (gg.HaveMemo(c1, 367) && myself.sm.flag != 367 && gg.OwnItemCount(c1, 5879) == 0 && myself.IsNullCreature(c1) == 0) {
i0 = gg.Rand(37);
if (i0 == 0) {
if (myself.GetCurrentTick() - c1.quest_last_reward_time > 1) {
c1.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(c1, 5875) > 0) {
myself.GiveItem1(c1, 5876, 1);
myself.DeleteItem1(c1, 5875, gg.OwnItemCount(c1, 5875));
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 5876) > 0) {
myself.GiveItem1(c1, 5877, 1);
myself.DeleteItem1(c1, 5876, gg.OwnItemCount(c1, 5876));
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 5877) > 0) {
myself.GiveItem1(c1, 5878, 1);
myself.DeleteItem1(c1, 5877, gg.OwnItemCount(c1, 5877));
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(c1, 5878) > 0) {
myself.GiveItem1(c1, 5879, 1);
myself.DeleteItem1(c1, 5878, gg.OwnItemCount(c1, 5878));
myself.SetJournal(c1, 367, 2);
myself.ShowQuestMark(c1, 367);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

} else if (i0 == 1 && gg.OwnItemCount(c1, 5880) == 0) {
myself.GiveItem1(c1, 5880, 1);
myself.DeleteItem1(c1, 5875, gg.OwnItemCount(c1, 5875));
myself.DeleteItem1(c1, 5876, gg.OwnItemCount(c1, 5876));
myself.DeleteItem1(c1, 5877, gg.OwnItemCount(c1, 5877));
myself.DeleteItem1(c1, 5878, gg.OwnItemCount(c1, 5878));
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}
super;
	}


}
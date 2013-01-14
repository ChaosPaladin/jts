package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summoner_primeval extends citizen {
	protected int EffectSkill1 = 335609857;
	protected int Pos_x = 0;
	protected int Pos_y = 0;
	protected int Pos_z = 0;
	protected int commission = 10;
	protected String fnHi2 = "vervato002.htm";
	protected String fnHi3 = "vervato003.htm";
	protected String fnHi4 = "vervato004.htm";
	protected int is_dbg = 0;

	protected void CREATED(HandlerParam s0) {
myself.c_ai0 = myself.sm;
	}

	protected void TALKED(HandlerParam talker, HandlerParam s0) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam s0, HandlerParam i1, HandlerParam i2) {
if (talker == myself.sm) {
myself.Say("no proper target");
return;

}
i2 = 0;
for (i1 = 0; i1 < gg.Party_GetCount(talker); i1 = i1 + 1) {
c0 = gg.Party_GetCreature(talker, i1);
if (myself.IsNullCreature(c0) == 0) {
if (c0.hp <= 0 && myself.InMyTerritory(c0)) {
i2 = i2 + 1;

}

}

}
if (ask == -505 && reply == 1) {
if (i2 == 0) {
myself.ShowPage(talker, fnHi2);

} else if (gg.OwnItemCount(talker, 57) >= commission) {
myself.DeleteItem1(talker, 57, commission);
myself.AddLogByNpc(415, talker, commission, myself.sm.id);
if (EffectSkill1 != 458752001) {
myself.c_ai0 = talker;
if (myself.Skill_GetConsumeMP(EffectSkill1) < myself.sm.mp && myself.Skill_GetConsumeHP(EffectSkill1) < myself.sm.hp && myself.Skill_InReuseDelay(EffectSkill1) == 0) {
myself.AddUseSkillDesire(myself.sm, EffectSkill1, 1, 1, 1000000);

}

}

} else {
myself.ShowPage(talker, fnHi3);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam c0, HandlerParam s0, HandlerParam i1) {
if (skill_name_id == EffectSkill1) {
if (myself.c_ai0 != myself.sm) {

}
for (i1 = 0; i1 < gg.Party_GetCount(myself.c_ai0); i1 = i1 + 1) {
c0 = gg.Party_GetCreature(myself.c_ai0, i1);
if (myself.IsNullCreature(c0) == 0) {
if (c0.hp <= 0 && myself.InMyTerritory(c0)) {
myself.InstantTeleport(c0, Pos_x, Pos_y, Pos_z);
myself.AddLogByNpc(416, myself.c_ai0, c0.id, myself.sm.id);

}

}

}
myself.AddTimerEx(2005, 3 * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 2005) {
if (myself.c_ai0 != myself.sm) {
myself.ShowPage(myself.c_ai0, fnHi4);

}

}
	}


}
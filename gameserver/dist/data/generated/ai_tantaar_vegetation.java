package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_tantaar_vegetation extends default_npc {
	protected int Max_Desire = 1000000000000000000;
	protected int Skill01_ID = 458752001;
	protected int Skill02_ID = 458752001;
	protected int Skill03_ID = 458752001;
	protected String Privates = "tantaar_lizardman_wizard:tantaar_lizardman_wizard:1:0sec;tantaar_lizardman_wizard:tantaar_lizardman_wizard:1:0sec;tantaar_lizardman_wizard:tantaar_lizardman_wizard:1:0sec";
	protected int babble_mode = 0;

	protected void CREATED() {
myself.i_ai1 = 0;
if (myself.sm.npc_class_id == 1018864) {
myself.CreatePrivates(Privates);

}
	}

	protected void ATTACKED(HandlerParam attacker) {
if (myself.i_ai1 == 0 && myself.IsNullCreature(attacker) == 0) {
if (attacker.is_pc || myself.IsInCategory(12, attacker.npc_class_id) || myself.IsInCategory(35, attacker.npc_class_id)) {
if (attacker.is_pc) {
myself.c_ai0 = attacker;

} else {
myself.c_ai0 = attacker.master;

}
myself.ChangeStatus(2);
myself.i_ai1 = 1;
if (myself.sm.npc_class_id == 1018864) {
if (babble_mode) {
myself.Say("skill01 out");

}
myself.BroadcastScriptEventEx(78010087, myself.sm.id, myself.c_ai0.id, 800);
myself.AddTimerEx(78001, 4 * 1000);

} else if (myself.sm.npc_class_id == 1018865) {
if (babble_mode) {
myself.Say("buffer out");

}
myself.CreateOnePrivateEx(1018918, "ai_tantaar_vegetation_buffer", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, attacker.id, 0, 0);
myself.Suicide();

} else if (myself.sm.npc_class_id == 1018868) {
if (babble_mode) {
myself.Say("buffer out");

}
myself.CreateOnePrivateEx(1018918, "ai_tantaar_vegetation_buffer", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, attacker.id, 1, 0);
myself.Suicide();

} else if (myself.sm.npc_class_id == 1018867) {
myself.BroadcastScriptEvent(78010085, myself.sm.id, 5000);
myself.Suicide();

}

} else if (myself.sm.npc_class_id == 1018867 && attacker.npc_class_id == 1018863) {
myself.ChangeStatus(2);
myself.i_ai1 = 1;
if (babble_mode) {
myself.Say("buffer out");

}
myself.CreateOnePrivateEx(1018918, "ai_tantaar_vegetation_buffer", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, attacker.id, 2, 0);
myself.Suicide();

}

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
super;
if (babble_mode) {
myself.Say("SPELLED:" + skill_name_id / 256 * 256);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (babble_mode) {
myself.Say("USE_SKILL_FINISHED:" + skill_name_id / 256 * 256);

}
myself.Suicide();
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0) {
if (myself.sm.alive && script_event_arg1 == 78010080 && script_event_arg2 != 0 && myself.sm.npc_class_id == 1018867) {
c0 = gg.GetCreatureFromID(script_event_arg2);
if (myself.IsNullCreature(c0) == 0 && c0 != myself.sm) {
if (babble_mode) {
myself.Say("luring ugoros");

}
gg.SendScriptEvent(c0, 78010080, myself.sm.id);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 78001) {
myself.AddUseSkillDesire(myself.sm, Skill01_ID, 1, 0, Max_Desire);
myself.CreateOnePrivateEx(1018918, "ai_tantaar_vegetation_buffer", 0, 0, gg.FloatToInt(myself.sm.x), gg.FloatToInt(myself.sm.y), gg.FloatToInt(myself.sm.z), 0, myself.c_ai0.id, 4, 0);

}
	}

	protected void MY_DYING() {
super;
if (myself.IsNullCreature(myself.c_ai0) == 0 && myself.c_ai0.is_pc) {
if (myself.sm.npc_class_id == 1018864) {
if (gg.HaveMemo(myself.c_ai0, 250) == 1 && gg.GetMemoState(myself.c_ai0, 250) == 1 && gg.OwnItemCount(myself.c_ai0, 15493) < 1) {
myself.GiveItem1(myself.c_ai0, 15493, 1);
myself.SoundEffect(myself.c_ai0, "ItemSound.quest_itemget");
if (gg.OwnItemCount(myself.c_ai0, 15494) >= 1 && gg.OwnItemCount(myself.c_ai0, 15495) >= 1) {
myself.SetFlagJournal(myself.c_ai0, 250, 2);
myself.ShowQuestMark(myself.c_ai0, 250);
myself.SoundEffect(myself.c_ai0, "ItemSound.quest_middle");

}

}

} else if (myself.sm.npc_class_id == 1018865) {
if (gg.HaveMemo(myself.c_ai0, 250) == 1 && gg.GetMemoState(myself.c_ai0, 250) == 1 && gg.OwnItemCount(myself.c_ai0, 15494) < 1) {
myself.GiveItem1(myself.c_ai0, 15494, 1);
myself.SoundEffect(myself.c_ai0, "ItemSound.quest_itemget");
if (gg.OwnItemCount(myself.c_ai0, 15493) >= 1 && gg.OwnItemCount(myself.c_ai0, 15495) >= 1) {
myself.SetFlagJournal(myself.c_ai0, 250, 2);
myself.ShowQuestMark(myself.c_ai0, 250);
myself.SoundEffect(myself.c_ai0, "ItemSound.quest_middle");

}

}

} else if (myself.sm.npc_class_id == 1018868) {
if (gg.HaveMemo(myself.c_ai0, 250) == 1 && gg.GetMemoState(myself.c_ai0, 250) == 1 && gg.OwnItemCount(myself.c_ai0, 15495) < 1) {
myself.GiveItem1(myself.c_ai0, 15495, 1);
myself.SoundEffect(myself.c_ai0, "ItemSound.quest_itemget");
if (gg.OwnItemCount(myself.c_ai0, 15493) >= 1 && gg.OwnItemCount(myself.c_ai0, 15494) >= 1) {
myself.SetFlagJournal(myself.c_ai0, 250, 2);
myself.ShowQuestMark(myself.c_ai0, 250);
myself.SoundEffect(myself.c_ai0, "ItemSound.quest_middle");

}

}

}

}
	}


}
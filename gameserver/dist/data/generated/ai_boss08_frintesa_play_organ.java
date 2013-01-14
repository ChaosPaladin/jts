package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_boss08_frintesa_play_organ extends ai_boss08_frintesa_set_db {
	protected void CREATED(HandlerParam reply) {
super;
	}

	protected void NO_DESIRE(HandlerParam i0, HandlerParam c4) {
if (myself.i_ai0 < 4) {

} else if (myself.i_ai4 == 0) {
if (myself.i_ai0 < 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30000) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30020) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30021) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30022) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30023) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30024) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30025) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam c4) {
super;
if (timer_id == 3000) {
myself.i_ai4 = 0;
if (myself.i_ai0 < 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30000) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30020) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30021) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30022) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30023) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30024) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30025) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (timer_id == 3001) {
myself.i_ai4 = 0;
if (myself.i_ai0 < 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30000) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30020) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30021) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30022) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30023) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30024) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30025) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

}
	}

	protected void ATTACKED(HandlerParam skill_name_id) {
if (skill_name_id == 146407425) {
myself.i_ai4 = 1;
myself.RemoveAllDesire();
myself.AddTimerEx(3000, 35 * 1000);

} else if (skill_name_id == 146407425) {
myself.i_ai4 = 1;
myself.RemoveAllDesire();
myself.AddTimerEx(3000, 35 * 1000);

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam c0, HandlerParam i0, HandlerParam c1) {
if (script_event_arg1 == i0) {
if (script_event_arg2 == 39999) {
myself.i_ai0 = 39999;

} else if (script_event_arg2 == 30000) {
myself.i_ai0 = 30000;

} else if (script_event_arg2 == 30010) {
myself.i_ai0 = 30010;

} else if (script_event_arg2 == 30010) {
myself.i_ai0 = 30010;

}

} else if (script_event_arg2 == 30020) {
myself.i_ai0 = 7;
myself.i_quest2 = myself.GetCurrentTick();
myself.AddTimerEx(5000, 1000);
c1 = gg.GetCreatureFromID(myself.i_ai8);
if (myself.IsNullCreature(c1)) {
gg.SendScriptEvent(c1, 99999999, myself.i_ai3);

}

} else if (script_event_arg2 == 30021) {
myself.i_ai0 = 30021;

} else if (script_event_arg2 == 30022) {
myself.i_ai0 = 30022;

} else if (script_event_arg2 == 30023) {
myself.i_ai0 = 30023;

} else if (script_event_arg2 == 30024) {
myself.i_ai0 = 30024;

} else if (script_event_arg2 == 30025) {
myself.i_ai0 = 30025;

}
super;
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id, HandlerParam success, HandlerParam i0, HandlerParam c4) {
if (myself.i_ai4 == 0) {
if (success == 0) {
gg.Area_SetOnOff(areadata_heal1, 0);
gg.Area_SetOnOff(areadata_heal2, 0);
gg.Area_SetOnOff(areadata_power1, 0);
gg.Area_SetOnOff(areadata_power2, 0);
gg.Area_SetOnOff(areadata_psycho1, 0);
gg.Area_SetOnOff(areadata_psycho2, 0);
gg.Area_SetOnOff(areadata_rampage1, 0);
gg.Area_SetOnOff(areadata_rampage2, 0);
gg.Area_SetOnOff(areadata_plague1, 0);
gg.Area_SetOnOff(areadata_plague2, 0);
myself.i_ai4 = 1;
myself.RemoveAllDesire();
myself.AddTimerEx(3001, 35000);

} else {
gg.Area_SetOnOff(areadata_heal1, 0);
gg.Area_SetOnOff(areadata_heal2, 0);
gg.Area_SetOnOff(areadata_power1, 0);
gg.Area_SetOnOff(areadata_power2, 0);
gg.Area_SetOnOff(areadata_psycho1, 0);
gg.Area_SetOnOff(areadata_psycho2, 0);
gg.Area_SetOnOff(areadata_rampage1, 0);
gg.Area_SetOnOff(areadata_rampage2, 0);
gg.Area_SetOnOff(areadata_plague1, 0);
gg.Area_SetOnOff(areadata_plague2, 0);
if (myself.i_ai0 < 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 39999) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30000) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30010) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1000) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30020) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 2500) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30021) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30022) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30023) {
if (myself.GetCurrentTick() - myself.i_quest2 > 15 * 60) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 625) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

} else if (myself.i_ai0 == 30024) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

} else if (myself.i_ai0 == 30025) {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 1500) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 3000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}

}

}

} else {
i0 = gg.Rand(10000);
if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_heal, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000522, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_heal1, 1);
gg.Area_SetOnOff(areadata_heal2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_power, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000523, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_power1, 1);
gg.Area_SetOnOff(areadata_power2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_psycho, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000525, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_psycho1, 1);
gg.Area_SetOnOff(areadata_psycho2, 1);

} else if (gg.Rand(10000) < 10000) {
myself.AddUseSkillDesire(myself.sm, music_of_rampage, 1, 1, 10000);
c4 = gg.GetCreatureFromID(myself.i_ai7);
if (myself.IsNullCreature(c4) == 0) {
gg.SendScriptEvent(c4, 40001, 0);

}
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000524, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_rampage1, 1);
gg.Area_SetOnOff(areadata_rampage2, 1);

} else if (gg.Rand(10000) < 0) {
myself.AddUseSkillDesire(myself.sm, music_of_plague, 1, 1, 10000);
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000526, "", "", "", "", ""));
gg.Area_SetOnOff(areadata_plague1, 1);
gg.Area_SetOnOff(areadata_plague2, 1);

} else {
gg.BroadcastOnScreenMsgStr(myself.sm, 4000, 2, 0, 0, 0, 0, 1, 3000, 0, gg.MakeFString(1000527, "", "", "", "", ""));
myself.AddUseSkillDesire(myself.sm, music, 1, 1, 10000);

}
myself.i_ai4 = 0;

}
	}


}
package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class alchemical_mixing_jar extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 373) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Supplier of Reagents (In Progress)");

}
if (gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 7 && gg.OwnItemCount(talker, 5905) >= 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Mimir's Elixir (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 373) == 1) {
myself.SetCurrentQuestID(373);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 7 && gg.OwnItemCount(talker, 5905) >= 1) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam reply, HandlerParam talker) {
if (ask == 373) {
myself.SetCurrentQuestID(373);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 373) {
if (reply == 1) {
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_02.htm");

}
if (reply == 11) {
if (gg.OwnItemCount(talker, 6011) >= 10) {
myself.SetMemoState(talker, 373, 11);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_03.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 12) {
if (gg.OwnItemCount(talker, 6012) >= 10) {
myself.SetMemoState(talker, 373, 12);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_04.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 13) {
if (gg.OwnItemCount(talker, 6013) >= 10) {
myself.SetMemoState(talker, 373, 13);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_05.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 14) {
if (gg.OwnItemCount(talker, 6014) >= 10) {
myself.SetMemoState(talker, 373, 14);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_06.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 15) {
if (gg.OwnItemCount(talker, 6015) >= 10) {
myself.SetMemoState(talker, 373, 15);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_07.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 16) {
if (gg.OwnItemCount(talker, 6016) >= 10) {
myself.SetMemoState(talker, 373, 16);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_08.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 17) {
if (gg.OwnItemCount(talker, 6021) >= 10) {
myself.SetMemoState(talker, 373, 17);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_09.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 18) {
if (gg.OwnItemCount(talker, 6022) >= 10) {
myself.SetMemoState(talker, 373, 18);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_10.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 19) {
if (gg.OwnItemCount(talker, 6023) >= 10) {
myself.SetMemoState(talker, 373, 19);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_11.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 20) {
if (gg.OwnItemCount(talker, 6024) >= 10) {
myself.SetMemoState(talker, 373, 20);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_12.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 21) {
if (gg.OwnItemCount(talker, 6025) >= 10) {
myself.SetMemoState(talker, 373, 21);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_13.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 22) {
if (gg.OwnItemCount(talker, 6026) >= 10) {
myself.SetMemoState(talker, 373, 22);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_14.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 23) {
if (gg.OwnItemCount(talker, 6028) >= 1) {
myself.SetMemoState(talker, 373, 23);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_15.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 24) {
if (gg.OwnItemCount(talker, 6029) >= 1) {
myself.SetMemoState(talker, 373, 24);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_16.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 2) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_18.htm");

}
if (reply == 31) {
if (gg.OwnItemCount(talker, 6017) >= 1) {
myself.SetMemoState(talker, 373, gg.GetMemoState(talker, 373) + 1100);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_19.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
i0 = gg.GetMemoState(talker, 373);
if (i0 == 11) {
myself.DeleteItem1(talker, 6011, 10);

} else if (i0 == 12) {
myself.DeleteItem1(talker, 6012, 10);

} else if (i0 == 13) {
myself.DeleteItem1(talker, 6013, 10);

} else if (i0 == 14) {
myself.DeleteItem1(talker, 6014, 10);

} else if (i0 == 15) {
myself.DeleteItem1(talker, 6015, 10);

} else if (i0 == 16) {
myself.DeleteItem1(talker, 6016, 10);

} else if (i0 == 17) {
myself.DeleteItem1(talker, 6021, 10);

} else if (i0 == 18) {
myself.DeleteItem1(talker, 6022, 10);

} else if (i0 == 19) {
myself.DeleteItem1(talker, 6023, 10);

} else if (i0 == 20) {
myself.DeleteItem1(talker, 6024, 10);

} else if (i0 == 21) {
myself.DeleteItem1(talker, 6025, 10);

} else if (i0 == 22) {
myself.DeleteItem1(talker, 6026, 10);

} else if (i0 == 23) {
myself.DeleteItem1(talker, 6028, 1);

} else if (i0 == 24) {
myself.DeleteItem1(talker, 6029, 1);

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_25.htm");

}

}
if (reply == 32) {
if (gg.OwnItemCount(talker, 6018) >= 1) {
myself.SetMemoState(talker, 373, gg.GetMemoState(talker, 373) + 1200);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_20.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
i0 = gg.GetMemoState(talker, 373);
if (i0 == 11) {
myself.DeleteItem1(talker, 6011, 10);

} else if (i0 == 12) {
myself.DeleteItem1(talker, 6012, 10);

} else if (i0 == 13) {
myself.DeleteItem1(talker, 6013, 10);

} else if (i0 == 14) {
myself.DeleteItem1(talker, 6014, 10);

} else if (i0 == 15) {
myself.DeleteItem1(talker, 6015, 10);

} else if (i0 == 16) {
myself.DeleteItem1(talker, 6016, 10);

} else if (i0 == 17) {
myself.DeleteItem1(talker, 6021, 10);

} else if (i0 == 18) {
myself.DeleteItem1(talker, 6022, 10);

} else if (i0 == 19) {
myself.DeleteItem1(talker, 6023, 10);

} else if (i0 == 20) {
myself.DeleteItem1(talker, 6024, 10);

} else if (i0 == 21) {
myself.DeleteItem1(talker, 6025, 10);

} else if (i0 == 22) {
myself.DeleteItem1(talker, 6026, 10);

} else if (i0 == 23) {
myself.DeleteItem1(talker, 6028, 1);

} else if (i0 == 24) {
myself.DeleteItem1(talker, 6029, 1);

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 33) {
if (gg.OwnItemCount(talker, 6019) >= 1) {
myself.SetMemoState(talker, 373, gg.GetMemoState(talker, 373) + 1300);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_21.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
i0 = gg.GetMemoState(talker, 373);
if (i0 == 11) {
myself.DeleteItem1(talker, 6011, 10);

} else if (i0 == 12) {
myself.DeleteItem1(talker, 6012, 10);

} else if (i0 == 13) {
myself.DeleteItem1(talker, 6013, 10);

} else if (i0 == 14) {
myself.DeleteItem1(talker, 6014, 10);

} else if (i0 == 15) {
myself.DeleteItem1(talker, 6015, 10);

} else if (i0 == 16) {
myself.DeleteItem1(talker, 6016, 10);

} else if (i0 == 17) {
myself.DeleteItem1(talker, 6021, 10);

} else if (i0 == 18) {
myself.DeleteItem1(talker, 6022, 10);

} else if (i0 == 19) {
myself.DeleteItem1(talker, 6023, 10);

} else if (i0 == 20) {
myself.DeleteItem1(talker, 6024, 10);

} else if (i0 == 21) {
myself.DeleteItem1(talker, 6025, 10);

} else if (i0 == 22) {
myself.DeleteItem1(talker, 6026, 10);

} else if (i0 == 23) {
myself.DeleteItem1(talker, 6028, 1);

} else if (i0 == 24) {
myself.DeleteItem1(talker, 6029, 1);

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 34) {
if (gg.OwnItemCount(talker, 6020) >= 1) {
myself.SetMemoState(talker, 373, gg.GetMemoState(talker, 373) + 1400);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_22.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
i0 = gg.GetMemoState(talker, 373);
if (i0 == 11) {
myself.DeleteItem1(talker, 6011, 10);

} else if (i0 == 12) {
myself.DeleteItem1(talker, 6012, 10);

} else if (i0 == 13) {
myself.DeleteItem1(talker, 6013, 10);

} else if (i0 == 14) {
myself.DeleteItem1(talker, 6014, 10);

} else if (i0 == 15) {
myself.DeleteItem1(talker, 6015, 10);

} else if (i0 == 16) {
myself.DeleteItem1(talker, 6016, 10);

} else if (i0 == 17) {
myself.DeleteItem1(talker, 6021, 10);

} else if (i0 == 18) {
myself.DeleteItem1(talker, 6022, 10);

} else if (i0 == 19) {
myself.DeleteItem1(talker, 6023, 10);

} else if (i0 == 20) {
myself.DeleteItem1(talker, 6024, 10);

} else if (i0 == 21) {
myself.DeleteItem1(talker, 6025, 10);

} else if (i0 == 22) {
myself.DeleteItem1(talker, 6026, 10);

} else if (i0 == 23) {
myself.DeleteItem1(talker, 6028, 1);

} else if (i0 == 24) {
myself.DeleteItem1(talker, 6029, 1);

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 35) {
if (gg.OwnItemCount(talker, 6031) >= 1) {
myself.SetMemoState(talker, 373, gg.GetMemoState(talker, 373) + 1500);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_23.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
i0 = gg.GetMemoState(talker, 373);
if (i0 == 11) {
myself.DeleteItem1(talker, 6011, 10);

} else if (i0 == 12) {
myself.DeleteItem1(talker, 6012, 10);

} else if (i0 == 13) {
myself.DeleteItem1(talker, 6013, 10);

} else if (i0 == 14) {
myself.DeleteItem1(talker, 6014, 10);

} else if (i0 == 15) {
myself.DeleteItem1(talker, 6015, 10);

} else if (i0 == 16) {
myself.DeleteItem1(talker, 6016, 10);

} else if (i0 == 17) {
myself.DeleteItem1(talker, 6021, 10);

} else if (i0 == 18) {
myself.DeleteItem1(talker, 6022, 10);

} else if (i0 == 19) {
myself.DeleteItem1(talker, 6023, 10);

} else if (i0 == 20) {
myself.DeleteItem1(talker, 6024, 10);

} else if (i0 == 21) {
myself.DeleteItem1(talker, 6025, 10);

} else if (i0 == 22) {
myself.DeleteItem1(talker, 6026, 10);

} else if (i0 == 23) {
myself.DeleteItem1(talker, 6028, 1);

} else if (i0 == 24) {
myself.DeleteItem1(talker, 6029, 1);

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 36) {
if (gg.OwnItemCount(talker, 6030) >= 1) {
myself.SetMemoState(talker, 373, gg.GetMemoState(talker, 373) + 1600);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_24.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_mix_01");

} else {
i0 = gg.GetMemoState(talker, 373);
if (i0 == 11) {
myself.DeleteItem1(talker, 6011, 10);

} else if (i0 == 12) {
myself.DeleteItem1(talker, 6012, 10);

} else if (i0 == 13) {
myself.DeleteItem1(talker, 6013, 10);

} else if (i0 == 14) {
myself.DeleteItem1(talker, 6014, 10);

} else if (i0 == 15) {
myself.DeleteItem1(talker, 6015, 10);

} else if (i0 == 16) {
myself.DeleteItem1(talker, 6016, 10);

} else if (i0 == 17) {
myself.DeleteItem1(talker, 6021, 10);

} else if (i0 == 18) {
myself.DeleteItem1(talker, 6022, 10);

} else if (i0 == 19) {
myself.DeleteItem1(talker, 6023, 10);

} else if (i0 == 20) {
myself.DeleteItem1(talker, 6024, 10);

} else if (i0 == 21) {
myself.DeleteItem1(talker, 6025, 10);

} else if (i0 == 22) {
myself.DeleteItem1(talker, 6026, 10);

} else if (i0 == 23) {
myself.DeleteItem1(talker, 6028, 1);

} else if (i0 == 24) {
myself.DeleteItem1(talker, 6029, 1);

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_17.htm");

}

}
if (reply == 3) {
if (gg.GetMemoState(talker, 373) == 1324) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_26a.htm");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_26.htm");

}

}
if (reply == 4) {
myself.SetMemoStateEx(talker, 373, 1, 1);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_27.htm");
gg.AddLog(5, talker, 373001);

}
if (reply == 5) {
if (gg.Rand(100) < 33) {
myself.SetMemoStateEx(talker, 373, 1, 3);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_28a.htm");

} else {
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_28a.htm");

}
gg.AddLog(5, talker, 373002);

}
if (reply == 6) {
if (gg.Rand(100) < 20) {
myself.SetMemoStateEx(talker, 373, 1, 5);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_29a.htm");

} else {
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_29a.htm");

}
gg.AddLog(5, talker, 373003);

}
if (reply == 7 && gg.GetMemoStateEx(talker, 373, 1) != 0) {
if (gg.GetMemoState(talker, 373) == 1111) {
if (gg.OwnItemCount(talker, 6011) >= 10 && gg.OwnItemCount(talker, 6017) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6011, 10);
myself.DeleteItem1(talker, 6017, 1);
myself.GiveItem1(talker, 6021, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_30.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1212) {
if (gg.OwnItemCount(talker, 6012) >= 10 && gg.OwnItemCount(talker, 6018) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6012, 10);
myself.DeleteItem1(talker, 6018, 1);
myself.GiveItem1(talker, 6022, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_31.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1213) {
if (gg.OwnItemCount(talker, 6013) >= 10 && gg.OwnItemCount(talker, 6018) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6013, 10);
myself.DeleteItem1(talker, 6018, 1);
myself.GiveItem1(talker, 6023, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_32.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1114) {
if (gg.OwnItemCount(talker, 6014) >= 10 && gg.OwnItemCount(talker, 6017) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6014, 10);
myself.DeleteItem1(talker, 6017, 1);
myself.GiveItem1(talker, 6024, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_33.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1115) {
if (gg.OwnItemCount(talker, 6015) >= 10 && gg.OwnItemCount(talker, 6017) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6015, 10);
myself.DeleteItem1(talker, 6017, 1);
myself.GiveItem1(talker, 6025, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_34.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1216) {
if (gg.OwnItemCount(talker, 6016) >= 10 && gg.OwnItemCount(talker, 6018) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6016, 10);
myself.DeleteItem1(talker, 6018, 1);
myself.GiveItem1(talker, 6026, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_35.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1317) {
if (gg.OwnItemCount(talker, 6021) >= 10 && gg.OwnItemCount(talker, 6019) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6021, 10);
myself.DeleteItem1(talker, 6019, 1);
myself.GiveItem1(talker, 6027, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_36.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1418) {
if (gg.OwnItemCount(talker, 6022) >= 10 && gg.OwnItemCount(talker, 6020) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6022, 10);
myself.DeleteItem1(talker, 6020, 1);
myself.GiveItem1(talker, 6028, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_37.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1319) {
if (gg.OwnItemCount(talker, 6023) >= 10 && gg.OwnItemCount(talker, 6019) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6023, 10);
myself.DeleteItem1(talker, 6019, 1);
myself.GiveItem1(talker, 6029, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_38.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1320) {
if (gg.OwnItemCount(talker, 6024) >= 10 && gg.OwnItemCount(talker, 6019) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6024, 10);
myself.DeleteItem1(talker, 6019, 1);
myself.GiveItem1(talker, 6030, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_39.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1421) {
if (gg.OwnItemCount(talker, 6025) >= 10 && gg.OwnItemCount(talker, 6020) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6025, 10);
myself.DeleteItem1(talker, 6020, 1);
myself.GiveItem1(talker, 6031, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_40.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1422) {
if (gg.OwnItemCount(talker, 6026) >= 10 && gg.OwnItemCount(talker, 6020) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6026, 10);
myself.DeleteItem1(talker, 6020, 1);
myself.GiveItem1(talker, 6032, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_41.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1523) {
if (gg.OwnItemCount(talker, 6028) >= 1 && gg.OwnItemCount(talker, 6031) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6028, 1);
myself.DeleteItem1(talker, 6031, 1);
myself.GiveItem1(talker, 6033, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_42.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1624) {
if (gg.OwnItemCount(talker, 6029) >= 1 && gg.OwnItemCount(talker, 6030) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6029, 1);
myself.DeleteItem1(talker, 6030, 1);
myself.GiveItem1(talker, 6034, gg.GetMemoStateEx(talker, 373, 1));
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_43.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else if (gg.GetMemoState(talker, 373) == 1324 && gg.HaveMemo(talker, 235)) {
if (gg.OwnItemCount(talker, 6320) == 0) {
if (gg.OwnItemCount(talker, 6029) >= 1 && gg.OwnItemCount(talker, 6019) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 6029, 1);
myself.DeleteItem1(talker, 6019, 1);
myself.GiveItem1(talker, 6320, 1);
myself.SetMemoState(talker, 373, 0);
myself.SetMemoStateEx(talker, 373, 1, 0);
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_46.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_success_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");

}

} else if (gg.GetMemoState(talker, 373) == 1324 && gg.HaveMemo(talker, 235) == 0) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");

} else {
i0 = gg.GetMemoState(talker, 373);
i1 = i0 / 100;
i2 = i0 % 100;
if (i2 == 11) {
myself.DeleteItem1(talker, 6011, 10);

} else if (i2 == 12) {
myself.DeleteItem1(talker, 6012, 10);

} else if (i2 == 13) {
myself.DeleteItem1(talker, 6013, 10);

} else if (i2 == 14) {
myself.DeleteItem1(talker, 6014, 10);

} else if (i2 == 15) {
myself.DeleteItem1(talker, 6015, 10);

} else if (i2 == 16) {
myself.DeleteItem1(talker, 6016, 10);

} else if (i2 == 17) {
myself.DeleteItem1(talker, 6021, 10);

} else if (i2 == 18) {
myself.DeleteItem1(talker, 6022, 10);

} else if (i2 == 19) {
myself.DeleteItem1(talker, 6023, 10);

} else if (i2 == 20) {
myself.DeleteItem1(talker, 6024, 10);

} else if (i2 == 21) {
myself.DeleteItem1(talker, 6025, 10);

} else if (i2 == 22) {
myself.DeleteItem1(talker, 6026, 10);

} else if (i2 == 23) {
myself.DeleteItem1(talker, 6028, 1);

} else if (i2 == 24) {
myself.DeleteItem1(talker, 6029, 1);

}
if (i1 == 11) {
myself.DeleteItem1(talker, 6017, 1);

} else if (i1 == 12) {
myself.DeleteItem1(talker, 6018, 1);

} else if (i1 == 13) {
myself.DeleteItem1(talker, 6019, 1);

} else if (i1 == 14) {
myself.DeleteItem1(talker, 6020, 1);

} else if (i1 == 15) {
myself.DeleteItem1(talker, 6031, 1);

} else if (i1 == 16) {
myself.DeleteItem1(talker, 6030, 1);

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_44.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

}
if (reply == 7 && gg.GetMemoStateEx(talker, 373, 1) == 0) {
i0 = gg.GetMemoState(talker, 373);
i1 = i0 / 100;
i2 = i0 % 100;
if (i2 == 11) {
myself.DeleteItem1(talker, 6011, 10);

} else if (i2 == 12) {
myself.DeleteItem1(talker, 6012, 10);

} else if (i2 == 13) {
myself.DeleteItem1(talker, 6013, 10);

} else if (i2 == 14) {
myself.DeleteItem1(talker, 6014, 10);

} else if (i2 == 15) {
myself.DeleteItem1(talker, 6015, 10);

} else if (i2 == 16) {
myself.DeleteItem1(talker, 6016, 10);

} else if (i2 == 17) {
myself.DeleteItem1(talker, 6021, 10);

} else if (i2 == 18) {
myself.DeleteItem1(talker, 6022, 10);

} else if (i2 == 19) {
myself.DeleteItem1(talker, 6023, 10);

} else if (i2 == 20) {
myself.DeleteItem1(talker, 6024, 10);

} else if (i2 == 21) {
myself.DeleteItem1(talker, 6025, 10);

} else if (i2 == 22) {
myself.DeleteItem1(talker, 6026, 10);

} else if (i2 == 23) {
myself.DeleteItem1(talker, 6028, 1);

} else if (i2 == 24) {
myself.DeleteItem1(talker, 6029, 1);

}
if (i1 == 11) {
myself.DeleteItem1(talker, 6017, 1);

} else if (i1 == 12) {
myself.DeleteItem1(talker, 6018, 1);

} else if (i1 == 13) {
myself.DeleteItem1(talker, 6019, 1);

} else if (i1 == 14) {
myself.DeleteItem1(talker, 6020, 1);

} else if (i1 == 15) {
myself.DeleteItem1(talker, 6031, 1);

} else if (i1 == 16) {
myself.DeleteItem1(talker, 6030, 1);

}
myself.ShowPage(talker, "alchemical_mixing_jar_q0373_45.htm");
myself.SoundEffect(talker, "SkillSound5.liquid_fail_01");

}

}
if (ask == 235) {
myself.SetCurrentQuestID(235);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 235) {
if (reply == 1) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_02.htm");

}
if (reply == 2) {
if (gg.OwnItemCount(talker, 6320) < 1) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_03.htm");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_04.htm");

}

}
if (reply == 3) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_05.htm");

}
if (reply == 4) {
if (gg.OwnItemCount(talker, 6321) >= 1) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_06.htm");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_06a.htm");

}

}
if (reply == 5) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_07.htm");

}
if (reply == 6) {
if (gg.OwnItemCount(talker, 6318) < 1) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_08.htm");

} else {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_09.htm");

}

}
if (reply == 7) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_10.htm");

}
if (reply == 8) {
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_11.htm");

}
if (reply == 9 && gg.OwnItemCount(talker, 6318) >= 1 && gg.OwnItemCount(talker, 6320) >= 1 && gg.OwnItemCount(talker, 6321) >= 1 && gg.HaveMemo(talker, 235) == 1 && gg.GetMemoState(talker, 235) == 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 6319, 1);
myself.DeleteItem1(talker, 6320, gg.OwnItemCount(talker, 6320));
myself.DeleteItem1(talker, 6321, gg.OwnItemCount(talker, 6321));
myself.DeleteItem1(talker, 6318, gg.OwnItemCount(talker, 6318));
gg.AddLog(3, talker, 235);
myself.SetMemoState(talker, 235, 8);
myself.SetFlagJournal(talker, 235, 8);
myself.ShowQuestMark(talker, 235);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.ShowPage(talker, "alchemical_mixing_jar_q0235_12.htm");

}

}

}
super;
	}


}
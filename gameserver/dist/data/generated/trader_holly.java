package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_holly extends merchant {
protected Object[][] SellList0 = {
{"soulshot_none";20;0.000000;0}, {"spiritshot_none";20;0.000000;0}, {"blessed_spiritshot_none";20;0.000000;0}, {"soulshot_d";20;0.000000;0}, {"soulshot_c";20;0.000000;0}, {"blessed_spiritshot_d";20;0.000000;0}, {"blessed_spiritshot_c";20;0.000000;0}, {"comp_bspiritshot_none";20;0.000000;0}, {"comp_spiritshot_none";20;0.000000;0}, {"comp_soulshot_none";20;0.000000;0}, {"adv_comp_bspiritshot_none";20;0.000000;0}, {"adv_comp_spiritshot_none";20;0.000000;0}, {"adv_comp_soulshot_none";20;0.000000;0}, {"wooden_arrow";20;0.000000;0}, {"bone_arrow";20;0.000000;0}, {"fine_steel_arrow";20;0.000000;0}, {"lesser_healing_potion";20;0.000000;0}, {"healing_potion";20;0.000000;0}, {"antidote";20;0.000000;0}, {"advanced_antidote";20;0.000000;0}, {"bandage";20;0.000000;0}, {"emergency_dressing";20;0.000000;0}, {"quick_step_potion";20;0.000000;0}, {"swift_attack_potion";20;0.000000;0}, {"potion_of_acumen2";20;0.000000;0}, {"scroll_of_awake";20;0.000000;0}, {"scroll_of_escape";20;0.000000;0}, {"scroll_of_resurrection";20;0.000000;0}, {"scroll_of_escape_to_agit";20;0.000000;0}, {"scroll_of_escape_to_castle";20;0.000000;0}, {"spirit_ore";20;0.000000;0}, {"soul_ore";20;0.000000;0}, {"energy_stone";20;0.000000;0}, {"key_of_thief";20;0.000000;0}, {"rope_of_magic_d";20;0.000000;0}, {"rope_of_magic_c";20;0.000000;0}, {"rope_of_magic_b";20;0.000000;0}, {"rope_of_magic_a";20;0.000000;0}, {"rope_of_magic_s";20;0.000000;0}, {"gemstone_d";20;0.000000;0}, {"bone_bolt";20;0.000000;0}, {"fine_steel_bolt";20;0.000000;0}, {"recovery_scroll_none";20;0.000000;0}, {"recovery_scroll_d";20;0.000000;0}, {"recovery_scroll_c";20;0.000000;0}, {"recovery_scroll_b";20;0.000000;0}, {"recovery_scroll_a";20;0.000000;0}, {"recovery_scroll_s";20;0.000000;0}, {"elixir_of_life_none";20;0.000000;0}, {"elixir_of_life_d";20;0.000000;0}, {"elixir_of_life_c";20;0.000000;0}, {"elixir_of_combative_none";20;0.000000;0}, {"elixir_of_combative_d";20;0.000000;0}, {"elixir_of_combative_c";20;0.000000;0}, {"elixir_of_combative_b";20;0.000000;0}, {"elixir_of_combative_a";20;0.000000;0}, {"elixir_of_combative_s";20;0.000000;0}, {"crystal_of_summon";20;0.000000;0}, {"mystery_solvent";20;0.000000;0}, {"union's_directions";20;0.000000;0}, {"blank_soul_bottle_5";20;0.000000;0}, {"dice_heart";20;0.000000;0}, {"dice_spade";20;0.000000;0}, {"dice_clover";20;0.000000;0}, {"dice_diamond";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 372) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Legacy of Insolence (In Progress)");

}
if (gg.HaveMemo(talker, 10275) == 0 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 10275) == 0 && gg.GetMemoStateEx(talker, 10275, 1) != 2) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Containing the Attribute Power");

}
if (gg.HaveMemo(talker, 10275) == 1 && gg.GetMemoState(talker, 10275) == 1 && gg.GetMemoStateEx(talker, 10275, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Containing the Attribute Power (In progress)");

}
if (gg.HaveMemo(talker, 10275) == 0 && talker.level < 76 && myself.GetOneTimeQuestFlag(talker, 10275) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Containing the Attribute Power");

}
if (myself.GetOneTimeQuestFlag(talker, 10275) == 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Containing the Attribute Power (Done)");

}
if (gg.HaveMemo(talker, 10275) == 0 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 10275) == 0 && gg.GetMemoStateEx(talker, 10275, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Containing the Attribute Power (In progress)");

}
if (gg.HaveMemo(talker, 10275) == 1 && gg.GetMemoState(talker, 10275) == 2 && gg.GetMemoStateEx(talker, 10275, 1) == 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Containing the Attribute Power (In progress)");

}
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 2) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Oath (In progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 372) == 1) {
myself.SetCurrentQuestID(372);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.OwnItemCount(talker, 5984) < 1 || gg.OwnItemCount(talker, 5985) < 1 || gg.OwnItemCount(talker, 5986) < 1 || gg.OwnItemCount(talker, 5987) < 1 || gg.OwnItemCount(talker, 5988) < 1) {
myself.ShowPage(talker, "trader_holly_q0372_01.htm");

} else if (gg.OwnItemCount(talker, 5984) >= 1 && gg.OwnItemCount(talker, 5985) >= 1 && gg.OwnItemCount(talker, 5986) >= 1 && gg.OwnItemCount(talker, 5987) >= 1 && gg.OwnItemCount(talker, 5988) >= 1) {
myself.DeleteItem1(talker, 5984, 1);
myself.DeleteItem1(talker, 5985, 1);
myself.DeleteItem1(talker, 5986, 1);
myself.DeleteItem1(talker, 5987, 1);
myself.DeleteItem1(talker, 5988, 1);
i1 = gg.Rand(100);
if (i1 < 30) {
myself.GiveItem1(talker, 5496, 1);

} else if (i1 < 60) {
myself.GiveItem1(talker, 5508, 1);

} else if (i1 < 80) {
myself.GiveItem1(talker, 5525, 1);

} else if (i1 < 90) {
myself.GiveItem1(talker, 5496, 1);
myself.GiveItem1(talker, 5508, 1);
myself.GiveItem1(talker, 5525, 1);

} else if (i1 < 100) {
myself.GiveItem1(talker, 57, 4000);

}
myself.ShowPage(talker, "trader_holly_q0372_02.htm");

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10275) == 0 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 10275) == 0 && gg.GetMemoStateEx(talker, 10275, 1) != 2) {
myself.SetCurrentQuestID(10275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "trader_holly_q10275_01.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 10275);
myself.ShowQuestFHTML(talker, fhtml0, 10275);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10275) == 1 && gg.GetMemoState(talker, 10275) == 1 && gg.GetMemoStateEx(talker, 10275, 1) == 1) {
myself.SetCurrentQuestID(10275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_holly_q10275_01b.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10275) == 0 && talker.level < 76 && myself.GetOneTimeQuestFlag(talker, 10275) == 0) {
myself.SetCurrentQuestID(10275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "trader_holly_q10275_02.htm", 10275);

}
break;

}
case 4: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 10275) == 1) {
myself.SetCurrentQuestID(10275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_holly_q10275_03.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10275) == 0 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 10275) == 0 && gg.GetMemoStateEx(talker, 10275, 1) == 2) {
myself.SetCurrentQuestID(10275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "trader_holly_q10275_05.htm", 10275);

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 10275) == 1 && gg.GetMemoState(talker, 10275) == 2 && gg.GetMemoStateEx(talker, 10275, 1) == 1) {
myself.SetCurrentQuestID(10275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_holly_q10275_07.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 2) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_holly_q0464_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 10275) {
myself.SetCurrentQuestID(10275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
if (gg.HaveMemo(talker, 10275) == 0 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 10275) == 0 && gg.GetMemoStateEx(talker, 10275, 1) != 2) {
myself.SetMemo(talker, 10275);
myself.SetMemoState(talker, 10275, 1);
myself.SetMemoStateEx(talker, 10275, 1, 1);
myself.ShowQuestPage(talker, "trader_holly_q10275_01a.htm", 10275);
myself.SetFlagJournal(talker, 10275, 1);
myself.ShowQuestMark(talker, 10275);
myself.SoundEffect(talker, "ItemSound.quest_middle");
gg.AddLog(1, talker, 10275);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 10275) {
myself.SetCurrentQuestID(10275);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 10275) {
if (reply == 1) {
if (gg.HaveMemo(talker, 10275) == 1 && gg.GetMemoState(talker, 10275) == 1 && gg.GetMemoStateEx(talker, 10275, 1) == 1) {
myself.ShowPage(talker, "trader_holly_q10275_04.htm");

}

}
if (reply == 2) {
if (gg.HaveMemo(talker, 10275) == 1 && gg.GetMemoState(talker, 10275) == 1 && gg.GetMemoStateEx(talker, 10275, 1) == 1) {
myself.SetMemoState(talker, 10275, 2);
myself.ShowPage(talker, "trader_holly_q10275_06.htm");
myself.SetFlagJournal(talker, 10275, 2);
myself.ShowQuestMark(talker, 10275);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 464) {
myself.SetCurrentQuestID(464);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 464) {
if (reply == 1) {
if (gg.HaveMemo(talker, 464) == 1 && gg.OwnItemCount(talker, 15539) >= 1 && gg.GetMemoStateEx(talker, 464, 1) == 2) {
if (myself.GetCurrentTick() != talker.quest_last_reward_time) {
myself.GiveItem1(talker, 57, 52599);
myself.IncrementParam(talker, 0, 189377);
myself.IncrementParam(talker, 1, 21692);
myself.DeleteItem1(talker, 15539, gg.OwnItemCount(talker, 15539));
myself.RemoveMemo(talker, 464);
gg.SetDailyQuestFlag(talker, 464);
myself.SoundEffect(talker, "ItemSound.quest_finish");
gg.AddLog(2, talker, 464);
gg.AddLog(3, talker, 464);
myself.ShowPage(talker, "trader_holly_q0464_02.htm");

}

}

}

}
super;
	}


}
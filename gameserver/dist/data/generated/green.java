package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class green extends merchant {
protected Object[][] SellList0 = {
{"soulshot_none";15;0.000000;0}, {"spiritshot_none";15;0.000000;0}, {"blessed_spiritshot_none";15;0.000000;0}, {"comp_bspiritshot_none";15;0.000000;0}, {"comp_spiritshot_none";15;0.000000;0}, {"comp_soulshot_none";15;0.000000;0}, {"adv_comp_bspiritshot_none";15;0.000000;0}, {"adv_comp_spiritshot_none";15;0.000000;0}, {"adv_comp_soulshot_none";15;0.000000;0}, {"wooden_arrow";15;0.000000;0}, {"bone_arrow";15;0.000000;0}, {"lesser_healing_potion";15;0.000000;0}, {"antidote";15;0.000000;0}, {"bandage";15;0.000000;0}, {"quick_step_potion";15;0.000000;0}, {"swift_attack_potion";15;0.000000;0}, {"potion_of_acumen2";15;0.000000;0}, {"scroll_of_escape";15;0.000000;0}, {"scroll_of_resurrection";15;0.000000;0}, {"spirit_ore";15;0.000000;0}, {"soul_ore";15;0.000000;0}, {"energy_stone";15;0.000000;0}, {"key_of_thief";15;0.000000;0}, {"rope_of_magic_d";15;0.000000;0}, {"bone_bolt";15;0.000000;0}, {"recovery_scroll_none";15;0.000000;0}, {"recovery_scroll_d";15;0.000000;0}, {"elixir_of_life_none";15;0.000000;0}, {"elixir_of_life_d";15;0.000000;0}, {"elixir_of_mental_none";15;0.000000;0}, {"elixir_of_mental_d";15;0.000000;0}, {"elixir_of_combative_none";15;0.000000;0}, {"elixir_of_combative_d";15;0.000000;0}, {"crystal_of_summon";15;0.000000;0}, {"dice_heart";15;0.000000;0}, {"dice_spade";15;0.000000;0}, {"dice_clover";15;0.000000;0}, {"dice_diamond";15;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 2) == 1 && myself.GetOneTimeQuestFlag(talker, 2) == 0 && gg.OwnItemCount(talker, 1092) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "What Women Want (In Progress)");

}
if (gg.HaveMemo(talker, 313) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Collect Spores");

}
if (gg.HaveMemo(talker, 313) != 0 && gg.OwnItemCount(talker, 1118) < 10) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Collect Spores (In Progress)");

}
if (gg.HaveMemo(talker, 313) != 0 && gg.OwnItemCount(talker, 1118) >= 10) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Collect Spores (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 2) == 1 && myself.GetOneTimeQuestFlag(talker, 2) == 0 && gg.OwnItemCount(talker, 1092) == 0) {
myself.SetCurrentQuestID(2);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1093)) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "green_q0002_01.htm");
myself.SetFlagJournal(talker, 2, 3);
myself.ShowQuestMark(talker, 2);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 1093, 1);
myself.GiveItem1(talker, 1094, 1);

}

} else if (gg.OwnItemCount(talker, 1094) || gg.OwnItemCount(talker, 689) || gg.OwnItemCount(talker, 693)) {
myself.ShowPage(talker, "green_q0002_02.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 313) == 0) {
myself.SetCurrentQuestID(313);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 8) {
myself.FHTML_SetFileName(fhtml0, "green_q0313_03.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 313);
myself.ShowQuestFHTML(talker, fhtml0, 313);

} else {
myself.ShowQuestPage(talker, "green_q0313_02.htm", 313);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 313) != 0 && gg.OwnItemCount(talker, 1118) < 10) {
myself.SetCurrentQuestID(313);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "green_q0313_06.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 313) != 0 && gg.OwnItemCount(talker, 1118) >= 10) {
myself.SetCurrentQuestID(313);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 1118, gg.OwnItemCount(talker, 1118));
myself.RemoveMemo(talker, 313);
gg.AddLog(2, talker, 313);
gg.AddLog(3, talker, 313);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.GiveItem1(talker, 57, 3500);
myself.ShowPage(talker, "green_q0313_07.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 313) {
myself.SetCurrentQuestID(313);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, quest_id);
myself.ShowQuestMark(talker, 313);
gg.AddLog(1, talker, 313);
myself.SetFlagJournal(talker, 313, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "green_q0313_05.htm", 313);

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 313) {
myself.SetCurrentQuestID(313);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 313) {
if (reply == 1) {
myself.FHTML_SetFileName(fhtml0, "green_q0313_04.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 313);
myself.ShowQuestFHTML(talker, fhtml0, 313);

}

}
super;
	}


}
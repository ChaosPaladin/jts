package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class marife_redbonnet extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 291) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Revenge of the Redbonnet");

}
if (gg.HaveMemo(talker, 291)) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Revenge of the Redbonnet (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3254) == 0 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3255) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3255) >= 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3254) == 0 && gg.OwnItemCount(talker, 3248) == 0) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Testimony of Prosperity (In Progress)");

}
if (gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3254) >= 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3255) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Testimony of Prosperity (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 291) == 0) {
myself.SetCurrentQuestID(291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 4) {
myself.ShowQuestPage(talker, "marife_redbonnet_q0291_01.htm", 291);

} else {
myself.FHTML_SetFileName(fhtml0, "marife_redbonnet_q0291_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 291);
myself.ShowQuestFHTML(talker, fhtml0, 291);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 291)) {
myself.SetCurrentQuestID(291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1482) < 40) {
myself.ShowPage(talker, "marife_redbonnet_q0291_04.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marife_redbonnet_q0291_05.htm");
myself.RemoveMemo(talker, 291);
gg.AddLog(2, talker, 291);
gg.AddLog(3, talker, 291);
myself.SoundEffect(talker, "ItemSound.quest_finish");
myself.DeleteItem1(talker, 1482, gg.OwnItemCount(talker, 1482));
i0 = gg.Rand(100);
if (i0 <= 2) {
myself.GiveItem1(talker, 1502, 1);

} else if (i0 <= 20) {
myself.GiveItem1(talker, 1503, 1);

} else if (i0 <= 45) {
myself.GiveItem1(talker, 1504, 1);

} else {
myself.GiveItem1(talker, 1505, 1);
myself.GiveItem1(talker, 736, 1);

}

}

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3254) == 0 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3255) == 0 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marife_redbonnet_q0221_01.htm");
myself.GiveItem1(talker, 3255, 1);

}

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3255) >= 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3254) == 0 && gg.OwnItemCount(talker, 3248) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 1867) < 10) {
myself.ShowPage(talker, "marife_redbonnet_q0221_02.htm");

} else if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "marife_redbonnet_q0221_03.htm");
myself.DeleteItem1(talker, 1867, 10);
myself.DeleteItem1(talker, 3255, 1);
myself.GiveItem1(talker, 3254, 1);

}

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 221) == 1 && gg.OwnItemCount(talker, 3239) >= 1 && gg.OwnItemCount(talker, 3246) >= 1 && gg.OwnItemCount(talker, 3254) >= 1 && gg.OwnItemCount(talker, 3259) == 0 && gg.OwnItemCount(talker, 3248) == 0 && gg.OwnItemCount(talker, 3255) == 0) {
myself.SetCurrentQuestID(221);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "marife_redbonnet_q0221_04.htm");

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 291) {
myself.SetCurrentQuestID(291);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.SetMemo(talker, 291);
myself.ShowQuestMark(talker, 291);
gg.AddLog(1, talker, 291);
myself.SetFlagJournal(talker, 291, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "marife_redbonnet_q0291_03.htm", 291);

}
return;

}
super;
	}


}
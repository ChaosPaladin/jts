package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class head_blacksmith_vergara extends master_lv3_black {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 382) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Kail's Magic Coin");

}
if (gg.HaveMemo(talker, 382) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Kail's Magic Coin");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 382) == 0) {
myself.SetCurrentQuestID(382);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level < 55 || gg.OwnItemCount(talker, 5898) == 0) {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_01.htm", 382);

} else {
myself.FHTML_SetFileName(fhtml0, "head_blacksmith_vergara_q0382_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 382);
myself.ShowQuestFHTML(talker, fhtml0, 382);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 382) == 1) {
myself.SetCurrentQuestID(382);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_04.htm", 382);

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 382) {
myself.SetCurrentQuestID(382);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_03.htm", 382);
myself.SetJournal(talker, 382, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
gg.AddLog(1, talker, 382);
myself.SetMemoState(talker, 382, 1);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 382) {
myself.SetCurrentQuestID(382);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 382) {
if (reply == 1) {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_04.htm", 382);

} else if (reply == 2) {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_05.htm", 382);

} else if (reply == 3) {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_06.htm", 382);

} else if (reply == 4) {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_07.htm", 382);

} else if (reply == 5) {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_08.htm", 382);

} else if (reply == 6) {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_09.htm", 382);

} else if (reply == 10) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3474) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3474, 3);
myself.GiveItem1(talker, 5434, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 11) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3474) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3474, 3);
myself.GiveItem1(talker, 5464, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 12) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3484) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3484, 3);
myself.GiveItem1(talker, 5466, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 13) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3492) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3492, 2);
myself.GiveItem1(talker, 5468, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 14) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3492) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3492, 2);
myself.GiveItem1(talker, 5470, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 15) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3474) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3474, 3);
myself.GiveItem1(talker, 5442, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 16) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3492) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3492, 2);
myself.GiveItem1(talker, 5444, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 17) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3492) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3492, 2);
myself.GiveItem1(talker, 5446, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 18) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3474) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3474, 3);
myself.GiveItem1(talker, 5448, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 20) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3474) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3474, 3);
myself.GiveItem1(talker, 5456, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 21) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3492) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3492, 2);
myself.GiveItem1(talker, 5458, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 22) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3492) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3492, 2);
myself.GiveItem1(talker, 5438, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 23) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3474) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3474, 3);
myself.GiveItem1(talker, 5440, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 24) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3492) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3492, 2);
myself.GiveItem1(talker, 5460, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 25) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3474) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3474, 3);
myself.GiveItem1(talker, 5462, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 26) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3474) >= 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3474, 3);
myself.GiveItem1(talker, 5450, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

} else if (reply == 27) {
if (gg.OwnItemCount(talker, 5898) > 0 && gg.OwnItemCount(talker, 5961) >= 10 && gg.OwnItemCount(talker, 5962) >= 10 && gg.OwnItemCount(talker, 5963) >= 10 && gg.OwnItemCount(talker, 3492) >= 2) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_11.htm", 382);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 5961, 10);
myself.DeleteItem1(talker, 5962, 10);
myself.DeleteItem1(talker, 5963, 10);
myself.DeleteItem1(talker, 3492, 2);
myself.GiveItem1(talker, 5452, 1);

}

} else {
myself.ShowQuestPage(talker, "head_blacksmith_vergara_q0382_10.htm", 382);

}

}

}
super;
	}


}
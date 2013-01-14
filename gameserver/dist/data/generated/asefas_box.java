package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class asefas_box extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 615) == 1 && gg.GetMemoState(talker, 615) == 2 || gg.GetMemoState(talker, 615) == 3) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Magical Power of Fire - Part 1 (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 615) == 1 && gg.GetMemoState(talker, 615) == 2 || gg.GetMemoState(talker, 615) == 3) {
myself.SetCurrentQuestID(615);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "asefas_box_q0615_01.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 615) {
myself.SetCurrentQuestID(615);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 615) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 1661) < 1) {
myself.ShowPage(talker, "asefas_box_q0615_02.htm");

} else if (gg.OwnItemCount(talker, 1661) >= 1 && gg.GetMemoState(talker, 615) == 2) {
myself.ShowPage(talker, "asefas_box_q0615_03.htm");
if (myself.Skill_GetConsumeMP(298057729) < myself.sm.mp && myself.Skill_GetConsumeHP(298057729) < myself.sm.hp && myself.Skill_InReuseDelay(298057729) == 0) {
myself.AddUseSkillDesire(talker, 298057729, 1, 0, 1000000);

}
myself.GiveItem1(talker, 7242, 1);
myself.DeleteItem1(talker, 1661, 1);
myself.SetMemoState(talker, 615, 4);
myself.SetFlagJournal(talker, 615, 3);
myself.ShowQuestMark(talker, 615);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.OwnItemCount(talker, 1661) >= 1 && gg.GetMemoState(talker, 615) == 3) {
myself.ShowPage(talker, "asefas_box_q0615_04.htm");
myself.DeleteItem1(talker, 1661, 1);

}

}

}
super;
	}


}
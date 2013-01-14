package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class head_blacksmith_opix extends lv2_head_blacksmith {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2 && gg.GetMemoStateEx(talker, 363, 1) < 100000) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Sorrowful Sound of Flute (In Progress)");

}
if (gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) >= 2 && gg.GetMemoStateEx(talker, 363, 1) >= 100000) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Sorrowful Sound of Flute (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) == 2 && gg.GetMemoStateEx(talker, 363, 1) < 100000) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
i0 = gg.GetMemoStateEx(talker, 363, 1);
myself.SetMemoStateEx(talker, 363, 1, i0 + 100001);
myself.SetMemoStateEx(talker, 363, 0, 2);
i1 = gg.Rand(3);
if (i1 == 0) {
myself.ShowPage(talker, "head_blacksmith_opix_q0363_01.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (i1 == 1) {
myself.ShowPage(talker, "head_blacksmith_opix_q0363_02.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (i1 == 2) {
myself.ShowPage(talker, "head_blacksmith_opix_q0363_03.htm");
myself.SetJournal(talker, 363, 2);
myself.ShowQuestMark(talker, 363);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 363) == 1 && gg.GetMemoState(talker, 363) >= 2 && gg.GetMemoStateEx(talker, 363, 1) >= 100000) {
myself.SetCurrentQuestID(363);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "head_blacksmith_opix_q0363_04.htm");

}
break;

}

}
return;

}
super;
	}


}
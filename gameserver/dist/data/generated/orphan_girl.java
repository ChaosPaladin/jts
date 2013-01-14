package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class orphan_girl extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 226) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Test of the Healer (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 226) == 1) {
myself.SetCurrentQuestID(226);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
switch (gg.Rand(5)) {
case 0: {
myself.ShowPage(talker, "orphan_girl_q0226_01.htm");
break;

}
case 1: {
myself.ShowPage(talker, "orphan_girl_q0226_02.htm");
break;

}
case 2: {
myself.ShowPage(talker, "orphan_girl_q0226_03.htm");
break;

}
case 3: {
myself.ShowPage(talker, "orphan_girl_q0226_04.htm");
break;

}
case 4: {
myself.ShowPage(talker, "orphan_girl_q0226_05.htm");
break;

}

}

}
break;

}

}
return;

}
super;
	}


}
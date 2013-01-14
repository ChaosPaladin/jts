package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guide_gludio_euria extends newbie_guide {
	protected void TALKED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (myself.GetOneTimeQuestFlag(talker, 41) == 0 && gg.HaveNRMemo(talker, 41) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "The Adventurer's Challenge (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || myself.GetOneTimeQuestFlag(talker, 41) == 0 && gg.HaveNRMemo(talker, 41) == 1) {
myself.SetCurrentQuestID(41);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}
if (talker.level < 18) {
myself.ShowPage(talker, "newbie_guide_q0041_16.htm");

} else if (talker.level < 20) {
myself.ShowPage(talker, "newbie_guide_q0041_17.htm");

} else {
myself.ShowPage(talker, "newbie_guide_q0041_17.htm");
myself.SetOneTimeQuestFlag(talker, 41, 1);

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
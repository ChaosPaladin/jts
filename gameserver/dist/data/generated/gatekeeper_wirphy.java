package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gatekeeper_wirphy extends teleporter_need_item {
protected Object[][] Position = {
{"The Town of Gludio";-12787;122779;-3114;32000;1}, {"Town of Schuttgart";87126;-143520;-1288;4400;9}, {"Dark Elf Village";9709;15566;-4500;22000;0}, {"Talking Island Village";-84141;244623;-3729;46000;0}, {"Elven Village";46951;51550;-2976;23000;0}, {"Orc Village";-45158;-112583;-236;17000;0}, {"Kamael Village";-117251;46771;380;32000;0}, {"Abandoned Coal Mines";139714;-177456;-1536;690;0}, {"Eastern Mining Zone (Northeastern Shore)";169008;-208272;-3506;2400;0}, {"Western Mining Zone (Central Shore)";136910;-205082;-3664;970;0}, {"Mithril Mines Western Entrance";171946;-173352;3440;11000;0}, {"Mithril Mines Eastern Entrance";178591;-184615;-360;12000;0}
};
protected Object[][] PositionNoblessNeedItemField = {
{"Gludin Arena";-87328;142266;-3640;1;0}, {"Giran Arena";73579;142709;-3768;1;0}, {"The Center of the Mithril Mines";175499;-181586;-904;1;0}, {"The Center of the Abandoned Coal Mines";144706;-173223;-1520;1;0}, {"Coliseum";146440;46723;-3400;1;0}
};
protected Object[][] PositionNoblessNoItemField = {
{"Gludin Arena";-87328;142266;-3640;1000;0}, {"Giran Arena";73579;142709;-3768;1000;0}, {"The Center of the Mithril Mines";175499;-181586;-904;1000;0}, {"The Center of the Abandoned Coal Mines";144706;-173223;-1520;1000;0}, {"Coliseum";146440;46723;-3400;1000;0}
};
protected Object[][] PositionNewbie = {
{"Dark Elf Village";9709;15566;-4500;1;0}, {"Talking Island Village";-84141;244623;-3729;1;0}, {"Elven Village";46951;51550;-2976;1;0}, {"Orc Village";-45158;-112583;-236;1;0}
};

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == -6) {
if (gg.OwnItemCount(talker, ItemNeeded) != 0) {
myself.InstantTeleportWithItem(talker, -80749, 149834, -3043, ItemNeeded, 1);
return;

} else {
myself.ShowPage(talker, fnNoItem);

}

}
super;
	}

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 297) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Gatekeeper's Favor");

}
if (gg.HaveMemo(talker, 297) == 1 && gg.OwnItemCount(talker, 1573) < 20) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Gatekeeper's Favor (In Progress)");

}
if (gg.HaveMemo(talker, 297) == 1 && gg.OwnItemCount(talker, 1573) >= 20) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Gatekeeper's Favor (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 297) == 0) {
myself.SetCurrentQuestID(297);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
myself.FHTML_SetFileName(fhtml0, "gatekeeper_wirphy_q0297_02.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 297);
myself.ShowQuestFHTML(talker, fhtml0, 297);

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 297) == 1 && gg.OwnItemCount(talker, 1573) < 20) {
myself.SetCurrentQuestID(297);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "gatekeeper_wirphy_q0297_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 297) == 1 && gg.OwnItemCount(talker, 1573) >= 20) {
myself.SetCurrentQuestID(297);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "gatekeeper_wirphy_q0297_05.htm");
myself.DeleteItem1(talker, 1573, gg.OwnItemCount(talker, 1573));
myself.GiveItem1(talker, 1659, 2);
myself.RemoveMemo(talker, 297);
gg.AddLog(2, talker, 297);
gg.AddLog(3, talker, 297);
myself.SoundEffect(talker, "ItemSound.quest_finish");

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
if (quest_id == 297) {
myself.SetCurrentQuestID(297);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 15) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowQuestPage(talker, "gatekeeper_wirphy_q0297_03.htm", 297);
myself.SetMemo(talker, 297);
myself.ShowQuestMark(talker, 297);
myself.SetFlagJournal(talker, 297, 1);
gg.AddLog(1, talker, 297);
myself.SoundEffect(talker, "ItemSound.quest_accept");

}

} else {
myself.ShowQuestPage(talker, "gatekeeper_wirphy_q0297_01.htm", 297);

}
return;

}
super;
	}


}
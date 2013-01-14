package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class gatekeeper_belladonna extends teleporter {
protected Object[][] Position = {
{"Town of Schuttgart";87126;-143520;-1288;85000;9}, {"Heine";111455;219400;-3546;47000;6}, {"Town of Aden";146783;25808;-2000;56000;5}, {"Town of Oren";82971;53207;-1470;35000;4}, {"The Town of Dion";15472;142880;-2699;3400;2}, {"Town of Goddard";148024;-55281;-2728;71000;7}, {"The Town of Giran";83551;147945;-3400;29000;3}, {"Rune Township";43835;-47749;-792;53000;8}, {"The Village of Gludin";-80684;149770;-3043;7300;0}, {"Elven Village";46951;51550;-2976;9200;0}, {"Dark Elf Village";9709;15566;-4500;10000;0}, {"Dwarven Village";115120;-178224;-917;32000;0}, {"Orc Village";-45158;-112583;-236;23000;0}, {"Kamael Village";-117251;46771;380;12000;0}, {"Ruins of Agony";-41248;122848;-2912;790;0}, {"Ruins of Despair";-19120;136816;-3762;610;0}, {"The Ant Nest";-9959;176184;-4160;2100;0}, {"Windawood Manor";-28327;155125;-3496;1400;1}
};
protected Object[][] PositionNoblessNeedItemField = {
{"Gludin Arena";-87328;142266;-3640;1;0}, {"Giran Arena";73579;142709;-3768;1;0}, {"Evil Hunting Grounds";-6989;109503;-3040;1;0}, {"Coliseum";146440;46723;-3400;1;0}
};
protected Object[][] PositionNoblessNoItemField = {
{"Gludin Arena";-87328;142266;-3640;1000;0}, {"Giran Arena";73579;142709;-3768;1000;0}, {"Evil Hunting Grounds";-6989;109503;-3040;1000;0}, {"Coliseum";146440;46723;-3400;1000;0}
};

	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Get a Pet (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 419) && gg.OwnItemCount(talker, 3417) == 1) {
myself.SetCurrentQuestID(419);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetMemoState(talker, 419, gg.GetMemoState(talker, 419) | 2);
myself.ShowPage(talker, "gatekeeper_belladonna_q0419_01.htm");

}
break;

}

}
return;

}
super;
	}


}
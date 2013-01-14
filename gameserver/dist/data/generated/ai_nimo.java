package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nimo extends citizen {
	protected String fnTutorial = "nimo002.htm";
	protected String fnMaxNpc = "nimo004b.htm";
	protected String Hadit = "nimo003b.htm";
	protected String Giveit = "nimo006.htm";
	protected String InvenFull = "nimo003c.htm";
	protected String GiveitSuccess = "nimo003a.htm";
	protected String SpawnSuccess = "nimo004a.htm";
	protected int CHECK_TIMER = 1111;

	protected void CREATED() {
myself.i_quest9 = 0;
super;
	}

	protected void DEBUG_AI(HandlerParam creature, HandlerParam reply, HandlerParam pos0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (reply == 0) {
if (creature.param1 == 0) {
pos0 = gg.GetRandomPosInCreature(creature, 50, 100);
myself.Whisper(creature, "Marguene Test Spawn ");
myself.CreateOnePrivateEx(1018839, "marguene", 0, 0, pos0.x, pos0.y, pos0.z, 0, 0, 0, gg.GetIndexFromCreature(creature));
creature.param1 = 1;

} else {
myself.Whisper(creature, "You have marguene already.");

}

} else if (reply == 1) {
if (creature.param1 == 0) {
pos0 = gg.GetRandomPosInCreature(creature, 50, 100);
myself.Whisper(creature, "Marguene Test Spawn ");
myself.CreateOnePrivateEx(1018839, "marguene", 0, 0, pos0.x, pos0.y, pos0.z, 0, 0, 1, gg.GetIndexFromCreature(creature));
creature.param1 = 1;

} else {
myself.Whisper(creature, "You have marguene already.");

}

} else if (reply == 2) {
myself.Whisper(creature, "=== Creature Buff Status ===");
if (myself.i_quest9) {
myself.Say(gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(417267713)) + " 비스타콘");

}
if (myself.i_quest9) {
myself.Say(gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(417333249)) + " 코크라콘");

}
if (myself.i_quest9) {
myself.Say(gg.GetAbnormalLevel(creature, myself.Skill_GetAbnormalType(417398785)) + " 렙틸리콘");

}

} else if (reply == 3) {
myself.Whisper(creature, "=== Normal marguene ===");
if (myself.GetInventoryInfo(creature, 0) >= 1) {
myself.CreatePet(creature, 15488, 1016071, 60);

}

} else if (reply == 4) {
myself.Whisper(creature, "=== Elite marguene ===");
if (myself.GetInventoryInfo(creature, 0) >= 1) {
myself.CreatePet(creature, 15489, 1016072, 60);

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam maker0, HandlerParam pos0) {
if (ask == -415) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 15487) > 0) {
myself.ShowPage(talker, Hadit);

} else if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowPage(talker, InvenFull);

} else {
myself.ShowPage(talker, GiveitSuccess);
myself.GiveItem1(talker, 15487, 1);

}

} else if (reply == 2) {
if (talker.param1 == 0) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
i0 = maker0.npc_count;
if (i0 < maker0.maximum_npc) {
myself.ShowPage(talker, SpawnSuccess);
pos0 = gg.GetRandomPosInCreature(talker, 50, 100);
myself.CreateOnePrivateEx(1018839, "marguene", 0, 0, pos0.x, pos0.y, pos0.z, 0, 0, 1, gg.GetIndexFromCreature(talker));
if (myself.i_quest9) {
myself.Say(gg.GetIndexFromCreature(talker) + " 가 talker 인덱스");

}
talker.param1 = 1;

} else {
myself.ShowPage(talker, fnMaxNpc);

}

}

} else if (talker.param1 == 1) {
myself.ShowPage(talker, fnMaxNpc);

}

} else if (reply == 3) {

}

}
	}


}
package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class br_vital_manager extends default_npc {
	protected void CREATED() {
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "br_vi_stevu001.htm");
super;
	}

	protected void GIVE_EVENT_DATA(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
i3 = i2 / 3600;
i2 = i2 - i3 * 3600;
i4 = i2 / 60;
i2 = i2 - i4 * 60;
myself.ShowSystemMessageStr(talker, gg.MakeFString(1900138, gg.IntToStr(i3), gg.IntToStr(i4), gg.IntToStr(i2), "", ""));
if (i1 == 20108888) {
if (i0 == 1) {
myself.CastBuffForQuestReward(talker, 1519058945);
myself.CastBuffForQuestReward(talker, 1519124481);
myself.ShowPage(talker, "br_vi_stevu002.htm");

} else {
myself.ShowPage(talker, "br_vi_stevu003.htm");

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam c0) {
if (ask == 50021) {
switch (reply) {
case 1: {
myself.CanGiveEventData(talker, 20108888);
break;

}
case 2: {
if (talker.level <= 75) {
myself.ShowPage(talker, "br_vi_stevu005.htm");

} else if (myself.IsInCategory(0, talker.occupation)) {
myself.CastBuffForQuestReward(talker, 283246593);
myself.CastBuffForQuestReward(talker, 283312129);
myself.CastBuffForQuestReward(talker, 369426433);
myself.CastBuffForQuestReward(talker, 283377665);
myself.CastBuffForQuestReward(talker, 283443201);
myself.CastBuffForQuestReward(talker, 283508737);
myself.CastBuffForQuestReward(talker, 369098753);
myself.ShowPage(talker, "br_vi_stevu006.htm");

} else if (myself.IsInCategory(1, talker.occupation)) {
myself.CastBuffForQuestReward(talker, 283246593);
myself.CastBuffForQuestReward(talker, 283312129);
myself.CastBuffForQuestReward(talker, 369426433);
myself.CastBuffForQuestReward(talker, 283639809);
myself.CastBuffForQuestReward(talker, 283705345);
myself.CastBuffForQuestReward(talker, 283770881);
myself.CastBuffForQuestReward(talker, 283836417);
myself.ShowPage(talker, "br_vi_stevu007.htm");

}
break;

}
case 3: {
c0 = myself.GetSummon(talker);
if (talker.level <= 75) {
myself.ShowPage(talker, "br_vi_stevu011.htm");

} else if (myself.IsNullCreature(c0) == 0 && myself.IsInCategory(12, c0.npc_class_id) && myself.IsInCategory(35, c0.npc_class_id) == 0) {
myself.CastBuffForQuestReward(c0, 283246593);
myself.CastBuffForQuestReward(c0, 283312129);
myself.CastBuffForQuestReward(c0, 369426433);
myself.CastBuffForQuestReward(c0, 283377665);
myself.CastBuffForQuestReward(c0, 283443201);
myself.CastBuffForQuestReward(c0, 283508737);
myself.CastBuffForQuestReward(c0, 283639809);
myself.CastBuffForQuestReward(c0, 283705345);
myself.CastBuffForQuestReward(c0, 283770881);
myself.CastBuffForQuestReward(c0, 283836417);
myself.CastBuffForQuestReward(c0, 369098753);
myself.ShowPage(talker, "br_vi_stevu009.htm");

} else {
myself.ShowPage(talker, "br_vi_stevu010.htm");

}
break;

}

}

}
	}


}
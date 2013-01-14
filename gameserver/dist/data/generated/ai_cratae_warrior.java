package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_cratae_warrior extends warrior_use_skill {
	protected int my_point = 1;
	protected int my_lvzone = 1;
	protected int my_item_name = 1;
	protected double my_item_rate = 0.000000;
	protected String maker_name_70 = "etc10_1717_026m1";
	protected String maker_name_75 = "etc10_1715_026m1";
	protected String maker_name_80 = "etc10_1815_026m1";

	protected void MY_DYING(HandlerParam i0, HandlerParam i1, HandlerParam c0, HandlerParam c1, HandlerParam h0, HandlerParam maker0) {
gg.SetAsNull(c0);
c1 = myself.GetLastAttacker();
if (myself.IsNullCreature(c1) == 0) {
if (c1.is_pc == 1) {
c0 = c1;

} else if (c1.summon_type == 1) {
c0 = c1.master;

}
if (myself.IsNullCreature(c0) == 0) {
myself.AddKillPointUserPVPMatch(c0, my_point);
if (my_lvzone == 70) {
maker0 = gg.GetNpcMaker(maker_name_70);

} else if (my_lvzone == 75) {
maker0 = gg.GetNpcMaker(maker_name_75);

} else if (my_lvzone == 80) {
maker0 = gg.GetNpcMaker(maker_name_80);

}
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1717012, c0.id, my_point);

}
i0 = gg.FloatToInt(my_item_rate * 100000);
i1 = gg.Rand(100000) + 1;
if (i1 < i0) {
myself.GiveItem1(c0, my_item_name, 1);

}

}
super;

}
	}


}
package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_white_freya_event extends citizen {
	protected String fnHi = "white_freya_event001.htm";
	protected int event_skill1 = 599654401;
	protected int event_skill2 = 599719937;
	protected int event_skill3 = 599785473;
	protected int event_skill4 = 599851009;
	protected int event_skill5 = 599916545;
	protected int event_skill6 = 599982081;
	protected int event_skill7 = 600047617;
	protected int event_present = 17138;
	protected int event_present_skill = 15440;
	protected int idle_massage = 1801190;
	protected int love_massage = 1801195;

	protected void CREATED() {
myself.AddTimerEx(200001, 60000);
myself.AddTimerEx(200002, 10000);
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, fnHi);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 20001) {
if (reply == 1) {
myself.GiveEventItem(talker, 57, 1, event_present_skill, 1, 0, 20, 8, 8);

}

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam i0, HandlerParam i1, HandlerParam i2) {
i0 = gg.Rand(10000);
i1 = gg.Rand(2);
if (skill_name_id == event_skill1 || skill_name_id == event_skill2 || skill_name_id == event_skill3 || skill_name_id == event_skill4 || skill_name_id == event_skill5 || skill_name_id == event_skill6 || skill_name_id == event_skill7) {
if (i0 >= 9500) {
if (myself.i_ai0 == 1) {
myself.GiveItem1(speller, event_present, 1);
myself.Say(gg.MakeFString(love_massage + i1, speller.name, "", "", "", ""));
myself.i_ai0 = 0;

} else if (myself.i_ai1 == 1) {
i2 = gg.Rand(5);
myself.Say(gg.MakeFString(idle_massage + i2, "", "", "", "", ""));
myself.i_ai1 = 0;

}

} else if (myself.i_ai1 == 1) {
i2 = gg.Rand(5);
myself.Say(gg.MakeFString(idle_massage + i2, "", "", "", "", ""));
myself.i_ai1 = 0;

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 200001) {
myself.i_ai0 = 1;
myself.AddTimerEx(200001, 60000);

}
if (timer_id == 200002) {
myself.i_ai1 = 1;
myself.AddTimerEx(200002, 10000);

}
	}


}
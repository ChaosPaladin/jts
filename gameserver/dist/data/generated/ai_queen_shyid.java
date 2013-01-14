package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_queen_shyid extends raid_boss_type5 {
	protected String AreaName1 = "22_16_stakato_mob_buff";
	protected String AreaName2 = "22_16_stakato_mob_buff_display";
	protected String AreaName3 = "22_16_stakato_pc_buff";

	protected void CREATED() {
if (myself.i_quest9) {
myself.Shout("출현 메시지 했음");

}
gg.Area_SetOnOff(AreaName1, 1);
gg.Area_SetOnOff(AreaName2, 1);
gg.Area_SetOnOff(AreaName3, 0);
myself.AddTimerEx(9899, 3 * 60 * 60 * 1000);
gg.ShowMsgInTerritory(0, "22_16_stakato_announce", 3007);
super;
	}

	protected void DEBUG_AI(HandlerParam reply) {
myself.Shout("디버깅 값 " + reply + " 를 받아 세팅합니다.");
myself.i_quest9 = reply;
	}

	protected void MY_DYING() {
gg.ShowMsgInTerritory2(0, "22_16_stakato_announce", gg.MakeFString(1800850, "", "", "", "", ""));
if (myself.i_quest9) {
myself.Shout("사라짐 메시지 했음");

}
gg.Area_SetOnOff(AreaName1, 0);
gg.Area_SetOnOff(AreaName2, 0);
gg.Area_SetOnOff(AreaName3, 1);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 9899) {
gg.Area_SetOnOff(AreaName1, 0);
gg.Area_SetOnOff(AreaName2, 0);
myself.AddTimerEx(9889, 10 * 1000);

} else if (timer_id == 9889) {
myself.Despawn();

}
super;
	}


}
package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_event_heat_manager extends citizen {
	protected int domain_id = 0;
	protected int heat_private01 = 1013269;
	protected String heat_private01_ai = "ai_event_the_heat";
	protected int heat_private02 = 1013270;
	protected String heat_private02_ai = "ai_event_terrible_heat";
	protected int vaccine_area_skill01 = 409796609;
	protected int vaccine_area_skill02 = 409862145;
	protected int vaccine_area_skill03 = 409927681;
	protected int vaccine_area_skill04 = 409993217;
	protected int vaccine_area_skill05 = 410058753;
	protected int vaccine_area_skill06 = 410124289;
	protected int vaccine_area_skill07 = 410189825;
	protected int vaccine_area_skill08 = 410255361;
	protected int vaccine_area_skill09 = 410320897;
	protected int heat_skill01 = 408944641;
	protected int target_heat_level = 3;
	protected int things_to_yell = 1800892;
	protected int delay_to_yell = 60;
	protected int range_to_yell = 1500;
	protected int delay_to_buff = 15;
	protected int TID_TO_YELL = 78001;
	protected int TID_TO_BUFF = 78002;
	protected int babble_mode = 0;

	protected void CREATED() {
if (domain_id == 99) {
myself.EventManagerEnter();
gg.SetXMasEventState(vaccine_area_skill01 / 256 * 256, 1);
gg.SetXMasEventState(vaccine_area_skill02 / 256 * 256, 1);
gg.SetXMasEventState(vaccine_area_skill03 / 256 * 256, 1);
gg.SetXMasEventState(vaccine_area_skill04 / 256 * 256, 1);
gg.SetXMasEventState(vaccine_area_skill05 / 256 * 256, 1);
gg.SetXMasEventState(vaccine_area_skill06 / 256 * 256, 1);
gg.SetXMasEventState(vaccine_area_skill07 / 256 * 256, 1);
gg.SetXMasEventState(vaccine_area_skill08 / 256 * 256, 1);
gg.SetXMasEventState(vaccine_area_skill09 / 256 * 256, 1);

}
myself.AddTimerEx(TID_TO_YELL, delay_to_yell * 1000);
myself.AddTimerEx(TID_TO_BUFF, delay_to_buff * 1000);
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == TID_TO_YELL) {
myself.BroadcastSystemMessageStr(myself.sm, range_to_yell, gg.MakeFString(things_to_yell, "", "", "", "", ""));
gg.BroadcastOnScreenMsgStr(myself.sm, range_to_yell, 5, 0, 1, 3, 1, 1, 5000, 0, gg.MakeFString(things_to_yell, "", "", "", "", ""));
myself.AddTimerEx(TID_TO_YELL, delay_to_yell * 1000);

} else if (timer_id == TID_TO_BUFF && domain_id != 0) {
switch (domain_id) {
case 1: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill01, 1, 1, 1000000);
break;

}
case 2: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill02, 1, 1, 1000000);
break;

}
case 3: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill03, 1, 1, 1000000);
break;

}
case 4: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill04, 1, 1, 1000000);
break;

}
case 5: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill05, 1, 1, 1000000);
break;

}
case 6: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill06, 1, 1, 1000000);
break;

}
case 7: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill07, 1, 1, 1000000);
break;

}
case 8: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill08, 1, 1, 1000000);
break;

}
case 9: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill09, 1, 1, 1000000);
break;

}
case 99: {
myself.AddUseSkillDesire(myself.sm, vaccine_area_skill01, 1, 1, 1000000);
break;

}

}
myself.AddTimerEx(TID_TO_BUFF, delay_to_buff * 1000);

}
super;
	}

	protected void TALKED(HandlerParam talker) {
if (myself.IsNullCreature(talker) == 0 && domain_id != 0) {

}
super;
	}

	protected void CREATE_NPC_TO_WINNER(HandlerParam target) {
if (babble_mode == 1) {
gg.Announce("CREATE_NPC_TO_WINNER 이벤트 받음");

}
if (myself.IsNullCreature(target) == 0 && target.instant_zone_id == 0) {
if (babble_mode == 1) {
myself.Say("TARGET" + target.id);

}
if (gg.GetAbnormalLevel(target, myself.Skill_GetAbnormalType(heat_skill01)) == target_heat_level) {
myself.CreateOnePrivateEx(heat_private02, heat_private02_ai, 0, 0, gg.FloatToInt(target.x - 50 + gg.Rand(100)), gg.FloatToInt(target.y - 50 + gg.Rand(100)), gg.FloatToInt(target.z + 10), myself.GetDirectionToTarget(target) * 182, target.id, 0, 0);

} else {
myself.CreateOnePrivateEx(heat_private01, heat_private01_ai, 0, 0, gg.FloatToInt(target.x - 50 + gg.Rand(100)), gg.FloatToInt(target.y - 50 + gg.Rand(100)), gg.FloatToInt(target.z + 10), myself.GetDirectionToTarget(target) * 182, target.id, 0, 0);

}

} else if (babble_mode == 1) {
gg.Announce("CREATE_NPC_TO_WINNER 이벤트 받았지만 크리쳐 정보 이상");

}
	}


}
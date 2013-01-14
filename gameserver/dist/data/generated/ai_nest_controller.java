package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_nest_controller extends default_npc {
	protected int GroupNum = -1;
	protected String my_trr = "";
	protected int TIMER_CHECK_20SEC = 33120;
	protected int TIMER_SPAWN_PRIVATE = 33124;
	protected int TIMER_DESTROY_CAMP = 33125;
	protected int SKILL_camp_destroy = 402980865;
	protected int Spot1_x = -1;
	protected int Spot1_y = -1;
	protected int Spot1_z = -1;
	protected int Spot1_dir = -1;
	protected int Spot2_x = -1;
	protected int Spot2_y = -1;
	protected int Spot2_z = -1;
	protected int Spot2_dir = -1;
	protected int Spot3_x = -1;
	protected int Spot3_y = -1;
	protected int Spot3_z = -1;
	protected int Spot3_dir = -1;
	protected int Spot4_x = -1;
	protected int Spot4_y = -1;
	protected int Spot4_z = -1;
	protected int Spot4_dir = -1;
	protected int debug_mode = 0;

	protected void CREATED(HandlerParam i0) {
myself.int_list.Clear();
for (i0 = 0; i0 < 4; i0 = i0 + 1) {
if (debug_mode) {
myself.Say("투명NPC init - 스폰 " + i0);

}
myself.int_list.Add(i0);

}
myself.AddTimerEx(TIMER_SPAWN_PRIVATE, 1);
myself.AddTimerEx(TIMER_CHECK_20SEC, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam maker0) {
if (timer_id == TIMER_CHECK_20SEC) {
if (gg.GetDateTime(0, 5) == 0 || gg.GetDateTime(0, 5) == 20 || gg.GetDateTime(0, 5) == 40) {
myself.AddTimerEx(TIMER_SPAWN_PRIVATE, 1);

}
myself.AddTimerEx(TIMER_CHECK_20SEC, 1000);

}
if (timer_id == TIMER_SPAWN_PRIVATE) {
if (myself.int_list.GetSize() > 0) {
for (i0 = 0; i0 < myself.int_list.GetSize(); i0 = i0 + 1) {
maker0 = myself.GetMyMaker();
if (maker0.maximum_npc - maker0.npc_count <= 0) {
if (debug_mode) {
myself.Shout("ERR! maximum_npc, 야영지번호 : " + GroupNum + " spotnum : " + myself.int_list.Get(i0));

}

}
switch (myself.int_list.Get(i0)) {
case 0: {
i1 = Spot1_x;
i2 = Spot1_y;
i3 = Spot1_z;
i4 = Spot1_dir;
break;

}
case 1: {
i1 = Spot2_x;
i2 = Spot2_y;
i3 = Spot2_z;
i4 = Spot2_dir;
break;

}
case 2: {
i1 = Spot3_x;
i2 = Spot3_y;
i3 = Spot3_z;
i4 = Spot3_dir;
break;

}
case 3: {
i1 = Spot4_x;
i2 = Spot4_y;
i3 = Spot4_z;
i4 = Spot4_dir;
break;

}

}
if (debug_mode) {
myself.Say("x : " + i1 + ",y : " + i2 + ",z : " + i3);

}
switch (gg.Rand(3) + 1) {
case 1: {
myself.CreateOnePrivateEx(1018812, "ai_nest_observer", 0, 0, i1, i2, i3, i4, GroupNum, myself.int_list.Get(i0), 0);
break;

}
case 2: {
myself.CreateOnePrivateEx(1018813, "ai_nest_observer", 0, 0, i1, i2, i3, i4, GroupNum, myself.int_list.Get(i0), 0);
break;

}
case 3: {
myself.CreateOnePrivateEx(1018814, "ai_nest_observer", 0, 0, i1, i2, i3, i4, GroupNum, myself.int_list.Get(i0), 0);
break;

}

}

}
myself.int_list.Clear();

}

} else if (timer_id == TIMER_DESTROY_CAMP) {
if (debug_mode) {
myself.Say("야영지 내부에 카샤의 낙인 시전!");

}
if (myself.Skill_GetConsumeMP(SKILL_camp_destroy) < myself.sm.mp && myself.Skill_GetConsumeHP(SKILL_camp_destroy) < myself.sm.hp && myself.Skill_InReuseDelay(SKILL_camp_destroy) == 0) {
myself.AddUseSkillDesire(myself.sm, SKILL_camp_destroy, 1, 1, 1000000);

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0) {
if (script_event_arg1 == 2214004) {
if (GroupNum == script_event_arg2) {
myself.int_list.Add(script_event_arg3);

}

} else if (script_event_arg1 == 2214010) {
if (debug_mode) {
myself.Say("SCE_OBSERVER_CREATED");

}
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2214010, script_event_arg2, 0);

}

} else if (script_event_arg1 == 2214011) {
if (debug_mode) {
myself.Say("SCE_OBSERVER_DYING");

}
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 2214011, script_event_arg2, 0);

}

} else if (script_event_arg1 == 2214002) {
if (GroupNum == script_event_arg2) {
if (script_event_arg3 == 0) {
if (debug_mode) {
myself.Say("3초뒤 야영지 내부에 카샤의 낙인 시전");

}
myself.BroadcastScriptEvent(2214003, GroupNum, 4000);
myself.AddTimerEx(TIMER_DESTROY_CAMP, 3 * 1000);

} else if (script_event_arg3 == 3) {
gg.ShowMsgInTerritory(0, my_trr, 3022);

} else if (script_event_arg3 == 2) {
gg.ShowMsgInTerritory(0, my_trr, 3023);

} else if (script_event_arg3 == 1) {
gg.ShowMsgInTerritory(0, my_trr, 3024);

}

}

} else if (script_event_arg1 == 2214001) {
if (GroupNum == script_event_arg2) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {

}

}

} else if (script_event_arg1 == 1111) {
if (debug_mode) {
switch (script_event_arg2) {
case 1: {
myself.Say("야영지 번호 : " + script_event_arg3);
break;

}
case 2: {
myself.Say("카샤의 저주(공격속도UP) : " + script_event_arg3);
break;

}
case 3: {
myself.Say("카샤의 갈망(공격력UP) : " + script_event_arg3);
break;

}
case 4: {
myself.Say("카샤의 절망(크리티컬UP) : " + script_event_arg3);
break;

}

}

}

}
	}


}
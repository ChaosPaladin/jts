package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_naia_spore extends warrior_basic {
	protected int IsAggressive = 1;
	protected int Aggressive_Time = 1;
	protected int MoveArounding = 1;
	protected int aspect_myself = 99;
	protected String my_maker_name = "gludio59_1825_naia01m1";
	protected int moveto1_x = -46080;
	protected int moveto1_y = 246368;
	protected int moveto1_z = -14183;
	protected int moveto2_x = -44816;
	protected int moveto2_y = 246368;
	protected int moveto2_z = -14183;
	protected int moveto3_x = -44224;
	protected int moveto3_y = 247440;
	protected int moveto3_z = -14184;
	protected int moveto4_x = -44896;
	protected int moveto4_y = 248464;
	protected int moveto4_z = -14183;
	protected int moveto5_x = -46064;
	protected int moveto5_y = 248544;
	protected int moveto5_z = -14183;
	protected int moveto6_x = -46720;
	protected int moveto6_y = 247424;
	protected int moveto6_z = -14183;
	protected int merge1_x = -45488;
	protected int merge1_y = 246768;
	protected int merge1_z = -14183;
	protected int merge2_x = -44767;
	protected int merge2_y = 247419;
	protected int merge2_z = -14183;
	protected int merge3_x = -46207;
	protected int merge3_y = 247417;
	protected int merge3_z = -14183;
	protected int merge4_x = -45462;
	protected int merge4_y = 248174;
	protected int merge4_z = -14183;
	protected int skill_exp_fire = 377815041;
	protected int skill_exp_water = 377880577;
	protected int skill_exp_wind = 377946113;
	protected int skill_exp_earth = 378011649;

	protected void CREATED(HandlerParam c0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = gg.Rand(6) + 1;
switch (myself.i_ai3) {
case 1: {
myself.i_ai3 = 1;
myself.AddMoveToDesire(moveto1_x, moveto1_y, moveto1_z, 10);
break;

}
case 2: {
myself.i_ai3 = 2;
myself.AddMoveToDesire(moveto2_x, moveto2_y, moveto2_z, 10);
break;

}
case 3: {
myself.i_ai3 = 3;
myself.AddMoveToDesire(moveto3_x, moveto3_y, moveto3_z, 10);
break;

}
case 4: {
myself.i_ai3 = 4;
myself.AddMoveToDesire(moveto4_x, moveto4_y, moveto4_z, 10);
break;

}
case 5: {
myself.i_ai3 = 5;
myself.AddMoveToDesire(moveto5_x, moveto5_y, moveto5_z, 10);
break;

}
case 6: {
myself.i_ai3 = 6;
myself.AddMoveToDesire(moveto6_x, moveto6_y, moveto6_z, 10);
break;

}

}
if (aspect_myself == 99) {
myself.AddTimerEx(78001, 1 * 60 * 1000);

} else {
myself.AddTimerEx(78002, 60 + gg.Rand(40) * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 78001) {
myself.Despawn();

} else if (timer_id == 78002) {
myself.RemoveAllDesire();
switch (aspect_myself) {
case 0: {
myself.AddUseSkillDesire(myself.sm, skill_exp_fire, 0, 1, 10000000000);
break;

}
case 1: {
myself.AddUseSkillDesire(myself.sm, skill_exp_water, 0, 1, 10000000000);
break;

}
case 2: {
myself.AddUseSkillDesire(myself.sm, skill_exp_wind, 0, 1, 10000000000);
break;

}
case 3: {
myself.AddUseSkillDesire(myself.sm, skill_exp_earth, 0, 1, 10000000000);
break;

}

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam s0) {
if (script_event_arg1 == 78010012) {
if (script_event_arg2 != 0) {
myself.i_ai0 = 1;
myself.i_ai2 = script_event_arg2;
myself.RemoveAllDesire();
switch (myself.i_ai2) {
case 1: {
myself.AddMoveToDesire(merge1_x, merge1_y, merge1_z, 100000000);
break;

}
case 2: {
myself.AddMoveToDesire(merge2_x, merge2_y, merge2_z, 100000000);
break;

}
case 3: {
myself.AddMoveToDesire(merge3_x, merge3_y, merge3_z, 100000000);
break;

}
case 4: {
myself.AddMoveToDesire(merge4_x, merge4_y, merge4_z, 100000000);
break;

}

}
myself.AddTimerEx(78001, 1 * 60 * 1000);

} else if (script_event_arg2 == 0 && gg.Rand(100) < 50) {
s0 = gg.MakeFString(script_event_arg3 + 1800208, "", "", "", "", "");
switch (gg.Rand(4)) {
case 0: {
myself.Say(gg.MakeFString(1800214, s0, "", "", "", ""));
break;

}
case 1: {
myself.Say(gg.MakeFString(1800215, s0, "", "", "", ""));
break;

}
case 2: {
myself.Say(gg.MakeFString(1800216, s0, "", "", "", ""));
break;

}
case 3: {
myself.Say(gg.MakeFString(1800217, s0, "", "", "", ""));
break;

}

}

}

} else if (script_event_arg1 == 78010043) {
if (gg.Rand(Rand - script_event_arg2) == 1) {
gg.SendScriptEvent(myself.boss, 78010043, 99);
myself.AddTimerEx(78002, 1 * 1000);

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam skill_name_id) {
if (skill_name_id == skill_exp_fire || skill_name_id == skill_exp_water || skill_name_id == skill_exp_wind || skill_name_id == skill_exp_earth) {
myself.Despawn();

}
super;
	}

	protected void MOVE_TO_FINISHED(HandlerParam maker0, HandlerParam i0) {
if (myself.i_ai0 == 1) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010031, myself.i_ai2, 0);
myself.RemoveAllDesire();
myself.Despawn();

}

} else {
i0 = gg.Rand(1);
if (myself.i_ai3 == 1 && i0 == 0 || myself.i_ai3 == 5 && i0 == 1) {
myself.i_ai3 = 6;
myself.AddMoveToDesire(moveto6_x, moveto6_y, moveto6_z, 10);

} else if (myself.i_ai3 == 1 && i0 == 1 || myself.i_ai3 == 3 && i0 == 0) {
myself.i_ai3 = 2;
myself.AddMoveToDesire(moveto2_x, moveto2_y, moveto2_z, 10);

} else if (myself.i_ai3 == 2 && i0 == 0 || myself.i_ai3 == 6 && i0 == 1) {
myself.i_ai3 = 1;
myself.AddMoveToDesire(moveto1_x, moveto1_y, moveto1_z, 10);

} else if (myself.i_ai3 == 2 && i0 == 1 || myself.i_ai3 == 4 && i0 == 0) {
myself.i_ai3 = 3;
myself.AddMoveToDesire(moveto3_x, moveto3_y, moveto3_z, 10);

} else if (myself.i_ai3 == 3 && i0 == 1 || myself.i_ai3 == 5 && i0 == 0) {
myself.i_ai3 = 4;
myself.AddMoveToDesire(moveto4_x, moveto4_y, moveto4_z, 10);

} else if (myself.i_ai3 == 4 && i0 == 1 || myself.i_ai3 == 6 && i0 == 0) {
myself.i_ai3 = 5;
myself.AddMoveToDesire(moveto5_x, moveto5_y, moveto5_z, 10);

} else {
myself.AddMoveAroundDesire(5, 10);

}

}
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private == myself.boss && private != myself.sm) {
myself.Despawn();

}
	}

	protected void OUT_OF_TERRITORY() {
	}


}
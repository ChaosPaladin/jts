package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class royal_rush_area_controller extends royal_rush_default_npc {
	protected String AreaName = "royal_rush_area_controller_default";
	protected int StatusEffect = 303300609;
	protected int type = 0;

	protected void CREATED() {
gg.Area_SetOnOff(AreaName, 0);
switch (type) {
case 0: {
myself.AddTimerEx(3001, 1000 * 60 * 2);
myself.Shout(gg.MakeFString(1010474, "", "", "", "", ""));
break;

}
case 1: {
myself.AddTimerEx(3001, 1000 * 60);
myself.Shout(gg.MakeFString(1010473, "", "", "", "", ""));
break;

}
case 2: {
gg.Area_SetOnOff(AreaName, 1);
myself.AddUseSkillDesire(myself.sm, StatusEffect, 1, 0, 1000000);
myself.Shout(gg.MakeFString(1010472, "", "", "", "", ""));
myself.AddTimerEx(3002, 1000 * 30);
break;

}
case 3: {
myself.AddTimerEx(3001, 1000 * 60 * 3);
myself.Shout(gg.MakeFString(1010475, "", "", "", "", ""));
break;

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0) {
if (timer_id == 3001) {
gg.Area_SetOnOff(AreaName, 1);
myself.AddUseSkillDesire(myself.sm, StatusEffect, 1, 0, 1000000);
switch (type) {
case 0: {
myself.Shout(gg.MakeFString(1010477, "", "", "", "", ""));
myself.AddTimerEx(3002, 1000 * 30);
break;

}
case 1: {
myself.Shout(gg.MakeFString(1010476, "", "", "", "", ""));
myself.AddTimerEx(3002, 1000 * 30);
break;

}
case 2: {
myself.Shout(gg.MakeFString(1010472, "", "", "", "", ""));
break;

}
case 3: {
myself.Shout(gg.MakeFString(1010478, "", "", "", "", ""));
myself.AddTimerEx(3002, 1000 * 30);
break;

}

}

}
if (timer_id == 3002) {
myself.AddUseSkillDesire(myself.sm, StatusEffect, 1, 0, 1000000);
myself.AddTimerEx(3002, 1000 * 30);

}
super;
	}

	protected void MY_DYING() {
gg.Area_SetOnOff(AreaName, 0);
switch (type) {
case 0: {
myself.Shout(gg.MakeFString(1010481, "", "", "", "", ""));
break;

}
case 1: {
myself.Shout(gg.MakeFString(1010480, "", "", "", "", ""));
break;

}
case 2: {
myself.Shout(gg.MakeFString(1010479, "", "", "", "", ""));
break;

}
case 3: {
myself.Shout(gg.MakeFString(1010482, "", "", "", "", ""));
break;

}

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id) {
myself.AddUseSkillDesire(myself.sm, StatusEffect, 1, 0, 1000000);
	}


}
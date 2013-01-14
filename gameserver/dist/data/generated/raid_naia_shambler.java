package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class raid_naia_shambler extends wizard_basic {
	protected int babble_mode = 0;
	protected int IsAggressive = 1;
	protected int Aggressive_Time = 1;
	protected int aspect_myself = 0;
	protected String door_defeated = "";
	protected String my_maker_name = "gludio59_1825_naia01m1";
	protected int Skill01_ID = 458752001;
	protected int Skill01_Probablity = 10000;
	protected int Skill01_FStringRate = 0;
	protected int Skill01_MainAttack = 1;
	protected int Skill02_ID = 458752001;
	protected int Skill02_Probablity = 5000;
	protected int Skill02_HPTarget = 0;
	protected int Skill02_HighHP = 50;
	protected int Skill02_MainAttack = 0;
	protected int Skill03_ID = 458752001;
	protected int Skill03_Probablity = 10000;
	protected int Skill03_MainAttack = 1;
	protected int Skill04_ID = 458752001;
	protected int Skill04_Probablity = 5000;
	protected int Skill04_Target = 3;
	protected int Skill04_Type = 3;
	protected double Skill04_Desire = 1000000.000000;
	protected int Skill04_HPTarget = 0;
	protected int Skill04_HighHP = 10;
	protected String PrivatesFire3 = "naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec";
	protected String PrivatesFire6 = "naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec";
	protected String PrivatesFire12 = "naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0secnaia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec;naia_spore_fire:naia_spore_fire:1:0sec";
	protected String PrivatesWater3 = "naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec";
	protected String PrivatesWater6 = "naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec";
	protected String PrivatesWater12 = "naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec;naia_spore_water:naia_spore_water:1:0sec";
	protected String PrivatesWind3 = "naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec";
	protected String PrivatesWind6 = "naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec";
	protected String PrivatesWind12 = "naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec;naia_spore_wind:naia_spore_wind:1:0sec";
	protected String PrivatesEarth3 = "naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec";
	protected String PrivatesEarth6 = "naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec";
	protected String PrivatesEarth12 = "naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec;naia_spore_earth:naia_spore_earth:1:0sec";
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

	protected void CREATED() {
myself.i_ai0 = gg.FloatToInt(myself.sm.max_hp);
myself.AddTimerEx(78001, 10 * 1000);
myself.i_ai2 = 0;
myself.AddTimerEx(78003, 10 * 60 * 1000);
myself.EffectMusic(myself.sm, 4000, "Rm01_A");
super;
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3) {
if (script_event_arg1 == 78010031) {
if (babble_mode == 1) {
myself.Shout("스포어 전부 도착: " + script_event_arg2 + "번 좌표로 텔!");

}
switch (script_event_arg2) {
case 1: {
myself.InstantTeleport(myself.sm, merge1_x, merge1_y, merge1_z);
break;

}
case 2: {
myself.InstantTeleport(myself.sm, merge2_x, merge2_y, merge2_z);
break;

}
case 3: {
myself.InstantTeleport(myself.sm, merge3_x, merge3_y, merge3_z);
break;

}
case 4: {
myself.InstantTeleport(myself.sm, merge3_x, merge3_y, merge3_z);
break;

}

}

} else if (script_event_arg1 == 78010043 && script_event_arg2 == 99) {
myself.i_ai2 = myself.i_ai2 - 1;
if (babble_mode == 1) {
myself.Shout("현재 부하수 " + gg.IntToStr(myself.i_ai2));

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam private, HandlerParam f0, HandlerParam f1) {
if (timer_id == 78001) {
if (gg.Rand(1000) > 250) {
f0 = myself.sm.hp;
f1 = myself.sm.max_hp;
myself.i_ai1 = gg.FloatToInt(myself.i_ai0 - gg.FloatToInt(f0) / gg.FloatToInt(f1) * 100);
if (myself.i_ai1 > 5 && myself.i_ai1 <= 15) {
if (babble_mode == 1) {
myself.Shout("프로스퍼 + 스폰 3마리 시도");

}
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, 10000000000);
if (myself.i_ai2 <= 9) {
myself.i_ai2 = myself.i_ai2 + 3;
if (babble_mode == 1) {
myself.Shout("스폰 했음: 현재 부하수 " + gg.IntToStr(myself.i_ai2));

}
switch (aspect_myself) {
case 0: {
myself.CreatePrivates(PrivatesFire3);
break;

}
case 1: {
myself.CreatePrivates(PrivatesWater3);
break;

}
case 2: {
myself.CreatePrivates(PrivatesWind3);
break;

}
case 3: {
myself.CreatePrivates(PrivatesEarth3);
break;

}

}

} else {
if (babble_mode == 1) {
myself.Shout("스폰 못함 - 소팅");

}
myself.BroadcastScriptEvent(78010043, 3, 5000);

}

} else if (myself.i_ai1 > 15 && myself.i_ai1 <= 30 || myself.i_ai1 > 1 && myself.i_ai1 <= 5) {
if (babble_mode == 1) {
myself.Shout("프로스퍼 + 스폰 6마리 시도");

}
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, 10000000000);
if (myself.i_ai2 <= 6) {
myself.i_ai2 = myself.i_ai2 + 6;
if (babble_mode == 1) {
myself.Shout("스폰 했음: 현재 부하수 " + gg.IntToStr(myself.i_ai2));

}
switch (aspect_myself) {
case 0: {
myself.CreatePrivates(PrivatesFire6);
break;

}
case 1: {
myself.CreatePrivates(PrivatesWater6);
break;

}
case 2: {
myself.CreatePrivates(PrivatesWind6);
break;

}
case 3: {
myself.CreatePrivates(PrivatesEarth6);
break;

}

}

} else {
if (babble_mode == 1) {
myself.Shout("스폰 못함 - 소팅");

}
myself.BroadcastScriptEvent(78010043, 6, 5000);

}

} else {
if (babble_mode == 1) {
myself.Shout("프로스퍼 + 스폰 12마리 시도");

}
myself.RemoveAllDesire();
myself.AddUseSkillDesire(myself.sm, Skill02_ID, 0, 1, 10000000000);
if (myself.i_ai2 == 0) {
myself.i_ai2 = myself.i_ai2 + 12;
if (babble_mode == 1) {
myself.Shout("스폰 했음: 현재 부하수 " + gg.IntToStr(myself.i_ai2));

}
switch (aspect_myself) {
case 0: {
myself.CreatePrivates(PrivatesFire12);
break;

}
case 1: {
myself.CreatePrivates(PrivatesWater12);
break;

}
case 2: {
myself.CreatePrivates(PrivatesWind12);
break;

}
case 3: {
myself.CreatePrivates(PrivatesEarth12);
break;

}

}

} else {
if (babble_mode == 1) {
myself.Shout("스폰 못함 - 소팅");

}
myself.BroadcastScriptEvent(78010043, 12, 5000);

}

}
myself.i_ai0 = gg.FloatToInt(myself.sm.hp);

}
myself.AddTimerEx(78001, 10 * 1000);

} else if (timer_id == 78003) {
if (myself.p_state == 1 || myself.p_state == 2 || myself.p_state == 11 || myself.p_state == 0) {
maker0 = gg.GetNpcMaker(my_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010035, 0, 0);

}

} else {
myself.AddTimerEx(78003, 10 * 60 * 1000);

}

}
super;
	}

	protected void PARTY_DIED(HandlerParam private) {
if (private != myself.sm) {
myself.i_ai2 = myself.i_ai2 - 1;
if (babble_mode == 1) {
myself.Shout("현재 부하수 " + gg.IntToStr(myself.i_ai2));

}

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
myself.CreateOnePrivateEx(1032376, "cube_for_naia", 0, 0, -45482, 246277, -14184, 0, 0, 0, 0);
if (babble_mode == 1) {
myself.Shout("사망 등록용 신청");

}
super;
	}

	protected void OUT_OF_TERRITORY() {
	}


}
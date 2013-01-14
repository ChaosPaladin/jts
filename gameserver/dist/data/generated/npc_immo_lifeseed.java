package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_immo_lifeseed extends default_npc {
	protected int tide = 0;
	protected int zone = 0;
	protected String type = "decoy";
	protected int room = 0;
	protected String dispatcher_maker = "";
	protected int Skill_Branding = 542375937;
	protected int Skill_dying_display = 395640833;
	protected int NPC_Attack_Skill_C = 387252225;
	protected int NPC_Attack_Skill_L = 387317761;
	protected String fnHi = "";
	protected String fnHi_working = "lifeseed_decoy002.htm";
	protected String fnHi_notworking = "lifeseed_decoy099.htm";
	protected String fnHi_keepworking = "lifeseed_decoy003.htm";
	protected int reward_siege = 13797;
	protected int reward_rate = 30;
	protected int TM_RESPAWN_BLANK = 78001;
	protected int TM_SEND_TAUNT = 78003;
	protected int TM_REWARD_DROP = 78004;
	protected int TM_TUMOR_CHECK = 78005;
	protected int TM_HEALTH_REPORT = 78006;
	protected int TIME_respawn_blank = 10;
	protected int TIME_reward_drop = 60;
	protected int TM_DECOY_TIME = 78009;
	protected int TIME_DECOY_TIME = 300;
	protected int TM_DECOY_RECHARGE = 78010;
	protected int TIME_DECOY_RECHARGE = 60;
	protected int TACT_AGGRESIVE = 0;
	protected int TACT_INTERCEPT = 1;
	protected int TACT_DEFENSIVE = 2;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam i0) {
myself.i_ai1 = 0;
if (gg.IsSameString(type, "def") == 1) {
myself.i_ai0 = 0;
if (babble_mode == 1) {
myself.i_ai2 = 3000000;

} else {
myself.i_ai2 = 300;

}
if (babble_mode == 1) {
myself.Shout("경직 시간 시작");

}
myself.AddTimerEx(TM_RESPAWN_BLANK, TIME_respawn_blank * 1000);

} else if (gg.IsSameString(type, "decoy") == 1) {
myself.i_ai0 = 1;
myself.i_ai2 = 100;
myself.i_ai3 = gg.Rand(3) + 1;
myself.AddTimerEx(TM_DECOY_TIME, TIME_DECOY_TIME * 1000);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam maker0, HandlerParam party0) {
if (timer_id == TM_RESPAWN_BLANK) {
if (babble_mode == 1) {
myself.Shout("정상화");

}
myself.i_ai0 = 1;
myself.AddTimerEx(TM_SEND_TAUNT, gg.Rand(15) + 1 * 1000);
myself.AddTimerEx(TM_REWARD_DROP, TIME_reward_drop * 1000);

} else if (timer_id == TM_SEND_TAUNT) {
if (gg.IsSameString(type, "decoy") == 1 && myself.i_ai0 == 1) {
myself.BroadcastScriptEventEx(78010052, myself.sm.id, 911, 500 + gg.Rand(200) - gg.Rand(200));
myself.AddTimerEx(TM_SEND_TAUNT, gg.Rand(10) + 1 * 1000);

} else {
myself.BroadcastScriptEventEx(78010052, myself.sm.id, room, 1300 + gg.Rand(200) - gg.Rand(200));
myself.AddTimerEx(TM_SEND_TAUNT, gg.Rand(15) + 1 * 1000);

}

} else if (timer_id == TM_REWARD_DROP) {
if (gg.Rand(100) <= reward_rate) {
if (babble_mode == 1) {
myself.Say("보상 아이템 드랍");

}
myself.DropItem1(myself.sm, reward_siege, 1);

}
myself.AddTimerEx(TM_REWARD_DROP, TIME_reward_drop * 1000);

} else if (timer_id == TM_DECOY_TIME) {
if (babble_mode == 1) {
myself.Say("디코이 지속 시간 종료");

}
myself.Despawn();

} else if (timer_id == TM_DECOY_RECHARGE) {
if (babble_mode == 1) {
myself.Say("디코이 쿨타임 종료");

}
myself.Say(gg.MakeFString(1800272, "", "", "", "", ""));
myself.i_ai0 = 1;

}
	}

	protected void SPELLED(HandlerParam attacker, HandlerParam skill_name_id) {
if (myself.i_ai1 == myself.i_ai2) {
if (babble_mode == 1) {
myself.Say("사망 연출 스킬 사용");

}
myself.AddUseSkillDesire(myself.sm, Skill_dying_display, 1, 1, 10000000000);

} else if (skill_name_id == NPC_Attack_Skill_C || skill_name_id == NPC_Attack_Skill_L) {
myself.i_ai1 = myself.i_ai1 + 1;
if (babble_mode == 1) {
myself.Say("NPC공격 스킬 맞음:" + gg.IntToStr(myself.i_ai1) + "/" + gg.IntToStr(myself.i_ai2));

}

}
	}

	protected void TALKED(HandlerParam talker) {
if (myself.i_ai0 == 2) {
myself.ShowPage(talker, fnHi_keepworking);

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void USE_SKILL_FINISHED(HandlerParam target, HandlerParam skill_name_id, HandlerParam success, HandlerParam s0) {
if (skill_name_id == Skill_dying_display && success == 1) {
if (babble_mode == 1) {
s0 = gg.IntToStr(room) + "방 재생의 싹 파괴!";
gg.BroadcastOnScreenMsgStr(myself.sm, 8000, 5, 0, 1, 2, 1, 1, 5000, 0, s0);
myself.BroadcastSystemMessageStr(myself.sm, 8000, s0);

}
myself.Suicide();

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam maker0, HandlerParam party0, HandlerParam i0, HandlerParam s0) {
if (ask == -7801) {
if (reply == 1 || reply == 2 || reply == 3) {
if (myself.i_ai0 == 1 && myself.IsInCategory(11, talker.occupation) || reply == myself.i_ai3) {
if (babble_mode == 1) {
myself.Say("디코이 타운트 사용");

}
myself.ShowPage(talker, fnHi_working);
myself.Say(gg.MakeFString(1800271, "", "", "", "", ""));
myself.i_ai1 = myself.i_ai1 + 10;
myself.i_ai0 = 2;
myself.AddTimerEx(TM_SEND_TAUNT, 1 * 1000);
myself.AddTimerEx(TM_DECOY_RECHARGE, TIME_DECOY_RECHARGE * 1000);

} else {
myself.i_ai1 = myself.i_ai1 + 5;
myself.ShowPage(talker, fnHi_notworking);

}

}

}
	}


}
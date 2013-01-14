package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class npc_ct2_box extends default_npc {
	protected int Inven_Check_SysMsg = 836;
	protected int Skill_unlock = 185925633;
	protected int Item_reward_coin = 13693;
	protected int Qty_reward_coin = 1;
	protected int TM_despawn_01 = 78001;
	protected int TM_despawn_02 = 78002;
	protected int TM_despawn_03 = 78003;
	protected int TIME_despawn_01 = 120;
	protected int TIME_despawn_02 = 60;
	protected int TIME_despawn_03 = 120;
	protected int babble_mode = 0;

	protected void CREATED(HandlerParam s0) {
s0 = gg.MakeFString(1800258, "", "", "", "", "");
myself.Shout(s0);
myself.AddTimerEx(TM_despawn_01, TIME_despawn_01 * 1000);
myself.i_ai0 = 0;
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id, HandlerParam skill_id) {
if (babble_mode == 1) {
myself.Say("맞은 스킬:" + gg.IntToStr(skill_id));

}
if (skill_name_id == Skill_unlock) {
if (myself.GetInventoryInfo(speller, 0) >= myself.GetInventoryInfo(speller, 1) * 0.800000 || myself.GetInventoryInfo(speller, 2) >= myself.GetInventoryInfo(speller, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(speller, Inven_Check_SysMsg);

}
return;

}
if (babble_mode == 1) {
myself.Say("기념 주화 수여");

}
myself.GiveItem1(speller, Item_reward_coin, Qty_reward_coin);

}
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam skill_name_id, HandlerParam skill_id) {
if (myself.i_ai0 == 0) {
myself.i_ai0 = 1;
if (TIME_despawn_03 > -1) {
myself.AddTimerEx(TM_despawn_03, TIME_despawn_03 * 1000);

}

}
if (babble_mode == 1) {
myself.Say("공격 스킬:" + gg.IntToStr(skill_id));

}
if (skill_name_id == Skill_unlock) {
if (myself.GetInventoryInfo(attacker, 0) >= myself.GetInventoryInfo(attacker, 1) * 0.800000 || myself.GetInventoryInfo(attacker, 2) >= myself.GetInventoryInfo(attacker, 3) * 0.800000) {
if (Inven_Check_SysMsg != 0) {
myself.ShowSystemMessage(attacker, Inven_Check_SysMsg);

}
return;

}
if (babble_mode == 1) {
myself.Say("기념 주화 수여");

}
myself.GiveItem1(attacker, Item_reward_coin, Qty_reward_coin);

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam s0) {
if (timer_id == TM_despawn_01) {
s0 = gg.MakeFString(1800259, "", "", "", "", "");
myself.Shout(s0);
myself.AddTimerEx(TM_despawn_02, TIME_despawn_02 * 1000);

} else if (timer_id == TM_despawn_02) {
if (babble_mode == 1) {
myself.Shout("카오틱쓰론2 보물상자 디스폰!");

}
myself.Despawn();

} else if (timer_id == TM_despawn_03) {
s0 = gg.MakeFString(1800259, "", "", "", "", "");
myself.Shout(s0);
myself.AddTimerEx(TM_despawn_02, TIME_despawn_02 * 1000);

}
	}


}
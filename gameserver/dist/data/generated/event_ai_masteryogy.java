package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class event_ai_masteryogy extends citizen {
	protected int yogy_staff = 13539;
	protected int yogy_scroll = 13540;

	protected void CREATED(HandlerParam talker) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.AddTimerEx(1000, 60000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1000) {
if (gg.Rand(5) < 1) {
if (gg.Rand(2) < 1) {
myself.Say(gg.MakeFString(1600023, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1600024, "", "", "", "", ""));

}

}
myself.AddTimerEx(1000, 60000);

}
	}

	protected void TALKED(HandlerParam talker) {
myself.ShowPage(talker, "event_master_yogi001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (ask == 1000) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 57) >= 1000 && gg.OwnItemCount(talker, yogy_staff) == 0) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_master_yogi_q01_05.htm");
myself.GiveItem1(talker, yogy_staff, 1);
myself.DeleteItem1(talker, 57, 1000);

} else {
myself.ShowPage(talker, "event_master_yogi_q01_05f.htm");

}

} else if (reply == 2) {
if (myself.IsEventDropTime() == 1) {
if (gg.OwnItemCount(talker, 57) >= 6000) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_master_yogi_q01_06.htm");
myself.GiveEventItem(talker, 57, 6000, yogy_scroll, 24, 0, 6, 0, 0);

} else {
myself.ShowPage(talker, "event_master_yogi_q01_06f.htm");

}

} else {
myself.ShowPage(talker, "event_master_yogi027.htm");

}

} else if (reply == 3) {
if (myself.IsEventDropTime() == 1) {
if (gg.OwnItemCount(talker, 57) >= 77777) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_master_yogi_q01_07.htm");
myself.GiveItem1(talker, yogy_scroll, 1);
myself.DeleteItem1(talker, 57, 77777);

} else {
myself.ShowPage(talker, "event_master_yogi_q01_07f.htm");

}

} else {
myself.ShowPage(talker, "event_master_yogi027.htm");

}

} else if (reply == 4) {
if (myself.IsEventDropTime() == 1) {
if (gg.OwnItemCount(talker, 57) >= 777770) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "event_master_yogi_q01_07.htm");
myself.GiveItem1(talker, yogy_scroll, 10);
myself.DeleteItem1(talker, 57, 777770);

} else {
myself.ShowPage(talker, "event_master_yogi_fail_q01_26.htm");

}

} else {
myself.ShowPage(talker, "event_master_yogi027.htm");

}

}

} else if (ask == 2000) {
if (talker.equiped_weapon_class_id == 13539) {
if (reply == 1) {
if (gg.OwnItemEnchantCount(talker, yogy_staff) <= 3) {
myself.ShowPage(talker, "event_master_yogi_fail_q01_08.htm");

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 4) {
myself.ShowPage(talker, "event_master_yogi_success_1_4_7_q01_09.htm");
myself.GiveItem1(talker, 6406, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 5) {
myself.ShowPage(talker, "event_master_yogi_success_1_4_7_q01_09.htm");
myself.GiveItem1(talker, 6406, 2);
myself.GiveItem1(talker, 6407, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 6) {
myself.ShowPage(talker, "event_master_yogi_success_1_4_7_q01_09.htm");
myself.GiveItem1(talker, 6406, 3);
myself.GiveItem1(talker, 6407, 2);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 7) {
myself.ShowPage(talker, "event_master_yogi_success_1_4_7_q01_09.htm");
i0 = gg.Rand(3);
if (i0 < 1) {
myself.GiveItem1(talker, 13074, 1);

} else if (i0 < 2) {
myself.GiveItem1(talker, 13075, 1);

} else {
myself.GiveItem1(talker, 13076, 1);

}
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 8) {
myself.ShowPage(talker, "event_master_yogi_success_1_4_7_q01_09.htm");
myself.GiveItem1(talker, 955, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 9) {
myself.ShowPage(talker, "event_master_yogi_success_2_8_15_q01_10.htm");
myself.GiveItem1(talker, 955, 1);
myself.GiveItem1(talker, 956, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 10) {
myself.ShowPage(talker, "event_master_yogi_success_2_8_15_q01_10.htm");
myself.GiveItem1(talker, 951, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 11) {
myself.ShowPage(talker, "event_master_yogi_success_2_8_15_q01_10.htm");
myself.GiveItem1(talker, 951, 1);
myself.GiveItem1(talker, 952, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 12) {
myself.ShowPage(talker, "event_master_yogi_success_2_8_15_q01_10.htm");
myself.GiveItem1(talker, 947, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 13) {
myself.ShowPage(talker, "event_master_yogi_success_2_8_15_q01_10.htm");
myself.GiveItem1(talker, 729, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 14) {
i0 = gg.Rand(3);
if (i0 < 1) {
myself.GiveItem1(talker, 13518, 1);

} else if (i0 < 2) {
myself.GiveItem1(talker, 13519, 1);

} else {
myself.GiveItem1(talker, 13522, 1);

}
myself.ShowPage(talker, "event_master_yogi_success_3_16_24_q01_11.htm");
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 15) {
myself.GiveItem1(talker, 13992, 1);
myself.DeleteItem1(talker, yogy_staff, 1);
myself.ShowPage(talker, "event_master_yogi_success_4_25_q01_12.htm");

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 16) {
myself.ShowPage(talker, "event_master_yogi_success_3_16_24_q01_11.htm");
myself.GiveItem1(talker, 8762, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 17) {
myself.ShowPage(talker, "event_master_yogi_success_3_16_24_q01_11.htm");
myself.GiveItem1(talker, 959, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 18) {
myself.GiveItem1(talker, 13991, 1);
myself.DeleteItem1(talker, yogy_staff, 1);
myself.ShowPage(talker, "event_master_yogi_success_4_26_q01_13.htm");

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 19) {
myself.ShowPage(talker, "event_master_yogi_success_coax_25_q01_19.htm");

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 20) {
myself.ShowPage(talker, "event_master_yogi_success_coax_26_q01_20.htm");

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 21) {
myself.ShowPage(talker, "event_master_yogi_success_coax_27_q01_21.htm");

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 22) {
myself.ShowPage(talker, "event_master_yogi_success_coax_28_q01_22.htm");

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 23) {
myself.ShowPage(talker, "event_master_yogi_success_5_29_q01_16.htm");
myself.GiveItem1(talker, 13988, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

} else {
myself.ShowPage(talker, "event_master_yogi_success_5_30_q01_17.htm");
myself.GiveItem1(talker, 13988, 1);
myself.DeleteItem1(talker, yogy_staff, 1);

}

}

} else {
myself.ShowPage(talker, "event_master_yogi_fail_q01_25.htm");

}

} else if (ask == 2100) {
if (reply == 1) {
if (gg.CanGet5YearGift(talker) == 1) {
myself.GiveItem1(talker, 57, 300);
gg.SaveGet5YearGiftTimeCount(talker);
myself.ShowPage(talker, "event_master_yogi_5th_success_q01_23.htm");

} else {
myself.ShowPage(talker, "event_master_yogi_5th_failed_q01_24.htm");

}

}

} else if (ask == 2200) {
if (reply == 1) {
myself.CreateOnePrivateEx(1032600, "event_ai_", 0, 0, gg.FloatToInt(myself.sm.x + talker.x / 2), gg.FloatToInt(myself.sm.y + talker.y / 2), gg.FloatToInt(myself.sm.z), 0, 0, 0, talker.id);

}

} else if (ask == 3000) {
if (reply == 1) {
if (talker.equiped_weapon_class_id == 13539) {
if (gg.OwnItemEnchantCount(talker, yogy_staff) == 19) {
myself.GiveItem1(talker, 13990, 1);
myself.DeleteItem1(talker, yogy_staff, 1);
myself.ShowPage(talker, "event_master_yogi_success_4_27_q01_14.htm");

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 20) {
myself.ShowPage(talker, "event_master_yogi_success_3_16_24_q01_11.htm");
i0 = gg.Rand(3);
if (i0 < 1) {
myself.GiveItem1(talker, 9570, 1);

} else if (i0 < 2) {
myself.GiveItem1(talker, 9572, 1);

} else {
myself.GiveItem1(talker, 9571, 1);

}
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 21) {
myself.ShowPage(talker, "event_master_yogi_success_3_16_24_q01_11.htm");
myself.GiveItem1(talker, 8762, 1);
myself.GiveItem1(talker, 8752, 1);
i0 = gg.Rand(3);
if (i0 < 1) {
myself.GiveItem1(talker, 9570, 1);

} else if (i0 < 2) {
myself.GiveItem1(talker, 9572, 1);

} else {
myself.GiveItem1(talker, 9571, 1);

}
myself.ShowPage(talker, "event_master_yogi_success_3_16_24_q01_11.htm");
myself.DeleteItem1(talker, yogy_staff, 1);

} else if (gg.OwnItemEnchantCount(talker, yogy_staff) == 22) {
myself.GiveItem1(talker, 13989, 1);
myself.DeleteItem1(talker, yogy_staff, 1);
myself.ShowPage(talker, "event_master_yogi_success_4_28_q01_15.htm");

}

} else {
myself.ShowPage(talker, "event_master_yogi_fail_q01_25.htm");

}

}

}
	}


}
package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_premium_npc extends default_npc {
	protected int ticket_5h = 13273;
	protected int ticket_5h_ev = 13383;
	protected int ticket_pt = 14065;
	protected int ticket_pt_ev = 14074;
	protected int warrior_buf_con_5h = 13017;
	protected int mage_buf_con_5h = 13018;
	protected int warrior_con_5h = 13019;
	protected int mage_con_5h = 13020;
	protected int toy_knight_con = 14061;
	protected int spirit_mage_con = 14062;
	protected int turtle_con = 14064;
	protected int owl_mage_con = 14063;
	protected int warrior_buf_pet_5h = 1016045;
	protected int mage_buf_pet_5h = 1016046;
	protected int warrior_pet_5h = 1016044;
	protected int mage_pet_5h = 1016043;
	protected int toy_knight_pet = 1016052;
	protected int spirit_mage_pet = 1016051;
	protected int turtle_pet = 1016053;
	protected int owl_mage_pet = 1016050;
	protected String NotHavePaper = "e_premium_manager014.htm";
	protected String NotYetTime = "e_premium_manager015.htm";
	protected int RcPaper = 15279;
	protected int RcPresent = 15278;

	protected void CREATED() {
	}

	protected void TALKED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
myself.ShowPage(talker, "e_premium_manager001.htm");
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4) {
if (ask == 1) {
if (reply == 1) {
myself.ShowPremiumItemList(talker);

}

} else if (ask == 2) {
if (reply == 1) {
myself.ShowPage(talker, "e_premium_manager002.htm");

}

} else if (ask == 3) {
if (reply == 1) {
myself.ShowPage(talker, "e_premium_manager003.htm");

} else if (reply == 2) {
if (gg.OwnItemCount(talker, ticket_5h) > 0 || gg.OwnItemCount(talker, ticket_5h_ev) > 0) {
if (gg.OwnItemCount(talker, ticket_5h_ev) > 0) {
myself.DeleteItem1(talker, ticket_5h_ev, 1);

} else {
myself.DeleteItem1(talker, ticket_5h, 1);

}
myself.GetItemData(talker, warrior_buf_con_5h);
myself.CreatePet(talker, warrior_buf_con_5h, warrior_buf_pet_5h, 1);
myself.ShowPage(talker, "e_premium_manager008.htm");

} else {
myself.ShowPage(talker, "e_premium_manager007.htm");

}

}

} else if (ask == 4) {
if (reply == 1) {
myself.ShowPage(talker, "e_premium_manager004.htm");

} else if (reply == 2) {
if (gg.OwnItemCount(talker, ticket_5h) > 0 || gg.OwnItemCount(talker, ticket_5h_ev) > 0) {
if (gg.OwnItemCount(talker, ticket_5h_ev) > 0) {
myself.DeleteItem1(talker, ticket_5h_ev, 1);

} else {
myself.DeleteItem1(talker, ticket_5h, 1);

}
myself.GetItemData(talker, mage_buf_con_5h);
myself.CreatePet(talker, mage_buf_con_5h, mage_buf_pet_5h, 1);
myself.ShowPage(talker, "e_premium_manager008.htm");

} else {
myself.ShowPage(talker, "e_premium_manager007.htm");

}

}

} else if (ask == 5) {
if (reply == 1) {
myself.ShowPage(talker, "e_premium_manager005.htm");

} else if (reply == 2) {
if (gg.OwnItemCount(talker, ticket_5h) > 0 || gg.OwnItemCount(talker, ticket_5h_ev) > 0) {
if (gg.OwnItemCount(talker, ticket_5h_ev) > 0) {
myself.DeleteItem1(talker, ticket_5h_ev, 1);

} else {
myself.DeleteItem1(talker, ticket_5h, 1);

}
myself.GetItemData(talker, warrior_con_5h);
myself.CreatePet(talker, warrior_con_5h, warrior_pet_5h, 1);
myself.ShowPage(talker, "e_premium_manager008.htm");

} else {
myself.ShowPage(talker, "e_premium_manager007.htm");

}

}

} else if (ask == 6) {
if (reply == 1) {
myself.ShowPage(talker, "e_premium_manager006.htm");

} else if (reply == 2) {
if (gg.OwnItemCount(talker, ticket_5h) > 0 || gg.OwnItemCount(talker, ticket_5h_ev) > 0) {
if (gg.OwnItemCount(talker, ticket_5h_ev) > 0) {
myself.DeleteItem1(talker, ticket_5h_ev, 1);

} else {
myself.DeleteItem1(talker, ticket_5h, 1);

}
myself.GetItemData(talker, mage_con_5h);
myself.CreatePet(talker, mage_con_5h, mage_pet_5h, 1);
myself.ShowPage(talker, "e_premium_manager008.htm");

} else {
myself.ShowPage(talker, "e_premium_manager007.htm");

}

}

} else if (ask == -303) {
myself.ShowMultisell(706, talker);

} else if (ask == 21000) {
if (reply == 11) {
if (gg.OwnItemCount(talker, ticket_pt) > 0 || gg.OwnItemCount(talker, ticket_pt_ev) > 0) {
if (gg.OwnItemCount(talker, ticket_pt_ev) > 0) {
myself.DeleteItem1(talker, ticket_pt_ev, 1);

} else {
myself.DeleteItem1(talker, ticket_pt, 1);

}
myself.GetItemData(talker, toy_knight_con);
myself.CreatePet(talker, toy_knight_con, toy_knight_pet, 1);
myself.ShowPage(talker, "e_premium_manager008.htm");

} else {
myself.ShowPage(talker, "e_premium_manager007.htm");

}

} else if (reply == 21) {
if (gg.OwnItemCount(talker, ticket_pt) > 0 || gg.OwnItemCount(talker, ticket_pt_ev) > 0) {
if (gg.OwnItemCount(talker, ticket_pt_ev) > 0) {
myself.DeleteItem1(talker, ticket_pt_ev, 1);

} else {
myself.DeleteItem1(talker, ticket_pt, 1);

}
myself.GetItemData(talker, spirit_mage_con);
myself.CreatePet(talker, spirit_mage_con, spirit_mage_pet, 1);
myself.ShowPage(talker, "e_premium_manager008.htm");

} else {
myself.ShowPage(talker, "e_premium_manager007.htm");

}

} else if (reply == 31) {
if (gg.OwnItemCount(talker, ticket_pt) > 0 || gg.OwnItemCount(talker, ticket_pt_ev) > 0) {
if (gg.OwnItemCount(talker, ticket_pt_ev) > 0) {
myself.DeleteItem1(talker, ticket_pt_ev, 1);

} else {
myself.DeleteItem1(talker, ticket_pt, 1);

}
myself.GetItemData(talker, owl_mage_con);
myself.CreatePet(talker, owl_mage_con, owl_mage_pet, 1);
myself.ShowPage(talker, "e_premium_manager008.htm");

} else {
myself.ShowPage(talker, "e_premium_manager007.htm");

}

} else if (reply == 41) {
if (gg.OwnItemCount(talker, ticket_pt) > 0 || gg.OwnItemCount(talker, ticket_pt_ev) > 0) {
if (gg.OwnItemCount(talker, ticket_pt_ev) > 0) {
myself.DeleteItem1(talker, ticket_pt_ev, 1);

} else {
myself.DeleteItem1(talker, ticket_pt, 1);

}
myself.GetItemData(talker, turtle_con);
myself.CreatePet(talker, turtle_con, turtle_pet, 1);
myself.ShowPage(talker, "e_premium_manager008.htm");

} else {
myself.ShowPage(talker, "e_premium_manager007.htm");

}

}

} else if (ask == -2271) {
if (reply == 1) {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, RcPaper) > 0) {
if (gg.GetDailyQuestFlag(talker, 992) == 1) {
myself.DeleteItem1(talker, RcPaper, 1);
myself.GiveItem1(talker, RcPresent, 1);
gg.SetDailyQuestFlag(talker, 992);

} else {
myself.ShowPage(talker, NotYetTime);

}

} else {
myself.ShowPage(talker, NotHavePaper);

}

}

}
	}


}
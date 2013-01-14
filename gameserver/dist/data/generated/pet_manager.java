package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class pet_manager extends merchant {
	protected String fnEvolutionSuccess = "pet_evolution_success.htm";
	protected String fnEvolutionStopped = "pet_evolution_stopped.htm";
	protected String fnEvolveMany_pet1 = "pet_evolution_many_pet.htm";
	protected String fnEvolveNoPet_pet1 = "pet_evolution_no_pet.htm";
	protected String fnNoPet_pet1 = "pet_evolution_farpet.htm";
	protected String fnTooFar_pet1 = "pet_evolution_farpet.htm";
	protected String fnNoProperPet_pet1 = "pet_evolution_farpet.htm";
	protected String fnNotEnoughLevel_pet1 = "pet_evolution_level.htm";
	protected String fnNotEnoughMinLv_pet1 = "pet_evolution_level.htm";
	protected String fnNoItem_pet1 = "pet_evolution_no_pet.htm";
	protected int item_baby_pet1 = 2375;
	protected int item_grown_pet1 = 9882;
	protected int id_grown_pet1 = 12;
	protected int class_id_grown_pet1 = 0;
	protected int class_id_baby_pet1 = 1012077;
	protected int min_lv_pet1 = 0;
	protected int check_min_lv_pet1 = 0;
	protected int skip_chk_summon_pet1 = 0;
	protected String fnEvolveMany_pet2 = "pet_evolution_many_pet.htm";
	protected String fnEvolveNoPet_pet2 = "pet_evolution_no_pet.htm";
	protected String fnNoPet_pet2 = "pet_evolution_farpet.htm";
	protected String fnTooFar_pet2 = "pet_evolution_farpet.htm";
	protected String fnNoProperPet_pet2 = "pet_evolution_farpet.htm";
	protected String fnNotEnoughLevel_pet2 = "pet_evolution_level.htm";
	protected String fnNotEnoughMinLv_pet2 = "pet_evolution_level.htm";
	protected String fnNoItem_pet2 = "pet_evolution_no_pet.htm";
	protected int item_baby_pet2 = 6648;
	protected int item_grown_pet2 = 10311;
	protected int id_grown_pet2 = 18;
	protected int class_id_grown_pet2 = 0;
	protected int class_id_baby_pet2 = 1012780;
	protected int min_lv_pet2 = 0;
	protected int check_min_lv_pet2 = 0;
	protected int skip_chk_summon_pet2 = 0;
	protected String fnEvolveMany_pet3 = "pet_evolution_many_pet.htm";
	protected String fnEvolveNoPet_pet3 = "pet_evolution_no_pet.htm";
	protected String fnNoPet_pet3 = "pet_evolution_farpet.htm";
	protected String fnTooFar_pet3 = "pet_evolution_farpet.htm";
	protected String fnNoProperPet_pet3 = "pet_evolution_farpet.htm";
	protected String fnNotEnoughLevel_pet3 = "pet_evolution_level.htm";
	protected String fnNotEnoughMinLv_pet3 = "pet_evolution_level.htm";
	protected String fnNoItem_pet3 = "pet_evolution_no_pet.htm";
	protected int item_baby_pet3 = 6650;
	protected int item_grown_pet3 = 10313;
	protected int id_grown_pet3 = 19;
	protected int class_id_grown_pet3 = 0;
	protected int class_id_baby_pet3 = 1012781;
	protected int min_lv_pet3 = 0;
	protected int check_min_lv_pet3 = 0;
	protected int skip_chk_summon_pet3 = 0;
	protected String fnEvolveMany_pet4 = "pet_evolution_many_pet.htm";
	protected String fnEvolveNoPet_pet4 = "pet_evolution_no_pet.htm";
	protected String fnNoPet_pet4 = "pet_evolution_farpet.htm";
	protected String fnTooFar_pet4 = "pet_evolution_farpet.htm";
	protected String fnNoProperPet_pet4 = "pet_evolution_farpet.htm";
	protected String fnNotEnoughLevel_pet4 = "pet_evolution_level.htm";
	protected String fnNotEnoughMinLv_pet4 = "pet_evolution_level.htm";
	protected String fnNoItem_pet4 = "pet_evolution_no_pet.htm";
	protected int item_baby_pet4 = 6649;
	protected int item_grown_pet4 = 1016036;
	protected int id_grown_pet4 = 20;
	protected int class_id_grown_pet4 = 0;
	protected int class_id_baby_pet4 = 1012782;
	protected int min_lv_pet4 = 0;
	protected int check_min_lv_pet4 = 0;
	protected int skip_chk_summon_pet4 = 0;
	protected String fnEvolveMany_pet5 = "pet_evolution_many_pet.htm";
	protected String fnEvolveNoPet_pet5 = "pet_evolution_no_pet.htm";
	protected String fnNoPet_pet5 = "pet_evolution_farpet.htm";
	protected String fnTooFar_pet5 = "pet_evolution_farpet.htm";
	protected String fnNoProperPet_pet5 = "pet_evolution_farpet.htm";
	protected String fnNotEnoughLevel_pet5 = "pet_evolution_level.htm";
	protected String fnNotEnoughMinLv_pet5 = "pet_evolution_level.htm";
	protected String fnNoItem_pet5 = "pet_evolution_no_pet.htm";
	protected int item_baby_pet5 = 6649;
	protected int item_grown_pet5 = 1016036;
	protected int id_grown_pet5 = 20;
	protected int class_id_grown_pet5 = 0;
	protected int class_id_baby_pet5 = 1012782;
	protected int min_lv_pet5 = 0;
	protected int check_min_lv_pet5 = 0;
	protected int skip_chk_summon_pet5 = 0;
	protected String fnEvolveMany_pet6 = "pet_evolution_many_pet.htm";
	protected String fnEvolveNoPet_pet6 = "pet_evolution_no_pet.htm";
	protected String fnNoPet_pet6 = "pet_evolution_farpet.htm";
	protected String fnTooFar_pet6 = "pet_evolution_farpet.htm";
	protected String fnNoProperPet_pet6 = "pet_evolution_farpet.htm";
	protected String fnNotEnoughLevel_pet6 = "pet_evolution_level.htm";
	protected String fnNotEnoughMinLv_pet6 = "pet_evolution_level.htm";
	protected String fnNoItem_pet6 = "pet_evolution_no_pet.htm";
	protected int item_baby_pet6 = 6649;
	protected int item_grown_pet6 = 1016036;
	protected int id_grown_pet6 = 20;
	protected int class_id_grown_pet6 = 0;
	protected int class_id_baby_pet6 = 1012782;
	protected int min_lv_pet6 = 0;
	protected int check_min_lv_pet6 = 0;
	protected int skip_chk_summon_pet6 = 0;

	protected void TALKED(HandlerParam talker, HandlerParam c0) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0 && skip_chk_summon_pet1 == 1) {
myself.ShowPage(talker, fnEvolutionStopped);
return;

} else {
super;

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam item0, HandlerParam c0) {
if (ask == -1001) {
switch (reply) {
case 0: {
if (gg.OwnItemCount(talker, 7585) > 0) {
myself.DeleteItem1(talker, 7585, 1);
myself.GetItemData(talker, 6650);
myself.CreatePet(talker, 6650, 1012781, 24);
myself.ShowSystemMessageStr(talker, gg.MakeFString(1800877, gg.IntToStr(24), "", "", "", ""));
myself.ShowPage(talker, "pet_manager_trade_pet.htm");

} else {
myself.ShowPage(talker, "pet_manager_no_ticket.htm");

}
break;

}
case 1: {
if (gg.OwnItemCount(talker, 7583) > 0) {
myself.DeleteItem1(talker, 7583, 1);
myself.GetItemData(talker, 6648);
myself.CreatePet(talker, 6648, 1012780, 25);
myself.ShowPage(talker, "pet_manager_trade_pet.htm");

} else {
myself.ShowPage(talker, "pet_manager_no_ticket.htm");

}
break;

}
case 2: {
if (gg.OwnItemCount(talker, 7584) > 0) {
myself.DeleteItem1(talker, 7584, 1);
myself.GetItemData(talker, 6649);
myself.CreatePet(talker, 6649, 1012782, 26);
myself.ShowPage(talker, "pet_manager_trade_pet.htm");

} else {
myself.ShowPage(talker, "pet_manager_no_ticket.htm");

}
break;

}

}

} else if (ask == -1002) {
switch (reply) {
case 1: {
if (item_baby_pet1 == -1) {
return;

}
if (gg.OwnItemCount(talker, item_baby_pet1) >= 2) {
myself.ShowPage(talker, fnEvolveMany_pet1);
return;

}
if (gg.OwnItemCount(talker, item_baby_pet1) <= 0 && gg.OwnItemCount(talker, item_grown_pet1) > 0) {
myself.ShowPage(talker, fnEvolveNoPet_pet1);
return;

}
if (skip_chk_summon_pet1 == 0) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
myself.ShowPage(talker, fnNoPet_pet1);
return;

} else if (myself.DistFromMe(talker) >= 200) {
myself.ShowPage(talker, fnTooFar_pet1);
return;

} else if (c0.class_id != class_id_baby_pet1) {
myself.ShowPage(talker, fnNoProperPet_pet1);
return;

} else if (c0.level < min_lv_pet1 && check_min_lv_pet1 == 1) {
myself.ShowPage(talker, fnNotEnoughMinLv_pet1);
return;

}

}
item0 = myself.GetItemData(talker, item_baby_pet1);
if (gg.IsNull(item0) == 0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, fnNotEnoughLevel_pet1);
return;

}
if (skip_chk_summon_pet1 == 0) {
myself.EvolvePetWithSameExp(talker, id_grown_pet1);

} else {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0 && skip_chk_summon_pet1 == 1) {
myself.ShowPage(talker, fnEvolutionStopped);
return;

}
myself.EvolvePet(talker, item0.dbid, class_id_baby_pet1, item_grown_pet1, class_id_grown_pet1, item0.pet_level);

}
myself.ShowPage(talker, fnEvolutionSuccess);

} else {
myself.ShowPage(talker, fnNoItem_pet1);
return;

}
break;

}
case 2: {
if (item_baby_pet2 == -1) {
return;

}
if (gg.OwnItemCount(talker, item_baby_pet2) >= 2) {
myself.ShowPage(talker, fnEvolveMany_pet2);
return;

}
if (gg.OwnItemCount(talker, item_baby_pet2) <= 0 && gg.OwnItemCount(talker, item_grown_pet2) > 0) {
myself.ShowPage(talker, fnEvolveNoPet_pet2);
return;

}
if (skip_chk_summon_pet2 == 0) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
myself.ShowPage(talker, fnNoPet_pet2);
return;

} else if (myself.DistFromMe(talker) >= 200) {
myself.ShowPage(talker, fnTooFar_pet2);
return;

} else if (c0.class_id != class_id_baby_pet2) {
myself.ShowPage(talker, fnNoProperPet_pet2);
return;

} else if (c0.level < min_lv_pet2 && check_min_lv_pet2 == 1) {
myself.ShowPage(talker, fnNotEnoughMinLv_pet2);
return;

}

}
item0 = myself.GetItemData(talker, item_baby_pet2);
if (gg.IsNull(item0) == 0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, fnNotEnoughLevel_pet2);
return;

}
if (skip_chk_summon_pet2 == 0) {
myself.EvolvePetWithSameExp(talker, id_grown_pet2);

} else {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0 && skip_chk_summon_pet2 == 1) {
myself.ShowPage(talker, fnEvolutionStopped);
return;

}
myself.EvolvePet(talker, item0.dbid, class_id_baby_pet2, item_grown_pet2, class_id_grown_pet2, item0.pet_level);

}
myself.ShowPage(talker, fnEvolutionSuccess);

} else {
myself.ShowPage(talker, fnNoItem_pet2);
return;

}
break;

}
case 3: {
if (item_baby_pet3 == -1) {
return;

}
if (gg.OwnItemCount(talker, item_baby_pet3) >= 2) {
myself.ShowPage(talker, fnEvolveMany_pet3);
return;

}
if (gg.OwnItemCount(talker, item_baby_pet3) <= 0 && gg.OwnItemCount(talker, item_grown_pet3) > 0) {
myself.ShowPage(talker, fnEvolveNoPet_pet3);
return;

}
if (skip_chk_summon_pet3 == 0) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
myself.ShowPage(talker, fnNoPet_pet3);
return;

} else if (myself.DistFromMe(talker) >= 200) {
myself.ShowPage(talker, fnTooFar_pet3);
return;

} else if (c0.class_id != class_id_baby_pet3) {
myself.ShowPage(talker, fnNoProperPet_pet3);
return;

} else if (c0.level < min_lv_pet3 && check_min_lv_pet3 == 1) {
myself.ShowPage(talker, fnNotEnoughMinLv_pet3);
return;

}

}
item0 = myself.GetItemData(talker, item_baby_pet3);
if (gg.IsNull(item0) == 0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, fnNotEnoughLevel_pet3);
return;

}
if (skip_chk_summon_pet3 == 0) {
myself.EvolvePetWithSameExp(talker, id_grown_pet3);

} else {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0 && skip_chk_summon_pet3 == 1) {
myself.ShowPage(talker, fnEvolutionStopped);
return;

}
myself.EvolvePet(talker, item0.dbid, class_id_baby_pet3, item_grown_pet3, class_id_grown_pet3, item0.pet_level);

}
myself.ShowPage(talker, fnEvolutionSuccess);

} else {
myself.ShowPage(talker, fnNoItem_pet3);
return;

}
break;

}
case 4: {
if (item_baby_pet4 == -1) {
return;

}
if (gg.OwnItemCount(talker, item_baby_pet4) >= 2) {
myself.ShowPage(talker, fnEvolveMany_pet4);
return;

}
if (gg.OwnItemCount(talker, item_baby_pet4) <= 0 && gg.OwnItemCount(talker, item_grown_pet4) > 0) {
myself.ShowPage(talker, fnEvolveNoPet_pet4);
return;

}
if (skip_chk_summon_pet4 == 0) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
myself.ShowPage(talker, fnNoPet_pet4);
return;

} else if (myself.DistFromMe(talker) >= 200) {
myself.ShowPage(talker, fnTooFar_pet4);
return;

} else if (c0.class_id != class_id_baby_pet4) {
myself.ShowPage(talker, fnNoProperPet_pet4);
return;

} else if (c0.level < min_lv_pet4 && check_min_lv_pet4 == 1) {
myself.ShowPage(talker, fnNotEnoughMinLv_pet4);
return;

}

}
item0 = myself.GetItemData(talker, item_baby_pet4);
if (gg.IsNull(item0) == 0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, fnNotEnoughLevel_pet4);
return;

}
if (skip_chk_summon_pet4 == 0) {
myself.EvolvePetWithSameExp(talker, id_grown_pet4);

} else {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0 && skip_chk_summon_pet4 == 1) {
myself.ShowPage(talker, fnEvolutionStopped);
return;

}
myself.EvolvePet(talker, item0.dbid, class_id_baby_pet4, item_grown_pet4, class_id_grown_pet4, item0.pet_level);

}
myself.ShowPage(talker, fnEvolutionSuccess);

} else {
myself.ShowPage(talker, fnNoItem_pet4);
return;

}
break;

}
case 5: {
if (item_baby_pet5 == -1) {
return;

}
if (gg.OwnItemCount(talker, item_baby_pet5) >= 2) {
myself.ShowPage(talker, fnEvolveMany_pet5);
return;

}
if (gg.OwnItemCount(talker, item_baby_pet5) <= 0 && gg.OwnItemCount(talker, item_grown_pet5) > 0) {
myself.ShowPage(talker, fnEvolveNoPet_pet5);
return;

}
if (skip_chk_summon_pet5 == 0) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
myself.ShowPage(talker, fnNoPet_pet5);
return;

} else if (myself.DistFromMe(talker) >= 200) {
myself.ShowPage(talker, fnTooFar_pet5);
return;

} else if (c0.class_id != class_id_baby_pet5) {
myself.ShowPage(talker, fnNoProperPet_pet5);
return;

} else if (c0.level < min_lv_pet5 && check_min_lv_pet5 == 1) {
myself.ShowPage(talker, fnNotEnoughMinLv_pet5);
return;

}

}
item0 = myself.GetItemData(talker, item_baby_pet5);
if (gg.IsNull(item0) == 0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, fnNotEnoughLevel_pet5);
return;

}
if (skip_chk_summon_pet5 == 0) {
myself.EvolvePetWithSameExp(talker, id_grown_pet5);

} else {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0 && skip_chk_summon_pet5 == 1) {
myself.ShowPage(talker, fnEvolutionStopped);
return;

}
myself.EvolvePet(talker, item0.dbid, class_id_baby_pet5, item_grown_pet5, class_id_grown_pet5, item0.pet_level);

}
myself.ShowPage(talker, fnEvolutionSuccess);

} else {
myself.ShowPage(talker, fnNoItem_pet5);
return;

}
break;

}
case 6: {
if (item_baby_pet6 == -1) {
return;

}
if (gg.OwnItemCount(talker, item_baby_pet6) >= 2) {
myself.ShowPage(talker, fnEvolveMany_pet6);
return;

}
if (gg.OwnItemCount(talker, item_baby_pet6) <= 0 && gg.OwnItemCount(talker, item_grown_pet6) > 0) {
myself.ShowPage(talker, fnEvolveNoPet_pet6);
return;

}
if (skip_chk_summon_pet6 == 0) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
myself.ShowPage(talker, fnNoPet_pet6);
return;

} else if (myself.DistFromMe(talker) >= 200) {
myself.ShowPage(talker, fnTooFar_pet6);
return;

} else if (c0.class_id != class_id_baby_pet6) {
myself.ShowPage(talker, fnNoProperPet_pet6);
return;

} else if (c0.level < min_lv_pet6 && check_min_lv_pet6 == 1) {
myself.ShowPage(talker, fnNotEnoughMinLv_pet6);
return;

}

}
item0 = myself.GetItemData(talker, item_baby_pet6);
if (gg.IsNull(item0) == 0) {
if (item0.pet_level < 55) {
myself.ShowPage(talker, fnNotEnoughLevel_pet6);
return;

}
if (skip_chk_summon_pet6 == 0) {
myself.EvolvePetWithSameExp(talker, id_grown_pet6);

} else {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 0 && skip_chk_summon_pet6 == 1) {
myself.ShowPage(talker, fnEvolutionStopped);
return;

}
myself.EvolvePet(talker, item0.dbid, class_id_baby_pet6, item_grown_pet6, class_id_grown_pet6, item0.pet_level);

}
myself.ShowPage(talker, fnEvolutionSuccess);

} else {
myself.ShowPage(talker, fnNoItem_pet6);
return;

}
break;

}

}

}
super;
	}


}
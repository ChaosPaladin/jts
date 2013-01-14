package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_beastfarm_quest extends citizen {
	protected int debug_mode = 0;

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (ask == -191) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 15473) >= 1) {
if (debug_mode) {
myself.Say("이미 소지하고 있다.");

}
myself.ShowPage(talker, "beast_herder_tunatun002.htm");

} else if (gg.OwnItemCount(talker, 15473) < 1 && gg.GetMemoStateEx(talker, 20, 1) != 1 && talker.level < 82) {
if (debug_mode) {
myself.Say("쪼렙이니까 못준다.");

}
myself.ShowPage(talker, "beast_herder_tunatun003.htm");

} else if (gg.OwnItemCount(talker, 15473) < 1 && gg.GetMemoStateEx(talker, 20, 1) == 1 || talker.level >= 82) {
if (debug_mode) {
myself.Say("채찍을 준다.");

}
myself.ShowPage(talker, "beast_herder_tunatun004.htm");
myself.GiveItem1(talker, 15473, 1);

}

}

}
	}


}
package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_icequeen_jinia extends ai_icequeen_help_pc {
	protected int is_hard_mode = 0;

	protected void CREATED() {
if (is_hard_mode == 0) {
myself.CreateOnePrivateEx(1018935, "ai_icequeen_p4_buff", 0, 0, 114707, -114797, -11199, 0, 0, 0, 0);

}
super;
	}


}
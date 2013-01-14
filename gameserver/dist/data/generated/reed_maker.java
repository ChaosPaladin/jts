package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class reed_maker extends default_maker {
	protected int on_start_spawn = 1;
	protected int mode = 0;
	protected String event_maker_reed = "innadril03_2223_murc01m1";
	protected int Prob_Obj_lv1 = 33;
	protected int Prob_Obj_lv2 = 50;
	protected int babble_mode = 0;

	protected void ON_NPC_DELETED(HandlerParam deleted_def, HandlerParam i0, HandlerParam maker0, HandlerParam reply) {
if (gg.IsNull(deleted_def) == 0) {
i0 = gg.Rand(100);
if (mode == -2 && deleted_def == myself.GetSpawnDefine(0) || deleted_def == myself.GetSpawnDefine(1) || mode == -1 && deleted_def == myself.GetSpawnDefine(0) || deleted_def == myself.GetSpawnDefine(1) && i0 <= Prob_Obj_lv1 || mode == -2 && deleted_def == myself.GetSpawnDefine(2) || mode == -1 && deleted_def == myself.GetSpawnDefine(2) && i0 <= Prob_Obj_lv2) {
if (babble_mode == 1) {
gg.Announce("수호령/횃불 파괴");

}
maker0 = gg.GetNpcMaker(event_maker_reed);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010075, 0, 0);

}

} else if (mode == 2 && deleted_def == myself.GetSpawnDefine(0) || deleted_def == myself.GetSpawnDefine(1) || mode == 1 && deleted_def == myself.GetSpawnDefine(0) || deleted_def == myself.GetSpawnDefine(1) && i0 <= Prob_Obj_lv1 || mode == 2 && deleted_def == myself.GetSpawnDefine(2) || mode == 1 && deleted_def == myself.GetSpawnDefine(2) && i0 <= Prob_Obj_lv2) {
if (babble_mode == 1) {
gg.Announce("헬도저렘/매립기 파괴");

}
maker0 = gg.GetNpcMaker(event_maker_reed);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 78010076, 0, 0);

}

}

}
super;
	}


}
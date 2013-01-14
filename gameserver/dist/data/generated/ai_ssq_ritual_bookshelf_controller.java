package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_ssq_ritual_bookshelf_controller extends default_npc {
	protected int Pos_X1 = -81669;
	protected int Pos_Y1 = 206090;
	protected int Pos_Z1 = -7960;
	protected int Pos_X2 = -81393;
	protected int Pos_Y2 = 206152;
	protected int Pos_Z2 = -7960;
	protected int Pos_X3 = -81784;
	protected int Pos_Y3 = 205690;
	protected int Pos_Z3 = -7960;
	protected int Pos_X4 = -81393;
	protected int Pos_Y4 = 205565;
	protected int Pos_Z4 = -7960;

	protected void CREATED(HandlerParam i0) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.i_ai3 = 0;
i0 = gg.Rand(4) + 1;
switch (i0) {
case 1: {
myself.i_ai0 = 1;
myself.i_ai1 = 2;
myself.i_ai2 = 2;
myself.i_ai3 = 2;

}
case 2: {
myself.i_ai0 = 2;
myself.i_ai1 = 1;
myself.i_ai2 = 2;
myself.i_ai3 = 2;

}
case 3: {
myself.i_ai0 = 2;
myself.i_ai1 = 2;
myself.i_ai2 = 1;
myself.i_ai3 = 2;

}
case 4: {
myself.i_ai0 = 2;
myself.i_ai1 = 2;
myself.i_ai2 = 2;
myself.i_ai3 = 1;

}

}
myself.CreateOnePrivateEx(1032581, "ai_ssq_ritual_bookshelf", 0, 0, Pos_X1, Pos_Y1, Pos_Z1, 0, myself.i_ai0, 0, 0);
myself.CreateOnePrivateEx(1032581, "ai_ssq_ritual_bookshelf", 0, 0, Pos_X2, Pos_Y2, Pos_Z2, 0, myself.i_ai1, 0, 0);
myself.CreateOnePrivateEx(1032581, "ai_ssq_ritual_bookshelf", 0, 0, Pos_X3, Pos_Y3, Pos_Z3, 0, myself.i_ai2, 0, 0);
myself.CreateOnePrivateEx(1032581, "ai_ssq_ritual_bookshelf", 0, 0, Pos_X4, Pos_Y4, Pos_Z4, 0, myself.i_ai3, 0, 0);
	}


}
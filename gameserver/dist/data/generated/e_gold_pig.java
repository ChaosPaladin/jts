package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class e_gold_pig extends e_big_pig {
	protected int event_animal = 12;
	protected int Debuff1 = 341180417;
	protected int Debuff2 = 341245953;
	protected int drop_pig_box = 9144;
	protected int event_coin = 9142;

	protected void MY_DYING() {
if (gg.Rand(100) < 50) {
if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800021, "", "", "", "", ""));

}

} else if (event_animal == 1) {
myself.Say(gg.MakeFString(MakeFString + 124, "", "", "", "", ""));

} else {
myself.Say(gg.MakeFString(1800018, "", "", "", "", ""));

}
	}


}
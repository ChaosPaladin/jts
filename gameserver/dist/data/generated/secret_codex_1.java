package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class secret_codex_1 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 5 && gg.OwnItemCount(talker, 7268) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 6) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Phoenix Knight (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 5 && gg.OwnItemCount(talker, 7269) >= 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 6) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of Eva's Templar (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 5 && gg.OwnItemCount(talker, 7270) >= 1) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 6) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Saga of the Sword Muse (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 5 && gg.OwnItemCount(talker, 7271) >= 1) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 6) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Saga of the Duelist (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 5 && gg.OwnItemCount(talker, 7272) >= 1) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 6) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 5 && gg.OwnItemCount(talker, 7273) >= 1) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 6) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Saga of the Titan (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 5 && gg.OwnItemCount(talker, 7274) >= 1) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 6) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Saga of the Grand Khavatari (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 5 && gg.OwnItemCount(talker, 7275) >= 1) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 6) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Saga of the Dominator (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 5 && gg.OwnItemCount(talker, 7276) >= 1) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 6) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Saga of the Doomcryer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 5 && gg.OwnItemCount(talker, 7277) >= 1) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 6) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Saga of the Adventurer (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 5 && gg.OwnItemCount(talker, 7278) >= 1) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 6) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Saga of the Wind Rider (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 5 && gg.OwnItemCount(talker, 7279) >= 1) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 6) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Saga of the Ghost Hunter (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 5 && gg.OwnItemCount(talker, 7280) >= 1) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 6) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Saga of the Sagittarius (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 5 && gg.OwnItemCount(talker, 7281) >= 1) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 6) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Saga of the Moonlight Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 5 && gg.OwnItemCount(talker, 7282) >= 1) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 6) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Saga of the Ghost Sentinel (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 5 && gg.OwnItemCount(talker, 7283) >= 1) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 6) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Saga of the Cardinal (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 5 && gg.OwnItemCount(talker, 7284) >= 1) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 6) {
_choiceN = _choiceN + 1;
_code = 33;
myself.AddChoice(33, "Saga of the Hierophant (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 5 && gg.OwnItemCount(talker, 7285) >= 1) {
_choiceN = _choiceN + 1;
_code = 34;
myself.AddChoice(34, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 6) {
_choiceN = _choiceN + 1;
_code = 35;
myself.AddChoice(35, "Saga of Eva's Saint (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 5 && gg.OwnItemCount(talker, 7286) >= 1) {
_choiceN = _choiceN + 1;
_code = 36;
myself.AddChoice(36, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 6) {
_choiceN = _choiceN + 1;
_code = 37;
myself.AddChoice(37, "Saga of the Archmage (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 5 && gg.OwnItemCount(talker, 7287) >= 1) {
_choiceN = _choiceN + 1;
_code = 38;
myself.AddChoice(38, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 6) {
_choiceN = _choiceN + 1;
_code = 39;
myself.AddChoice(39, "Saga of the Mystic Muse (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 5 && gg.OwnItemCount(talker, 7288) >= 1) {
_choiceN = _choiceN + 1;
_code = 40;
myself.AddChoice(40, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 6) {
_choiceN = _choiceN + 1;
_code = 41;
myself.AddChoice(41, "Saga of the Storm Screamer (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 5 && gg.OwnItemCount(talker, 7289) >= 1) {
_choiceN = _choiceN + 1;
_code = 42;
myself.AddChoice(42, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 6) {
_choiceN = _choiceN + 1;
_code = 43;
myself.AddChoice(43, "Saga of the Arcana Lord (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 5 && gg.OwnItemCount(talker, 7290) >= 1) {
_choiceN = _choiceN + 1;
_code = 44;
myself.AddChoice(44, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 6) {
_choiceN = _choiceN + 1;
_code = 45;
myself.AddChoice(45, "Saga of the Elemental Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 5 && gg.OwnItemCount(talker, 7291) >= 1) {
_choiceN = _choiceN + 1;
_code = 46;
myself.AddChoice(46, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 6) {
_choiceN = _choiceN + 1;
_code = 47;
myself.AddChoice(47, "Saga of the Spectral Master (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 5 && gg.OwnItemCount(talker, 7292) >= 1) {
_choiceN = _choiceN + 1;
_code = 48;
myself.AddChoice(48, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 6) {
_choiceN = _choiceN + 1;
_code = 49;
myself.AddChoice(49, "Saga of the Soultaker (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 5 && gg.OwnItemCount(talker, 7293) >= 1) {
_choiceN = _choiceN + 1;
_code = 50;
myself.AddChoice(50, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 6) {
_choiceN = _choiceN + 1;
_code = 51;
myself.AddChoice(51, "Saga of the Hell Knight (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 5 && gg.OwnItemCount(talker, 7294) >= 1) {
_choiceN = _choiceN + 1;
_code = 52;
myself.AddChoice(52, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 6) {
_choiceN = _choiceN + 1;
_code = 53;
myself.AddChoice(53, "Saga of the Spectral Dancer (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 5 && gg.OwnItemCount(talker, 7295) >= 1) {
_choiceN = _choiceN + 1;
_code = 54;
myself.AddChoice(54, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 6) {
_choiceN = _choiceN + 1;
_code = 55;
myself.AddChoice(55, "Saga of the Shillien Templar (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 5 && gg.OwnItemCount(talker, 7296) >= 1) {
_choiceN = _choiceN + 1;
_code = 56;
myself.AddChoice(56, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 6) {
_choiceN = _choiceN + 1;
_code = 57;
myself.AddChoice(57, "Saga of the Shillien Saint (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 5 && gg.OwnItemCount(talker, 7297) >= 1) {
_choiceN = _choiceN + 1;
_code = 58;
myself.AddChoice(58, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 6) {
_choiceN = _choiceN + 1;
_code = 59;
myself.AddChoice(59, "Saga of the Fortune Seeker (In Progress)");

}
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 5 && gg.OwnItemCount(talker, 7298) >= 1) {
_choiceN = _choiceN + 1;
_code = 60;
myself.AddChoice(60, "Saga of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 6) {
_choiceN = _choiceN + 1;
_code = 61;
myself.AddChoice(61, "Saga of the Maestro (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 5 && gg.OwnItemCount(talker, 9722) >= 1) {
_choiceN = _choiceN + 1;
_code = 62;
myself.AddChoice(62, "Saga of the Doombringer (In Progress)");

}
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 6) {
_choiceN = _choiceN + 1;
_code = 63;
myself.AddChoice(63, "Saga of the Doombringer (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 5 && gg.OwnItemCount(talker, 9724) >= 1) {
_choiceN = _choiceN + 1;
_code = 64;
myself.AddChoice(64, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 6) {
_choiceN = _choiceN + 1;
_code = 65;
myself.AddChoice(65, "Saga of the Trickster (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 5 && gg.OwnItemCount(talker, 9723) >= 1) {
_choiceN = _choiceN + 1;
_code = 66;
myself.AddChoice(66, "Saga of the Soul Hound (In Progress)");

}
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 6) {
_choiceN = _choiceN + 1;
_code = 67;
myself.AddChoice(67, "Saga of the Soul Hound (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 5 && gg.OwnItemCount(talker, 7268) >= 1) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0070_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 6) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0070_0103.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 5 && gg.OwnItemCount(talker, 7269) >= 1) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0071_0101.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 6) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0071_0103.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 5 && gg.OwnItemCount(talker, 7270) >= 1) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0072_0101.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 6) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0072_0103.htm");

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 5 && gg.OwnItemCount(talker, 7271) >= 1) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0073_0101.htm");

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 6) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0073_0103.htm");

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 5 && gg.OwnItemCount(talker, 7272) >= 1) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0074_0101.htm");

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 6) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0074_0103.htm");

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 5 && gg.OwnItemCount(talker, 7273) >= 1) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0075_0101.htm");

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 6) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0075_0103.htm");

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 5 && gg.OwnItemCount(talker, 7274) >= 1) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0076_0101.htm");

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 6) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0076_0103.htm");

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 5 && gg.OwnItemCount(talker, 7275) >= 1) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0077_0101.htm");

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 6) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0077_0103.htm");

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 5 && gg.OwnItemCount(talker, 7276) >= 1) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0078_0101.htm");

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 6) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0078_0103.htm");

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 5 && gg.OwnItemCount(talker, 7277) >= 1) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0079_0101.htm");

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 6) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0079_0103.htm");

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 5 && gg.OwnItemCount(talker, 7278) >= 1) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0080_0101.htm");

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 6) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0080_0103.htm");

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 5 && gg.OwnItemCount(talker, 7279) >= 1) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0081_0101.htm");

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 6) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0081_0103.htm");

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 5 && gg.OwnItemCount(talker, 7280) >= 1) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0082_0101.htm");

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 6) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0082_0103.htm");

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 5 && gg.OwnItemCount(talker, 7281) >= 1) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0083_0101.htm");

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 6) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0083_0103.htm");

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 5 && gg.OwnItemCount(talker, 7282) >= 1) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0084_0101.htm");

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 6) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0084_0103.htm");

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 5 && gg.OwnItemCount(talker, 7283) >= 1) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0085_0101.htm");

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 6) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0085_0103.htm");

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 5 && gg.OwnItemCount(talker, 7284) >= 1) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0086_0101.htm");

}
break;

}
case 33: {
if (_from_choice == 0 || gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 6) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0086_0103.htm");

}
break;

}
case 34: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 5 && gg.OwnItemCount(talker, 7285) >= 1) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0087_0101.htm");

}
break;

}
case 35: {
if (_from_choice == 0 || gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 6) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0087_0103.htm");

}
break;

}
case 36: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 5 && gg.OwnItemCount(talker, 7286) >= 1) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0088_0101.htm");

}
break;

}
case 37: {
if (_from_choice == 0 || gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 6) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0088_0103.htm");

}
break;

}
case 38: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 5 && gg.OwnItemCount(talker, 7287) >= 1) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0089_0101.htm");

}
break;

}
case 39: {
if (_from_choice == 0 || gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 6) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0089_0103.htm");

}
break;

}
case 40: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 5 && gg.OwnItemCount(talker, 7288) >= 1) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0090_0101.htm");

}
break;

}
case 41: {
if (_from_choice == 0 || gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 6) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0090_0103.htm");

}
break;

}
case 42: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 5 && gg.OwnItemCount(talker, 7289) >= 1) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0091_0101.htm");

}
break;

}
case 43: {
if (_from_choice == 0 || gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 6) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0091_0103.htm");

}
break;

}
case 44: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 5 && gg.OwnItemCount(talker, 7290) >= 1) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0092_0101.htm");

}
break;

}
case 45: {
if (_from_choice == 0 || gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 6) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0092_0103.htm");

}
break;

}
case 46: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 5 && gg.OwnItemCount(talker, 7291) >= 1) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0093_0101.htm");

}
break;

}
case 47: {
if (_from_choice == 0 || gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 6) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0093_0103.htm");

}
break;

}
case 48: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 5 && gg.OwnItemCount(talker, 7292) >= 1) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0094_0101.htm");

}
break;

}
case 49: {
if (_from_choice == 0 || gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 6) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0094_0103.htm");

}
break;

}
case 50: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 5 && gg.OwnItemCount(talker, 7293) >= 1) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0095_0101.htm");

}
break;

}
case 51: {
if (_from_choice == 0 || gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 6) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0095_0103.htm");

}
break;

}
case 52: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 5 && gg.OwnItemCount(talker, 7294) >= 1) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0096_0101.htm");

}
break;

}
case 53: {
if (_from_choice == 0 || gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 6) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0096_0103.htm");

}
break;

}
case 54: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 5 && gg.OwnItemCount(talker, 7295) >= 1) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0097_0101.htm");

}
break;

}
case 55: {
if (_from_choice == 0 || gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 6) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0097_0103.htm");

}
break;

}
case 56: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 5 && gg.OwnItemCount(talker, 7296) >= 1) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0098_0101.htm");

}
break;

}
case 57: {
if (_from_choice == 0 || gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 6) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0098_0103.htm");

}
break;

}
case 58: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 5 && gg.OwnItemCount(talker, 7297) >= 1) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0099_0101.htm");

}
break;

}
case 59: {
if (_from_choice == 0 || gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 6) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0099_0103.htm");

}
break;

}
case 60: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 5 && gg.OwnItemCount(talker, 7298) >= 1) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0100_0101.htm");

}
break;

}
case 61: {
if (_from_choice == 0 || gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 6) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0100_0103.htm");

}
break;

}
case 62: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 5 && gg.OwnItemCount(talker, 9722) >= 1) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0067_0101.htm");

}
break;

}
case 63: {
if (_from_choice == 0 || gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 6) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0067_0103.htm");

}
break;

}
case 64: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 5 && gg.OwnItemCount(talker, 9724) >= 1) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0069_0101.htm");

}
break;

}
case 65: {
if (_from_choice == 0 || gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 6) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0069_0103.htm");

}
break;

}
case 66: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 5 && gg.OwnItemCount(talker, 9723) >= 1) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0068_0101.htm");

}
break;

}
case 67: {
if (_from_choice == 0 || gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 6) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "secret_codex_1_q0068_0103.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 70) {
myself.SetCurrentQuestID(70);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 70) {
if (reply == 1) {
if (gg.HaveMemo(talker, 70) == 1 && talker.occupation == 5 && gg.GetMemoState(talker, 70) == 5 && gg.OwnItemCount(talker, 7268) >= 1) {
myself.DeleteItem1(talker, 7268, gg.OwnItemCount(talker, 7268));
myself.SetMemoState(talker, 70, 6);
myself.SetMemoStateEx(talker, 70, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0070_0102.htm");
myself.SetFlagJournal(talker, 70, 6);
myself.ShowQuestMark(talker, 70);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 71) {
myself.SetCurrentQuestID(71);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 71) {
if (reply == 1) {
if (gg.HaveMemo(talker, 71) == 1 && talker.occupation == 20 && gg.GetMemoState(talker, 71) == 5 && gg.OwnItemCount(talker, 7269) >= 1) {
myself.DeleteItem1(talker, 7269, gg.OwnItemCount(talker, 7269));
myself.SetMemoState(talker, 71, 6);
myself.SetMemoStateEx(talker, 71, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0071_0102.htm");
myself.SetFlagJournal(talker, 71, 6);
myself.ShowQuestMark(talker, 71);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 72) {
myself.SetCurrentQuestID(72);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 72) {
if (reply == 1) {
if (gg.HaveMemo(talker, 72) == 1 && talker.occupation == 21 && gg.GetMemoState(talker, 72) == 5 && gg.OwnItemCount(talker, 7270) >= 1) {
myself.DeleteItem1(talker, 7270, gg.OwnItemCount(talker, 7270));
myself.SetMemoState(talker, 72, 6);
myself.SetMemoStateEx(talker, 72, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0072_0102.htm");
myself.SetFlagJournal(talker, 72, 6);
myself.ShowQuestMark(talker, 72);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 73) {
myself.SetCurrentQuestID(73);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 73) {
if (reply == 1) {
if (gg.HaveMemo(talker, 73) == 1 && talker.occupation == 2 && gg.GetMemoState(talker, 73) == 5 && gg.OwnItemCount(talker, 7271) >= 1) {
myself.DeleteItem1(talker, 7271, gg.OwnItemCount(talker, 7271));
myself.SetMemoState(talker, 73, 6);
myself.SetMemoStateEx(talker, 73, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0073_0102.htm");
myself.SetFlagJournal(talker, 73, 6);
myself.ShowQuestMark(talker, 73);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 74) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 74) {
if (reply == 1) {
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 5 && gg.OwnItemCount(talker, 7272) >= 1) {
myself.DeleteItem1(talker, 7272, gg.OwnItemCount(talker, 7272));
myself.SetMemoState(talker, 74, 6);
myself.SetMemoStateEx(talker, 74, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0074_0102.htm");
myself.SetFlagJournal(talker, 74, 6);
myself.ShowQuestMark(talker, 74);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 75) {
myself.SetCurrentQuestID(75);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 75) {
if (reply == 1) {
if (gg.HaveMemo(talker, 75) == 1 && talker.occupation == 46 && gg.GetMemoState(talker, 75) == 5 && gg.OwnItemCount(talker, 7273) >= 1) {
myself.DeleteItem1(talker, 7273, gg.OwnItemCount(talker, 7273));
myself.SetMemoState(talker, 75, 6);
myself.SetMemoStateEx(talker, 75, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0075_0102.htm");
myself.SetFlagJournal(talker, 75, 6);
myself.ShowQuestMark(talker, 75);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 76) {
myself.SetCurrentQuestID(76);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 76) {
if (reply == 1) {
if (gg.HaveMemo(talker, 76) == 1 && talker.occupation == 48 && gg.GetMemoState(talker, 76) == 5 && gg.OwnItemCount(talker, 7274) >= 1) {
myself.DeleteItem1(talker, 7274, gg.OwnItemCount(talker, 7274));
myself.SetMemoState(talker, 76, 6);
myself.SetMemoStateEx(talker, 76, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0076_0102.htm");
myself.SetFlagJournal(talker, 76, 6);
myself.ShowQuestMark(talker, 76);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 77) {
myself.SetCurrentQuestID(77);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 77) {
if (reply == 1) {
if (gg.HaveMemo(talker, 77) == 1 && talker.occupation == 51 && gg.GetMemoState(talker, 77) == 5 && gg.OwnItemCount(talker, 7275) >= 1) {
myself.DeleteItem1(talker, 7275, gg.OwnItemCount(talker, 7275));
myself.SetMemoState(talker, 77, 6);
myself.SetMemoStateEx(talker, 77, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0077_0102.htm");
myself.SetFlagJournal(talker, 77, 6);
myself.ShowQuestMark(talker, 77);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 78) {
myself.SetCurrentQuestID(78);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 78) {
if (reply == 1) {
if (gg.HaveMemo(talker, 78) == 1 && talker.occupation == 52 && gg.GetMemoState(talker, 78) == 5 && gg.OwnItemCount(talker, 7276) >= 1) {
myself.DeleteItem1(talker, 7276, gg.OwnItemCount(talker, 7276));
myself.SetMemoState(talker, 78, 6);
myself.SetMemoStateEx(talker, 78, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0078_0102.htm");
myself.SetFlagJournal(talker, 78, 6);
myself.ShowQuestMark(talker, 78);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 79) {
myself.SetCurrentQuestID(79);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 79) {
if (reply == 1) {
if (gg.HaveMemo(talker, 79) == 1 && talker.occupation == 8 && gg.GetMemoState(talker, 79) == 5 && gg.OwnItemCount(talker, 7277) >= 1) {
myself.DeleteItem1(talker, 7277, gg.OwnItemCount(talker, 7277));
myself.SetMemoState(talker, 79, 6);
myself.SetMemoStateEx(talker, 79, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0079_0102.htm");
myself.SetFlagJournal(talker, 79, 6);
myself.ShowQuestMark(talker, 79);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 80) {
myself.SetCurrentQuestID(80);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 80) {
if (reply == 1) {
if (gg.HaveMemo(talker, 80) == 1 && talker.occupation == 23 && gg.GetMemoState(talker, 80) == 5 && gg.OwnItemCount(talker, 7278) >= 1) {
myself.DeleteItem1(talker, 7278, gg.OwnItemCount(talker, 7278));
myself.SetMemoState(talker, 80, 6);
myself.SetMemoStateEx(talker, 80, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0080_0102.htm");
myself.SetFlagJournal(talker, 80, 6);
myself.ShowQuestMark(talker, 80);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 81) {
myself.SetCurrentQuestID(81);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 81) {
if (reply == 1) {
if (gg.HaveMemo(talker, 81) == 1 && talker.occupation == 36 && gg.GetMemoState(talker, 81) == 5 && gg.OwnItemCount(talker, 7279) >= 1) {
myself.DeleteItem1(talker, 7279, gg.OwnItemCount(talker, 7279));
myself.SetMemoState(talker, 81, 6);
myself.SetMemoStateEx(talker, 81, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0081_0102.htm");
myself.SetFlagJournal(talker, 81, 6);
myself.ShowQuestMark(talker, 81);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 82) {
myself.SetCurrentQuestID(82);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 82) {
if (reply == 1) {
if (gg.HaveMemo(talker, 82) == 1 && talker.occupation == 9 && gg.GetMemoState(talker, 82) == 5 && gg.OwnItemCount(talker, 7280) >= 1) {
myself.DeleteItem1(talker, 7280, gg.OwnItemCount(talker, 7280));
myself.SetMemoState(talker, 82, 6);
myself.SetMemoStateEx(talker, 82, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0082_0102.htm");
myself.SetFlagJournal(talker, 82, 6);
myself.ShowQuestMark(talker, 82);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 83) {
myself.SetCurrentQuestID(83);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 83) {
if (reply == 1) {
if (gg.HaveMemo(talker, 83) == 1 && talker.occupation == 24 && gg.GetMemoState(talker, 83) == 5 && gg.OwnItemCount(talker, 7281) >= 1) {
myself.DeleteItem1(talker, 7281, gg.OwnItemCount(talker, 7281));
myself.SetMemoState(talker, 83, 6);
myself.SetMemoStateEx(talker, 83, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0083_0102.htm");
myself.SetFlagJournal(talker, 83, 6);
myself.ShowQuestMark(talker, 83);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 84) {
myself.SetCurrentQuestID(84);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 84) {
if (reply == 1) {
if (gg.HaveMemo(talker, 84) == 1 && talker.occupation == 37 && gg.GetMemoState(talker, 84) == 5 && gg.OwnItemCount(talker, 7282) >= 1) {
myself.DeleteItem1(talker, 7282, gg.OwnItemCount(talker, 7282));
myself.SetMemoState(talker, 84, 6);
myself.SetMemoStateEx(talker, 84, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0084_0102.htm");
myself.SetFlagJournal(talker, 84, 6);
myself.ShowQuestMark(talker, 84);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 85) {
myself.SetCurrentQuestID(85);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 85) {
if (reply == 1) {
if (gg.HaveMemo(talker, 85) == 1 && talker.occupation == 16 && gg.GetMemoState(talker, 85) == 5 && gg.OwnItemCount(talker, 7283) >= 1) {
myself.DeleteItem1(talker, 7283, gg.OwnItemCount(talker, 7283));
myself.SetMemoState(talker, 85, 6);
myself.SetMemoStateEx(talker, 85, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0085_0102.htm");
myself.SetFlagJournal(talker, 85, 6);
myself.ShowQuestMark(talker, 85);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 86) {
myself.SetCurrentQuestID(86);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 86) {
if (reply == 1) {
if (gg.HaveMemo(talker, 86) == 1 && talker.occupation == 17 && gg.GetMemoState(talker, 86) == 5 && gg.OwnItemCount(talker, 7284) >= 1) {
myself.DeleteItem1(talker, 7284, gg.OwnItemCount(talker, 7284));
myself.SetMemoState(talker, 86, 6);
myself.SetMemoStateEx(talker, 86, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0086_0102.htm");
myself.SetFlagJournal(talker, 86, 6);
myself.ShowQuestMark(talker, 86);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 87) {
myself.SetCurrentQuestID(87);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 87) {
if (reply == 1) {
if (gg.HaveMemo(talker, 87) == 1 && talker.occupation == 30 && gg.GetMemoState(talker, 87) == 5 && gg.OwnItemCount(talker, 7285) >= 1) {
myself.DeleteItem1(talker, 7285, gg.OwnItemCount(talker, 7285));
myself.SetMemoState(talker, 87, 6);
myself.SetMemoStateEx(talker, 87, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0087_0102.htm");
myself.SetFlagJournal(talker, 87, 6);
myself.ShowQuestMark(talker, 87);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 88) {
myself.SetCurrentQuestID(88);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 88) {
if (reply == 1) {
if (gg.HaveMemo(talker, 88) == 1 && talker.occupation == 12 && gg.GetMemoState(talker, 88) == 5 && gg.OwnItemCount(talker, 7286) >= 1) {
myself.DeleteItem1(talker, 7286, gg.OwnItemCount(talker, 7286));
myself.SetMemoState(talker, 88, 6);
myself.SetMemoStateEx(talker, 88, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0088_0102.htm");
myself.SetFlagJournal(talker, 88, 6);
myself.ShowQuestMark(talker, 88);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 89) {
myself.SetCurrentQuestID(89);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 89) {
if (reply == 1) {
if (gg.HaveMemo(talker, 89) == 1 && talker.occupation == 27 && gg.GetMemoState(talker, 89) == 5 && gg.OwnItemCount(talker, 7287) >= 1) {
myself.DeleteItem1(talker, 7287, gg.OwnItemCount(talker, 7287));
myself.SetMemoState(talker, 89, 6);
myself.SetMemoStateEx(talker, 89, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0089_0102.htm");
myself.SetFlagJournal(talker, 89, 6);
myself.ShowQuestMark(talker, 89);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 90) {
myself.SetCurrentQuestID(90);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 90) {
if (reply == 1) {
if (gg.HaveMemo(talker, 90) == 1 && talker.occupation == 40 && gg.GetMemoState(talker, 90) == 5 && gg.OwnItemCount(talker, 7288) >= 1) {
myself.DeleteItem1(talker, 7288, gg.OwnItemCount(talker, 7288));
myself.SetMemoState(talker, 90, 6);
myself.SetMemoStateEx(talker, 90, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0090_0102.htm");
myself.SetFlagJournal(talker, 90, 6);
myself.ShowQuestMark(talker, 90);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 91) {
myself.SetCurrentQuestID(91);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 91) {
if (reply == 1) {
if (gg.HaveMemo(talker, 91) == 1 && talker.occupation == 14 && gg.GetMemoState(talker, 91) == 5 && gg.OwnItemCount(talker, 7289) >= 1) {
myself.DeleteItem1(talker, 7289, gg.OwnItemCount(talker, 7289));
myself.SetMemoState(talker, 91, 6);
myself.SetMemoStateEx(talker, 91, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0091_0102.htm");
myself.SetFlagJournal(talker, 91, 6);
myself.ShowQuestMark(talker, 91);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 92) {
myself.SetCurrentQuestID(92);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 92) {
if (reply == 1) {
if (gg.HaveMemo(talker, 92) == 1 && talker.occupation == 28 && gg.GetMemoState(talker, 92) == 5 && gg.OwnItemCount(talker, 7290) >= 1) {
myself.DeleteItem1(talker, 7290, gg.OwnItemCount(talker, 7290));
myself.SetMemoState(talker, 92, 6);
myself.SetMemoStateEx(talker, 92, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0092_0102.htm");
myself.SetFlagJournal(talker, 92, 6);
myself.ShowQuestMark(talker, 92);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 93) {
myself.SetCurrentQuestID(93);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 93) {
if (reply == 1) {
if (gg.HaveMemo(talker, 93) == 1 && talker.occupation == 41 && gg.GetMemoState(talker, 93) == 5 && gg.OwnItemCount(talker, 7291) >= 1) {
myself.DeleteItem1(talker, 7291, gg.OwnItemCount(talker, 7291));
myself.SetMemoState(talker, 93, 6);
myself.SetMemoStateEx(talker, 93, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0093_0102.htm");
myself.SetFlagJournal(talker, 93, 6);
myself.ShowQuestMark(talker, 93);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 94) {
myself.SetCurrentQuestID(94);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 94) {
if (reply == 1) {
if (gg.HaveMemo(talker, 94) == 1 && talker.occupation == 13 && gg.GetMemoState(talker, 94) == 5 && gg.OwnItemCount(talker, 7292) >= 1) {
myself.DeleteItem1(talker, 7292, gg.OwnItemCount(talker, 7292));
myself.SetMemoState(talker, 94, 6);
myself.SetMemoStateEx(talker, 94, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0094_0102.htm");
myself.SetFlagJournal(talker, 94, 6);
myself.ShowQuestMark(talker, 94);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 95) {
myself.SetCurrentQuestID(95);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 95) {
if (reply == 1) {
if (gg.HaveMemo(talker, 95) == 1 && talker.occupation == 6 && gg.GetMemoState(talker, 95) == 5 && gg.OwnItemCount(talker, 7293) >= 1) {
myself.DeleteItem1(talker, 7293, gg.OwnItemCount(talker, 7293));
myself.SetMemoState(talker, 95, 6);
myself.SetMemoStateEx(talker, 95, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0095_0102.htm");
myself.SetFlagJournal(talker, 95, 6);
myself.ShowQuestMark(talker, 95);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 96) {
myself.SetCurrentQuestID(96);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 96) {
if (reply == 1) {
if (gg.HaveMemo(talker, 96) == 1 && talker.occupation == 34 && gg.GetMemoState(talker, 96) == 5 && gg.OwnItemCount(talker, 7294) >= 1) {
myself.DeleteItem1(talker, 7294, gg.OwnItemCount(talker, 7294));
myself.SetMemoState(talker, 96, 6);
myself.SetMemoStateEx(talker, 96, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0096_0102.htm");
myself.SetFlagJournal(talker, 96, 6);
myself.ShowQuestMark(talker, 96);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 97) {
myself.SetCurrentQuestID(97);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 97) {
if (reply == 1) {
if (gg.HaveMemo(talker, 97) == 1 && talker.occupation == 33 && gg.GetMemoState(talker, 97) == 5 && gg.OwnItemCount(talker, 7295) >= 1) {
myself.DeleteItem1(talker, 7295, gg.OwnItemCount(talker, 7295));
myself.SetMemoState(talker, 97, 6);
myself.SetMemoStateEx(talker, 97, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0097_0102.htm");
myself.SetFlagJournal(talker, 97, 6);
myself.ShowQuestMark(talker, 97);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 98) {
myself.SetCurrentQuestID(98);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 98) {
if (reply == 1) {
if (gg.HaveMemo(talker, 98) == 1 && talker.occupation == 43 && gg.GetMemoState(talker, 98) == 5 && gg.OwnItemCount(talker, 7296) >= 1) {
myself.DeleteItem1(talker, 7296, gg.OwnItemCount(talker, 7296));
myself.SetMemoState(talker, 98, 6);
myself.SetMemoStateEx(talker, 98, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0098_0102.htm");
myself.SetFlagJournal(talker, 98, 6);
myself.ShowQuestMark(talker, 98);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 99) {
myself.SetCurrentQuestID(99);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 99) {
if (reply == 1) {
if (gg.HaveMemo(talker, 99) == 1 && talker.occupation == 55 && gg.GetMemoState(talker, 99) == 5 && gg.OwnItemCount(talker, 7297) >= 1) {
myself.DeleteItem1(talker, 7297, gg.OwnItemCount(talker, 7297));
myself.SetMemoState(talker, 99, 6);
myself.SetMemoStateEx(talker, 99, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0099_0102.htm");
myself.SetFlagJournal(talker, 99, 6);
myself.ShowQuestMark(talker, 99);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 100) {
myself.SetCurrentQuestID(100);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 100) {
if (reply == 1) {
if (gg.HaveMemo(talker, 100) == 1 && talker.occupation == 57 && gg.GetMemoState(talker, 100) == 5 && gg.OwnItemCount(talker, 7298) >= 1) {
myself.DeleteItem1(talker, 7298, gg.OwnItemCount(talker, 7298));
myself.SetMemoState(talker, 100, 6);
myself.SetMemoStateEx(talker, 100, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0100_0102.htm");
myself.SetFlagJournal(talker, 100, 6);
myself.ShowQuestMark(talker, 100);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 67) {
myself.SetCurrentQuestID(67);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 67) {
if (reply == 1) {
if (gg.HaveMemo(talker, 67) == 1 && talker.occupation == 127 && gg.GetMemoState(talker, 67) == 5 && gg.OwnItemCount(talker, 9722) >= 1) {
myself.DeleteItem1(talker, 9722, gg.OwnItemCount(talker, 9722));
myself.SetMemoState(talker, 67, 6);
myself.SetMemoStateEx(talker, 67, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0067_0102.htm");
myself.SetFlagJournal(talker, 67, 6);
myself.ShowQuestMark(talker, 67);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 69) {
myself.SetCurrentQuestID(69);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 69) {
if (reply == 1) {
if (gg.HaveMemo(talker, 69) == 1 && talker.occupation == 130 && gg.GetMemoState(talker, 69) == 5 && gg.OwnItemCount(talker, 9724) >= 1) {
myself.DeleteItem1(talker, 9724, gg.OwnItemCount(talker, 9724));
myself.SetMemoState(talker, 69, 6);
myself.SetMemoStateEx(talker, 69, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0069_0102.htm");
myself.SetFlagJournal(talker, 69, 6);
myself.ShowQuestMark(talker, 69);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
if (ask == 68) {
myself.SetCurrentQuestID(68);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 68) {
if (reply == 1) {
if (gg.HaveMemo(talker, 68) == 1 && talker.occupation == 128 || talker.occupation == 129 && gg.GetMemoState(talker, 68) == 5 && gg.OwnItemCount(talker, 9723) >= 1) {
myself.DeleteItem1(talker, 9723, gg.OwnItemCount(talker, 9723));
myself.SetMemoState(talker, 68, 6);
myself.SetMemoStateEx(talker, 68, 1, 0);
myself.AddUseSkillDesire(myself.sm, 297926657, 1, 0, 1000000);
myself.AddUseSkillDesire(talker, 297926657, 1, 0, 1000000);
myself.ShowPage(talker, "secret_codex_1_q0068_0102.htm");
myself.SetFlagJournal(talker, 68, 6);
myself.ShowQuestMark(talker, 68);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}
super;
	}


}
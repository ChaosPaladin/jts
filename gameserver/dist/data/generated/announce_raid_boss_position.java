package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class announce_raid_boss_position extends citizen {
	protected String fnHiPCCafe = "pc.htm";
	protected String fnHiPCCoupon = "pc.htm";
	protected int isKamaelTown = 0;

protected Object[][] RaidBossList20_29 = {
{"Discarded Guardian (lv20)";-111092;232173;-3448;0;0}, {"Zombie Lord Farakelsus (lv20)";22523;80431;-2772;0;0}, {"Madness Beast (lv20)";-53970;84334;-3048;0;0}, {"Evil Spirit Bifrons (lv21)";-13698;213796;-3300;0;0}, {"Sukar Wererat Chief (lv21)";-3451;112819;-3032;0;0}, {"Malex, Herald of Dagoniel  (lv21)";9661;76976;-3652;0;0}, {"Kaysha, Herald of Icarus (lv21)";-47412;51647;-5659;0;0}, {"Greyclaw Kutus (lv23)";-54464;146572;-2400;0;0}, {"Tracker Leader Sharuk (lv23)";-55791;186903;-2856;0;0}, {"Kuroboros' Priest (lv23)";-62342;179572;-3088;0;0}, {"Unrequited Kael (lv24)";-60427;188266;-4352;0;0}, {"Langk Matriarch Rashkos (lv24)";-47634;219274;-1936;0;0}, {"Pan Dryad (lv25)";7352;169433;-3172;0;0}, {"Princess Molrang (lv25)";-61041;127347;-2512;0;0}, {"Zombie Lord Crowl (lv25)";-12652;138200;-3120;0;0}, {"Ikuntai (lv25)";-21778;152065;-2636;0;0}, {"Soul Scavenger (lv25)";-45713;111186;-3280;0;0}, {"Freki, Betrayer of Urutu (lv25)";-18053;-101274;-1580;0;0}, {"Mammon's Collector Talloth (lv25)";172122;-214776;-3064;0;0}, {"Tiger Hornet (lv26)";29064;179362;-3128;0;0}, {"Patriarch Kuroboros (lv26)";-62171;190489;-3160;0;0}, {"Tirak (lv28)";-57366;186276;-4804;0;0}, {"Partisan Leader Talakin (lv28)";49194;127999;-3161;0;0}, {"Elf Renoa (lv29)";-37799;198120;-2200;0;0}
};
protected Object[][] RaidBossList30_39 = {
{"Turek Mercenary Captain (lv30)";-94101;100238;-3012;0;0}, {"Cat's Eye (lv30)";53794;102660;-529;0;0}, {"Meana, Agent of Beres (lv30)";116219;139458;-3124;0;0}, {"Ragraman (lv30)";-54517;170321;-2700;0;0}, {"Apepi (lv30)";88102;176262;-3012;0;0}, {"Giant Wastelands Basilisk (lv30)";-16843;174890;-2984;0;0}, {"Grave Robber Boss Akata (lv30)";48693;-106508;-1247;0;0}, {"Captain of the Queen's Royal Guard (lv32)";29891;107201;-3572;0;0}, {"Skyla (lv32)";117812;102948;-3140;0;0}, {"Vuku Grand Seer Gharmash (lv33)";17671;179134;-3016;0;0}, {"Nurka's Messenger (lv33)";45620;120710;-2158;0;0}, {"Corsair Captain Kylon (lv33)";36048;191352;-2524;0;0}, {"Breka Warlock Pastu (lv34)";90365;125716;-1632;0;0}, {"Stakato Queen Zyrnna (lv34)";27181;101830;-3192;0;0}, {"Cronos's Servitor Mumu (lv34)";68677;203149;-3192;0;0}, {"Ghost of Sir Calibus (lv34)";51405;153984;-3008;0;0}, {"Remmel (lv35)";10525;126890;-3132;0;0}, {"Chertuba of Great Soul (lv35)";-91009;116339;-2908;0;0}, {"Sejarr's Servitor (lv35)";123570;133506;-3156;0;0}, {"Guilotine, Warden of the Execution Grounds (lv35)";50883;146764;-3077;0;0}, {"Flame Lord Shadar (lv35)";43787;124067;-2512;0;0}, {"Tasaba Patriarch Hellena (lv35)";88143;166365;-3388;0;0}, {"Soul Collector Acheron (lv35)";43062;152492;-2294;0;0}, {"Gargoyle Lord Sirocco (lv35)";-16089;184295;-3364;0;0}, {"Red Eye Captain Trakia (lv35)";40074;102019;-790;0;0}, {"Eye of Beleth (lv35)";5000;189000;-3728;0;0}, {"Sebek (lv36)";76461;193228;-3208;0;0}, {"Evil Spirit Tempest (lv36)";53418;143534;-3332;0;0}, {"Rayito the Looter (lv37)";127856;-160639;-1080;0;0}, {"Lizardmen Leader Hellion (lv38)";26108;122256;-3488;0;0}, {"Premo Prime (lv38)";101806;200394;-3180;0;0}, {"Leader of Cat Gang(lv39)";88554;140646;-2960;0;0}, {"Nellis' Vengeful Spirit (lv39)";122771;-141022;-1016;0;0}
};
protected Object[][] RaidBossList40_49 = {
{"Mystic of Storm Teruk (lv40)";92511;84868;-3276;0;0}, {"Icarus Sample 1 (lv40)";93907;197640;-3272;0;0}, {"Leto Chief Talkin (lv40)";87457;76055;-3088;0;0}, {"Shaman King Selu (lv40)";73506;66930;-3236;0;0}, {"Water Couatle Ateka (lv40)";73789;201565;-3324;0;0}, {"Fafurion's Page Sika (lv40)";112065;210010;-3087;0;0}, {"Road Scavenger Leader (lv40)";72043;125476;-3120;0;0}, {"Nakondas (lv40)";128394;138494;-2964;0;0}, {"Water Spirit Lian (lv40)";82878;183263;-3140;0;0}, {"Gwindorr (lv40)";86534;216888;-3176;0;0}, {"Retreat Spider Cletu (lv42)";124219;75453;-2312;0;0}, {"Crazy Mechanic Golem (lv43)";90798;16427;-4800;0;0}, {"Earth Protector Panathen (lv43)";125892;190292;-2744;0;0}, {"Timak Orc Chief Ranger (lv44)";66960;67364;-3208;0;0}, {"Rotten Tree Repiro (lv44)";64119;16091;-3060;0;0}, {"Dread Avenger Kraven (lv44)";62481;8165;-2984;0;0}, {"Flame Stone Golem (lv44)";79734;18484;-4924;0;0}, {"Thief Kelbar (lv44)";107000;92000;-2272;0;0}, {"Biconne of Blue Sky (lv45)";106982;168324;-2908;0;0}, {"Shacram (lv45)";113740;84265;-2232;0;0}, {"Tiger King Karuta (lv45)";75842;110909;-2072;0;0}, {"Iron Giant Totem (lv45)";93102;19514;-3096;0;0}, {"Archon Suscepter (lv45)";14950;118901;-11802;0;0}, {"Timak Orc Gosmos (lv45)";67278;64236;-3244;0;0}, {"Evil Spirit Cyrion (lv45)";111458;82957;-2352;0;0}, {"Fafurion's Henchman Istary (lv45)";126673;174461;-2588;0;0}, {"Barion (lv47)";107843;27696;-2972;0;0}, {"Necrosentinel Royal Guard (lv47)";81865;113236;-2624;0;0}, {"King Tarlk (lv48)";77170;5465;-2592;0;0}, {"Orfen's Handmaiden (lv48)";41998;24118;-4408;0;0}, {"Katu Van Leader Atui (lv49)";92886;8015;-3448;0;0}, {"Karte (lv49)";116373;27646;-2776;0;0}, {"Mirror of Oblivion (lv49)";133628;87077;-3096;0;0}
};
protected Object[][] RaidBossList50_59 = {
{"Spiteful Soul of Peasant Leader (lv50)";169763;12002;-2180;0;0}, {"Berun, Messenger of the Fairy Queen (lv50)";121826;64079;-3192;0;0}, {"Carnage Lord Gato (lv50)";75425;-9310;-2304;0;0}, {"Cursed Clara (lv50)";89879;105765;-2740;0;0}, {"Carnamakos (lv50)";23786;119490;-8667;0;0}, {"Lilith's Witch Marilion (lv50)";54512;180285;-4863;0;0}, {"Zaken's Mate Tillion (lv50)";43082;220384;-3508;0;0}, {"Verfa (lv51)";125445;27213;-3140;0;0}, {"Deadman Ereve (lv51)";150437;67666;-3204;0;0}, {"Shaka, Captain of the Red Flag (lv52)";95031;-23101;-1752;0;0}, {"Grave Robber Kim (lv52)";175633;29904;-3272;0;0}, {"Fafurion's Envoy Pingolpin (lv52)";88406;258226;-10123;0;0}, {"Gigantic Chaos Golem (lv52)";97000;-111000;-3100;0;0}, {"Atraiban (lv53)";55863;206185;-3400;0;0}, {"Magus Kenishee (lv53)";53374;205451;-3588;0;0}, {"Dark Shaman Varangka (lv53)";74323;-101926;-864;0;0}, {"Unicorn Paniel (lv54)";125060;43251;-3280;0;0}, {"Furious Thieles (lv55)";114074;52978;-3304;0;0}, {"Enchanted Forest Watcher Ruell (lv55)";125630;50168;-3348;0;0}, {"Sorcerer Isirr (lv55)";135845;94549;-3244;0;0}, {"Sephia, Seer of Bereth (lv55)";125228;102636;-2880;0;0}, {"Black Lilly (lv55)";92486;115214;-2748;0;0}, {"Harit Hero Tamash (lv55)";165955;88202;-1864;0;0}, {"Zaken's Butcher Krantz (lv55)";42050;208107;-3752;0;0}, {"Pagan Watcher Cerberon (lv55)";85556;88735;-5005;0;0}, {"Bandit Leader Barda (lv55)";104052;-16802;-1436;0;0}, {"Ghost Knight Kabed (lv55)";183520;24681;-2604;0;0}, {"Eva's Spirit Niniel (lv55)";82247;251891;-10234;0;0}, {"Hopeful Refugee Leo (lv56)";86320;-8272;-2684;0;0}, {"Harit Guardian Garangky (lv56)";166205;68268;-2748;0;0}, {"Ragoth, Seer of Timak (lv57)";66620;46739;-3348;0;0}, {"Eva's Guardian Millenu (lv58)";88778;245805;-10126;0;0}, {"Soulless Wild Boar (lv59)";165408;93846;-2660;0;0}, {"Demon Kurikups (lv59)";41896;216167;-3416;0;0}, {"Abyss Brukunt (lv59)";154959;85453;-3180;0;0}, {"Captain of the Ice Queen's Royal Guard (lv59)";105852;-127569;-2564;0;0}
};
protected Object[][] RaidBossList60_69 = {
{"The 3rd Underwater Guardian (lv60)";76671;245767;-10126;0;0}, {"Lidia, Ghost of the Well (lv60)";173998;-11305;-2556;0;0}, {"Giant Marpanak (lv60)";193902;54135;-4184;0;0}, {"Karum, Guardian of the Statue of the Giant (lv60)";182842;52332;-4184;0;0}, {"Ancient Weird Drake (lv60)";119993;111353;-2596;0;0}, {"Taik High Prefect Arak (lv60)";170294;42666;-4312;0;0}, {"Lord Ishka  (lv60)";115067;112234;-2480;0;0}, {"Ice Fairy Sirra (lv60)";102800;-126000;-2500;0;0}, {"Fairy Queen Timiniel (lv61)";113485;47057;-4096;0;0}, {"Roaring Lord Kastor (lv62)";104150;-3614;-2936;0;0}, {"Gorgolos (lv64)";186210;61479;-4000;0;0}, {"Rahha (lv65)";117738;-9021;-2720;0;0}, {"Fierce Tiger King Angel (lv65)";170629;85343;-1452;0;0}, {"Hekaton Prime (lv65)";192107;56472;-7458;0;0}, {"Gargoyle Lord Tiphon (lv65)";169895;-24946;-3224;0;0}, {"Enmity Ghost Ramdal (lv65)";113181;17534;-3820;0;0}, {"Hisilrome, Priest of Shilen (lv65)";168263;28403;-3156;0;0}, {"Demon's Agent Falston (lv66)";93336;-75115;-1384;0;0}, {" Utenus, the Last Titan (lv66)";186919;56297;-4480;0;0}, {"Kernon's Faithful Servant Kelone (lv67)";144521;-28034;-1472;0;0}, {"Bloody Priest Rudelto (lv69)";143776;110310;-3784;0;0}, {"Spiteful Soul of Andras the Betrayer (lv69)";185826;-26563;-1808;0;0}
};
protected Object[][] RaidBossList70_79 = {
{"Shilen's Messenger Cabrio (lv70)";180986;11934;-2580;0;0}, {"Korim (lv70)";115949;16089;2104;0;0}, {"Roaring Skylancer (lv70)";130468;59125;4096;0;0}, {"Fafurion's Messenger Loch Ness (lv70)";102677;157467;-3169;0;0}, {"Palibati Queen Themis (lv70)";192807;22414;-3448;0;0}, {"Beast Lord Behemoth (lv70)";123485;-23633;-3004;0;0}, {"Anakim's Nemesis Zakaron(lv70)";151083;88258;-5276;0;0}, {"Barakiel, the Flame of Splendor (lv70)";91023;-85929;-2200;0;0}, {"Minas Anor (lv70)";156685;-6129;-3704;0;0}, {"Eilhalder Von Hellmann (lv71)";59440;-42205;-2810;0;0}, {"Immortal Savior Mardil (lv71)";113211;17533;-848;0;0}, {"Fafurion's Seer Sheshark (lv72)";107894;157480;-3126;0;0}, {"Vanor Chief Kandra (lv72)";116340;-62440;-2772;0;0}, {"Doom Blade Tanatos (lv72)";127936;-13366;-3236;0;0}, {"Death Lord Hallate (lv73)";113155;17515;-1772;0;0}, {"Plague Golem (lv73)";168812;-59954;-3445;0;0}, {"Cloe, Priest of Antharas (lv74)";152312;110438;-5364;0;0}, {"Crokian Padisha Sobekk (lv74)";119693;157431;-3188;0;0}, {"Icicle Emperor Bumbalump (lv74)";158352;-121088;-2240;0;0}, {"Kernon (lv75)";113501;16670;4324;0;0}, {"Storm Winged Naga (lv75)";137629;-19454;-3140;0;0}, {"Last Lesser Giant Olkuth (lv75)";172154;55314;-5920;0;0}, {"Palatanos of the Fearsome Power (lv75)";147295;-20711;-2960;0;0}, {"Bloody Empress Decarbia (lv75)";188983;13492;-1796;0;0}, {"Death Lord Ipos (lv75)";153989;-14050;-3340;0;0}, {"Death Lord Shax (lv75)";179284;-7684;-4732;0;0}, {"Ocean's Flame Ashakiel (lv76)";123820;153439;-3101;0;0}, {"Flamestone Giant (lv76)";144640;-5568;-4087;0;0}, {"Shuriel, Fire of Wrath (lv78)";112689;16446;7164;0;0}, {"Last Lesser Giant Glaki (lv78)";188800;48350;-5856;0;0}, {"Hestia, Guardian Deity of the Hot Springs (lv78)";134712;-115532;-700;0;0}, {"Daimon the White-Eyed (lv78)";186304;-43744;-3193;0;0}, {"Longhorn Golkonda (lv79)";116553;15718;7156;0;0}, {"Cherub Galaxia (lv79)";113584;15028;9828;0;0}
};
protected Object[][] RaidBossList80_89 = {
{"Ketra's Hero Hekaton (lv80)";148154;-73782;-4364;0;0}, {"Varka's Hero Shadith (lv80)";115537;-39046;-1940;0;0}, {"Spiked Stakato Queen Shyeed (lv80)";79635;-55612;-5980;0;0}, {"Lilith (lv80)";185060;-9622;-5104;0;0}, {"Anakim (lv80)";185065;-12612;-5104;0;0}, {"Ketra's Commander Tayr (lv80)";145553;-81651;-5464;0;0}, {"Varka's Commander Mos (lv80)";109296;-36103;-648;0;0}, {"Ember (lv80)";185700;-106066;-6184;0;0}, {"Uruka (lv80)";3776;-6768;-3276;0;0}, {"Ketra's Chief Braki (lv80)";144997;-84948;-5712;0;0}, {"Varka's Chief Horus (lv80)";105654;-42995;-1240;0;0}, {"Master Anays (lv80)";112793;-76080;286;0;0}, {"High Priest Andreas Van Halter (lv80)";35765;-50351;1704;0;0}, {"Soul of Fire Nastron (lv80)";142368;-82512;-6487;0;0}, {"Soul of Water Ashutar (lv80)";105452;-36775;-1050;0;0}, {"Sailren (lv80)";26528;-8244;-2007;0;0}, {"Typhoon (lv83)";-17475;253163;-3432;0;0}, {"Valdstone (lv80)";-192361;254528;1598;0;0}, {"Rok (lv83)";-174600;219711;4424;0;0}, {"Enira (lv85)";-181989;208968;4424;0;0}, {"Dius (lv85)";-252898;235845;5343;0;0}
};
protected Object[][] RaidBossList90_99 = {
{"Ketra's Hero Hekaton (lv80)";148154;-73782;-4364;0;0}, {"Varka's Hero Shadith (lv80)";115537;-39046;-1940;0;0}, {"Spiked Stakato Queen Shyeed (lv80)";79635;-55612;-5980;0;0}, {"Lilith (lv80)";185060;-9622;-5104;0;0}, {"Anakim (lv80)";185065;-12612;-5104;0;0}, {"Ketra's Commander Tayr (lv80)";145553;-81651;-5464;0;0}, {"Varka's Commander Mos (lv80)";109296;-36103;-648;0;0}, {"Ember (lv80)";185700;-106066;-6184;0;0}, {"Uruka (lv80)";3776;-6768;-3276;0;0}, {"Ketra's Chief Braki (lv80)";144997;-84948;-5712;0;0}, {"Varka's Chief Horus (lv80)";105654;-42995;-1240;0;0}, {"Master Anays (lv80)";112793;-76080;286;0;0}, {"High Priest Andreas Van Halter (lv80)";35765;-50351;1704;0;0}, {"Soul of Fire Nastron (lv80)";142368;-82512;-6487;0;0}, {"Soul of Water Ashutar (lv80)";105452;-36775;-1050;0;0}, {"Sailren (lv80)";26528;-8244;-2007;0;0}, {"Typhoon (lv83)";-17475;253163;-3432;0;0}, {"Valdstone (lv80)";-192361;254528;1598;0;0}, {"Rok (lv83)";-174600;219711;4424;0;0}, {"Enira (lv85)";-181989;208968;4424;0;0}, {"Dius (lv85)";-252898;235845;5343;0;0}
};
protected Object[][] Position = {
{"Talking Island Village";-84169;244693;-3729;100000;0}
};

	protected void CREATED(HandlerParam talker) {
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.i_ai2 = 0;
myself.c_ai0 = gg.GetNullCreature();
myself.RegisterTeleporterType(1, 0);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.CastBuffForQuestReward(myself.c_ai0, 288161793);
myself.AddTimerEx(1002, 1000);

} else if (timer_id == 1002) {
myself.CastBuffForQuestReward(myself.c_ai0, 287899649);
myself.AddTimerEx(1003, 1000);

} else if (timer_id == 1003) {
myself.CastBuffForQuestReward(myself.c_ai0, 287834113);
myself.AddTimerEx(1004, 1000);

} else if (timer_id == 1004) {
myself.CastBuffForQuestReward(myself.c_ai0, 288620545);
myself.AddTimerEx(1005, 1000);

} else if (timer_id == 1005) {
myself.CastBuffForQuestReward(myself.c_ai0, 288686081);
myself.AddTimerEx(1006, 1000);

} else if (timer_id == 1006) {
myself.CastBuffForQuestReward(myself.c_ai0, 288555009);
myself.AddTimerEx(1007, 1000);

} else if (timer_id == 1007) {
myself.CastBuffForQuestReward(myself.c_ai0, 288227329);
myself.AddTimerEx(1008, 1000);

} else if (timer_id == 1008) {
myself.CastBuffForQuestReward(myself.c_ai0, 287965185);
myself.AddTimerEx(1009, 1000);

} else if (timer_id == 1009) {
myself.CastBuffForQuestReward(myself.c_ai0, 288489473);
myself.AddTimerEx(1010, 1000);

} else if (timer_id == 1010) {
myself.CastBuffForQuestReward(myself.c_ai0, 288751617);
myself.AddTimerEx(1011, 1000);

} else if (timer_id == 1011) {
myself.CastBuffForQuestReward(myself.c_ai0, 288292865);
myself.AddTimerEx(1012, 1000);

} else if (timer_id == 1012) {
myself.CastBuffForQuestReward(myself.c_ai0, 287768577);
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();

} else if (timer_id == 1101) {
myself.CastBuffForQuestReward(myself.c_ai0, 288161793);
myself.AddTimerEx(1102, 1000);

} else if (timer_id == 1102) {
myself.CastBuffForQuestReward(myself.c_ai0, 288096257);
myself.AddTimerEx(1103, 1000);

} else if (timer_id == 1103) {
myself.CastBuffForQuestReward(myself.c_ai0, 287834113);
myself.AddTimerEx(1104, 1000);

} else if (timer_id == 1104) {
myself.CastBuffForQuestReward(myself.c_ai0, 287768577);
myself.AddTimerEx(1105, 1000);

} else if (timer_id == 1105) {
myself.CastBuffForQuestReward(myself.c_ai0, 288030721);
myself.AddTimerEx(1106, 1000);

} else if (timer_id == 1106) {
myself.CastBuffForQuestReward(myself.c_ai0, 288423937);
myself.AddTimerEx(1107, 1000);

} else if (timer_id == 1107) {
myself.CastBuffForQuestReward(myself.c_ai0, 288358401);
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();

} else if (timer_id == 2001) {
myself.CastBuffForQuestReward(myself.c_ai0, 288161793);
myself.AddTimerEx(2002, 1000);

} else if (timer_id == 2002) {
myself.CastBuffForQuestReward(myself.c_ai0, 287899650);
myself.AddTimerEx(2003, 1000);

} else if (timer_id == 2003) {
myself.CastBuffForQuestReward(myself.c_ai0, 287834114);
myself.AddTimerEx(2004, 1000);

} else if (timer_id == 2004) {
myself.CastBuffForQuestReward(myself.c_ai0, 288620546);
myself.AddTimerEx(2005, 1000);

} else if (timer_id == 2005) {
myself.CastBuffForQuestReward(myself.c_ai0, 288686082);
myself.AddTimerEx(2006, 1000);

} else if (timer_id == 2006) {
myself.CastBuffForQuestReward(myself.c_ai0, 288555010);
myself.AddTimerEx(2007, 1000);

} else if (timer_id == 2007) {
myself.CastBuffForQuestReward(myself.c_ai0, 288227330);
myself.AddTimerEx(2008, 1000);

} else if (timer_id == 2008) {
myself.CastBuffForQuestReward(myself.c_ai0, 287965187);
myself.AddTimerEx(2009, 1000);

} else if (timer_id == 2009) {
myself.CastBuffForQuestReward(myself.c_ai0, 288489473);
myself.AddTimerEx(2010, 1000);

} else if (timer_id == 2010) {
myself.CastBuffForQuestReward(myself.c_ai0, 288751618);
myself.AddTimerEx(2011, 1000);

} else if (timer_id == 2011) {
myself.CastBuffForQuestReward(myself.c_ai0, 288292866);
myself.AddTimerEx(2012, 1000);

} else if (timer_id == 2012) {
myself.CastBuffForQuestReward(myself.c_ai0, 287768578);
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();

} else if (timer_id == 2101) {
myself.CastBuffForQuestReward(myself.c_ai0, 288161793);
myself.AddTimerEx(2102, 1000);

} else if (timer_id == 2102) {
myself.CastBuffForQuestReward(myself.c_ai0, 288096257);
myself.AddTimerEx(2103, 1000);

} else if (timer_id == 2103) {
myself.CastBuffForQuestReward(myself.c_ai0, 287834114);
myself.AddTimerEx(2104, 1000);

} else if (timer_id == 2104) {
myself.CastBuffForQuestReward(myself.c_ai0, 287768578);
myself.AddTimerEx(2105, 1000);

} else if (timer_id == 2105) {
myself.CastBuffForQuestReward(myself.c_ai0, 288030723);
myself.AddTimerEx(2106, 1000);

} else if (timer_id == 2106) {
myself.CastBuffForQuestReward(myself.c_ai0, 288423938);
myself.AddTimerEx(2107, 1000);

} else if (timer_id == 2107) {
myself.CastBuffForQuestReward(myself.c_ai0, 288358402);
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();

} else if (timer_id == 3001) {
myself.CastBuffForQuestReward(myself.c_ai0, 288161794);
myself.AddTimerEx(3002, 1000);

} else if (timer_id == 3002) {
myself.CastBuffForQuestReward(myself.c_ai0, 287899651);
myself.AddTimerEx(3003, 1000);

} else if (timer_id == 3003) {
myself.CastBuffForQuestReward(myself.c_ai0, 287834115);
myself.AddTimerEx(3004, 1000);

} else if (timer_id == 3004) {
myself.CastBuffForQuestReward(myself.c_ai0, 288620547);
myself.AddTimerEx(3005, 1000);

} else if (timer_id == 3005) {
myself.CastBuffForQuestReward(myself.c_ai0, 288686083);
myself.AddTimerEx(3006, 1000);

} else if (timer_id == 3006) {
myself.CastBuffForQuestReward(myself.c_ai0, 288555011);
myself.AddTimerEx(3007, 1000);

} else if (timer_id == 3007) {
myself.CastBuffForQuestReward(myself.c_ai0, 288227331);
myself.AddTimerEx(3008, 1000);

} else if (timer_id == 3008) {
myself.CastBuffForQuestReward(myself.c_ai0, 287965188);
myself.AddTimerEx(3009, 1000);

} else if (timer_id == 3009) {
myself.CastBuffForQuestReward(myself.c_ai0, 288489474);
myself.AddTimerEx(3010, 1000);

} else if (timer_id == 3010) {
myself.CastBuffForQuestReward(myself.c_ai0, 288751619);
myself.AddTimerEx(3011, 1000);

} else if (timer_id == 3011) {
myself.CastBuffForQuestReward(myself.c_ai0, 288292867);
myself.AddTimerEx(3012, 1000);

} else if (timer_id == 3012) {
myself.CastBuffForQuestReward(myself.c_ai0, 287768578);
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();

} else if (timer_id == 3101) {
myself.CastBuffForQuestReward(myself.c_ai0, 288161794);
myself.AddTimerEx(3102, 1000);

} else if (timer_id == 3102) {
myself.CastBuffForQuestReward(myself.c_ai0, 288096258);
myself.AddTimerEx(3103, 1000);

} else if (timer_id == 3103) {
myself.CastBuffForQuestReward(myself.c_ai0, 287834115);
myself.AddTimerEx(3104, 1000);

} else if (timer_id == 3104) {
myself.CastBuffForQuestReward(myself.c_ai0, 287768578);
myself.AddTimerEx(3105, 1000);

} else if (timer_id == 3105) {
myself.CastBuffForQuestReward(myself.c_ai0, 288030724);
myself.AddTimerEx(3106, 1000);

} else if (timer_id == 3106) {
myself.CastBuffForQuestReward(myself.c_ai0, 288423939);
myself.AddTimerEx(3107, 1000);

} else if (timer_id == 3107) {
myself.CastBuffForQuestReward(myself.c_ai0, 288358403);
myself.i_ai0 = 0;
myself.c_ai0 = gg.GetNullCreature();

} else if (timer_id == 3999) {
myself.i_ai2 = 0;

} else if (timer_id == 4000) {
myself.i_ai1 = 0;

}
	}

	protected void TALKED(HandlerParam talker) {
if (myself.GetPCCafePointEventState() > 0 && myself.GetPCCafePoint(talker) > 0) {
myself.ShowPage(talker, fnHiPCCafe);

} else if (myself.GetPCCafeCouponEventState() == 1 && myself.IsPCCafeUser(talker) == 1) {
myself.ShowPage(talker, fnHiPCCoupon);

} else if (myself.GetPCCafeCouponEventState() == 2 && myself.IsPCCafeUser(talker) == 1) {
myself.ShowPage(talker, fnHiPCCoupon);

} else {
myself.ShowPage(talker, fnHi);

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam c0) {
if (ask == -18) {
switch (reply) {
case 1: {
myself.ShowQuestInfoList(talker);
break;

}
case 2: {
myself.ShowTelPosListPage(talker, RaidBossList20_29);
break;

}
case 3: {
myself.ShowTelPosListPage(talker, RaidBossList30_39);
break;

}
case 4: {
myself.ShowTelPosListPage(talker, RaidBossList40_49);
break;

}
case 5: {
myself.ShowTelPosListPage(talker, RaidBossList50_59);
break;

}
case 6: {
myself.ShowTelPosListPage(talker, RaidBossList60_69);
break;

}
case 7: {
myself.ShowTelPosListPage(talker, RaidBossList70_79);
break;

}
case 8: {
myself.ShowTelPosListPage(talker, RaidBossList80_89);
break;

}
case 9: {
myself.ShowTelPosListPage(talker, RaidBossList90_99);
break;

}

}

} else if (ask == -100) {
if (isKamaelTown == 1) {
myself.ShowPage(talker, "pccafe_list001a.htm");

} else {
myself.ShowPage(talker, "pccafe_list001.htm");

}

} else if (ask == -110) {
if (gg.GetAbnormalLevel(talker, myself.Skill_GetAbnormalType(93716481)) > 0 || gg.GetAbnormalLevel(talker, myself.Skill_GetAbnormalType(5308417)) > 0) {
myself.ShowPage(talker, "pccafe_buff_warning.htm");
return;

}
if (talker.level < 40) {
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else if (talker.level >= 40 && talker.level < 55) {
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_buff_3001.htm");

}

} else if (ask == -111) {
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else if (ask == -120) {
myself.ShowPage(talker, "pccafe_item001.htm");

} else if (ask == -130) {
myself.ShowPage(talker, "pccafe_wyvern001.htm");

} else if (ask == -200) {
if (gg.GetAbnormalLevel(talker, myself.Skill_GetAbnormalType(93716481)) > 0 || gg.GetAbnormalLevel(talker, myself.Skill_GetAbnormalType(5308417)) > 0) {
myself.ShowPage(talker, "pccafe_buff_warning.htm");
return;

}
if (talker.level < 40) {
switch (reply) {
case 1: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288161793);
gg.AddLogEx(111, talker, 288161793, 300);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 2: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 287899649);
gg.AddLogEx(111, talker, 287899649, 200);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 3: {
if (myself.UpdatePCCafePoint(talker, -100) == 1) {
myself.CastBuffForQuestReward(talker, 287834113);
gg.AddLogEx(111, talker, 287834113, 100);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 4: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 287768577);
gg.AddLogEx(111, talker, 287768577, 200);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 5: {
if (myself.UpdatePCCafePoint(talker, -550) == 1) {
myself.CastBuffForQuestReward(talker, 288620545);
gg.AddLogEx(111, talker, 288620545, 550);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 6: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288096257);
gg.AddLogEx(111, talker, 288096257, 300);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 7: {
if (myself.UpdatePCCafePoint(talker, -650) == 1) {
myself.CastBuffForQuestReward(talker, 288686081);
gg.AddLogEx(111, talker, 288686081, 650);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 8: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 288555009);
gg.AddLogEx(111, talker, 288555009, 200);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 9: {
if (myself.UpdatePCCafePoint(talker, -100) == 1) {
myself.CastBuffForQuestReward(talker, 288227329);
gg.AddLogEx(111, talker, 288227329, 100);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 10: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 287965185);
gg.AddLogEx(111, talker, 287965185, 200);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 11: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 288030721);
gg.AddLogEx(111, talker, 288030721, 200);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 12: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288489473);
gg.AddLogEx(111, talker, 288489473, 400);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 13: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 288751617);
gg.AddLogEx(111, talker, 288751617, 200);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 14: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 288292865);
gg.AddLogEx(111, talker, 288292865, 200);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 15: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 288423937);
gg.AddLogEx(111, talker, 288423937, 200);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 16: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288358401);
gg.AddLogEx(111, talker, 288358401, 400);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 17: {
if (myself.GetPCCafePoint(talker) < 3100 || myself.i_ai0 == 0) {
if (myself.UpdatePCCafePoint(talker, -3100) == 1) {
myself.i_ai0 = 1;
myself.c_ai0 = talker;
myself.AddTimerEx(1001, 1000);
gg.AddLogEx(111, talker, 17, 3100);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600001, "", "", "", "", ""));
myself.ShowPage(talker, "pccafe_buff_1001.htm");

}
break;

}
case 18: {
if (myself.GetPCCafePoint(talker) < 1600 || myself.i_ai0 == 0) {
if (myself.UpdatePCCafePoint(talker, -1600) == 1) {
myself.i_ai0 = 1;
myself.c_ai0 = talker;
myself.AddTimerEx(1101, 1000);
gg.AddLogEx(111, talker, 18, 1600);
myself.ShowPage(talker, "pccafe_buff_1001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600001, "", "", "", "", ""));
myself.ShowPage(talker, "pccafe_buff_1001.htm");

}
break;

}

}

} else if (talker.level >= 40 && talker.level < 55) {
switch (reply) {
case 1: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288161793);
gg.AddLogEx(111, talker, 288161793, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 2: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 287899650);
gg.AddLogEx(111, talker, 287899650, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 3: {
if (myself.UpdatePCCafePoint(talker, -150) == 1) {
myself.CastBuffForQuestReward(talker, 287834114);
gg.AddLogEx(111, talker, 287834114, 150);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 4: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 287768578);
gg.AddLogEx(111, talker, 287768578, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 5: {
if (myself.UpdatePCCafePoint(talker, -650) == 1) {
myself.CastBuffForQuestReward(talker, 288620546);
gg.AddLogEx(111, talker, 288620546, 650);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 6: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288096257);
gg.AddLogEx(111, talker, 288096257, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 7: {
if (myself.UpdatePCCafePoint(talker, -800) == 1) {
myself.CastBuffForQuestReward(talker, 288686082);
gg.AddLogEx(111, talker, 288686082, 800);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 8: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288555010);
gg.AddLogEx(111, talker, 288555010, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 9: {
if (myself.UpdatePCCafePoint(talker, -150) == 1) {
myself.CastBuffForQuestReward(talker, 288227330);
gg.AddLogEx(111, talker, 288227330, 150);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 10: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 287965187);
gg.AddLogEx(111, talker, 287965187, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 11: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288030723);
gg.AddLogEx(111, talker, 288030723, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 12: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288489473);
gg.AddLogEx(111, talker, 288489473, 400);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 13: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288751618);
gg.AddLogEx(111, talker, 288751618, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 14: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288292866);
gg.AddLogEx(111, talker, 288292866, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 15: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 288423938);
gg.AddLogEx(111, talker, 288423938, 300);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 16: {
if (myself.UpdatePCCafePoint(talker, -600) == 1) {
myself.CastBuffForQuestReward(talker, 288358402);
gg.AddLogEx(111, talker, 288358402, 600);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 17: {
if (myself.GetPCCafePoint(talker) < 4000 || myself.i_ai0 == 0) {
if (myself.UpdatePCCafePoint(talker, -4000) == 1) {
myself.i_ai0 = 1;
myself.c_ai0 = talker;
myself.AddTimerEx(2001, 1000);
gg.AddLogEx(111, talker, 17, 4000);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600001, "", "", "", "", ""));
myself.ShowPage(talker, "pccafe_buff_2001.htm");

}
break;

}
case 18: {
if (myself.GetPCCafePoint(talker) < 2100 || myself.i_ai0 == 0) {
if (myself.UpdatePCCafePoint(talker, -2100) == 1) {
myself.i_ai0 = 1;
myself.c_ai0 = talker;
myself.AddTimerEx(2101, 1000);
gg.AddLogEx(111, talker, 18, 2100);
myself.ShowPage(talker, "pccafe_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600001, "", "", "", "", ""));
myself.ShowPage(talker, "pccafe_buff_2001.htm");

}
break;

}

}

} else {
switch (reply) {
case 1: {
if (myself.UpdatePCCafePoint(talker, -500) == 1) {
myself.CastBuffForQuestReward(talker, 288161794);
gg.AddLogEx(111, talker, 288161794, 500);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 2: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 287899651);
gg.AddLogEx(111, talker, 287899651, 400);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 3: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 287834115);
gg.AddLogEx(111, talker, 287834115, 200);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 4: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(talker, 287768578);
gg.AddLogEx(111, talker, 287768578, 300);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 5: {
if (myself.UpdatePCCafePoint(talker, -800) == 1) {
myself.CastBuffForQuestReward(talker, 288620547);
gg.AddLogEx(111, talker, 288620547, 800);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 6: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288096258);
gg.AddLogEx(111, talker, 288096258, 400);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 7: {
if (myself.UpdatePCCafePoint(talker, -950) == 1) {
myself.CastBuffForQuestReward(talker, 288686083);
gg.AddLogEx(111, talker, 288686083, 950);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 8: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288555011);
gg.AddLogEx(111, talker, 288555011, 400);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 9: {
if (myself.UpdatePCCafePoint(talker, -200) == 1) {
myself.CastBuffForQuestReward(talker, 288227331);
gg.AddLogEx(111, talker, 288227331, 200);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 10: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 287965188);
gg.AddLogEx(111, talker, 287965188, 400);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 11: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288030724);
gg.AddLogEx(111, talker, 288030724, 400);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 12: {
if (myself.UpdatePCCafePoint(talker, -950) == 1) {
myself.CastBuffForQuestReward(talker, 288489474);
gg.AddLogEx(111, talker, 288489474, 950);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 13: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288751619);
gg.AddLogEx(111, talker, 288751619, 400);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 14: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288292867);
gg.AddLogEx(111, talker, 288292867, 400);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 15: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(talker, 288423939);
gg.AddLogEx(111, talker, 288423939, 400);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 16: {
if (myself.UpdatePCCafePoint(talker, -950) == 1) {
myself.CastBuffForQuestReward(talker, 288358403);
gg.AddLogEx(111, talker, 288358403, 950);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 17: {
if (myself.GetPCCafePoint(talker) < 5600 || myself.i_ai0 == 0) {
if (myself.UpdatePCCafePoint(talker, -5600) == 1) {
myself.i_ai0 = 1;
myself.c_ai0 = talker;
myself.AddTimerEx(3001, 1000);
gg.AddLogEx(111, talker, 17, 5600);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600001, "", "", "", "", ""));
myself.ShowPage(talker, "pccafe_buff_3001.htm");

}
break;

}
case 18: {
if (myself.GetPCCafePoint(talker) < 3000 || myself.i_ai0 == 0) {
if (myself.UpdatePCCafePoint(talker, -3000) == 1) {
myself.i_ai0 = 1;
myself.c_ai0 = talker;
myself.AddTimerEx(3101, 1000);
gg.AddLogEx(111, talker, 18, 3000);
myself.ShowPage(talker, "pccafe_buff_3001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600001, "", "", "", "", ""));
myself.ShowPage(talker, "pccafe_buff_3001.htm");

}
break;

}

}

}

} else if (ask == -201) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
myself.ShowPage(talker, "pccafe_no_summon001.htm");

} else {
switch (reply) {
case 1: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 288161793);
gg.AddLogEx(112, talker, 288161793, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 2: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 287899650);
gg.AddLogEx(112, talker, 287899650, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 3: {
if (myself.UpdatePCCafePoint(talker, -150) == 1) {
myself.CastBuffForQuestReward(c0, 287834114);
gg.AddLogEx(112, talker, 287834114, 150);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 4: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 287768578);
gg.AddLogEx(112, talker, 287768578, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 5: {
if (myself.UpdatePCCafePoint(talker, -650) == 1) {
myself.CastBuffForQuestReward(c0, 288620546);
gg.AddLogEx(112, talker, 288620546, 650);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 6: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 288096257);
gg.AddLogEx(112, talker, 288096257, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 7: {
if (myself.UpdatePCCafePoint(talker, -800) == 1) {
myself.CastBuffForQuestReward(c0, 288686082);
gg.AddLogEx(112, talker, 288686082, 800);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 8: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 288555010);
gg.AddLogEx(112, talker, 288555010, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 9: {
if (myself.UpdatePCCafePoint(talker, -150) == 1) {
myself.CastBuffForQuestReward(c0, 288227330);
gg.AddLogEx(112, talker, 288227330, 150);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 10: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 287965187);
gg.AddLogEx(112, talker, 287965187, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 11: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 288030723);
gg.AddLogEx(112, talker, 288030723, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 12: {
if (myself.UpdatePCCafePoint(talker, -400) == 1) {
myself.CastBuffForQuestReward(c0, 288489473);
gg.AddLogEx(112, talker, 288489473, 400);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 13: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 288751618);
gg.AddLogEx(112, talker, 288751618, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 14: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 288292866);
gg.AddLogEx(112, talker, 288292866, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 15: {
if (myself.UpdatePCCafePoint(talker, -300) == 1) {
myself.CastBuffForQuestReward(c0, 288423938);
gg.AddLogEx(112, talker, 288423938, 300);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 16: {
if (myself.UpdatePCCafePoint(talker, -600) == 1) {
myself.CastBuffForQuestReward(c0, 288358402);
gg.AddLogEx(112, talker, 288358402, 600);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}
break;

}
case 17: {
if (myself.GetPCCafePoint(talker) < 4000 || myself.i_ai2 == 0) {
if (myself.UpdatePCCafePoint(talker, -4000) == 1) {
myself.CastBuffForQuestReward(c0, 288161793);
myself.CastBuffForQuestReward(c0, 287899650);
myself.CastBuffForQuestReward(c0, 287834114);
myself.CastBuffForQuestReward(c0, 287768578);
myself.CastBuffForQuestReward(c0, 288620546);
myself.CastBuffForQuestReward(c0, 288686082);
myself.CastBuffForQuestReward(c0, 288555010);
myself.CastBuffForQuestReward(c0, 288227330);
myself.CastBuffForQuestReward(c0, 287965187);
myself.CastBuffForQuestReward(c0, 288489473);
myself.CastBuffForQuestReward(c0, 288751618);
myself.CastBuffForQuestReward(c0, 288292866);
myself.CastBuffForQuestReward(c0, 288161793);
gg.AddLogEx(112, talker, 17, 4000);
myself.i_ai2 = 1;
myself.AddTimerEx(3999, 20000);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600001, "", "", "", "", ""));
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

}
break;

}
case 18: {
if (myself.GetPCCafePoint(talker) < 2100 || myself.i_ai2 == 0) {
if (myself.UpdatePCCafePoint(talker, -2100) == 1) {
myself.CastBuffForQuestReward(c0, 288161793);
myself.CastBuffForQuestReward(c0, 288096257);
myself.CastBuffForQuestReward(c0, 287834114);
myself.CastBuffForQuestReward(c0, 287768578);
myself.CastBuffForQuestReward(c0, 288030723);
myself.CastBuffForQuestReward(c0, 288423938);
myself.CastBuffForQuestReward(c0, 288358402);
gg.AddLogEx(112, talker, 18, 2100);
myself.i_ai2 = 1;
myself.AddTimerEx(3999, 20000);
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600001, "", "", "", "", ""));
myself.ShowPage(talker, "pccafe_summon_buff_2001.htm");

}
break;

}

}

}

} else if (ask == -300) {
switch (reply) {
case 100: {
if (myself.GetPCCafePoint(talker) < 12000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
i1 = gg.Rand(1000);
if (i1 < 10) {
if (gg.Rand(2) < 1) {
myself.GiveItemByPCCafePoint(talker, 12000, 12779, 0, 1);

} else {
myself.GiveItemByPCCafePoint(talker, 12000, 12780, 0, 1);

}

} else if (i1 < 40) {
if (gg.Rand(2) < 1) {
myself.GiveItemByPCCafePoint(talker, 12000, 8910, 0, 1);

} else {
myself.GiveItemByPCCafePoint(talker, 12000, 8557, 0, 1);

}

} else if (i1 < 100) {
if (gg.Rand(2) < 1) {
myself.GiveItemByPCCafePoint(talker, 12000, 7844, 0, 1);

} else {
myself.GiveItemByPCCafePoint(talker, 12000, 7842, 0, 1);

}

} else if (i1 < 300) {
i0 = gg.Rand(21);
if (i0 == 0) {
myself.GiveItemByPCCafePoint(talker, 12000, 15357, 0, 1);

} else if (i0 == 1) {
myself.GiveItemByPCCafePoint(talker, 12000, 15356, 0, 1);

} else if (i0 == 2) {
myself.GiveItemByPCCafePoint(talker, 12000, 15357, 0, 1);

} else if (i0 == 3) {
myself.GiveItemByPCCafePoint(talker, 12000, 15356, 0, 1);

} else if (i0 == 4) {
myself.GiveItemByPCCafePoint(talker, 12000, 9184, 0, 1);

} else if (i0 == 5) {
myself.GiveItemByPCCafePoint(talker, 12000, 9185, 0, 1);

} else if (i0 == 6) {
myself.GiveItemByPCCafePoint(talker, 12000, 9187, 0, 1);

} else if (i0 == 7) {
myself.GiveItemByPCCafePoint(talker, 12000, 9188, 0, 1);

} else if (i0 == 8) {
myself.GiveItemByPCCafePoint(talker, 12000, 9190, 0, 1);

} else if (i0 == 9) {
myself.GiveItemByPCCafePoint(talker, 12000, 9191, 0, 1);

} else if (i0 == 10) {
myself.GiveItemByPCCafePoint(talker, 12000, 9192, 0, 1);

} else if (i0 == 11) {
myself.GiveItemByPCCafePoint(talker, 12000, 9194, 0, 1);

} else if (i0 == 12) {
myself.GiveItemByPCCafePoint(talker, 12000, 9195, 0, 1);

} else if (i0 == 13) {
myself.GiveItemByPCCafePoint(talker, 12000, 9197, 0, 1);

} else if (i0 == 14) {
myself.GiveItemByPCCafePoint(talker, 12000, 9198, 0, 1);

} else if (i0 == 15) {
myself.GiveItemByPCCafePoint(talker, 12000, 9199, 0, 1);

} else if (i0 == 16) {
myself.GiveItemByPCCafePoint(talker, 12000, 9201, 0, 1);

} else if (i0 == 17) {
myself.GiveItemByPCCafePoint(talker, 12000, 9202, 0, 1);

} else if (i0 == 18) {
myself.GiveItemByPCCafePoint(talker, 12000, 9204, 0, 1);

} else if (i0 == 19) {
myself.GiveItemByPCCafePoint(talker, 12000, 15357, 0, 1);

} else if (i0 == 20) {
myself.GiveItemByPCCafePoint(talker, 12000, 15356, 0, 1);

}

} else if (i1 < 650) {
myself.GiveItemByPCCafePoint(talker, 12000, 6407, 0, 5);

} else {
myself.GiveItemByPCCafePoint(talker, 12000, 6406, 0, 10);

}
break;

}
case 1: {
if (myself.GetPCCafePoint(talker) < 600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 600, 6406, 0, 1);
break;

}
case 2: {
if (myself.GetPCCafePoint(talker) < 1200) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1200, 6407, 0, 1);
break;

}
case 3: {
if (myself.GetPCCafePoint(talker) < 60000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 60000, 7840, 0, 1);
break;

}
case 4: {
if (myself.GetPCCafePoint(talker) < 60000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 60000, 7841, 0, 1);
break;

}
case 5: {
if (myself.GetPCCafePoint(talker) < 96000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 96000, 7842, 0, 1);
break;

}
case 6: {
if (myself.GetPCCafePoint(talker) < 60000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 60000, 7847, 0, 1);
break;

}
case 7: {
if (myself.GetPCCafePoint(talker) < 60000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 60000, 7843, 0, 1);
break;

}
case 8: {
if (myself.GetPCCafePoint(talker) < 96000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 96000, 7844, 0, 1);
break;

}
case 9: {
if (myself.GetPCCafePoint(talker) < 60000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 60000, 7845, 0, 1);
break;

}
case 10: {
if (myself.GetPCCafePoint(talker) < 60000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 60000, 7846, 0, 1);
break;

}
case 11: {
if (myself.GetPCCafePoint(talker) < 60000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 60000, 7848, 0, 1);
break;

}
case 12: {
if (myself.GetPCCafePoint(talker) < 60000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 60000, 7849, 0, 1);
break;

}
case 13: {
if (myself.GetPCCafePoint(talker) < 144000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 144000, 8557, 0, 1);
break;

}
case 14: {
if (myself.GetPCCafePoint(talker) < 144000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 144000, 8910, 0, 1);
break;

}
case 15: {
if (myself.GetPCCafePoint(talker) < 12000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

} else {
i0 = gg.Rand(15);
if (i0 == 0) {
myself.GiveItemByPCCafePoint(talker, 12000, 9184, 0, 1);

} else if (i0 == 1) {
myself.GiveItemByPCCafePoint(talker, 12000, 9185, 0, 1);

} else if (i0 == 2) {
myself.GiveItemByPCCafePoint(talker, 12000, 9187, 0, 1);

} else if (i0 == 3) {
myself.GiveItemByPCCafePoint(talker, 12000, 9188, 0, 1);

} else if (i0 == 4) {
myself.GiveItemByPCCafePoint(talker, 12000, 9190, 0, 1);

} else if (i0 == 5) {
myself.GiveItemByPCCafePoint(talker, 12000, 9191, 0, 1);

} else if (i0 == 6) {
myself.GiveItemByPCCafePoint(talker, 12000, 9192, 0, 1);

} else if (i0 == 7) {
myself.GiveItemByPCCafePoint(talker, 12000, 9194, 0, 1);

} else if (i0 == 8) {
myself.GiveItemByPCCafePoint(talker, 12000, 9195, 0, 1);

} else if (i0 == 9) {
myself.GiveItemByPCCafePoint(talker, 12000, 9197, 0, 1);

} else if (i0 == 10) {
myself.GiveItemByPCCafePoint(talker, 12000, 9198, 0, 1);

} else if (i0 == 11) {
myself.GiveItemByPCCafePoint(talker, 12000, 9199, 0, 1);

} else if (i0 == 12) {
myself.GiveItemByPCCafePoint(talker, 12000, 9201, 0, 1);

} else if (i0 == 13) {
myself.GiveItemByPCCafePoint(talker, 12000, 9202, 0, 1);

} else if (i0 == 14) {
myself.GiveItemByPCCafePoint(talker, 12000, 9204, 0, 1);

}

}
break;

}
case 16: {
if (myself.GetPCCafePoint(talker) < 192000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
if (gg.Rand(2) < 1) {
myself.GiveItemByPCCafePoint(talker, 192000, 12779, 0, 1);

} else {
myself.GiveItemByPCCafePoint(talker, 192000, 12780, 0, 1);

}
break;

}
case 17: {
if (myself.GetPCCafePoint(talker) < 3500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 3500, 15356, 0, 1);
break;

}
case 18: {
if (myself.GetPCCafePoint(talker) < 3000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 3000, 15357, 0, 1);
break;

}
case 19: {
if (talker.level >= 20 && talker.level <= 39) {
myself.ShowPage(talker, "pccafe_item_bytime_20_39001.htm");
break;

} else if (talker.level >= 40 && talker.level <= 51) {
myself.ShowPage(talker, "pccafe_item_bytime_40_51001.htm");
break;

} else if (talker.level >= 52 && talker.level <= 60) {
myself.ShowPage(talker, "pccafe_item_bytime_52_60001.htm");
break;

} else if (talker.level >= 61 && talker.level <= 75) {
myself.ShowPage(talker, "pccafe_item_bytime_61_75001.htm");
break;

} else if (talker.level >= 76 && talker.level <= 85) {
myself.ShowPage(talker, "pccafe_item_bytime_76_85001.htm");
break;

} else {
myself.ShowPage(talker, "pccafe_item_bytime_ETCLevel001.htm");
break;

}

}
case 20: {
if (myself.GetPCCafePoint(talker) < 1500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1500, 15346, 0, 1);
break;

}
case 21: {
if (myself.GetPCCafePoint(talker) < 1300) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1300, 15347, 0, 1);
break;

}
case 22: {
if (myself.GetPCCafePoint(talker) < 1000) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1000, 15348, 0, 1);
break;

}
case 23: {
if (myself.GetPCCafePoint(talker) < 800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 800, 15349, 0, 1);
break;

}
case 24: {
if (myself.GetPCCafePoint(talker) < 500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 500, 15350, 0, 1);
break;

}

}

} else if (ask == -350) {
switch (reply) {
case 1: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13210, 0, 1);
break;

}
case 2: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13211, 0, 1);
break;

}
case 3: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13212, 0, 1);
break;

}
case 4: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13213, 0, 1);
break;

}
case 5: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13214, 0, 1);
break;

}
case 6: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13215, 0, 1);
break;

}
case 7: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13216, 0, 1);
break;

}
case 8: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13217, 0, 1);
break;

}
case 9: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13218, 0, 1);
break;

}
case 10: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13219, 0, 1);
break;

}
case 11: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13220, 0, 1);
break;

}
case 12: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13221, 0, 1);
break;

}
case 13: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13222, 0, 1);
break;

}
case 14: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13223, 0, 1);
break;

}
case 15: {
if (myself.GetPCCafePoint(talker) < 5500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 5500, 13224, 0, 1);
break;

}

}

} else if (ask == -351) {
switch (reply) {
case 1: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13163, 0, 1);
break;

}
case 2: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13164, 0, 1);
break;

}
case 3: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13165, 0, 1);
break;

}
case 4: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13166, 0, 1);
break;

}
case 5: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13167, 0, 1);
break;

}
case 6: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13168, 0, 1);
break;

}
case 7: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13169, 0, 1);
break;

}
case 8: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13170, 0, 1);
break;

}
case 9: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13171, 0, 1);
break;

}
case 10: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13172, 0, 1);
break;

}
case 11: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13173, 0, 1);
break;

}
case 12: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13174, 0, 1);
break;

}
case 13: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13175, 0, 1);
break;

}
case 14: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13176, 0, 1);
break;

}
case 15: {
if (myself.GetPCCafePoint(talker) < 1600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 1600, 13177, 0, 1);
break;

}

}

} else if (ask == -352) {
switch (reply) {
case 1: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13178, 0, 1);
break;

}
case 2: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13179, 0, 1);
break;

}
case 3: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13180, 0, 1);
break;

}
case 4: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13181, 0, 1);
break;

}
case 5: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13182, 0, 1);
break;

}
case 6: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13183, 0, 1);
break;

}
case 7: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13184, 0, 1);
break;

}
case 8: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13185, 0, 1);
break;

}
case 9: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13186, 0, 1);
break;

}
case 10: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13187, 0, 1);
break;

}
case 11: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13188, 0, 1);
break;

}
case 12: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13189, 0, 1);
break;

}
case 13: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13190, 0, 1);
break;

}
case 14: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13191, 0, 1);
break;

}
case 15: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13192, 0, 1);
break;

}
case 16: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 13193, 0, 1);
break;

}
case 17: {
if (myself.GetPCCafePoint(talker) < 2800) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 2800, 15403, 0, 1);
break;

}

}

} else if (ask == -353) {
switch (reply) {
case 1: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13194, 0, 1);
break;

}
case 2: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13195, 0, 1);
break;

}
case 3: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13196, 0, 1);
break;

}
case 4: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13197, 0, 1);
break;

}
case 5: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13198, 0, 1);
break;

}
case 6: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13199, 0, 1);
break;

}
case 7: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13200, 0, 1);
break;

}
case 8: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13201, 0, 1);
break;

}
case 9: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13202, 0, 1);
break;

}
case 10: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13203, 0, 1);
break;

}
case 11: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13204, 0, 1);
break;

}
case 12: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13205, 0, 1);
break;

}
case 13: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13206, 0, 1);
break;

}
case 14: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13207, 0, 1);
break;

}
case 15: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13208, 0, 1);
break;

}
case 16: {
if (myself.GetPCCafePoint(talker) < 4500) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 4500, 13209, 0, 1);
break;

}

}

} else if (ask == -354) {
switch (reply) {
case 1: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15313, 0, 1);
break;

}
case 2: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15314, 0, 1);
break;

}
case 3: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15315, 0, 1);
break;

}
case 4: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15316, 0, 1);
break;

}
case 5: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15317, 0, 1);
break;

}
case 6: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15318, 0, 1);
break;

}
case 7: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15319, 0, 1);
break;

}
case 8: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15320, 0, 1);
break;

}
case 9: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15321, 0, 1);
break;

}
case 10: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15322, 0, 1);
break;

}
case 11: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15323, 0, 1);
break;

}
case 12: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15324, 0, 1);
break;

}
case 13: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15325, 0, 1);
break;

}
case 14: {
if (myself.GetPCCafePoint(talker) < 6600) {
myself.ShowPage(talker, "pccafe_notpoint001.htm");
break;

}
myself.GiveItemByPCCafePoint(talker, 6600, 15326, 0, 1);
break;

}

}

} else if (ask == -2407) {
switch (reply) {
case 1: {
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.IsPCCafeUser(talker) == 1) {
if (gg.GetDailyQuestFlag(talker, 991) == 1) {
myself.GiveItemByPCCafePoint(talker, 0, 15358, 0, 1);
gg.SetDailyQuestFlag(talker, 991);

} else {
myself.ShowPage(talker, "pccafe_help_lottery_notoneday.htm");

}

} else {
myself.ShowPage(talker, "pccafe_help_lottery_notpccafe.htm");

}
break;

}
case 2: {
if (gg.OwnItemCount(talker, 15359) > 0) {
if (myself.GetPCCafePoint(talker) <= 100000) {
myself.DeleteItem1(talker, 15359, 1);
myself.UpdatePCCafePoint2(talker, 100000);
myself.ShowPage(talker, "pccafe_help_lottery003.htm");

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail2.htm");

}

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail.htm");

}
break;

}
case 3: {
if (gg.OwnItemCount(talker, 15360) > 0) {
if (myself.GetPCCafePoint(talker) <= 190000) {
myself.DeleteItem1(talker, 15360, 1);
myself.UpdatePCCafePoint2(talker, 10000);
myself.ShowPage(talker, "pccafe_help_lottery003.htm");

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail2.htm");

}

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail.htm");

}
break;

}
case 4: {
if (gg.OwnItemCount(talker, 15361) > 0) {
if (myself.GetPCCafePoint(talker) <= 198000) {
myself.DeleteItem1(talker, 15361, 1);
myself.UpdatePCCafePoint2(talker, 2000);
myself.ShowPage(talker, "pccafe_help_lottery003.htm");

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail2.htm");

}

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail.htm");

}
break;

}
case 5: {
if (gg.OwnItemCount(talker, 15362) > 0) {
if (myself.GetPCCafePoint(talker) <= 199000) {
myself.DeleteItem1(talker, 15362, 1);
myself.UpdatePCCafePoint2(talker, 1000);
myself.ShowPage(talker, "pccafe_help_lottery003.htm");

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail2.htm");

}

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail.htm");

}
break;

}
case 6: {
if (gg.OwnItemCount(talker, 15363) > 0) {
if (myself.GetPCCafePoint(talker) <= 199900) {
myself.DeleteItem1(talker, 15363, 1);
myself.UpdatePCCafePoint2(talker, 100);
myself.ShowPage(talker, "pccafe_help_lottery003.htm");

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail2.htm");

}

} else {
myself.ShowPage(talker, "pccafe_help_lottery_fail.htm");

}
break;

}

}

} else if (ask == -303) {
if (reply == 564) {
if (talker.level < 20) {
myself.ShowPage(talker, "pccoupon_error_under20.htm");
return;

} else {
myself.ShowMultisell(564, talker);

}

}

} else if (ask == -400) {
c0 = myself.GetSummon(talker);
if (myself.IsNullCreature(c0) == 1) {
if (talker.transformID == 0) {
if (myself.IsInCombatMode(talker) == 0 && talker.yongma_type == 0) {
if (talker.alive == 1) {
if (talker.stop_mode == 1) {
if (myself.i_ai1 == 0) {
if (myself.GetPCCafePoint(talker) >= 2500) {
myself.UpdatePCCafePoint2(talker, -2500);
myself.RideForEvent(talker, 1012621, 5, 2500);
myself.i_ai1 = 1;
myself.AddTimerEx(4000, 120000);

} else {
myself.ShowPage(talker, "pccafe_notpoint001.htm");

}

} else {
myself.ShowPage(talker, "pccafe_no_wyvern001.htm");

}

} else {
myself.ShowSystemMessage(talker, 2253);

}

} else {
myself.ShowSystemMessage(talker, 2249);

}

} else {
myself.ShowSystemMessageStr(talker, gg.MakeFString(1600003, "", "", "", "", ""));

}

} else {
myself.ShowSystemMessage(talker, 2247);

}

} else {
myself.ShowSystemMessage(talker, 2257);

}

}
super;
	}

	protected void TELEPORT_REQUESTED(HandlerParam talker) {
if (talker.transformID == 111 || talker.transformID == 112 || talker.transformID == 124) {
myself.ShowPage(talker, "q194_noteleport.htm");

} else {
myself.Teleport(talker, Position, "", "", "", "", -100, gg.MakeFString(1000506, "", "", "", "", ""));

}
	}


}
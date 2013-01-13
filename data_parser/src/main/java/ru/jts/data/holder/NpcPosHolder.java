/*
 * Copyright 2012 jts
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.jts.data.holder;

import ru.jts.annotations.data.Element;
import ru.jts.annotations.data.factory.IObjectFactory;
import ru.jts.common.parser.AbstractHolder;
import ru.jts.data.holder.npcpos.Domain;
import ru.jts.data.holder.npcpos.PosTerritory;
import ru.jts.data.holder.npcpos.maker.NpcMaker;
import ru.jts.data.holder.npcpos.maker.spawn_time.*;
import ru.jts.data.holder.npcpos.maker_ex.NpcMakerEx;
import ru.jts.nasc_loader.pch.LinkerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.jts.data.holder.npcpos.maker_ex.NpcMakerEx.AIParameters;

/**
 * @author : Camelion
 * @date : 30.08.12  20:10
 */
public class NpcPosHolder extends AbstractHolder {
    @Element(start = "domain_begin", end = "domain_end")
    private List<Domain> domains;
    @Element(start = "territory_begin", end = "territory_end")
    private List<PosTerritory> territories;
    @Element(start = "npcmaker_begin", end = "npcmaker_end", objectFactory = NpcMakerObjectFactory.class)
    private List<NpcMaker> makers;
    @Element(start = "npcmaker_ex_begin", end = "npcmaker_ex_end")
    private List<NpcMakerEx> ex_makers;

    private static NpcPosHolder ourInstance = new NpcPosHolder();

    public static NpcPosHolder getInstance() {
        return ourInstance;
    }

    private NpcPosHolder() {
    }

    @Override
    public int size() {
        return domains.size() + territories.size() + makers.size() + ex_makers.size();
    }

    public List<Domain> getDomains() {
        return domains;
    }

    public List<PosTerritory> getTerritories() {
        return territories;
    }

    public static class NpcMakerObjectFactory implements IObjectFactory<NpcMaker> {
        private static final Pattern pattern = Pattern.compile("spawn_time=(\\S+?)\\((\\S+?)\\)");


        @Override
        public NpcMaker createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
            NpcMaker maker = new NpcMaker();
            Matcher matcher = pattern.matcher(data);
            if (matcher.find()) {
                String param1 = matcher.group(1);
                String params = matcher.group(2);
                switch (param1) {
                    case "agit_defend_warfare_start":
                        AgitDefendWarfareStart agitDefendWarfareStart = new AgitDefendWarfareStart();
                        agitDefendWarfareStart.agit_id = Integer.valueOf(params);
                        maker.spawn_time = agitDefendWarfareStart;
                        break;
                    case "agit_attack_warfare_start":
                        AgitAttackWarfareStart agitAttackWarfareStart = new AgitAttackWarfareStart();
                        agitAttackWarfareStart.agit_id = Integer.valueOf(params);
                        maker.spawn_time = agitAttackWarfareStart;
                        break;
                    case "siege_warfare_start":
                        SiegeWarfareStart siegeWarfareStart = new SiegeWarfareStart();
                        siegeWarfareStart.castle_id = Integer.valueOf(params);
                        maker.spawn_time = siegeWarfareStart;
                        break;
                    case "pc_siege_warfare_start":
                        PCSiegeWarfareStart pcSiegeWarfareStart = new PCSiegeWarfareStart();
                        pcSiegeWarfareStart.castle_id = Integer.valueOf(params);
                        maker.spawn_time = pcSiegeWarfareStart;
                        break;
                    case "extended_siege_warfare_start":
                        ExtendedSiegeWarfareStart extendedSiegeWarfareStart = new ExtendedSiegeWarfareStart();
                        extendedSiegeWarfareStart.dominion_id = Integer.valueOf(params);
                        maker.spawn_time = extendedSiegeWarfareStart;
                        break;
                    case "door_open":
                        DoorOpen doorOpen = new DoorOpen();
                        doorOpen.door_name = params.substring(params.indexOf("[") + 1, params.indexOf("]"));
                        maker.spawn_time = doorOpen;
                        break;
                }
            }

            return maker;
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            // Ignore
        }
    }

    public static class AiParamsObjectFactory implements IObjectFactory<AIParameters> {
        public static Pattern paramPattern = Pattern.compile("\\b(?<Float>\\-?\\d+\\.\\d+)|(?<Integer>\\-?\\d+)" +
                "|(?<String>\\[(?<StringVal>\\S+)])|(?<Link>@\\S+)|(?<aString>\\S+)");

        @Override
        public AIParameters createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
            Map<String, Object> ai_params = new HashMap<>();

            for (String params : data.toString().split(";")) {
                String[] parts = params.split("=");

                parts[0] = parts[0].trim();
                parts[1] = parts[1].trim();

                String key = parts[0].substring(parts[0].indexOf("[") + 1, parts[0].indexOf("]"));
                String value = parts[1];

                Matcher valueMatcher = paramPattern.matcher(value);
                if (valueMatcher.find()) {

                    String param = valueMatcher.group("Float");
                    if (param != null) {
                        ai_params.put(key, Float.valueOf(value));
                        continue;
                    }

                    param = valueMatcher.group("Integer");
                    if (param != null) {
                        ai_params.put(key, Integer.valueOf(value));
                        continue;
                    }

                    param = valueMatcher.group("String");
                    if (param != null) {
                        ai_params.put(key, valueMatcher.group("StringVal"));
                        continue;
                    }

                    param = valueMatcher.group("Link");
                    if (param != null) {
                        String p = LinkerFactory.getInstance().findValueFor(value);

                        if (p == null)
                            throw new NoSuchFieldException(p);
                        ai_params.put(key, p);

                        continue;
                    }

                    param = valueMatcher.group("aString");
                    if (param != null) {
                        ai_params.put(key, value);
                        continue;
                    }

                    throw new NoSuchFieldError();
                }
            }

            return new AIParameters(ai_params);
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            // Ignore
        }
    }
}

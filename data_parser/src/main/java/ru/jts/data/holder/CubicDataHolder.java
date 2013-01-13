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
import ru.jts.data.holder.cubicdata.Agathion;
import ru.jts.data.holder.cubicdata.Cubic;
import ru.jts.data.holder.cubicdata.DefaultCubicData;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.jts.data.holder.cubicdata.Agathion.AgathionTimeSkill;
import static ru.jts.data.holder.cubicdata.DefaultCubicData.*;

/**
 * @author : Camelion
 * @date : 25.08.12  22:47
 */
public class CubicDataHolder extends AbstractHolder {
    @Element(start = "cubic_begin", end = "cubic_end", objectFactory = CubicDataObjectFactory.class)
    public List<Cubic> cubics;
    @Element(start = "agathion_begin", end = "agathion_end", objectFactory = CubicDataObjectFactory.class)
    public List<Agathion> agathions;

    private static CubicDataHolder ourInstance = new CubicDataHolder();

    public static CubicDataHolder getInstance() {
        return ourInstance;
    }

    private CubicDataHolder() {
    }

    @Override
    public int size() {
        return cubics.size();
    }

    public List<Cubic> getCubics() {
        return cubics;
    }

    public List<Agathion> getAgathions() {
        return agathions;
    }

    private static final Pattern cubicDataTargetTypePattern = Pattern.compile("target_type\\s*?=\\s*?\\{?(master|target|by_skill|heal;(\\d+)%;(\\d+)%;(\\d+)%;(\\d+)%)}?");
    private static final Pattern cubicDataOpCondPattern = Pattern.compile("op_cond\\s*?=\\s*?\\{?(debuff|(\\d+);(\\d+)%;(\\d+))}?");
    // skills 1-3
    private static final Pattern cubicSkill1Pattern = Pattern.compile("skill1\\s*?=\\s*?\\{(\\d+)?%?;?\\[(\\S+?)];(\\d+)%;(\\d+);?(master|target|by_skill|heal)?;?\\{?(debuff|(\\d+);(\\d+)%;(\\d+))?}?}");
    private static final Pattern cubicSkill2Pattern = Pattern.compile("skill2\\s*?=\\s*?\\{(\\d+)?%?;?\\[(\\S+?)];(\\d+)%;(\\d+);?(master|target|by_skill|heal)?;?\\{?(debuff|(\\d+);(\\d+)%;(\\d+))?}?}");
    private static final Pattern cubicSkill3Pattern = Pattern.compile("skill3\\s*?=\\s*?\\{(\\d+)?%?;?\\[(\\S+?)];(\\d+)%;(\\d+);?(master|target|by_skill|heal)?;?\\{?(debuff|(\\d+);(\\d+)%;(\\d+))?}?}");

    //timeskills 1-3
    private static final Pattern agathionTimeSkill1Pattern = Pattern.compile("timeskill1\\s*?=\\s*?\\{\\[(\\S+?)];(\\d+);(master|target|by_skill|heal);(\\d+)}");
    private static final Pattern agathionTimeSkill2Pattern = Pattern.compile("timeskill2\\s*?=\\s*?\\{\\[(\\S+?)];(\\d+);(master|target|by_skill|heal);(\\d+)}");
    private static final Pattern agathionTimeSkill3Pattern = Pattern.compile("timeskill3\\s*?=\\s*?\\{\\[(\\S+?)];(\\d+);(master|target|by_skill|heal);(\\d+)}");


    public static class CubicDataObjectFactory implements IObjectFactory<DefaultCubicData> {
        private Class<?> clazz;

        @Override
        public DefaultCubicData createObjectFor(StringBuilder data) throws IllegalAccessException, InstantiationException {
            DefaultCubicData cubicData = (DefaultCubicData) clazz.newInstance();

            // target_type
            Matcher matcher = cubicDataTargetTypePattern.matcher(data);
            if (matcher.find()) {
                int group = 1;
                String target_type = matcher.group(group++);
                if (target_type.startsWith("heal")) {
                    int[] params = new int[4];
                    params[0] = Integer.valueOf(matcher.group(group++));
                    params[1] = Integer.valueOf(matcher.group(group++));
                    params[2] = Integer.valueOf(matcher.group(group++));
                    params[3] = Integer.valueOf(matcher.group(group));
                    cubicData.target_type = new CubicDataTargetType(TargetType.heal, params);
                } else {
                    cubicData.target_type = new CubicDataTargetType(TargetType.valueOf(target_type));
                }

                data.replace(matcher.start(), matcher.end(), "");
            }


            // op_cond
            matcher = cubicDataOpCondPattern.matcher(data);
            if (matcher.find()) {
                int group = 1;
                String type = matcher.group(group++);
                if (type.equals("debuff")) {
                    cubicData.op_cond = new CubicDataOpCond();
                } else {
                    int[] cond = new int[3];
                    cond[0] = Integer.valueOf(matcher.group(group++));
                    cond[1] = Integer.valueOf(matcher.group(group++));
                    cond[2] = Integer.valueOf(matcher.group(group));
                    cubicData.op_cond = new CubicDataOpCond(cond);
                }
                data.replace(matcher.start(), matcher.end(), "");
            }


            //skill1
            matcher = cubicSkill1Pattern.matcher(data);
            if (matcher.find()) {
                cubicData.skill1 = doSkill(matcher);
                data.replace(matcher.start(), matcher.end(), "");
            }

            //skill2
            matcher = cubicSkill2Pattern.matcher(data);
            if (matcher.find()) {
                cubicData.skill2 = doSkill(matcher);
                data.replace(matcher.start(), matcher.end(), "");
            }

            //skill3
            matcher = cubicSkill3Pattern.matcher(data);
            if (matcher.find()) {
                cubicData.skill3 = doSkill(matcher);
                data.replace(matcher.start(), matcher.end(), "");
            }

            // Agathion timeskills 1-3
            if (clazz == Agathion.class) {
                matcher = agathionTimeSkill1Pattern.matcher(data);
                if (matcher.find()) {
                    ((Agathion) cubicData).timeskill1 = doTimeSkill(matcher);
                    data.replace(matcher.start(), matcher.end(), "");
                }
                matcher = agathionTimeSkill2Pattern.matcher(data);
                if (matcher.find()) {
                    ((Agathion) cubicData).timeskill2 = doTimeSkill(matcher);
                    data.replace(matcher.start(), matcher.end(), "");
                }
                matcher = agathionTimeSkill3Pattern.matcher(data);
                if (matcher.find()) {
                    ((Agathion) cubicData).timeskill3 = doTimeSkill(matcher);
                    data.replace(matcher.start(), matcher.end(), "");
                }
            }

            return cubicData;
        }

        private AgathionTimeSkill doTimeSkill(Matcher matcher) {
            AgathionTimeSkill skill = new AgathionTimeSkill();
            skill.skill_name = matcher.group(1);
            skill.targetStaticObject = Integer.valueOf(matcher.group(2));
            skill.skill_target_type = TargetType.valueOf(matcher.group(3));
            skill.unknown = Integer.valueOf(matcher.group(4));

            return skill;
        }

        private CubicDataSkill doSkill(Matcher matcher) {
            CubicDataSkill skill = new CubicDataSkill();
            int group = 1;

            String group1 = matcher.group(group++);
            if (group1 != null) {
                skill.skillChance = Integer.valueOf(group1);
            }

            // Эта информация всегда есть в скиле
            skill.skill_name = matcher.group(group++);
            skill.useChance = Integer.valueOf(matcher.group(group++));
            skill.targetStaticObject = Integer.valueOf(matcher.group(group++));

            // Присутствует, например, для smart кубиков
            if (matcher.group(group) != null) {
                skill.skill_target_type = TargetType.valueOf(matcher.group(group++));

                String opCond = matcher.group(group++);
                if (opCond.equals("debuff")) {
                    skill.skill_op_cond = new CubicDataOpCond();
                } else {
                    int[] cond = new int[3];
                    cond[0] = Integer.valueOf(matcher.group(group++));
                    cond[1] = Integer.valueOf(matcher.group(group++));
                    cond[2] = Integer.valueOf(matcher.group(group));
                    skill.skill_op_cond = new CubicDataOpCond(cond);
                }
            }
            return skill;
        }

        @Override
        public void setFieldClass(Class<?> clazz) {
            this.clazz = clazz;
        }
    }
}

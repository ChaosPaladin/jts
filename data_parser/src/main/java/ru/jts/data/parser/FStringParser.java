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

package ru.jts.data.parser;

import ru.jts.common.log.Log;
import ru.jts.common.parser.AbstractParser;
import ru.jts.data.holder.FStringHolder;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Camelion
 * @date : 27.08.12  13:29
 */
public class FStringParser extends AbstractParser<FStringHolder> {
    private static final String FILE_NAME = "data/fstring.txt";
    private static final Pattern fStringPattern = Pattern.compile("(\\d+)\\s+\\[(.*)]");

    private static FStringParser ourInstance = new FStringParser();

    public static FStringParser getInstance() {
        return ourInstance;
    }

    private FStringParser() {
        super(FStringHolder.getInstance());
    }


    @Override
    protected void parse() throws Exception {
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(FILE_NAME), Charset.forName("UTF-16"));
            String line;
            // Считываем файл до конца
            while ((line = br.readLine()) != null) {
                if (line.startsWith("//"))
                    continue;

                if (line.contains("//")) {// обрезаем комментарии
                    int index = line.indexOf("//");
                    String replacement = line.substring(index);
                    line = line.replace(replacement, "").trim();
                }

                line = line.trim();
                if (line.isEmpty())
                    continue;

                Matcher matcher = fStringPattern.matcher(line);
                if (matcher.find()) {
                    int id = Integer.valueOf(matcher.group(1));
                    String value = matcher.group(2);
                    getHolder().addFString(id, value);
                }
            }
        } catch (Exception e) {
            Log.w(e.getLocalizedMessage(), e);
            throw e;
        }
    }
}

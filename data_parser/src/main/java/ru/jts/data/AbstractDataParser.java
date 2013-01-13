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

package ru.jts.data;

import ru.jts.common.GlobalConstans;
import ru.jts.common.log.Log;
import ru.jts.common.parser.AbstractHolder;
import ru.jts.common.parser.AbstractParser;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Camelion
 * @date : 22.08.12  1:37
 */
public abstract class AbstractDataParser<H extends AbstractHolder> extends AbstractParser<H> {
    private static final Pattern commentReplacePattern = Pattern.compile("(/\\*[^\\*]*[^/]*/|//[^\\n]*)", Pattern.DOTALL | Pattern.MULTILINE);

    protected AbstractDataParser(H holder) {
        super(holder);
    }

    @Override
    protected void parse() throws Exception {
        try {
            StringBuilder buffer = new StringBuilder();
            BufferedReader br = Files.newBufferedReader(Paths.get(getFileName()), Charset.forName("UTF-16"));
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
                if (!line.isEmpty())
                    buffer.append(line).append("\n");
            }
            Matcher matcher = commentReplacePattern.matcher(buffer);
            while (matcher.find()) {
                buffer = new StringBuilder(matcher.replaceAll("").trim());
            }
            StringBuilder lost = Parser.parseClass(buffer, getHolder().getClass(), getHolder());

        } catch (Exception e) {
            Log.w(e.getLocalizedMessage(), e);
            throw e;
        }
    }

    @Override
    protected void afterParsing() {
        if (GlobalConstans.DEBUG)
            Parser.printStatistic();
    }

    protected abstract String getFileName();
}

package ru.jts.data.parser;

import ru.jts.data.AbstractDataParser;
import ru.jts.data.holder.FormationInfoHolder;

/**
 * @author : Camelion
 * @date : 27.08.12  13:04
 */
public class FormationInfoParser extends AbstractDataParser<FormationInfoHolder> {
    private static FormationInfoParser ourInstance = new FormationInfoParser();

    public static FormationInfoParser getInstance() {
        return ourInstance;
    }

    private FormationInfoParser() {
        super(FormationInfoHolder.getInstance());
    }

    @Override
    protected String getFileName() {
        return "data/formationinfo.txt";
    }
}

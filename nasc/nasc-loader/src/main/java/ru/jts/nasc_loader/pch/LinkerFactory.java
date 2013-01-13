package ru.jts.nasc_loader.pch;

import ru.jts.nasc_loader.pch.linker.*;

/**
 * Created with IntelliJ IDEA.
 * User: camelion
 * Date: 1/13/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkerFactory {
    private static LinkerFactory ourInstance = new LinkerFactory();
    private boolean isLoaded;

    public static LinkerFactory getInstance() {
        return ourInstance;
    }

    private LinkerFactory() {
        load();
    }

    private void load() {
        if(!isLoaded) {
            CastledataPchLinker.getInstance().load();
            CategoryPchLinker.getInstance().load();
            ManualPchLinker.getInstance().load();
            InstantzoneDataPchLinker.getInstance().load();
            ItemPchLinker.getInstance().load();
            SkillPchLinker.getInstance().load();
            MultisellPchLinker.getInstance().load();
            NpcPchLinker.getInstance().load();
            QuestPchLinker.getInstance().load();
            isLoaded = true;
        }
    }

    public void unload() {
        if(isLoaded) {
            CastledataPchLinker.getInstance().unload();
            CategoryPchLinker.getInstance().unload();
            ManualPchLinker.getInstance().unload();
            InstantzoneDataPchLinker.getInstance().unload();
            ItemPchLinker.getInstance().unload();
            SkillPchLinker.getInstance().unload();
            MultisellPchLinker.getInstance().unload();
            NpcPchLinker.getInstance().unload();
            QuestPchLinker.getInstance().unload();
            isLoaded = false;
        }
    }

    public native String findValueFor(String link);
}

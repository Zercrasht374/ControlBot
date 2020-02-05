package tv.marius.controlbot.util;

import net.dv8tion.jda.api.entities.TextChannel;
import tv.marius.controlbot.ControlBot;

public class Secrets {

    public static final String TOKEN = "Njc0Mjk4NzA4MjQ2MDAzNzMy.XjmlAA.w0_9wpAtzOXWf9pmLEjXp200zVg";
    public static String PREFIX = "!";

    public static final String[] TEAM_RANKS = {};

    public static final String ID_CHANNEL_BOT = "639825393377083392",
                                ID_CHANNEL_DCCHANGE = "624957917543530496", // Ist geändert
                                ID_CHANNEL_SUGGESTIONS = "624957380089610285",
                                ID_CHANNEL_TODO = "674144593352196096";

    public static final TextChannel BOT = ControlBot.jda.getTextChannelById(ID_CHANNEL_BOT),
                                    DCCHANGE = ControlBot.jda.getTextChannelById(ID_CHANNEL_DCCHANGE),
                                    SUGGESTIONS = ControlBot.jda.getTextChannelById(ID_CHANNEL_SUGGESTIONS),
                                    TODO = ControlBot.jda.getTextChannelById(ID_CHANNEL_TODO);
}

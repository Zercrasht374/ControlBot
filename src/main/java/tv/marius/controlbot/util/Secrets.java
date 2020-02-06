package tv.marius.controlbot.util;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import tv.marius.controlbot.ControlBot;

import java.util.ArrayList;
import java.util.List;

public class Secrets {

    public static final String TOKEN = "Njc0Mjk4NzA4MjQ2MDAzNzMy.XjwoDg.mVyqLwbGz__e96HjzIs5A0PZC7k";
    public static String PREFIX = "!";

    public static List<Message> todo2 = new ArrayList<>();
    public static List<Message> changelog2 = new ArrayList<>();

    public static final String[] TEAM_RANKS = {};
    public static final String[] ADMINS = { "Administration" };

    public static final String ID_CHANNEL_PLUGINCHANGE = "623526091113365536",
                                ID_CHANNEL_DCCHANGE = "624957917543530496", // Ist geändert
                                ID_CHANNEL_TODO = "674144593352196096",
                                ID_CHANNEL_CHANGELOG = "674144650377953310";

    public static final TextChannel PLUGINCHANGE = ControlBot.jda.getTextChannelById(ID_CHANNEL_PLUGINCHANGE),
                                    DCCHANGE = ControlBot.jda.getTextChannelById(ID_CHANNEL_DCCHANGE),
                                    TODO = ControlBot.jda.getTextChannelById(ID_CHANNEL_TODO),
                                    CHANGELOG = ControlBot.jda.getTextChannelById(ID_CHANNEL_CHANGELOG);
}

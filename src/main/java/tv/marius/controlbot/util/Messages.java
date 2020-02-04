package tv.marius.controlbot.util;

import net.dv8tion.jda.api.entities.TextChannel;

import java.awt.*;

public class Messages
{

    public static void nopermission(TextChannel tc)
    {
        Message.message(Ember.getMessage("You dont have the permission to use the command", Color.RED, ":warning: **Permission Error**"), tc);
    }

    public static void arguments(TextChannel tc, String args)
    {
        Message.message(Ember.getMessage(Secrets.PREFIX + args, Color.RED, ":warning: **Wrong Usage**"), tc);
    }

    public static void usernotfound(TextChannel tc, String usernf) {
        Message.message(Ember.getMessage("The user " + usernf + " doesn't exists", Color.RED, ":warning: **User Error**"), tc);
    }

}

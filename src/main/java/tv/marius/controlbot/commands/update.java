package tv.marius.controlbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import tv.marius.controlbot.util.Ember;
import tv.marius.controlbot.util.Message;
import tv.marius.controlbot.util.Messages;
import tv.marius.controlbot.util.Secrets;

import java.awt.*;

public class update implements Command {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        //      .update <Username> <Rank> <+/->
        if (args.length == 3) {
            if (event.getJDA().getUsersByName(args[0], true) != null && event.getJDA().getUsersByName(args[0], true).size() == 0) {
                String role = args[1];
                if (event.getGuild().getRolesByName(role, true) != null && event.getGuild().getRolesByName(role, true).size() == 1 && event.getGuild().getRolesByName(role, true).get(0) != null) {
                    if (args[2].equals("+") || args[2].equals("-")) {
                        StringBuilder message = new StringBuilder();
                        message.append("[" + args[2] + "]\n");
                        message.append("User: " + event.getJDA().getUsersByName(args[0], true).get(0).getAsMention() + "\n");
                        message.append("Role: " + event.getGuild().getRolesByName(role, true).get(0).getAsMention() + "\n");
                        Message.message(Ember.getMessage(message.toString(), Color.GREEN, "**Role Update**"), Secrets.DCCHANGE);
                    } else {
                        Messages.arguments(event.getTextChannel(), "update <Username> <Role> <+/->");
                    }
                } else {
                    Message.message(Ember.getMessage("Bitte gebe eine existierende Rolle ein", Color.RED, "**Role Error**"), event.getTextChannel());
                }
            } else {
                Message.message(Ember.getMessage("Bitte gebe einen existierenden Spieler an", Color.RED, "**User Error**"), event.getTextChannel());
            }
        } else {
            Messages.arguments(event.getTextChannel(), "update <Username> <Role> <+/->");
        }
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
    }

    @Override
    public String help() {
        return null;
    }
}

package tv.marius.controlbot.commands;

import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import tv.marius.controlbot.util.*;

import java.awt.*;

public class todo implements Command {
    public static MessageEmbed message = null;

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    //      !todo <Developer> <Pluginname> <Description>

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (Perms.isAdmin(event.getMember())) {
            if (args.length >= 3) {
                String developer = args[0];
                String pluginname = args[1];
                String description = "";
                for (int i = 2; i < args.length; i++)
                    description += args[i] + " ";

                StringBuilder builder = new StringBuilder();
                builder.append("Developer: " + developer + "\n");
                builder.append("Pluginname: " + pluginname + "\n");
                builder.append("Description: \n" + description + "\n");
                message = Ember.getMessage(builder.toString(), Color.GREEN, "**TODO**");

                Secrets.TODO.sendMessage(message).queue(msg -> {
                    Secrets.todo2.add(msg);
                    msg.addReaction("✔").queue();
                });

                event.getMessage().delete().queue();
            } else {
                Messages.arguments(event.getTextChannel(), "todo <Developer> <Pluginname> <Description>");
            }
        } else {
            Messages.nopermission(event.getTextChannel());
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

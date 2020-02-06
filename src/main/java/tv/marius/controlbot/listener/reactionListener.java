package tv.marius.controlbot.listener;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tv.marius.controlbot.ControlBot;
import tv.marius.controlbot.commands.todo;
import tv.marius.controlbot.util.Ember;
import tv.marius.controlbot.util.Perms;
import tv.marius.controlbot.util.Secrets;

import javax.annotation.Nonnull;
import java.awt.*;

public class reactionListener extends ListenerAdapter {

    @Override
    public void onMessageReactionAdd(@Nonnull MessageReactionAddEvent event) {
        if (event.getUser() == ControlBot.jda.getSelfUser()) return;
        for (Message m : Secrets.todo2) {
            if (m.getId().equalsIgnoreCase(event.getMessageId())) {
                Secrets.todo2.remove(m);
                m.delete().queue();
                MessageEmbed message = Ember.getMessage(todo.message.getDescription(), Color.GREEN, "**Changelog**");
                Secrets.CHANGELOG.sendMessage(message).queue(msg -> {
                    Secrets.changelog2.add(msg);
                    msg.addReaction("✔").queue();
                });
                return;
            }
        }
        for (Message m : Secrets.changelog2) {
            if (m.getId().equalsIgnoreCase(event.getMessageId())) {
                if (!Perms.isAdmin(event.getMember())) return;
                Secrets.changelog2.remove(m);
                m.delete().queue();
                MessageEmbed message = Ember.getMessage(todo.message.getDescription(), Color.GREEN, "**NEW PLUGIN**");
                Secrets.PLUGINCHANGE.sendMessage(message).queue();
                return;
            }
        }
    }
}

package tv.marius.controlbot.util;

import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.TextChannel;

public class Message {

    public static void message(MessageEmbed message, TextChannel channel) {
        channel.sendMessage(message).queue();
    }

}

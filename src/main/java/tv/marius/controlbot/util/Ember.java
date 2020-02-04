package tv.marius.controlbot.util;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

import java.awt.*;

public class Ember {

    public static MessageEmbed getMessage(String text, Color color) {
        return new EmbedBuilder().setDescription(text).setColor(color).build();
    }

    public static MessageEmbed getMessage(String text, Color color, String header) {
        return new EmbedBuilder().setDescription(text).setColor(color).setTitle(header).build();
    }

    public static MessageEmbed getMessage(String text, Color color, String header, String footer) {
        return new EmbedBuilder().setDescription(text).setColor(color).setTitle(header).setFooter(footer).build();
    }

    public static MessageEmbed addField(MessageEmbed message, MessageEmbed.Field field) {
        message.getFields().add(field);
        return message;
    }

}

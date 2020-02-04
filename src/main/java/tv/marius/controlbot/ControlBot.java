package tv.marius.controlbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import tv.marius.controlbot.commands.update;
import tv.marius.controlbot.listener.messageListener;
import tv.marius.controlbot.util.Secrets;
import tv.marius.controlbot.util.commandHandler;

import javax.security.auth.login.LoginException;

public class ControlBot {

    /* TODO: Bug Report, Suggestions */

    public static JDABuilder builder;
    public static JDA jda;

    public static void main(String[] args) {
        builder = new JDABuilder();

        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setToken(Secrets.TOKEN);

        builder.setActivity(Activity.of(Activity.ActivityType.DEFAULT, "Controle Forumats Discord"));

        registerCommands();
        registerListener();

        try {
            jda = builder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    private static void registerListener() { builder.addEventListeners(new messageListener()); }

    private static void registerCommands() {

        commandHandler.commands.put("update", new update());

    }

}

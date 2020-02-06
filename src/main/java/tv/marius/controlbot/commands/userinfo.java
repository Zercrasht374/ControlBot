package tv.marius.controlbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class userinfo implements Command{

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) { return false; }

    /*

    Typen:
    -Name
    -TagID
    -Status
    -Game
    -Roles
    -Join Date
    -Discrod Since

     */


    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
    }

    @Override
    public String help() { return null; }

}

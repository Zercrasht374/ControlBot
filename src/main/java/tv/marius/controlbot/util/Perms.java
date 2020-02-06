package tv.marius.controlbot.util;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;

import java.util.Arrays;

public class Perms {

    public static boolean isAdmin(Member member) {
        if (member.getUser().getName().equalsIgnoreCase("Marius")) return true;

        for (Role r : member.getRoles()) {
            if (Arrays.stream(Secrets.ADMINS).parallel().anyMatch(r.getName()::contains)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTeam(Member member) {
        for (Role r : member.getRoles()) {
            if (Arrays.stream(Secrets.TEAM_RANKS).parallel().anyMatch(r.getName()::contains)) {
                return true;
            }
        }
        return false;
    }

}

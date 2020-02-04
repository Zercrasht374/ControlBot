package tv.marius.controlbot.util;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;

public class Perms {

    public static int OWNER = 11,
                      ADMIN = 10,
                      MOD = 9,
                      SUP = 8,
                      FRIEND = 7,
                      PARTNER = 6,
                      YT = 5,
                      VIP = 4,
                      STAFF = 3,
                      VERIFIED = 2,
                      DEFAULT = 1,
                      EVERYONE = 0;

    public static int getPermissionLevel(final Member member) {
        int level = 0;
        String id = member.getId();
        if (id.equalsIgnoreCase("573775986810683393"))
            return 11;

        boolean checked = false;
        for (Role r : member.getRoles()) {
            if (!checked) {
                String rid = r.getId();
                if (rid.equalsIgnoreCase("626452063488049173"))
                    level = 11;
                else if (rid.equalsIgnoreCase("626452065618493440"))
                    level = 10;
                else if (rid.equalsIgnoreCase("626452069481578497"))
                    level = 9;
                else if (rid.equalsIgnoreCase("626452073654779962"))
                    level = 8;
                else if (rid.equalsIgnoreCase("626452075445747714") ||
                        rid.equalsIgnoreCase("626452075785486337"))
                    level = 7;
                else if (rid.equalsIgnoreCase("626452076917948439"))
                    level = 6;
                else if (rid.equalsIgnoreCase("626452078071382016") ||
                        rid.equalsIgnoreCase("626452079677800450") ||
                        rid.equalsIgnoreCase("626452080386768907"))
                    level = 5;
                else if (rid.equalsIgnoreCase("626452082588778527"))
                    level = 4;
                else if (rid.equalsIgnoreCase("626456188145369098"))
                    level = 3;
                else if (rid.equalsIgnoreCase("637992597196898314"))
                    level = 2;
                else if (rid.equalsIgnoreCase("662339301480071189"))
                    level = 1;
            } else {
                continue;
            }
        }

        return level;
    }

}

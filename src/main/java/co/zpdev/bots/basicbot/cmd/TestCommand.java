package co.zpdev.bots.basicbot.cmd;

import co.zpdev.core.discord.command.Command;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Message;

/**
 * @author ZP4RKER
 */
public class TestCommand {

    @Command(aliases = "test", permission = Permission.MESSAGE_READ, autodelete = true)
    public void onCommand(Message message) {
        message.getMember().getPermissions().forEach(System.out::println);
    }

}

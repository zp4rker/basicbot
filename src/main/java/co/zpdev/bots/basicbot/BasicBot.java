package co.zpdev.bots.basicbot;

import co.zpdev.core.discord.command.CommandHandler;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.hooks.AnnotatedEventManager;

import javax.security.auth.login.LoginException;

/**
 * @author ZP4RKER
 */
public class BasicBot {

    public static void main(String[] args) throws LoginException, InterruptedException {
        CommandHandler handler = new CommandHandler("/", "co.zpdev.bots.basicbot.cmd");

        new JDABuilder(AccountType.BOT).setToken(args[0])
                .setEventManager(new AnnotatedEventManager())
                .addEventListener(handler)
                .buildBlocking();
    }

}

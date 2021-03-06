package axc.AXConnection.utility;

import axc.AXConnection.AXConnection;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Message {

    public enum LogType {
        PLAYER_JOIN,
        PLAYER_QUIT,
        COMMAND_INVALID_ARGUMENT_TYPE,
        COMMAND_REQUIRE_ARGUMENTS,
    };

    private static String convertColorString(String target)
    {
        target = target.replaceAll("\\{AQUA\\}", ChatColor.AQUA+"");
        target = target.replaceAll("\\{BLACK\\}", ChatColor.BLACK+"");
        target = target.replaceAll("\\{BLUE\\}", ChatColor.BLUE+"");
        target = target.replaceAll("\\{BOLD\\}", ChatColor.BOLD+"");
        target = target.replaceAll("\\{COLOR_CHAR\\}", ChatColor.COLOR_CHAR+"");
        target = target.replaceAll("\\{DARK_AQUA\\}", ChatColor.DARK_AQUA+"");
        target = target.replaceAll("\\{DARK_BLUE\\}", ChatColor.DARK_BLUE+"");
        target = target.replaceAll("\\{DARK_GRAY\\}", ChatColor.DARK_GRAY+"");
        target = target.replaceAll("\\{DARK_GREEN\\}", ChatColor.DARK_GREEN+"");
        target = target.replaceAll("\\{DARK_PURPLE\\}", ChatColor.DARK_PURPLE+"");
        target = target.replaceAll("\\{DARK_RED\\}", ChatColor.DARK_RED+"");
        target = target.replaceAll("\\{GOLD\\}", ChatColor.GOLD+"");
        target = target.replaceAll("\\{GRAY\\}", ChatColor.GRAY+"");
        target = target.replaceAll("\\{GREEN\\}", ChatColor.GREEN+"");
        target = target.replaceAll("\\{ITALIC\\}", ChatColor.ITALIC+"");
        target = target.replaceAll("\\{LIGHT_PURPLE\\}", ChatColor.LIGHT_PURPLE+"");
        target = target.replaceAll("\\{MAGIC\\}", ChatColor.MAGIC+"");
        target = target.replaceAll("\\{RED\\}", ChatColor.RED+"");
        target = target.replaceAll("\\{RESET\\}", ChatColor.RESET+"");
        target = target.replaceAll("\\{STRIKETHROUGH\\}", ChatColor.STRIKETHROUGH+"");
        target = target.replaceAll("\\{UNDERLINE\\}", ChatColor.UNDERLINE+"");
        target = target.replaceAll("\\{WHITE\\}", ChatColor.WHITE+"");
        target = target.replaceAll("\\{YELLOW\\}", ChatColor.YELLOW+"");

        return target;
    }

    private static String convertPlayernameString(String target, String playerName)
    {
        if(playerName == null) {
            target = target.replaceAll("\\{USERNAME\\}", "NULL");
        } else {
            target = target.replaceAll("\\{USERNAME\\}", playerName);
        }

        return target;
    }

    public static String getConfigMessage(AXConnection plugin, LogType logT, String playerName)
    {
        String returnString;

        switch(logT) {
            case PLAYER_JOIN: {
                returnString = plugin.getConfig().getString("messages.player_join");

                returnString = convertPlayernameString(returnString, playerName);
                returnString = convertColorString(returnString);
                break;
            }
            case PLAYER_QUIT: {
                returnString = plugin.getConfig().getString("messages.player_quit");

                returnString = convertPlayernameString(returnString, playerName);
                returnString = convertColorString(returnString);
                break;
            }
            case COMMAND_INVALID_ARGUMENT_TYPE: {
                returnString = plugin.getConfig().getString("messages.invalid_argument_type");
                returnString = convertColorString(returnString);
                break;
            }
            case COMMAND_REQUIRE_ARGUMENTS: {
                returnString = plugin.getConfig().getString("messages.require_arguments");
                returnString = convertColorString(returnString);
                break;
            }
            default: {
                returnString = "NULL";
            }
        }
        return returnString;
    }

}

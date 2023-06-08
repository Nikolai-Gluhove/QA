package factories;

import data.CommandsData;

public class CommandFactory {

    public CommandsData createComand(String type){
        switch (type){
            case "LIST" ->{
                return CommandsData.LIST;
            }
            case "ADD" -> {
                return CommandsData.ADD;
            }
            case "EXIT" -> {
                return CommandsData.EXIT;
            }
        }
        return null;
    }
}

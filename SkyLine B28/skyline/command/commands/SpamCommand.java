package skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.command.commands;

import java.util.List;
import java.util.Random;

import skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.command.Command;
import skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.skyline.mod.Module;
import skyline.specc.SkyLine;
import skyline.specc.utils.MathUtil;
import skyline.specc.utils.TimerUtils;
import skyline.specc.utils.Wrapper;

public class SpamCommand extends Command {

	public TimerUtils timer;
	
    public SpamCommand(){
        super("Spam", new String[]{"s"}, "spam a specific player.");
    }

    @Override
    public void onCommand(List<String> args){
        if(args.size() != 1){
            error("Invalid args! Usage : 'Spam name msg'");
            return;
        }

        
        String name = args.get(0);
                
        if(timer.hasReached(3000L) && name != null) {
        	Wrapper.getPlayer().sendChatMessage("Wachdog is ððsðððhððððiððððððtð, Hypixel needs look puppy or its royaly ððfðððuðððcððððkððððed");
        	timer.reset();
        }

        
        
    }
}
